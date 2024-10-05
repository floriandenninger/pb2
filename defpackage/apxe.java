package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxe {
    private final aakv a;
    private final apxf b;

    public apxe(apxf apxfVar, aakv aakvVar) {
        this.b = apxfVar;
        this.a = aakvVar;
    }

    public static awns b(apxf apxfVar) {
        return new awns((aong) apxfVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amsx a() {
        amsv amsvVar = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            aone builder = ((asus) it.next()).toBuilder();
            amrpVar.h(new asuo((asus) builder.build(), this.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            asuo asuoVar = (asuo) it2.next();
            amsv amsvVar2 = new amsv();
            amrp amrpVar2 = new amrp();
            Iterator it3 = asuoVar.b.d.iterator();
            while (it3.hasNext()) {
                aone builder2 = ((asur) it3.next()).toBuilder();
                aakv aakvVar = asuoVar.a;
                amrpVar2.h(new asun((asur) builder2.build()));
            }
            amxe it4 = amrpVar2.g().iterator();
            while (it4.hasNext()) {
                amsvVar2.j(new amsv().g());
            }
            amrp amrpVar3 = new amrp();
            Iterator it5 = asuoVar.b.e.iterator();
            while (it5.hasNext()) {
                aone builder3 = ((asut) it5.next()).toBuilder();
                aakv aakvVar2 = asuoVar.a;
                amrpVar3.h(new asup((asut) builder3.build()));
            }
            amxe it6 = amrpVar3.g().iterator();
            while (it6.hasNext()) {
                amsvVar2.j(new amsv().g());
            }
            amsvVar.j(amsvVar2.g());
        }
        apxg apxgVar = this.b.e;
        if (apxgVar == null) {
            apxgVar = apxg.a;
        }
        new apxd((apxg) ((aong) apxgVar.toBuilder()).build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxe) && this.b.equals(((apxe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("CommandModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
