package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwb {
    public final apvr a;

    public apwb(apvr apvrVar) {
        this.a = apvrVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwb) && this.a.equals(((apwb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ComponentPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
