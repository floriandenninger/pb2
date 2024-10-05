package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphm implements aala {
    public static final aalb a = new aphk();
    private final aphn b;

    public aphm(aphn aphnVar) {
        this.b = aphnVar;
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
        return new aphl(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aphm) && this.b.equals(((aphm) obj).b);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public apho getVisibilityState() {
        apho b = apho.b(this.b.d);
        return b == null ? apho.AUTOTAG_VISIBILITY_STATE_UNSPECIFIED : b;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("AutotagVisibilityStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
