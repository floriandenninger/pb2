package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmv {
    private final aakv a;
    private final awnd b;

    public awmv(awnd awndVar, aakv aakvVar) {
        this.b = awndVar;
        this.a = aakvVar;
    }

    public static awxk b(awnd awndVar) {
        return new awxk(awndVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amsx a() {
        amsv amsvVar = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = this.b.e.iterator();
        while (it.hasNext()) {
            aong aongVar = (aong) ((awne) it.next()).toBuilder();
            amrpVar.h(new awmw((awne) aongVar.build(), this.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            awmw awmwVar = (awmw) it2.next();
            amsv amsvVar2 = new amsv();
            awnw awnwVar = awmwVar.b.e;
            if (awnwVar == null) {
                awnwVar = awnw.a;
            }
            awns a = awnt.a(awnwVar);
            aakv aakvVar = awmwVar.a;
            a.a();
            amsvVar2.j(awnt.b());
            awnw awnwVar2 = awmwVar.b.f;
            if (awnwVar2 == null) {
                awnwVar2 = awnw.a;
            }
            awns a2 = awnt.a(awnwVar2);
            aakv aakvVar2 = awmwVar.a;
            a2.a();
            amsvVar2.j(awnt.b());
            awoa awoaVar = awmwVar.b.g;
            if (awoaVar == null) {
                awoaVar = awoa.a;
            }
            awxk b = awnv.b(awoaVar);
            aakv aakvVar3 = awmwVar.a;
            amsvVar2.j(b.b().a());
            awoa awoaVar2 = awmwVar.b.h;
            if (awoaVar2 == null) {
                awoaVar2 = awoa.a;
            }
            awxk b2 = awnv.b(awoaVar2);
            aakv aakvVar4 = awmwVar.a;
            amsvVar2.j(b2.b().a());
            amsvVar.j(amsvVar2.g());
        }
        amrp amrpVar2 = new amrp();
        Iterator it3 = this.b.f.iterator();
        while (it3.hasNext()) {
            aong aongVar2 = (aong) ((awnh) it3.next()).toBuilder();
            amrpVar2.h(new awna((awnh) aongVar2.build(), this.a));
        }
        amxe it4 = amrpVar2.g().iterator();
        while (it4.hasNext()) {
            awna awnaVar = (awna) it4.next();
            amsv amsvVar3 = new amsv();
            awni awniVar = awnaVar.b.m;
            if (awniVar == null) {
                awniVar = awni.a;
            }
            aong aongVar3 = (aong) awniVar.toBuilder();
            aakv aakvVar5 = awnaVar.a;
            new awmz((awni) aongVar3.build());
            amsvVar3.j(new amsv().g());
            amsvVar.j(amsvVar3.g());
        }
        amrp amrpVar3 = new amrp();
        Iterator it5 = this.b.g.iterator();
        while (it5.hasNext()) {
            amrpVar3.h(new awmu((awnc) ((awnc) it5.next()).toBuilder().build()));
        }
        amxe it6 = amrpVar3.g().iterator();
        while (it6.hasNext()) {
            amsvVar.j(new amsv().g());
        }
        amrp amrpVar4 = new amrp();
        Iterator it7 = this.b.h.iterator();
        while (it7.hasNext()) {
            aone builder = ((awnf) it7.next()).toBuilder();
            amrpVar4.h(new awmx((awnf) builder.build(), this.a));
        }
        amxe it8 = amrpVar4.g().iterator();
        while (it8.hasNext()) {
            awmx awmxVar = (awmx) it8.next();
            amsv amsvVar4 = new amsv();
            awnj awnjVar = awmxVar.b.b;
            if (awnjVar == null) {
                awnjVar = awnj.a;
            }
            aong aongVar4 = (aong) awnjVar.toBuilder();
            aakv aakvVar6 = awmxVar.a;
            new awnb((awnj) aongVar4.build());
            amsvVar4.j(new amsv().g());
            amsvVar.j(amsvVar4.g());
        }
        awng awngVar = this.b.i;
        if (awngVar == null) {
            awngVar = awng.a;
        }
        new awmy((awng) awngVar.toBuilder().build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmv) && this.b.equals(((awmv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("AttributedStringModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
