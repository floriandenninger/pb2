package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmi implements aala {
    public static final aalb a = new aqmh();
    private final aakv b;
    private final aqmj c;

    public aqmi(aqmj aqmjVar, aakv aakvVar) {
        this.c = aqmjVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getOfflineFutureUnplayableInfoModel().a());
        getOnTapCommandOverrideDataModel();
        amsvVar.j(atpd.a());
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
        return new aqmg(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqmi) && this.c.equals(((aqmi) obj).c);
    }

    public Float getDownloadProgress() {
        return Float.valueOf(this.c.f);
    }

    public avxt getDownloadState() {
        avxt b = avxt.b(this.c.e);
        return b == null ? avxt.DOWNLOAD_STATE_UNKNOWN : b;
    }

    public String getDownloadStatusMessage() {
        return this.c.h;
    }

    public Boolean getIsFutureUnplayable() {
        return Boolean.valueOf(this.c.k);
    }

    public Boolean getIsPartiallyPlayable() {
        return Boolean.valueOf(this.c.i);
    }

    public Long getLastUpdatedTimestampSeconds() {
        return Long.valueOf(this.c.m);
    }

    public atpg getOfflineFutureUnplayableInfo() {
        atpg atpgVar = this.c.l;
        return atpgVar == null ? atpg.a : atpgVar;
    }

    public atpe getOfflineFutureUnplayableInfoModel() {
        atpg atpgVar = this.c.l;
        if (atpgVar == null) {
            atpgVar = atpg.a;
        }
        return atpe.b(atpgVar).g(this.b);
    }

    public atpf getOnTapCommandOverrideData() {
        atpf atpfVar = this.c.n;
        return atpfVar == null ? atpf.a : atpfVar;
    }

    public atpd getOnTapCommandOverrideDataModel() {
        atpf atpfVar = this.c.n;
        if (atpfVar == null) {
            atpfVar = atpf.a;
        }
        return atpd.b(atpfVar).h();
    }

    public Float getPreviousDownloadProgress() {
        return Float.valueOf(this.c.g);
    }

    public Boolean getShowDownloadBadge() {
        return Boolean.valueOf(this.c.j);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("DownloadStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
