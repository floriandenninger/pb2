package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pee extends pei {
    private final boolean a;
    private final pgw c;
    private final pgx d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private MediaFormat i;
    private int j;
    private long k;

    public pee(pcn pcnVar, boolean z) {
        super(pcnVar);
        this.a = z;
        pgw pgwVar = new pgw(new byte[8]);
        this.c = pgwVar;
        this.d = new pgx(pgwVar.a);
        this.e = 0;
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.k = j;
    }

    @Override // defpackage.pei
    public final void d() {
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    @Override // defpackage.pei
    public final void a(pgx pgxVar) {
        int i;
        int i2;
        MediaFormat b;
        int i3;
        while (pgxVar.a() > 0) {
            int i4 = this.e;
            if (i4 == 0) {
                while (true) {
                    if (pgxVar.a() <= 0) {
                        break;
                    }
                    if (!this.g) {
                        this.g = pgxVar.h() == 11;
                    } else {
                        int h = pgxVar.h();
                        if (h == 119) {
                            this.g = false;
                            this.e = 1;
                            byte[] bArr = this.d.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f = 2;
                            break;
                        }
                        this.g = h == 11;
                    }
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.d.a;
                int min = Math.min(pgxVar.a(), 8 - this.f);
                pgxVar.u(bArr2, this.f, min);
                int i5 = this.f + min;
                this.f = i5;
                if (i5 == 8) {
                    if (this.i == null) {
                        if (this.a) {
                            pgw pgwVar = this.c;
                            int[] iArr = pgi.a;
                            pgwVar.e(32);
                            int a = pgwVar.a(2);
                            if (a == 3) {
                                i3 = pgi.c[pgwVar.a(2)];
                            } else {
                                pgwVar.e(2);
                                i3 = pgi.b[a];
                            }
                            b = MediaFormat.b(null, "audio/eac3", -1, -1, -1L, pgi.d[pgwVar.a(3)] + (pgwVar.f() ? 1 : 0), i3, null, null);
                        } else {
                            pgw pgwVar2 = this.c;
                            int[] iArr2 = pgi.a;
                            pgwVar2.e(32);
                            int a2 = pgwVar2.a(2);
                            pgwVar2.e(14);
                            int a3 = pgwVar2.a(3);
                            if ((a3 & 1) != 0 && a3 != 1) {
                                pgwVar2.e(2);
                            }
                            if ((a3 & 4) != 0) {
                                pgwVar2.e(2);
                            }
                            if (a3 == 2) {
                                pgwVar2.e(2);
                            }
                            b = MediaFormat.b(null, "audio/ac3", -1, -1, -1L, pgi.d[a3] + (pgwVar2.f() ? 1 : 0), pgi.b[a2], null, null);
                        }
                        this.i = b;
                        this.b.d(this.i);
                    }
                    if (this.a) {
                        byte[] bArr3 = this.c.a;
                        int[] iArr3 = pgi.a;
                        int i6 = ((bArr3[2] & 7) << 8) + (bArr3[3] & 255) + 1;
                        i = i6 + i6;
                    } else {
                        byte[] bArr4 = this.c.a;
                        int[] iArr4 = pgi.a;
                        byte b2 = bArr4[4];
                        int i7 = b2 & 63;
                        int i8 = pgi.b[(b2 & 192) >> 6];
                        if (i8 == 44100) {
                            int i9 = pgi.f[i7 >> 1] + (i7 & 1);
                            i = i9 + i9;
                        } else {
                            int i10 = pgi.e[i7 >> 1];
                            i = i8 == 32000 ? i10 * 6 : i10 * 4;
                        }
                    }
                    this.j = i;
                    if (this.a) {
                        byte[] bArr5 = this.c.a;
                        i2 = (((bArr5[4] & 192) >> 6) != 3 ? pgi.a[(bArr5[4] & 48) >> 4] : 6) * 256;
                    } else {
                        i2 = 1536;
                    }
                    this.h = (int) ((i2 * 1000000) / this.i.r);
                    this.d.z(0);
                    this.b.f(this.d, 8);
                    this.e = 2;
                }
            } else {
                int min2 = Math.min(pgxVar.a(), this.j - this.f);
                this.b.f(pgxVar, min2);
                int i11 = this.f + min2;
                this.f = i11;
                int i12 = this.j;
                if (i11 == i12) {
                    this.b.g(this.k, 1, i12, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            }
        }
    }
}
