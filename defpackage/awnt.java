package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnt {
    private final awnw a;

    public awnt(awnw awnwVar) {
        this.a = awnwVar;
    }

    public static awns a(awnw awnwVar) {
        return new awns((aong) awnwVar.toBuilder());
    }

    public static final amsx b() {
        return new amsv().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awnt) && this.a.equals(((awnt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("CommandModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
