package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxg {
    private final awxh a;

    public awxg(awxh awxhVar) {
        this.a = awxhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awxg) && this.a.equals(((awxg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("FocusDescriptionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
