package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asyr implements aala {
    public static final aalb a = new asyq();
    public final asyt b;

    public asyr(asyt asytVar) {
        this.b = asytVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        getActiveSectionInfoModel();
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asyp e() {
        return new asyp(this.b.toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof asyr) && this.b.equals(((asyr) obj).b);
    }

    public final boolean f() {
        return (this.b.c & 64) != 0;
    }

    public final boolean g() {
        return (this.b.c & 4) != 0;
    }

    public Integer getActiveItemIndex() {
        return Integer.valueOf(this.b.f);
    }

    public asys getActiveSectionInfo() {
        asys asysVar = this.b.h;
        return asysVar == null ? asys.a : asysVar;
    }

    public asyo getActiveSectionInfoModel() {
        asys asysVar = this.b.h;
        if (asysVar == null) {
            asysVar = asys.a;
        }
        return new asyo((asys) asysVar.toBuilder().build());
    }

    public String getActiveSyncId() {
        return this.b.j;
    }

    public asyu getCurrentSyncMode() {
        asyu b = asyu.b(this.b.i);
        return b == null ? asyu.SYNC_MODE_UNKNOWN : b;
    }

    public String getPanelId() {
        return this.b.e;
    }

    public Boolean getSyncEnabled() {
        return Boolean.valueOf(this.b.g);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public final boolean h() {
        return (this.b.c & 16) != 0;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("MarkersEngagementPanelSyncEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
