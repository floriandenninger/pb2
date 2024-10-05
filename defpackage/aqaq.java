package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqaq implements aala {
    public static final aalb a = new aqap();
    private final aakv b;
    private final aqar c;

    public aqaq(aqar aqarVar, aakv aakvVar) {
        this.c = aqarVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        aqax aqaxVar;
        amsv amsvVar = new amsv();
        aqas commerceAcquisitionClientPayloadModel = getCommerceAcquisitionClientPayloadModel();
        amsv amsvVar2 = new amsv();
        aqav aqavVar = commerceAcquisitionClientPayloadModel.a;
        if (aqavVar.b == 1) {
            aqaxVar = (aqax) aqavVar.c;
        } else {
            aqaxVar = aqax.a;
        }
        aqat aqatVar = new aqat((aqax) aqaxVar.toBuilder().build());
        amsv amsvVar3 = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = aqatVar.a.b.iterator();
        while (it.hasNext()) {
            amrpVar.h(new aqau((aqaw) ((aqaw) it.next()).toBuilder().build()));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            amsvVar3.j(new amsv().g());
        }
        amsvVar2.j(amsvVar3.g());
        amsvVar.j(amsvVar2.g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aqao(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqaq) && this.c.equals(((aqaq) obj).c);
    }

    public aqav getCommerceAcquisitionClientPayload() {
        aqav aqavVar = this.c.d;
        return aqavVar == null ? aqav.a : aqavVar;
    }

    public aqas getCommerceAcquisitionClientPayloadModel() {
        aqav aqavVar = this.c.d;
        if (aqavVar == null) {
            aqavVar = aqav.a;
        }
        return new aqas((aqav) aqavVar.toBuilder().build());
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("CommerceAcquisitionClientPayloadEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
