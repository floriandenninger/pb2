package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wlz implements View.OnClickListener {
    final /* synthetic */ apmg a;
    final /* synthetic */ wmc b;

    public wlz(wmc wmcVar, apmg apmgVar) {
        this.b = wmcVar;
        this.a = apmgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wmb wmbVar = this.b.b;
        if (wmbVar != null) {
            apxf apxfVar = this.a.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            wmbVar.aL(apxfVar);
        }
    }
}
