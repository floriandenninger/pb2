package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blt implements bly {
    private final ptg a;
    private final pth b;
    private final String c;
    private String d;
    private bjc e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private pms j;
    private int k;
    private long l;

    public blt() {
        this(null);
    }

    @Override // defpackage.bly
    public final void a(pth pthVar) {
        pse.d(this.e);
        while (pthVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                while (pthVar.a() > 0) {
                    if (!this.h) {
                        this.h = pthVar.i() == 172;
                    } else {
                        int i2 = pthVar.i();
                        this.h = i2 == 172;
                        if (i2 != 64) {
                            if (i2 == 65) {
                                i2 = 65;
                            }
                        }
                        this.f = 1;
                        byte[] bArr = this.b.a;
                        bArr[0] = -84;
                        bArr[1] = i2 == 65 ? (byte) 65 : (byte) 64;
                        this.g = 2;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(pthVar.a(), 16 - this.g);
                pthVar.B(bArr2, this.g, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 == 16) {
                    this.a.j(0);
                    dkb c = bhs.c(this.a);
                    pms pmsVar = this.j;
                    if (pmsVar == null || pmsVar.A != 2 || c.c != pmsVar.B || !"audio/ac4".equals(pmsVar.n)) {
                        pmr pmrVar = new pmr();
                        pmrVar.a = this.d;
                        pmrVar.k = "audio/ac4";
                        pmrVar.x = 2;
                        pmrVar.y = c.c;
                        pmrVar.c = this.c;
                        pms a = pmrVar.a();
                        this.j = a;
                        this.e.rp(a);
                    }
                    this.k = c.a;
                    this.i = (c.b * 1000000) / this.j.B;
                    this.b.G(0);
                    this.e.t(this.b, 16);
                    this.f = 2;
                }
            } else {
                int min2 = Math.min(pthVar.a(), this.k - this.g);
                this.e.t(pthVar, min2);
                int i4 = this.g + min2;
                this.g = i4;
                int i5 = this.k;
                if (i4 == i5) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.v(j, 1, i5, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.d = bmzVar.b();
        this.e = bikVar.n(bmzVar.a(), 1);
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    public blt(String str) {
        ptg ptgVar = new ptg(new byte[16]);
        this.a = ptgVar;
        this.b = new pth(ptgVar.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
