package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aueb {
    private final auec a;

    public aueb(auec auecVar) {
        this.a = auecVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aueb) && this.a.equals(((aueb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("PostCreationDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
