package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvo extends vvt {
    private final int[] a;

    public vvo(vvn vvnVar) {
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
            f.d();
        } else if (i == 1) {
            f.e();
            f.e();
            f.d();
            f.e();
        } else {
            throw new vvu("Invalid atom version");
        }
        f.a();
        f.m();
        f.k(10L);
        for (int i2 = 0; i2 < 9; i2++) {
            this.a[i2] = f.a();
        }
        f.k(24L);
        f.d();
        f.k(f.b());
        vvjVar.j(f);
    }
}
