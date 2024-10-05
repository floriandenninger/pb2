package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfq {
    private final arfs a;

    public arfq(arfs arfsVar) {
        this.a = arfsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arfq) && this.a.equals(((arfq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("IconModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
