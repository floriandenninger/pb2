package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asva {
    private final asvc a;

    public asva(asvc asvcVar) {
        this.a = asvcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asva) && this.a.equals(((asva) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("LogoLottieAnimationDetailsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
