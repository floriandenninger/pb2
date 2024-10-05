package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotq {
    private final aots a;

    public aotq(aots aotsVar) {
        this.a = aotsVar;
    }

    public static awxk b(aots aotsVar) {
        return new awxk(aotsVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        aotv aotvVar = this.a.d;
        if (aotvVar == null) {
            aotvVar = aotv.a;
        }
        new aotu((aotv) aotvVar.toBuilder().build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aotq) && this.a.equals(((aotq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("AccessibilityDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
