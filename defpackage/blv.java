package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blv implements bly {
    private static final byte[] b = {73, 68, 51};
    public long a;
    private final boolean c;
    private final ptg d = new ptg(new byte[7]);
    private final pth e = new pth(Arrays.copyOf(b, 10));
    private final String f;
    private String g;
    private bjc h;
    private bjc i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private long t;
    private bjc u;
    private long v;

    public blv(boolean z, String str) {
        h();
        this.o = -1;
        this.p = -1;
        this.a = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.c = z;
        this.f = str;
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    private final void g() {
        this.n = false;
        h();
    }

    private final void h() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    private final void i() {
        this.j = 3;
        this.k = 0;
    }

    private final void j(bjc bjcVar, long j, int i, int i2) {
        this.j = 4;
        this.k = i;
        this.u = bjcVar;
        this.v = j;
        this.s = i2;
    }

    private final boolean k(pth pthVar, byte[] bArr, int i) {
        int min = Math.min(pthVar.a(), i - this.k);
        pthVar.B(bArr, this.k, min);
        int i2 = this.k + min;
        this.k = i2;
        return i2 == i;
    }

    private static final boolean l(byte b2) {
        return f((b2 & 255) | 65280);
    }

    private static final boolean m(pth pthVar, byte[] bArr, int i) {
        if (pthVar.a() < i) {
            return false;
        }
        pthVar.B(bArr, 0, i);
        return true;
    }

    @Override // defpackage.bly
    public final void a(pth pthVar) {
        int i;
        int i2;
        int i3;
        pse.c(this.h);
        int i4 = pts.a;
        while (pthVar.a() > 0) {
            int i5 = this.j;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] bArr = pthVar.a;
                int i8 = pthVar.b;
                int i9 = pthVar.c;
                while (true) {
                    if (i8 < i9) {
                        i = i8 + 1;
                        i2 = bArr[i8] & 255;
                        if (this.l == 512 && l((byte) i2)) {
                            if (!this.n) {
                                int i10 = i - 2;
                                pthVar.G(i10 + 1);
                                if (m(pthVar, this.d.a, 1)) {
                                    this.d.j(4);
                                    int d = this.d.d(1);
                                    int i11 = this.o;
                                    if (i11 == -1 || d == i11) {
                                        if (this.p != -1) {
                                            if (!m(pthVar, this.d.a, 1)) {
                                                break;
                                            }
                                            this.d.j(i7);
                                            if (this.d.d(4) == this.p) {
                                                pthVar.G(i10 + 2);
                                            }
                                        }
                                        if (!m(pthVar, this.d.a, 4)) {
                                            break;
                                        }
                                        this.d.j(14);
                                        int d2 = this.d.d(i6);
                                        if (d2 >= 7) {
                                            byte[] bArr2 = pthVar.a;
                                            int i12 = pthVar.c;
                                            int i13 = i10 + d2;
                                            if (i13 >= i12) {
                                                break;
                                            } else if ((r8 = bArr2[i13]) == -1) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i14 = this.l;
                        int i15 = i14 | i2;
                        if (i15 == 329) {
                            i3 = 768;
                        } else if (i15 == 511) {
                            i3 = 512;
                        } else if (i15 == 836) {
                            i3 = 1024;
                        } else {
                            if (i15 == 1075) {
                                this.j = 2;
                                this.k = 3;
                                this.s = 0;
                                this.e.G(0);
                                pthVar.G(i);
                                break;
                            }
                            if (i14 != 256) {
                                this.l = 256;
                                i8 = i - 1;
                                i6 = 13;
                                i7 = 2;
                            } else {
                                i8 = i;
                                i6 = 13;
                                i7 = 2;
                            }
                        }
                        this.l = i3;
                        i8 = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        pthVar.G(i8);
                        break;
                    }
                }
                this.q = (i2 & 8) >> 3;
                this.m = 1 == ((i2 & 1) ^ 1);
                if (this.n) {
                    i();
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                pthVar.G(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(pthVar.a(), this.s - this.k);
                        this.u.t(pthVar, min);
                        int i16 = this.k + min;
                        this.k = i16;
                        int i17 = this.s;
                        if (i16 == i17) {
                            long j = this.t;
                            if (j != -9223372036854775807L) {
                                this.u.v(j, 1, i17, 0, null);
                                this.t += this.v;
                            }
                            h();
                        }
                    } else {
                        if (k(pthVar, this.d.a, true != this.m ? 5 : 7)) {
                            this.d.j(0);
                            if (!this.r) {
                                int d3 = this.d.d(2) + 1;
                                if (d3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(d3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.d.l(5);
                                int d4 = this.d.d(3);
                                int i18 = this.p;
                                int i19 = bhq.a;
                                byte[] bArr3 = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((d4 << 3) & 120) | ((i18 << 7) & 128))};
                                bagd a = bhq.a(bArr3);
                                pmr pmrVar = new pmr();
                                pmrVar.a = this.g;
                                pmrVar.k = "audio/mp4a-latm";
                                pmrVar.h = a.a;
                                pmrVar.x = a.c;
                                pmrVar.y = a.b;
                                pmrVar.m = Collections.singletonList(bArr3);
                                pmrVar.c = this.f;
                                pms a2 = pmrVar.a();
                                this.a = 1024000000 / a2.B;
                                this.h.rp(a2);
                                this.r = true;
                            } else {
                                this.d.l(10);
                            }
                            this.d.l(4);
                            int d5 = this.d.d(13) - 7;
                            if (this.m) {
                                d5 -= 2;
                            }
                            j(this.h, this.a, 0, d5);
                        }
                    }
                } else if (k(pthVar, this.e.a, 10)) {
                    this.i.t(this.e, 10);
                    this.e.G(6);
                    j(this.i, 0L, 10, this.e.h() + 10);
                }
            } else if (pthVar.a() != 0) {
                ptg ptgVar = this.d;
                ptgVar.a[0] = pthVar.a[pthVar.b];
                ptgVar.j(2);
                int d6 = this.d.d(4);
                int i20 = this.p;
                if (i20 == -1 || d6 == i20) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = d6;
                    }
                    i();
                } else {
                    g();
                }
            }
        }
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.g = bmzVar.b();
        bjc n = bikVar.n(bmzVar.a(), 1);
        this.h = n;
        this.u = n;
        if (this.c) {
            bmzVar.c();
            bjc n2 = bikVar.n(bmzVar.a(), 5);
            this.i = n2;
            pmr pmrVar = new pmr();
            pmrVar.a = bmzVar.b();
            pmrVar.k = "application/id3";
            n2.rp(pmrVar.a());
            return;
        }
        this.i = new big();
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.t = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        this.t = -9223372036854775807L;
        g();
    }
}
