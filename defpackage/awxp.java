package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxp {
    public final awxq a;

    public awxp(awxq awxqVar) {
        this.a = awxqVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awxp) && this.a.equals(((awxp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("VisibilityCriteriaModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
