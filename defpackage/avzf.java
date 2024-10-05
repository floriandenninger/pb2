package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzf implements aala {
    public static final aalb a = new avze();
    private final avzg b;

    public avzf(avzg avzgVar) {
        this.b = avzgVar;
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
        return new avzd(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avzf) && this.b.equals(((avzf) obj).b);
    }

    public Long getLastPlaybackPositionSeconds() {
        return Long.valueOf(this.b.f);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public String getVideoId() {
        return this.b.e;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("VideoPlaybackPositionEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
