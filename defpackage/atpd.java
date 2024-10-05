package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpd {
    private final atpf a;

    public atpd(atpf atpfVar) {
        this.a = atpfVar;
    }

    public static final amsx a() {
        return new amsv().g();
    }

    public static awxk b(atpf atpfVar) {
        return new awxk(atpfVar.toBuilder());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atpd) && this.a.equals(((atpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("ClientEndpointBuilderDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
