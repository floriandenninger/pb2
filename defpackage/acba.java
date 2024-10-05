package defpackage;

import java.io.InterruptedIOException;
import java.io.PipedInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acba extends PipedInputStream {
    private final int a;
    private int b;

    public acba() {
        super(2097152);
        this.b = Integer.MAX_VALUE;
        this.a = 2097152;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(byte[] bArr, int i, int i2) {
        notifyAll();
        while (available() > this.b) {
            try {
                wait(1000L);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        while (i2 > 0) {
            int i3 = i + 1;
            receive(bArr[i]);
            notifyAll();
            int i4 = i2 - 1;
            if (this.in > this.out) {
                int min = Math.min(i4, this.buffer.length - this.in);
                System.arraycopy(bArr, i3, this.buffer, this.in, min);
                this.in += min;
                i3 += min;
                i4 -= min;
                if (this.in == this.buffer.length) {
                    this.in = 0;
                }
                if (i4 == 0) {
                    return;
                }
            }
            int min2 = Math.min(i4, this.out - this.in);
            System.arraycopy(bArr, i3, this.buffer, this.in, min2);
            this.in += min2;
            i2 = i4 - min2;
            i = i3 + min2;
        }
    }

    public final synchronized void b(int i) {
        int i2 = this.a;
        if (i > i2) {
            StringBuilder sb = new StringBuilder(78);
            sb.append("Attempted to set buffer limit to ");
            sb.append(i);
            sb.append(" when the pipe size is ");
            sb.append(i2);
            zga.l(sb.toString());
            this.b = this.a;
        } else {
            this.b = i;
        }
        notifyAll();
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        notifyAll();
        return read;
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        notifyAll();
        return read;
    }
}
