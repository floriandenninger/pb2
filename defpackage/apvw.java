package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvw {
    private final apvg a;

    public apvw(apvg apvgVar) {
        this.a = apvgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvw) && this.a.equals(((apvw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("AnalyticsDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
