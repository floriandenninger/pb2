package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaje extends aajj {
    private final amrz a;
    private final aakt b;
    private final aaku c;
    private final aoqa d;
    private final aakl e;
    private final shf f;
    private final String g;

    public aaje(aakl aaklVar, amrz amrzVar, aakt aaktVar, aaku aakuVar, aoqa aoqaVar, shf shfVar, String str) {
        boolean z = true;
        if (aaktVar == null && aakuVar == null) {
            z = false;
        }
        amkq.O(z, "entity and metadata cannot both be null");
        this.e = aaklVar;
        this.a = amrzVar;
        this.b = aaktVar;
        this.c = aakuVar;
        this.d = aoqaVar;
        this.f = shfVar;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aaje a(aakl aaklVar, amrz amrzVar, aakt aaktVar, aoqa aoqaVar, shf shfVar) {
        return new aaje(aaklVar, amrzVar, aaktVar, null, aoqaVar, shfVar, aaktVar.d());
    }

    @Override // defpackage.aajj
    public final void b(aaka aakaVar, viq viqVar, amrp amrpVar) {
        aaln c = this.e.c(viqVar, this.g);
        if (aalj.d(c.d, this.d)) {
            aakt aaktVar = c.b;
            aaku aakuVar = c.c;
            aakt aaktVar2 = this.b;
            boolean z = false;
            if (aaktVar2 != null && !amkq.b(aaktVar2, aaktVar)) {
                z = true;
            }
            aaku aakuVar2 = this.c;
            if (aakuVar2 == null) {
                aakuVar2 = aakuVar;
            }
            boolean z2 = !amkq.b(aakuVar2, aakuVar);
            aoqa c2 = aalj.c(this.d, c.d);
            if (this.b != null || aaktVar != null) {
                aalm a = aaln.a();
                aakt aaktVar3 = this.b;
                a.a = aaktVar3 != null ? aalj.b(this.a, aaktVar, aaktVar3) : aaktVar;
                aaku aakuVar3 = this.c;
                if (aakuVar3 == null) {
                    aakuVar3 = aakuVar;
                }
                a.c(aakuVar3);
                a.b(c2);
                aaln a2 = a.a();
                if (amrpVar != null && (z || z2)) {
                    aakx a3 = aakz.a();
                    a3.c(this.g);
                    a3.a = aaktVar;
                    a3.b = a2.b;
                    a3.d(aakuVar);
                    a3.b(a2.c);
                    amrpVar.h(a3.a());
                }
                c(aakaVar, viqVar, a2, this.f.c(), c2);
                return;
            }
            throw aaiq.a(new Exception("Cannot commit metadata without an existing entity"), 4);
        }
    }
}
