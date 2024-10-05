package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmn implements bna {
    private final bly a;
    private final ptg b = new ptg(new byte[10]);
    private int c = 0;
    private int d;
    private ptq e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public bmn(bly blyVar) {
        this.a = blyVar;
    }

    private final void d(int i) {
        this.c = i;
        this.d = 0;
    }

    private final boolean e(pth pthVar, byte[] bArr, int i) {
        int min = Math.min(pthVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pthVar.H(min);
        } else {
            pthVar.B(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.bna
    public final void a(pth pthVar, int i) {
        long j;
        pse.d(this.e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.c;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i6 = i;
        while (pthVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != i3) {
                        int a = pthVar.a();
                        int i8 = this.j;
                        int i9 = i8 != i2 ? a - i8 : 0;
                        if (i9 > 0) {
                            a -= i9;
                            pthVar.F(pthVar.b + a);
                        }
                        this.a.a(pthVar);
                        int i10 = this.j;
                        if (i10 != i2) {
                            int i11 = i10 - a;
                            this.j = i11;
                            if (i11 == 0) {
                                this.a.c();
                                d(1);
                            }
                        }
                    } else {
                        if (e(pthVar, this.b.a, Math.min(10, this.i)) && e(pthVar, null, this.i)) {
                            this.b.j(0);
                            if (this.f) {
                                this.b.l(4);
                                int d = this.b.d(3);
                                this.b.l(1);
                                int d2 = this.b.d(15);
                                this.b.l(1);
                                long d3 = (d2 << 15) | (d << 30) | this.b.d(15);
                                this.b.l(1);
                                if (!this.h && this.g) {
                                    this.b.l(4);
                                    int d4 = this.b.d(3);
                                    this.b.l(1);
                                    int d5 = this.b.d(15);
                                    this.b.l(1);
                                    int d6 = this.b.d(15);
                                    this.b.l(1);
                                    this.e.b((d4 << 30) | (d5 << 15) | d6);
                                    this.h = true;
                                }
                                j = this.e.b(d3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.k ? 0 : 4;
                            this.a.d(j, i6);
                            d(3);
                            i2 = -1;
                        }
                    }
                } else if (e(pthVar, this.b.a, 9)) {
                    int i12 = 0;
                    this.b.j(0);
                    int d7 = this.b.d(24);
                    if (d7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(d7);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.j = -1;
                    } else {
                        this.b.l(8);
                        int d8 = this.b.d(16);
                        this.b.l(5);
                        this.k = this.b.n();
                        this.b.l(2);
                        this.f = this.b.n();
                        this.g = this.b.n();
                        this.b.l(6);
                        int d9 = this.b.d(8);
                        this.i = d9;
                        if (d8 == 0) {
                            this.j = -1;
                        } else {
                            int i13 = (d8 - 3) - d9;
                            this.j = i13;
                            if (i13 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i13);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.j = -1;
                                i12 = 2;
                            }
                        }
                        i2 = -1;
                        i12 = 2;
                    }
                    d(i12);
                } else {
                    i2 = -1;
                }
            } else {
                pthVar.H(pthVar.a());
            }
            i3 = 2;
        }
    }

    @Override // defpackage.bna
    public final void b(ptq ptqVar, bik bikVar, bmz bmzVar) {
        this.e = ptqVar;
        this.a.b(bikVar, bmzVar);
    }

    @Override // defpackage.bna
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.e();
    }
}
