package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwd {
    private final apvs a;

    public apwd(apvs apvsVar) {
        this.a = apvsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwd) && this.a.equals(((apwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("IncludeDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
