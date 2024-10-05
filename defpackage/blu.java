package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blu implements bih {
    private final blv a;
    private final pth b;
    private final pth c;
    private final ptg d;
    private bik e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public blu() {
        this(null);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.e = bikVar;
        this.a.b(bikVar, new bmz(0, 1));
        bikVar.q();
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        this.h = false;
        this.a.e();
        this.f = j2;
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        int i = 0;
        while (true) {
            biiVar.j(this.c.a, 0, 10);
            this.c.G(0);
            if (this.c.k() != 4801587) {
                break;
            }
            this.c.H(3);
            int h = this.c.h();
            i += h + 10;
            biiVar.f(h);
        }
        biiVar.l();
        biiVar.f(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            biiVar.j(this.c.a, 0, 2);
            this.c.G(0);
            if (blv.f(this.c.m())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                biiVar.j(this.c.a, 0, 4);
                this.d.j(14);
                int d = this.d.d(13);
                if (d <= 6) {
                    i2++;
                    biiVar.l();
                    biiVar.f(i2);
                } else {
                    biiVar.f(d - 6);
                    i4 += d;
                }
            } else {
                i2++;
                biiVar.l();
                biiVar.f(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        pse.d(this.e);
        int g = biiVar.g(this.b.a, 0, 2048);
        if (!this.i) {
            this.e.w(new biy(-9223372036854775807L));
            this.i = true;
        }
        if (g == -1) {
            return -1;
        }
        this.b.G(0);
        this.b.F(g);
        if (!this.h) {
            this.a.d(this.f, 4);
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public blu(byte[] bArr) {
        this.a = new blv(true, null);
        this.b = new pth(2048);
        this.g = -1L;
        pth pthVar = new pth(10);
        this.c = pthVar;
        this.d = new ptg(pthVar.a);
    }
}
