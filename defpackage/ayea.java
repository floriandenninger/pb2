package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayea extends InputStream implements aybh {
    private byte[][] a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public ayea(byte[] bArr) {
        this.a = null;
        int length = bArr.length;
        this.b = length <= 0 ? null : bArr;
        this.e = length;
    }

    private final void a() {
        int i = this.c + 1;
        this.c = i;
        this.d = 0;
        byte[][] bArr = this.a;
        if (bArr == null || i >= bArr.length) {
            this.b = null;
        } else {
            this.b = bArr[i];
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        byte[][] bArr = this.a;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                ayeb.a(bArr2);
            }
        } else {
            byte[] bArr3 = this.b;
            if (bArr3 != null) {
                ayeb.a(bArr3);
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return -1;
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte b = bArr[i];
        this.e--;
        if (i2 == bArr.length) {
            a();
        }
        return b;
    }

    public ayea(byte[][] bArr, int i) {
        this.a = bArr;
        this.e = i;
        if (bArr.length > 0) {
            this.b = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.b;
            if (bArr2 == null) {
                break;
            }
            int af = anaf.af(i3, bArr2.length - this.d, this.e);
            System.arraycopy(this.b, this.d, bArr, i, af);
            i += af;
            i3 -= af;
            this.e -= af;
            if (i3 != 0) {
                a();
            } else {
                int i4 = this.d + af;
                this.d = i4;
                if (i4 == this.b.length) {
                    a();
                }
            }
        }
        int i5 = i2 - i3;
        if (i5 > 0 || this.e > 0) {
            return i5;
        }
        return -1;
    }
}
