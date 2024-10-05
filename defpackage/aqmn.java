package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmn implements aala {
    public static final aalb a = new aqmm();
    private final aakv b;
    private final aqmo c;

    public aqmn(aqmo aqmoVar, aakv aakvVar) {
        this.c = aqmoVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getThumbnailModel().a());
        amxe it = ((amru) getBadgesModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(apjp.a());
        }
        amsvVar.j(getChannelAvatarModel().a());
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
        return new aqml(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqmn) && this.c.equals(((aqmn) obj).c);
    }

    public List getBadges() {
        return this.c.o;
    }

    public List getBadgesModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.o.iterator();
        while (it.hasNext()) {
            amrpVar.h(apjp.b((apjq) it.next()).p());
        }
        return amrpVar.g();
    }

    public avgg getChannelAvatar() {
        avgg avggVar = this.c.p;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getChannelAvatarModel() {
        avgg avggVar = this.c.p;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.b);
    }

    public String getChannelOwner() {
        return this.c.g;
    }

    public Integer getPlaybackPositionSeconds() {
        return Integer.valueOf(this.c.j);
    }

    public String getPublishedTimeText() {
        return this.c.n;
    }

    public avgg getThumbnail() {
        avgg avggVar = this.c.k;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getThumbnailModel() {
        avgg avggVar = this.c.k;
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
        return Integer.valueOf(this.c.l);
    }

    public String getVideoId() {
        return this.c.e;
    }

    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }

    public Integer getVideoLengthSeconds() {
        return Integer.valueOf(this.c.h);
    }

    public String getViewCountText() {
        return this.c.m;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("DownloadedVideoWithContextEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
