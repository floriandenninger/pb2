package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cym extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final ctk f;

    public cym(InputStream inputStream, ctk ctkVar) {
        super(inputStream);
        this.d = -1;
        this.f = ctkVar;
        this.a = (byte[]) ctkVar.a(65536, byte[].class);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(java.io.InputStream r6, byte[] r7) {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L55
            int r3 = r5.e
            int r4 = r5.c
            int r3 = r3 - r0
            if (r3 < r4) goto Le
            goto L55
        Le:
            if (r0 != 0) goto L34
            int r0 = r7.length
            if (r4 <= r0) goto L33
            int r1 = r5.b
            if (r1 != r0) goto L33
            int r1 = r0 + r0
            if (r1 <= r4) goto L1c
            goto L1d
        L1c:
            r4 = r1
        L1d:
            ctk r1 = r5.f
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r1 = r1.a(r4, r3)
            byte[] r1 = (byte[]) r1
            java.lang.System.arraycopy(r7, r2, r1, r2, r0)
            r5.a = r1
            ctk r0 = r5.f
            r0.c(r7)
            r7 = r1
            goto L3b
        L33:
            r0 = 0
        L34:
            if (r0 <= 0) goto L3b
            int r1 = r7.length
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r7, r2, r1)
        L3b:
            int r0 = r5.e
            int r1 = r5.d
            int r0 = r0 - r1
            r5.e = r0
            r5.d = r2
            r5.b = r2
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.e
            if (r6 > 0) goto L51
            goto L52
        L51:
            int r7 = r7 + r6
        L52:
            r5.b = r7
            return r6
        L55:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L61
            r5.d = r1
            r5.e = r2
            r5.b = r6
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cym.c(java.io.InputStream, byte[]):int");
    }

    private static IOException d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw d();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.e >= this.b && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.a && (bArr = this.a) == null) {
            throw d();
        }
        int i = this.b;
        int i2 = this.e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.d;
        if (i != -1) {
            this.e = i;
        } else {
            int i2 = this.e;
            int i3 = this.c;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Mark has been invalidated, pos: ");
            sb.append(i2);
            sb.append(" markLimit: ");
            sb.append(i3);
            throw new cyl(sb.toString());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = this.in;
        if (inputStream != null) {
            int i = this.b;
            int i2 = this.e;
            if (i - i2 >= j) {
                this.e = (int) (i2 + j);
                return j;
            }
            long j2 = i - i2;
            this.e = i;
            if (this.d == -1 || j > this.c) {
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.d = -1;
                }
                return j2 + skip;
            }
            if (c(inputStream, bArr) == -1) {
                return j2;
            }
            int i3 = this.b;
            int i4 = this.e;
            if (i3 - i4 >= j - j2) {
                this.e = (int) ((i4 + j) - j2);
                return j;
            }
            this.e = i3;
            return (j2 + i3) - i4;
        }
        throw d();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            throw d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.in;
        if (inputStream != null) {
            int i5 = this.e;
            int i6 = this.b;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.d != -1 || i3 < bArr2.length) {
                    if (c(inputStream, bArr2) == -1) {
                        if (i3 == i2) {
                            return -1;
                        }
                        return i2 - i3;
                    }
                    if (bArr2 != this.a && (bArr2 = this.a) == null) {
                        throw d();
                    }
                    int i8 = this.b;
                    int i9 = this.e;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.e += i4;
                } else {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        if (i3 == i2) {
                            return -1;
                        }
                        return i2 - i3;
                    }
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw d();
        }
    }
}
