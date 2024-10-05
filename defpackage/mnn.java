package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mnn implements View.OnClickListener {
    final /* synthetic */ mno a;

    public mnn(mno mnoVar) {
        this.a = mnoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apsl apslVar = this.a.b;
        if (apslVar != null) {
            apsm apsmVar = apslVar.d;
            if (apsmVar == null) {
                apsmVar = apsm.a;
            }
            apmg apmgVar = apsmVar.b;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 16384) != 0) {
                mno mnoVar = this.a;
                aahd aahdVar = mnoVar.a;
                apsm apsmVar2 = mnoVar.b.d;
                if (apsmVar2 == null) {
                    apsmVar2 = apsm.a;
                }
                apmg apmgVar2 = apsmVar2.b;
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
    }
}
