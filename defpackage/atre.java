package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atre implements aala {
    public static final aalb a = new atrd();
    public final atrf b;
    private final aakv c;

    public atre(atrf atrfVar, aakv aakvVar) {
        this.b = atrfVar;
        this.c = aakvVar;
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
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new atrc(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof atre) && this.b.equals(((atre) obj).b);
    }

    public atrb getAction() {
        atrb b = atrb.b(this.b.e);
        return b == null ? atrb.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN : b;
    }

    public Long getExpirationTimestamp() {
        return Long.valueOf(this.b.f);
    }

    public Long getLastUpdatedTimestampSeconds() {
        return Long.valueOf(this.b.i);
    }

    public atpg getOfflineFutureUnplayableInfo() {
        atpg atpgVar = this.b.h;
        return atpgVar == null ? atpg.a : atpgVar;
    }

    public atpe getOfflineFutureUnplayableInfoModel() {
        atpg atpgVar = this.b.h;
        if (atpgVar == null) {
            atpgVar = atpg.a;
        }
        return atpe.b(atpgVar).g(this.c);
    }

    public aomf getOfflineStateBytes() {
        return this.b.g;
    }

    public String getOfflineToken() {
        return this.b.l;
    }

    public atpf getOnTapCommandOverrideData() {
        atpf atpfVar = this.b.j;
        return atpfVar == null ? atpf.a : atpfVar;
    }

    public atpd getOnTapCommandOverrideDataModel() {
        atpf atpfVar = this.b.j;
        if (atpfVar == null) {
            atpfVar = atpf.a;
        }
        return atpd.b(atpfVar).h();
    }

    public String getShortMessageForDisabledAction() {
        return this.b.k;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("OfflineVideoPolicyEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
