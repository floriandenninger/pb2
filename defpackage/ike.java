package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ike implements View.OnClickListener {
    public final /* synthetic */ ikn a;
    public final /* synthetic */ apmg b;
    private final /* synthetic */ int c;

    public /* synthetic */ ike(ikn iknVar, apmg apmgVar, int i) {
        this.c = i;
        this.a = iknVar;
        this.b = apmgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            ikn iknVar = this.a;
            apmg apmgVar = this.b;
            aahd aahdVar = iknVar.f;
            apxf apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
            return;
        }
        if (i == 1) {
            ikn iknVar2 = this.a;
            apmg apmgVar2 = this.b;
            aahd aahdVar2 = iknVar2.f;
            apxf apxfVar2 = apmgVar2.p;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.a(apxfVar2);
            return;
        }
        ikn iknVar3 = this.a;
        apmg apmgVar3 = this.b;
        if ((apmgVar3.b & 1048576) != 0) {
            iknVar3.h.mM().I(3, new acqx(apmgVar3.t), null);
        }
        aahd aahdVar3 = iknVar3.f;
        apxf apxfVar3 = apmgVar3.p;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        aahdVar3.a(apxfVar3);
    }
}
