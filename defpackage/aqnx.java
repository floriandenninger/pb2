package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnx implements aala {
    public static final aalb a = new aqnw();
    private final aakv b;
    private final aqny c;

    public aqnx(aqny aqnyVar, aakv aakvVar) {
        this.c = aqnyVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aqny aqnyVar = this.c;
        if ((aqnyVar.c & 64) != 0) {
            amsvVar.c(aqnyVar.j);
        }
        amsvVar.j(getThumbnailModel().a());
        amxe it = ((amru) getRecommendedDownloadFormatsModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(aqlk.a());
        }
        return amsvVar.g();
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
        return new aqnv(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqnx) && this.c.equals(((aqnx) obj).c);
    }

    public String getChannelOwner() {
        return this.c.g;
    }

    public List getRecommendedDownloadFormats() {
        return this.c.m;
    }

    public List getRecommendedDownloadFormatsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.m.iterator();
        while (it.hasNext()) {
            amrpVar.h(aqlk.b((aqll) it.next()).o());
        }
        return amrpVar.g();
    }

    public aomf getScoringTrackingParams() {
        return this.c.n;
    }

    public avgg getThumbnail() {
        avgg avggVar = this.c.e;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getThumbnailModel() {
        avgg avggVar = this.c.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.b);
    }

    public String getTitle() {
        return this.c.f;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public String getVideoId() {
        return this.c.k;
    }

    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }

    public Integer getVideoLengthSeconds() {
        return Integer.valueOf(this.c.h);
    }

    public String getViewCountText() {
        return this.c.l;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("DownloadsPageRecommendedVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
