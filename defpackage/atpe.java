package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpe {
    private final atpg a;

    public atpe(atpg atpgVar) {
        this.a = atpgVar;
    }

    public static awxk b(atpg atpgVar) {
        return new awxk(atpgVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        atpf atpfVar = this.a.e;
        if (atpfVar == null) {
            atpfVar = atpf.a;
        }
        atpd.b(atpfVar).h();
        amsvVar.j(atpd.a());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atpe) && this.a.equals(((atpe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("OfflineFutureUnplayableInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
