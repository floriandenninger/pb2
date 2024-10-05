package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wmh implements View.OnClickListener {
    final /* synthetic */ wmj a;
    private final /* synthetic */ int b;

    public wmh(wmj wmjVar, int i) {
        this.b = i;
        this.a = wmjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wmi wmiVar = this.a.ag;
            if (wmiVar != null) {
                wmiVar.a();
                return;
            }
            return;
        }
        wmj wmjVar = this.a;
        amkq.E(wmj.p(wmjVar.a));
        wmjVar.ah.getClass();
        wmjVar.ag.getClass();
        wmjVar.b.b();
        wkt wktVar = new wkt(wmjVar, wmjVar.ah);
        arzs arzsVar = wmjVar.e;
        String str = wmjVar.ae;
        String str2 = wmjVar.af;
        atuh atuhVar = wmjVar.a.f;
        if (atuhVar == null) {
            atuhVar = atuh.a;
        }
        apmg apmgVar = atuhVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        apxf apxfVar = apmgVar.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        wktVar.c(arzsVar, str, str2, apxfVar);
        wmjVar.c.setEnabled(false);
        wmjVar.d.setEnabled(false);
    }
}
