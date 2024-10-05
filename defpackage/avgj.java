package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgj {
    private final aakv a;
    private final avgg b;

    public avgj(avgg avggVar, aakv aakvVar) {
        this.b = avggVar;
        this.a = aakvVar;
    }

    public static awns b(avgg avggVar) {
        return new awns((aong) avggVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amsx a() {
        amsv amsvVar = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            amrpVar.h(new avgk((avgf) ((avgf) it.next()).toBuilder().build()));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            amsvVar.j(new amsv().g());
        }
        aott aottVar = this.b.d;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        amsvVar.j(aotr.b(aottVar).q(this.a).a());
        avgd avgdVar = this.b.e;
        if (avgdVar == null) {
            avgdVar = avgd.a;
        }
        avgh avghVar = new avgh((avgd) avgdVar.toBuilder().build());
        amsv amsvVar2 = new amsv();
        asvd asvdVar = avghVar.a.b;
        if (asvdVar == null) {
            asvdVar = asvd.a;
        }
        new asve((asvd) asvdVar.toBuilder().build());
        amsvVar2.j(new amsv().g());
        amsvVar.j(amsvVar2.g());
        avge avgeVar = this.b.g;
        if (avgeVar == null) {
            avgeVar = avge.a;
        }
        new avgi((avge) avgeVar.toBuilder().build());
        amsvVar.j(new amsv().g());
        asnf asnfVar = this.b.h;
        if (asnfVar == null) {
            asnfVar = asnf.a;
        }
        asne.b(asnfVar).j();
        amsvVar.j(asne.a());
        asnf asnfVar2 = this.b.i;
        if (asnfVar2 == null) {
            asnfVar2 = asnf.a;
        }
        asne.b(asnfVar2).j();
        amsvVar.j(asne.a());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avgj) && this.b.equals(((avgj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ThumbnailDetailsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
