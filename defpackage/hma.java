package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hma implements ajde {
    final /* synthetic */ hmc a;

    public hma(hmc hmcVar) {
        this.a = hmcVar;
    }

    @Override // defpackage.ajde
    public final void a() {
        apmh apmhVar = this.a.aq.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 16384) != 0) {
            hmc hmcVar = this.a;
            aahd aahdVar = hmcVar.af;
            apmh apmhVar2 = hmcVar.aq.i;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apxf apxfVar = apmgVar2.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }

    @Override // defpackage.ajde
    public final void b() {
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
        this.a.an.f(false);
    }
}
