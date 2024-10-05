package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asun {
    private final asur a;

    public asun(asur asurVar) {
        this.a = asurVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asun) && this.a.equals(((asun) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("HeaderModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
