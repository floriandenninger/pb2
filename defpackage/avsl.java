package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avsl implements aala {
    public static final aalb a = new avsk();
    private final avsm b;

    public avsl(avsm avsmVar) {
        this.b = avsmVar;
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
        return new avsj(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avsl) && this.b.equals(((avsl) obj).b);
    }

    public String getDeletedStatusMessage() {
        return this.b.d;
    }

    public Boolean getShouldShowOriginalContent() {
        return Boolean.valueOf(this.b.f);
    }

    public String getShowOriginalContentMessage() {
        return this.b.e;
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
        sb.append("UpdateLiveChatItemEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
