package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sow {
    public final axop a;
    private final aoam b;

    public sow(axop axopVar, aoam aoamVar) {
        this.a = axopVar;
        this.b = aoamVar;
    }

    private static aoam a(aoam aoamVar) {
        aoam aoamVar2 = new aoam();
        for (int i = 0; i < aoamVar.W(); i++) {
            aoamVar.aA(aoamVar2, i);
            if (aoamVar2.T() == 224886694) {
                return aoamVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sow)) {
            return false;
        }
        sow sowVar = (sow) obj;
        if (szz.c(this.a, sowVar.a)) {
            aoam aoamVar = this.b;
            aoam aoamVar2 = sowVar.b;
            if ((aoamVar == null && aoamVar2 == null) || (aoamVar != null && aoamVar2 != null && szz.c(a(aoamVar), a(aoamVar2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        aoam aoamVar = this.b;
        return hashCode ^ (aoamVar == null ? 0 : aoamVar.hashCode());
    }
}
