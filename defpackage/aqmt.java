package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmt implements aala {
    public static final aalb a = new aqms();
    private final aqmu b;

    public aqmt(aqmu aqmuVar) {
        this.b = aqmuVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
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
        return new aqmr(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqmt) && this.b.equals(((aqmt) obj).b);
    }

    public String getButtonNavigationUrl() {
        return this.b.h;
    }

    public String getButtonText() {
        return this.b.g;
    }

    public Integer getButtonUiType() {
        return Integer.valueOf(this.b.i);
    }

    public String getText() {
        return this.b.e;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public Integer getUiType() {
        return Integer.valueOf(this.b.f);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("DownloadsPageBannerEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
