package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astq implements aala {
    public static final aalb a = new astp();
    public final astr b;

    public astq(astr astrVar) {
        this.b = astrVar;
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
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new asto(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof astq) && this.b.equals(((astq) obj).b);
    }

    public Long getImageFetchedTimestampMs() {
        return Long.valueOf(this.b.f);
    }

    public String getLocalImageUrl() {
        return this.b.e;
    }

    public String getRemoteImageUrl() {
        return this.b.d;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("LocalImageEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
