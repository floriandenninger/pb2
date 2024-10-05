package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pex extends pez {
    private final pei a;
    private final peu b;
    private final pgw c = new pgw(new byte[10]);
    private int d = 0;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public pex(pei peiVar, peu peuVar) {
        this.a = peiVar;
        this.b = peuVar;
    }

    private final void c(int i) {
        this.d = i;
        this.e = 0;
    }

    private final boolean d(pgx pgxVar, byte[] bArr, int i) {
        int min = Math.min(pgxVar.a(), i - this.e);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pgxVar.A(min);
        } else {
            pgxVar.u(bArr, this.e, min);
        }
        int i2 = this.e + min;
        this.e = i2;
        return i2 == i;
    }

    @Override // defpackage.pez
    public final void b() {
        this.d = 0;
        this.e = 0;
        this.h = false;
        this.a.d();
    }

    @Override // defpackage.pez
    public final void a(pgx pgxVar, boolean z, pca pcaVar) {
        int i;
        long j;
        int i2 = -1;
        int i3 = 2;
        if (z) {
            int i4 = this.d;
            if (i4 == 2) {
                Log.w("TsExtractor", "Unexpected start indicator reading extended header");
            } else if (i4 == 3) {
                int i5 = this.j;
                if (i5 != -1) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("Unexpected start indicator: expected ");
                    sb.append(i5);
                    sb.append(" more bytes");
                    Log.w("TsExtractor", sb.toString());
                }
                this.a.b();
            }
            c(1);
        }
        while (pgxVar.a() > 0) {
            int i6 = this.d;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != i3) {
                        int a = pgxVar.a();
                        int i7 = this.j;
                        int i8 = i7 != i2 ? a - i7 : 0;
                        if (i8 > 0) {
                            a -= i8;
                            pgxVar.y(pgxVar.b + a);
                        }
                        this.a.a(pgxVar);
                        int i9 = this.j;
                        if (i9 != i2) {
                            int i10 = i9 - a;
                            this.j = i10;
                            if (i10 == 0) {
                                this.a.b();
                                c(1);
                            }
                        }
                    } else {
                        if (d(pgxVar, this.c.a, Math.min(10, this.i)) && d(pgxVar, null, this.i)) {
                            this.c.d(0);
                            if (this.f) {
                                this.c.e(4);
                                int a2 = this.c.a(3);
                                this.c.e(1);
                                int a3 = this.c.a(15);
                                this.c.e(1);
                                long a4 = (a2 << 30) | (a3 << 15) | this.c.a(15);
                                this.c.e(1);
                                if (!this.h && this.g) {
                                    this.c.e(4);
                                    int a5 = this.c.a(3);
                                    this.c.e(1);
                                    int a6 = this.c.a(15);
                                    this.c.e(1);
                                    int a7 = this.c.a(15);
                                    this.c.e(1);
                                    this.b.a((a5 << 30) | (a6 << 15) | a7);
                                    this.h = true;
                                }
                                j = this.b.a(a4);
                            } else {
                                j = -1;
                            }
                            this.a.c(j, this.k);
                            c(3);
                        }
                    }
                } else if (d(pgxVar, this.c.a, 9)) {
                    this.c.d(0);
                    int a8 = this.c.a(24);
                    if (a8 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(a8);
                        Log.w("TsExtractor", sb2.toString());
                        this.j = -1;
                        i = 0;
                    } else {
                        this.c.e(8);
                        int a9 = this.c.a(16);
                        this.c.e(5);
                        this.k = this.c.f();
                        this.c.e(2);
                        this.f = this.c.f();
                        this.g = this.c.f();
                        this.c.e(6);
                        int a10 = this.c.a(8);
                        this.i = a10;
                        if (a9 == 0) {
                            this.j = -1;
                        } else {
                            this.j = (a9 - 3) - a10;
                        }
                        i = 2;
                    }
                    c(i);
                }
            } else {
                pgxVar.A(pgxVar.a());
            }
            i2 = -1;
            i3 = 2;
        }
    }
}
