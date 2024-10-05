package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class peh extends pei {
    private final pgx a;
    private int c;
    private int d;
    private int e;
    private long f;
    private MediaFormat g;
    private int h;
    private long i;

    public peh(pcn pcnVar) {
        super(pcnVar);
        pgx pgxVar = new pgx(new byte[15]);
        this.a = pgxVar;
        byte[] bArr = pgxVar.a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.c = 0;
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.i = j;
    }

    @Override // defpackage.pei
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.pei
    public final void a(pgx pgxVar) {
        while (pgxVar.a() > 0) {
            int i = this.c;
            if (i == 0) {
                while (true) {
                    if (pgxVar.a() > 0) {
                        int i2 = this.e << 8;
                        this.e = i2;
                        int h = i2 | pgxVar.h();
                        this.e = h;
                        if (h == 2147385345) {
                            this.e = 0;
                            this.d = 4;
                            this.c = 1;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(pgxVar.a(), 15 - this.d);
                pgxVar.u(bArr, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 15) {
                    byte[] bArr2 = this.a.a;
                    if (this.g == null) {
                        pgw pgwVar = pgk.d;
                        int length = bArr2.length;
                        pgwVar.a = bArr2;
                        pgwVar.b = 0;
                        pgwVar.c = 0;
                        pgwVar.d = length;
                        pgwVar.e(60);
                        int i4 = pgk.a[pgwVar.a(6)];
                        int i5 = pgk.b[pgwVar.a(4)];
                        int a = pgwVar.a(5);
                        int i6 = a >= 29 ? -1 : (pgk.c[a] * 1000) / 2;
                        pgwVar.e(10);
                        this.g = MediaFormat.b(null, "audio/vnd.dts", i6, -1, -1L, i4 + (pgwVar.a(2) > 0 ? 1 : 0), i5, null, null);
                        this.b.d(this.g);
                    }
                    int[] iArr = pgk.a;
                    this.h = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f = (int) (((((((bArr2[5] & 252) >> 2) | ((bArr2[4] & 1) << 6)) + 1) * 32) * 1000000) / this.g.r);
                    this.a.z(0);
                    this.b.f(this.a, 15);
                    this.c = 2;
                }
            } else {
                int min2 = Math.min(pgxVar.a(), this.h - this.d);
                this.b.f(pgxVar, min2);
                int i7 = this.d + min2;
                this.d = i7;
                int i8 = this.h;
                if (i7 == i8) {
                    this.b.g(this.i, 1, i8, 0, null);
                    this.i += this.f;
                    this.c = 0;
                }
            }
        }
    }
}
