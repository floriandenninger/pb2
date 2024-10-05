package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnp implements aala {
    public static final aalb a = new aqno();
    private final aakv b;
    private final aqnr c;

    public aqnp(aqnr aqnrVar, aakv aakvVar) {
        this.c = aqnrVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aqnr aqnrVar = this.c;
        if ((aqnrVar.c & 256) != 0) {
            amsvVar.c(aqnrVar.l);
        }
        amsvVar.j(getPlaylistThumbnailModel().a());
        aqnm playlistCollageThumbnailModel = getPlaylistCollageThumbnailModel();
        amsv amsvVar2 = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = playlistCollageThumbnailModel.b.c.iterator();
        while (it.hasNext()) {
            amrpVar.h(avgj.b((avgg) it.next()).b(playlistCollageThumbnailModel.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            amsvVar2.j(((avgj) it2.next()).a());
        }
        amrp amrpVar2 = new amrp();
        Iterator it3 = playlistCollageThumbnailModel.b.d.iterator();
        while (it3.hasNext()) {
            amrpVar2.h(avgj.b((avgg) it3.next()).b(playlistCollageThumbnailModel.a));
        }
        amxe it4 = amrpVar2.g().iterator();
        while (it4.hasNext()) {
            amsvVar2.j(((avgj) it4.next()).a());
        }
        amsvVar.j(amsvVar2.g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.f;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aqnn(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqnp) && this.c.equals(((aqnp) obj).c);
    }

    public String getChannelOwnerName() {
        return this.c.i;
    }

    public String getLastSyncedTimeText() {
        return this.c.o;
    }

    public aqnq getPlaylistCollageThumbnail() {
        aqnr aqnrVar = this.c;
        return aqnrVar.d == 7 ? (aqnq) aqnrVar.e : aqnq.a;
    }

    public aqnm getPlaylistCollageThumbnailModel() {
        aqnr aqnrVar = this.c;
        return new awxk((aqnrVar.d == 7 ? (aqnq) aqnrVar.e : aqnq.a).toBuilder()).l(this.b);
    }

    public String getPlaylistId() {
        return this.c.g;
    }

    public avgg getPlaylistThumbnail() {
        aqnr aqnrVar = this.c;
        return aqnrVar.d == 6 ? (avgg) aqnrVar.e : avgg.a;
    }

    public avgj getPlaylistThumbnailModel() {
        aqnr aqnrVar = this.c;
        return avgj.b(aqnrVar.d == 6 ? (avgg) aqnrVar.e : avgg.a).b(this.b);
    }

    public String getShareText() {
        return this.c.m;
    }

    public String getTitle() {
        return this.c.h;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public Integer getUiType() {
        return Integer.valueOf(this.c.n);
    }

    public Integer getVideoCount() {
        return Integer.valueOf(this.c.k);
    }

    public String getVideoCountText() {
        return this.c.j;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DownloadsPagePlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
