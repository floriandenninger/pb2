package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwk {
    private final apvp a;

    public apwk(apvp apvpVar) {
        this.a = apvpVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwk) && this.a.equals(((apwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("YoodleVeDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
