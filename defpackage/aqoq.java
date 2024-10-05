package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoq implements aala {
    public static final aalb a = new aqop();
    private final aqor b;

    public aqoq(aqor aqorVar) {
        this.b = aqorVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        getSmartDownloadsOptInBannerVisibilityModel();
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
        return new aqoo(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqoq) && this.b.equals(((aqoq) obj).b);
    }

    public aqnj getSmartDownloadsOptInBannerVisibility() {
        aqnj aqnjVar = this.b.e;
        return aqnjVar == null ? aqnj.a : aqnjVar;
    }

    public aqni getSmartDownloadsOptInBannerVisibilityModel() {
        aqnj aqnjVar = this.b.e;
        if (aqnjVar == null) {
            aqnjVar = aqnj.a;
        }
        return new aqni((aqnj) ((aong) aqnjVar.toBuilder()).build());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("DownloadsPageViewConfigurationEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
