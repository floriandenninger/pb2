package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxd {
    private final apxg a;

    public apxd(apxg apxgVar) {
        this.a = apxgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxd) && this.a.equals(((apxd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("CommandMetadataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
