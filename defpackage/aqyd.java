package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyd {
    private final aakv a;
    private final aqyg b;

    public aqyd(aqyg aqygVar, aakv aakvVar) {
        this.b = aqygVar;
        this.a = aakvVar;
    }

    public static awns b(aqyg aqygVar) {
        return new awns((aong) aqygVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amsx a() {
        amsv amsvVar = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            aong aongVar = (aong) ((aqyi) it.next()).toBuilder();
            amrpVar.h(new aqyf((aqyi) aongVar.build(), this.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            aqyf aqyfVar = (aqyf) it2.next();
            amsv amsvVar2 = new amsv();
            apxf apxfVar = aqyfVar.b.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            amsvVar2.j(apxe.b(apxfVar).e(aqyfVar.a).a());
            asuh asuhVar = aqyfVar.b.n;
            if (asuhVar == null) {
                asuhVar = asuh.b;
            }
            amsvVar2.j(asug.b(asuhVar).c(aqyfVar.a).a());
            amsvVar.j(amsvVar2.g());
        }
        aqyh aqyhVar = this.b.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        aone builder = aqyhVar.toBuilder();
        aqye aqyeVar = new aqye((aqyh) builder.build(), this.a);
        amsv amsvVar3 = new amsv();
        aots aotsVar = aqyeVar.b.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        amsvVar3.j(aotq.b(aotsVar).r().a());
        amsvVar.j(amsvVar3.g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqyd) && this.b.equals(((aqyd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("FormattedStringModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
