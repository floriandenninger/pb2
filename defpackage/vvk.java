package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vvk {
    private final vvn a;

    public vvk(vvn vvnVar) {
        this.a = vvnVar;
    }

    public final long a() {
        vvn vvnVar = this.a;
        return vvnVar.a - vvnVar.e;
    }

    public final long b() {
        return this.a.d;
    }

    public List c() {
        return new ArrayList();
    }

    public final List d(String str) {
        ArrayList arrayList = new ArrayList();
        for (vvk vvkVar : c()) {
            if (vvkVar.a.b.equals(str)) {
                arrayList.add(vvkVar);
            }
        }
        return arrayList;
    }

    public void e(vvj vvjVar) {
        vvj f = vvjVar.f(a());
        f.k(a());
        vvjVar.j(f);
    }
}
