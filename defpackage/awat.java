package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awat {
    private final awau a;

    public awat(awau awauVar) {
        this.a = awauVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awat) && this.a.equals(((awat) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("VisibilityLoggingDirectivesModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
