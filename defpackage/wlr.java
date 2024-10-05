package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wlr implements View.OnClickListener {
    final /* synthetic */ wls a;
    private final /* synthetic */ int b;

    public wlr(wls wlsVar, int i) {
        this.b = i;
        this.a = wlsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wlt wltVar = this.a.a;
            wltVar.i.a.m.I(3, new acqx(acsb.c(31778)), null);
            wltVar.b(ahbl.l(wltVar.b));
        } else {
            wlt wltVar2 = this.a.a;
            wltVar2.g.setEnabled(false);
            wltVar2.h.setEnabled(false);
            wltVar2.e.b();
            wltVar2.i.a.m.I(3, new acqx(acsb.c(31777)), null);
            wltVar2.b(ahbl.m(wltVar2.b));
        }
    }
}
