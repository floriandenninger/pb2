package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyu {
    private final aqyw a;

    public aqyu(aqyw aqywVar) {
        this.a = aqywVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqyu) && this.a.equals(((aqyu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("FormfillFieldTextValueModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
