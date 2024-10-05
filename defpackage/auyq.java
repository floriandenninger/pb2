package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auyq {
    public final auyr a;

    public auyq(auyr auyrVar) {
        this.a = auyrVar;
    }

    public static final amsx a() {
        return new amsv().g();
    }

    public static awxk b(auyr auyrVar) {
        return new awxk(auyrVar.toBuilder());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof auyq) && this.a.equals(((auyq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("StreamProgressModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
