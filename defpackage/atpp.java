package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpp {
    private final aakv a;
    private final atpq b;

    public atpp(atpq atpqVar, aakv aakvVar) {
        this.b = atpqVar;
        this.a = aakvVar;
    }

    public static awxk b(atpq atpqVar) {
        return new awxk(atpqVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amsx a() {
        amsv amsvVar = new amsv();
        atpo atpoVar = this.b.e;
        if (atpoVar == null) {
            atpoVar = atpo.b;
        }
        new atpm((atpo) ((aong) atpoVar.toBuilder()).build());
        amsvVar.j(new amsv().g());
        amrp amrpVar = new amrp();
        Iterator it = this.b.f.iterator();
        while (it.hasNext()) {
            amrpVar.h(b((atpq) it.next()).f(this.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            amsvVar.j(((atpp) it2.next()).a());
        }
        amrp amrpVar2 = new amrp();
        Iterator it3 = this.b.g.iterator();
        while (it3.hasNext()) {
            amrpVar2.h(b((atpq) it3.next()).f(this.a));
        }
        amxe it4 = amrpVar2.g().iterator();
        while (it4.hasNext()) {
            amsvVar.j(((atpp) it4.next()).a());
        }
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atpp) && this.b.equals(((atpp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("OfflineOrchestrationActionModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
