package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwc {
    private final apvk a;

    public apwc(apvk apvkVar) {
        this.a = apvkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwc) && this.a.equals(((apwc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("DelegationContextModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
