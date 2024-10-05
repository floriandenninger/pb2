package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqye {
    public final aakv a;
    public final aqyh b;

    public aqye(aqyh aqyhVar, aakv aakvVar) {
        this.b = aqyhVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqye) && this.b.equals(((aqye) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("FormattedStringSupportedAccessibilityDatasModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
