package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.zip.Adler32;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxj implements WritableByteChannel {
    public long a;
    public boolean b;
    private final Adler32 c = new Adler32();
    private final ArrayList d;

    public vxj(ArrayList arrayList) {
        arrayList.getClass();
        this.d = arrayList;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.a % 10485760 != 0) {
            this.d.add(Long.valueOf(this.c.getValue()));
        }
        this.b = true;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining;
        byte[] bArr;
        int i;
        amkq.N(!this.b);
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset() + byteBuffer.position();
            remaining = byteBuffer.remaining();
        } else {
            remaining = byteBuffer.remaining();
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        long j = this.a % 10485760;
        int i2 = remaining;
        while (i2 > 0) {
            int i3 = (int) (10485760 - j);
            if (i2 >= i3) {
                this.c.update(bArr, i, i3);
                this.d.add(Long.valueOf(this.c.getValue()));
                this.c.reset();
                i += i3;
                i2 -= i3;
                j = 0;
            } else {
                this.c.update(bArr, i, i2);
                j += i2;
                i += i2;
                i2 = 0;
            }
        }
        this.a += remaining;
        return remaining;
    }
}
