package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyt {
    public final aakv a;
    public final aqyv b;

    public aqyt(aqyv aqyvVar, aakv aakvVar) {
        this.b = aqyvVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqyt) && this.b.equals(((aqyt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FormfillFieldResultModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
