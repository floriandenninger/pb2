package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjl {
    private final awjm a;

    public awjl(awjm awjmVar) {
        this.a = awjmVar;
    }

    public static final amsx a() {
        return new amsv().g();
    }

    public static awxk b(awjm awjmVar) {
        return new awxk(awjmVar.toBuilder());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awjl) && this.a.equals(((awjl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("YtMainVideoEntityLocalizedStringsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
