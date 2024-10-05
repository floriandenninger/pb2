package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswz implements aala {
    public static final aalb a = new aswy();
    private final asxa b;

    public aswz(asxa asxaVar) {
        this.b = asxaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asxa asxaVar = this.b;
        if ((asxaVar.b & 4) != 0) {
            amsvVar.c(asxaVar.d);
        }
        if (this.b.e.size() > 0) {
            amsvVar.j(this.b.e);
        }
        asxa asxaVar2 = this.b;
        if ((asxaVar2.b & 8) != 0) {
            amsvVar.c(asxaVar2.g);
        }
        amxe it = ((amru) getFormatsModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(aqlk.a());
        }
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aswx(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aswz) && this.b.equals(((aswz) obj).b);
    }

    public List getFormats() {
        return this.b.f;
    }

    public List getFormatsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.f.iterator();
        while (it.hasNext()) {
            amrpVar.h(aqlk.b((aqll) it.next()).o());
        }
        return amrpVar.g();
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("MainRecommendedDownloadPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
