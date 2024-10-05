package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvq extends vvt {
    private final int[] a;

    public vvq(vvn vvnVar) {
        super(vvnVar);
        this.a = new int[9];
    }

    @Override // defpackage.vvt, defpackage.vvk
    public final void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        super.e(f);
        int i = this.c;
        if (i == 0) {
            f.d();
            f.d();
            f.d();
            f.k(4L);
            f.d();
        } else if (i == 1) {
            f.e();
            f.e();
            f.d();
            f.k(4L);
            f.e();
        } else {
            throw new vvu("Invalid atom version");
        }
        f.k(8L);
        f.m();
        f.m();
        f.m();
        f.k(2L);
        for (int i2 = 0; i2 < 9; i2++) {
            this.a[i2] = f.a();
        }
        f.d();
        f.d();
        f.k(f.b());
        vvjVar.j(f);
    }
}
