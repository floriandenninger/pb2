package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwh {
    private final apvn a;

    public apwh(apvn apvnVar) {
        this.a = apvnVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwh) && this.a.equals(((apwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ServletDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
