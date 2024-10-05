package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wak implements afwx {
    final /* synthetic */ Bundle a;
    final /* synthetic */ wam b;

    public wak(wam wamVar, Bundle bundle) {
        this.b = wamVar;
        this.a = bundle;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.aj.b();
        this.b.al.e(cnqVar);
        this.b.kv();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        apxf apxfVar;
        aauo aauoVar = (aauo) obj;
        aauo aauoVar2 = new aauo(aauoVar.a);
        if (this.b.ar != null && aauoVar.a() != null) {
            ((acqq) this.b.ar).D(new acqx(aauoVar.a()));
        }
        wam wamVar = this.b;
        appn appnVar = aauoVar2.a.d;
        if (appnVar == null) {
            appnVar = appn.a;
        }
        wamVar.af = appnVar;
        wam wamVar2 = this.b;
        arkw arkwVar = aauoVar2.a;
        if ((arkwVar.b & 4) != 0) {
            apxfVar = arkwVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        wamVar2.as = apxfVar;
        wam wamVar3 = this.b;
        wamVar3.aH(wamVar3.af, this.a);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
