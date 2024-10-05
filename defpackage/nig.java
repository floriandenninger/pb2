package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nig implements nim {
    public final /* synthetic */ nin a;
    private final /* synthetic */ int b;

    public /* synthetic */ nig(nin ninVar, int i) {
        this.b = i;
        this.a = ninVar;
    }

    @Override // defpackage.nim
    public final void a(boolean z) {
        apxf apxfVar;
        if (this.b == 0) {
            this.a.g(z);
            return;
        }
        nin ninVar = this.a;
        aahd aahdVar = ninVar.c;
        if (z) {
            apmh apmhVar = ninVar.d.d;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apmh apmhVar2 = ninVar.d.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apxfVar = apmgVar2.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        aahdVar.a(apxfVar);
    }
}
