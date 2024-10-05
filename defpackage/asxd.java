package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxd implements aala {
    public static final aalb a = new asxc();
    private final aakv b;
    private final asxe c;

    public asxd(asxe asxeVar, aakv aakvVar) {
        this.c = asxeVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asxe asxeVar = this.c;
        if ((asxeVar.c & 4) != 0) {
            amsvVar.c(asxeVar.e);
        }
        asxe asxeVar2 = this.c;
        if ((asxeVar2.c & 8) != 0) {
            amsvVar.c(asxeVar2.g);
        }
        amxe it = ((amru) getFormatsModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(aqlk.a());
        }
        getLocalizedStringsModel();
        amsvVar.j(awjl.a());
        return amsvVar.g();
    }

    public final awjp b() {
        aakt b = this.b.b(this.c.g);
        boolean z = true;
        if (b != null && !(b instanceof awjp)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (awjp) b;
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
    public final /* bridge */ /* synthetic */ whu e() {
        return new asxb(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asxd) && this.c.equals(((asxd) obj).c);
    }

    public List getFormats() {
        return this.c.f;
    }

    public List getFormatsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.f.iterator();
        while (it.hasNext()) {
            amrpVar.h(aqlk.b((aqll) it.next()).o());
        }
        return amrpVar.g();
    }

    public awjm getLocalizedStrings() {
        awjm awjmVar = this.c.h;
        return awjmVar == null ? awjm.a : awjmVar;
    }

    public awjl getLocalizedStringsModel() {
        awjm awjmVar = this.c.h;
        if (awjmVar == null) {
            awjmVar = awjm.a;
        }
        return awjl.b(awjmVar).d();
    }

    public aomf getScoringTrackingParams() {
        return this.c.i;
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
        sb.append("MainRecommendedDownloadVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
