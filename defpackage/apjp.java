package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjp {
    private final apjq a;

    public apjp(apjq apjqVar) {
        this.a = apjqVar;
    }

    public static final amsx a() {
        return new amsv().g();
    }

    public static awxk b(apjq apjqVar) {
        return new awxk(apjqVar.toBuilder());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apjp) && this.a.equals(((apjp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("BadgeInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
