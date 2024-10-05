package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjl implements bih {
    private bik f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private bjk o;
    private bjp p;
    private final pth a = new pth(4);
    private final pth b = new pth(9);
    private final pth c = new pth(11);
    private final pth d = new pth();
    private final bjm e = new bjm();
    private int g = 1;

    private final pth a(bii biiVar) {
        if (this.l > this.d.b()) {
            pth pthVar = this.d;
            int b = pthVar.b();
            pthVar.E(new byte[Math.max(b + b, this.l)], 0);
        } else {
            this.d.G(0);
        }
        this.d.F(this.l);
        biiVar.k(this.d.a, 0, this.l);
        return this.d;
    }

    private final void b() {
        if (this.n) {
            return;
        }
        this.f.w(new biy(-9223372036854775807L));
        this.n = true;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.f = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        biiVar.j(this.a.a, 0, 3);
        this.a.G(0);
        if (this.a.k() != 4607062) {
            return false;
        }
        biiVar.j(this.a.a, 0, 2);
        this.a.G(0);
        if ((this.a.m() & 250) != 0) {
            return false;
        }
        biiVar.j(this.a.a, 0, 4);
        this.a.G(0);
        int d = this.a.d();
        biiVar.l();
        biiVar.f(d);
        biiVar.j(this.a.a, 0, 4);
        this.a.G(0);
        return this.a.d() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r17, defpackage.tfq r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjl.h(bii, tfq):int");
    }
}
