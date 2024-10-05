package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyf {
    public final aakv a;
    public final aqyi b;

    public aqyf(aqyi aqyiVar, aakv aakvVar) {
        this.b = aqyiVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqyf) && this.b.equals(((aqyf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("StringRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
