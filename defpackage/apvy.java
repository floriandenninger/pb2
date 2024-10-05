package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvy {
    private final apvi a;

    public apvy(apvi apviVar) {
        this.a = apviVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvy) && this.a.equals(((apvy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ChannelDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
