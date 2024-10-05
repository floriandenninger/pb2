package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvm extends vvk {
    public String a;
    public List b;

    public vvm(vvn vvnVar) {
        super(vvnVar);
    }

    @Override // defpackage.vvk
    public final void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        this.a = f.g();
        f.d();
        this.b = new ArrayList();
        while (f.b() > 4) {
            this.b.add(f.g());
        }
        f.k(f.b());
        vvjVar.j(f);
    }
}
