package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvv {
    public final apvf a;

    public apvv(apvf apvfVar) {
        this.a = apvfVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvv) && this.a.equals(((apvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("AdminSelfieDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
