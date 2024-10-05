package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvc {
    public final aakv a;
    public final apvd b;

    public apvc(apvd apvdVar, aakv aakvVar) {
        this.b = apvdVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvc) && this.b.equals(((apvc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("ClientVeSpecModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
