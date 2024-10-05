package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwf {
    private final apvt a;

    public apwf(apvt apvtVar) {
        this.a = apvtVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwf) && this.a.equals(((apwf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ReviewQueuePageDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
