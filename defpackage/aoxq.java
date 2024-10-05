package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxq implements aala {
    public static final aalb a = new aoxo();
    private final aoxr b;

    public aoxq(aoxr aoxrVar) {
        this.b = aoxrVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aoxp e() {
        return new aoxp(this.b.toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof aoxq) && this.b.equals(((aoxq) obj).b);
    }

    public Boolean getFullscreenForced() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("AdPlayerFullscreenStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
