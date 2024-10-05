package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aakm extends aajj {
    private final aakl a;
    private final aalo b;
    private final String c;
    private final aqua d;
    private final byte[] e;
    private final shf f;
    private final aoqa g;

    public aakm(aakl aaklVar, aalo aaloVar, String str, aqua aquaVar, byte[] bArr, shf shfVar, aoqa aoqaVar) {
        this.a = aaklVar;
        this.b = aaloVar;
        this.c = str;
        this.d = aquaVar;
        this.e = bArr;
        this.f = shfVar;
        this.g = aoqaVar;
    }

    @Override // defpackage.aajj
    public final void b(aaka aakaVar, viq viqVar, amrp amrpVar) {
        aaln c = this.a.c(viqVar, this.c);
        if (aalj.d(c.d, this.g)) {
            aakt aaktVar = c.b;
            aaku aakuVar = c.c;
            aakt a = aalj.a(this.b, this.d, this.c, aaktVar, this.e);
            if (a == null) {
                String valueOf = String.valueOf(this.c);
                throw aaiq.c(new IllegalArgumentException(valueOf.length() != 0 ? "One of the edits failed for key: ".concat(valueOf) : new String("One of the edits failed for key: ")), -1);
            }
            boolean z = !a.equals(aaktVar);
            String.format("[ENTITY] About to update entity %s(%s)", a.getClass().getSimpleName(), this.c);
            aoqa c2 = aalj.c(this.g, c.d);
            aalm a2 = aaln.a();
            a2.a = a;
            a2.c(aakuVar);
            a2.b(c2);
            aaln a3 = a2.a();
            if (amrpVar != null && z) {
                aakx a4 = aakz.a();
                a4.c(this.c);
                a4.a = aaktVar;
                a4.b = a;
                a4.b(aakuVar);
                amrpVar.h(a4.a());
            }
            c(aakaVar, viqVar, a3, this.f.c(), this.g);
        }
    }
}
