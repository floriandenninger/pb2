package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqm {
    public final aakv a;
    public final asqr b;

    public asqm(asqr asqrVar, aakv aakvVar) {
        this.b = asqrVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asqm) && this.b.equals(((asqm) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("LiveChatPollChoiceStateModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
