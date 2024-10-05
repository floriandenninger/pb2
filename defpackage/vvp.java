package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvp extends vvt {
    public long[] a;
    public long b;

    public vvp(vvn vvnVar) {
        super(vvnVar);
    }

    @Override // defpackage.vvt, defpackage.vvk
    public final void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        super.e(f);
        int d = (int) f.d();
        this.a = new long[d];
        this.b = f.c();
        for (int i = 0; i < d; i++) {
            this.a[i] = f.d();
        }
        f.k(f.b());
        vvjVar.j(f);
    }
}
