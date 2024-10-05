package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvl extends vvt {
    public long a;
    public long[] b;

    public vvl(vvn vvnVar) {
        super(vvnVar);
    }

    @Override // defpackage.vvt, defpackage.vvk
    public final void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        super.e(f);
        int e = (int) f.e();
        this.b = new long[e];
        this.a = f.c();
        for (int i = 0; i < e; i++) {
            this.b[i] = f.e();
        }
        f.k(f.b());
        vvjVar.j(f);
    }
}
