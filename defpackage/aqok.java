package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqok implements aala {
    public static final aalb a = new aqoj();
    private final aakv b;
    private final aqol c;

    public aqok(aqol aqolVar, aakv aakvVar) {
        this.c = aqolVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aqol aqolVar = this.c;
        if ((aqolVar.c & 64) != 0) {
            amsvVar.c(aqolVar.j);
        }
        amsvVar.j(getThumbnailModel().a());
        amxe it = ((amru) getBadgeInfoModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(apjp.a());
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
        return new aqoi(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqok) && this.c.equals(((aqok) obj).c);
    }

    public List getBadgeInfo() {
        return this.c.r;
    }

    public List getBadgeInfoModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.r.iterator();
        while (it.hasNext()) {
            amrpVar.h(apjp.b((apjq) it.next()).p());
        }
        return amrpVar.g();
    }

    public String getChannelOwner() {
        return this.c.g;
    }

    public Boolean getIsAndroid() {
        return Boolean.valueOf(this.c.m);
    }

    public Boolean getIsLargeFormFactor() {
        return Boolean.valueOf(this.c.n);
    }

    public Integer getPlaybackPositionSeconds() {
        return Integer.valueOf(this.c.k);
    }

    public String getPublishedTimeText() {
        return this.c.q;
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

    public Integer getUiType() {
        return Integer.valueOf(this.c.o);
    }

    public String getVideoId() {
        return this.c.l;
    }

    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }

    public Integer getVideoLengthSeconds() {
        return Integer.valueOf(this.c.h);
    }

    public String getViewCountText() {
        return this.c.p;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("DownloadsPageVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
