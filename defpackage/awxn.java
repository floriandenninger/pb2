package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxn {
    private final awxo a;

    public awxn(awxo awxoVar) {
        this.a = awxoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awxn) && this.a.equals(((awxn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("VisibilityConditionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
