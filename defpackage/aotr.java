package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotr {
    private final aakv a;
    private final aott b;

    public aotr(aott aottVar, aakv aakvVar) {
        this.b = aottVar;
        this.a = aakvVar;
    }

    public static awxk b(aott aottVar) {
        return new awxk(aottVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        aots aotsVar = this.b.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        amsvVar.j(aotq.b(aotsVar).r().a());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aotr) && this.b.equals(((aotr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("AccessibilitySupportedDatasModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
