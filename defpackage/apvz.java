package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvz {
    private final apvj a;

    public apvz(apvj apvjVar) {
        this.a = apvjVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvz) && this.a.equals(((apvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ChannelItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
