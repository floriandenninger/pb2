package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjf implements aala {
    public static final aalb a = new avje();
    private final avjg b;

    public avjf(avjg avjgVar) {
        this.b = avjgVar;
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
        return new avjd(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avjf) && this.b.equals(((avjf) obj).b);
    }

    public Boolean getHighlighted() {
        return Boolean.valueOf(this.b.d);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("TranscriptSegmentEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
