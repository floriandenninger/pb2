package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqau {
    private final aqaw a;

    public aqau(aqaw aqawVar) {
        this.a = aqawVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqau) && this.a.equals(((aqau) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("PurchaseModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
