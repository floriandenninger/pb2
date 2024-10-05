package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxl {
    private final awxm a;

    public awxl(awxm awxmVar) {
        this.a = awxmVar;
    }

    public static awxk b(awxm awxmVar) {
        return new awxk(awxmVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        awxq awxqVar = this.a.b;
        if (awxqVar == null) {
            awxqVar = awxq.a;
        }
        awxp awxpVar = new awxp((awxq) awxqVar.toBuilder().build());
        amsv amsvVar2 = new amsv();
        awxo awxoVar = awxpVar.a.b;
        if (awxoVar == null) {
            awxoVar = awxo.a;
        }
        new awxn((awxo) ((aong) awxoVar.toBuilder()).build());
        amsvVar2.j(new amsv().g());
        amsvVar.j(amsvVar2.g());
        awxh awxhVar = this.a.c;
        if (awxhVar == null) {
            awxhVar = awxh.a;
        }
        new awxg((awxh) ((aong) awxhVar.toBuilder()).build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awxl) && this.a.equals(((awxl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("FocusVisibilityLoggingCriteriaModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
