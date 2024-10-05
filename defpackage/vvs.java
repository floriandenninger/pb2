package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvs extends vvk {
    protected final List a;

    public vvs(vvn vvnVar) {
        super(vvnVar);
        this.a = new ArrayList();
    }

    @Override // defpackage.vvk
    public final List c() {
        return this.a;
    }

    @Override // defpackage.vvk
    public final void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        while (f.b() > 8) {
            vvk p = vlu.p(vvn.a(f));
            p.e(f);
            this.a.add(p);
        }
        f.k(f.b());
        vvjVar.j(f);
    }
}
