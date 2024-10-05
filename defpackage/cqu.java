package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqu extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private final ctk c;
    private int d;

    public cqu(OutputStream outputStream, ctk ctkVar) {
        this.a = outputStream;
        this.c = ctkVar;
        this.b = (byte[]) ctkVar.a(65536, byte[].class);
    }

    private final void a() {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private final void b() {
        if (this.d == this.b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.c.c(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        a();
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            if (i6 == 0) {
                if (i4 >= this.b.length) {
                    this.a.write(bArr, i5, i4);
                    return;
                }
                i6 = 0;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.d, min);
            this.d += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }
}
