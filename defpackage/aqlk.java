package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlk {
    private final aqll a;

    public aqlk(aqll aqllVar) {
        this.a = aqllVar;
    }

    public static final amsx a() {
        return new amsv().g();
    }

    public static awxk b(aqll aqllVar) {
        return new awxk(aqllVar.toBuilder());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqlk) && this.a.equals(((aqlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DownloadFormatModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
