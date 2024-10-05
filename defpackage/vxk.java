package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.zip.Adler32;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxk extends InputStream {
    final ArrayList a;
    public final long b;
    private final Adler32 c = new Adler32();
    private final vxl d;
    private final ReadableByteChannel e;
    private final ByteBuffer f;
    private long g;
    private boolean h;

    public vxk(vxl vxlVar) {
        try {
            this.d = vxlVar;
            ByteBuffer allocate = ByteBuffer.allocate(10485760);
            this.f = allocate;
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.h = false;
            vxj vxjVar = new vxj(arrayList);
            try {
                vxlVar.a().k(vxjVar);
                vxjVar.close();
                amkq.N(vxjVar.b);
                this.b = vxjVar.a;
                try {
                    Pipe open = Pipe.open();
                    new vxi(vxlVar, open.sink()).start();
                    this.e = open.source();
                    this.g = 0L;
                } catch (IOException e) {
                    vxlVar.close();
                    throw e;
                }
            } catch (Throwable th) {
                vxjVar.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw new vrz(th2, vry.GENERIC_MOVIE_INPUT_STREAM);
        }
    }

    private final int a(ByteBuffer byteBuffer) {
        this.e.getClass();
        if (this.h) {
            return -1;
        }
        if (byteBuffer.remaining() >= 10485760) {
            int i = (int) (this.g / 10485760);
            while (true) {
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                if (this.e.read(byteBuffer) == -1) {
                    this.h = true;
                    this.d.close();
                    break;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                if (!this.h) {
                    throw new IOException("MovieInputStream had issue fetching more data");
                }
                if (this.g + 1 >= this.b) {
                    return -1;
                }
                throw new IOException("End of file found without reaching full data size");
            }
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            this.c.reset();
            this.c.update(array, arrayOffset + position, remaining);
            if (this.c.getValue() != ((Long) this.a.get(i)).longValue()) {
                long j = this.g;
                StringBuilder sb = new StringBuilder(99);
                sb.append("CRC mismatch from MP4Parser stream at buffer index: ");
                sb.append(i);
                sb.append(" bufferPosition:");
                sb.append(j);
                throw new vrz(sb.toString(), vry.MOVIE_INPUT_STREAM_CRC_MISMATCH);
            }
            this.g += byteBuffer.remaining();
            return byteBuffer.remaining();
        }
        throw new IOException("Insufficient buffer size");
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        if (this.h && !this.f.hasRemaining()) {
            return 0;
        }
        return (int) ((this.b - this.g) + this.f.remaining());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            if (!this.f.hasRemaining() && a(this.f) == -1) {
                return -1;
            }
            return this.f.get() & 255;
        } catch (Throwable th) {
            if (!(th instanceof vrz)) {
                throw new vrz(th, vry.MOVIE_INPUT_STREAM_READ);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (!this.f.hasRemaining() && a(this.f) == -1) {
                return -1;
            }
            if (this.f.remaining() < i2) {
                i2 = this.f.remaining();
            }
            this.f.get(bArr, i, i2);
            return i2;
        } catch (Throwable th) {
            if (!(th instanceof vrz)) {
                throw new vrz(th, vry.MOVIE_INPUT_STREAM_READ);
            }
            throw th;
        }
    }
}
