package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apyd implements aala {
    public static final aalb a = new apyc();
    private final apye b;

    public apyd(apye apyeVar) {
        this.b = apyeVar;
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
        return new apyb(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof apyd) && this.b.equals(((apyd) obj).b);
    }

    public String getLatestTimestampText() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("CommentComposerTimestampEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
