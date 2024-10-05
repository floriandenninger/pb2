package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjb implements aala {
    public static final aalb a = new avja();
    private final avjc b;

    public avjb(avjc avjcVar) {
        this.b = avjcVar;
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
        return new aviz(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avjb) && this.b.equals(((avjb) obj).b);
    }

    public aviu getSearchState() {
        aviu b = aviu.b(this.b.d);
        return b == null ? aviu.TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("TranscriptSearchStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
