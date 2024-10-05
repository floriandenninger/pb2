package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wjj implements wig {
    final /* synthetic */ Activity a;
    final /* synthetic */ apxf b;
    final /* synthetic */ wjk c;

    public wjj(wjk wjkVar, Activity activity, apxf apxfVar) {
        this.c = wjkVar;
        this.a = activity;
        this.b = apxfVar;
    }

    @Override // defpackage.wig
    public final void a() {
        wjk wjkVar = this.c;
        Activity activity = this.a;
        apxf apxfVar = this.b;
        wjkVar.c = true;
        dd supportFragmentManager = ((ci) activity).getSupportFragmentManager();
        wab wabVar = (wab) supportFragmentManager.f("fusion-sign-in-flow-fragment");
        dn k = supportFragmentManager.k();
        if (wabVar == null) {
            k.r(wcb.aG(apxfVar), "fusion-sign-in-flow-fragment");
        } else {
            wabVar.aF(apxfVar);
            if (!wabVar.av()) {
                k.n(wabVar);
            }
        }
        k.k();
    }

    @Override // defpackage.wig
    public final void b(Exception exc) {
        this.c.b.d(new wjc(wjb.CANCELLED, true));
    }

    @Override // defpackage.wig
    public final void c(aata aataVar) {
        if (!aataVar.l() || aataVar.p() || aataVar.m()) {
            return;
        }
        this.c.a.i(aataVar, null, aftl.g);
    }
}
