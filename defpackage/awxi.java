package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxi {
    public final aakv a;
    public final awxj b;

    public awxi(awxj awxjVar, aakv aakvVar) {
        this.b = awxjVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awxi) && this.b.equals(((awxi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("FocusVisibilityLoggingConfigModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
