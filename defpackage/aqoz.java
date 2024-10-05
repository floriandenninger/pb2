package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoz implements aala {
    public static final aalb a = new aqoy();
    public final aqpc b;

    public aqoz(aqpc aqpcVar) {
        this.b = aqpcVar;
    }

    public static aqox b(aqpc aqpcVar) {
        return new aqox(aqpcVar.toBuilder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aqpc aqpcVar = this.b;
        if ((aqpcVar.c & 8) != 0) {
            amsvVar.c(aqpcVar.h);
        }
        amxe it = ((amru) getLicensesModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(new amsv().g());
        }
        getErrorModel();
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aqox(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqoz) && this.b.equals(((aqoz) obj).b);
    }

    public aqpb getError() {
        aqpb aqpbVar = this.b.i;
        return aqpbVar == null ? aqpb.a : aqpbVar;
    }

    public aqow getErrorModel() {
        aqpb aqpbVar = this.b.i;
        if (aqpbVar == null) {
            aqpbVar = aqpb.a;
        }
        return new aqow((aqpb) aqpbVar.toBuilder().build());
    }

    public Long getLicenseExpirySeconds() {
        return Long.valueOf(this.b.g);
    }

    public List getLicenses() {
        return this.b.e;
    }

    public List getLicensesModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.e.iterator();
        while (it.hasNext()) {
            amrpVar.h(new aqpa((aqpd) ((aqpd) it.next()).toBuilder().build()));
        }
        return amrpVar.g();
    }

    public Long getPlaybackStartSeconds() {
        return Long.valueOf(this.b.f);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("DrmLicenseEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
