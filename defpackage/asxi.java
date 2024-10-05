package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxi implements aala {
    public static final aalb a = new asxh();
    public final aakv b;
    public final asxk c;

    public asxi(asxk asxkVar, aakv aakvVar) {
        this.c = asxkVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asxk asxkVar = this.c;
        if ((asxkVar.c & 4) != 0) {
            amsvVar.c(asxkVar.f);
        }
        amxe it = ((amru) getItemsModels()).iterator();
        while (it.hasNext()) {
            asxf asxfVar = (asxf) it.next();
            amsv amsvVar2 = new amsv();
            asxj asxjVar = asxfVar.a;
            if (asxjVar.b == 1) {
                amsvVar2.c((String) asxjVar.c);
            }
            asxj asxjVar2 = asxfVar.a;
            if (asxjVar2.b == 2) {
                amsvVar2.c((String) asxjVar2.c);
            }
            amsvVar.j(amsvVar2.g());
        }
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asxg e() {
        return new asxg(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asxi) && this.c.equals(((asxi) obj).c);
    }

    public List getItems() {
        return this.c.e;
    }

    public List getItemsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.e.iterator();
        while (it.hasNext()) {
            aone builder = ((asxj) it.next()).toBuilder();
            amrpVar.h(new asxf((asxj) builder.build(), this.b));
        }
        return amrpVar.g();
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("MainRecommendedDownloadsListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
