package defpackage;

import java.io.IOException;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axad implements awzu {
    private final String a;
    private final awzu b;
    private axal c;
    private axal d;
    private axal e;
    private final long h;
    private final MessageDigest i;
    private boolean j;
    private int k = 1;
    private long f = 0;
    private long g = 0;

    public axad(String str, String str2, awzx awzxVar, awzu awzuVar, MessageDigest messageDigest) {
        this.a = str;
        this.b = awzuVar;
        this.i = messageDigest;
        this.c = new axal("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append("\r\n");
        for (String str3 : awzxVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(awzxVar.a(str3));
            sb.append("\r\n");
        }
        if (this.b.a() >= 0 && awzxVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.a());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.d = new axal(sb.toString());
        if (awzuVar.a() == -1 || messageDigest != null) {
            this.h = -1L;
        } else {
            this.e = j();
            this.h = this.c.a() + this.d.a() + awzuVar.a() + this.e.a();
        }
    }

    private final axal j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n--");
        sb.append(this.a);
        MessageDigest messageDigest = this.i;
        if (messageDigest != null && (messageDigest.getAlgorithm().equalsIgnoreCase("md5") || this.i.getAlgorithm().equalsIgnoreCase("sha-1"))) {
            sb.append("\r\n\r\nX-Goog-Hash:");
            if (this.i.getAlgorithm().equalsIgnoreCase("md5")) {
                sb.append(" md5=");
            } else {
                sb.append(" sha1=");
            }
            sb.append(anbp.d.i(this.i.digest()));
            sb.append("\r\n--");
            sb.append(this.a);
            sb.append("--");
            return new axal(sb.toString());
        }
        sb.append("--");
        return new axal(sb.toString());
    }

    @Override // defpackage.awzu
    public final long a() {
        return this.h;
    }

    @Override // defpackage.awzu
    public final int b(byte[] bArr, int i, int i2) {
        if (this.j) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        amkq.F(bArr.length - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        while (true) {
            long j2 = this.f;
            if (j2 != j) {
                return (int) (j2 - j);
            }
            int i3 = this.k;
            int i4 = i3 - 1;
            awzu awzuVar = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    awzuVar = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    awzuVar = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    awzuVar = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = j();
                    }
                    awzuVar = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    return 0;
                }
                this.f += awzuVar.b(bArr, i, i2);
                if (awzuVar.d() < Long.MAX_VALUE) {
                    awzuVar.g();
                }
                if (!awzuVar.i()) {
                    this.k = i3;
                }
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.awzu
    public final long c() {
        return this.g;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.b.close();
    }

    @Override // defpackage.awzu
    public final long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awzu
    public final long e() {
        return this.f;
    }

    @Override // defpackage.awzu
    public final long f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    @Override // defpackage.awzu
    public final void g() {
        this.g = this.f;
    }

    @Override // defpackage.awzu
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    @Override // defpackage.awzu
    public final boolean i() {
        return this.k != 5;
    }
}
