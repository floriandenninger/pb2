package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class niw implements View.OnClickListener {
    public final /* synthetic */ njb a;
    private final /* synthetic */ int b;

    public /* synthetic */ niw(njb njbVar, int i) {
        this.b = i;
        this.a = njbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            njb njbVar = this.a;
            njbVar.j.a.I(3, new acqx(acsb.c(true != njbVar.e ? 87402 : 87401)), null);
            njbVar.f(!njbVar.e);
            return;
        }
        njb njbVar2 = this.a;
        if (njbVar2.e) {
            return;
        }
        auvk auvkVar = (auvk) njbVar2.k;
        auvl auvlVar = auvkVar.f;
        if (auvlVar == null) {
            auvlVar = auvl.a;
        }
        if ((auvlVar.b & 8) != 0) {
            auvl auvlVar2 = auvkVar.f;
            if (auvlVar2 == null) {
                auvlVar2 = auvl.a;
            }
            apxf apxfVar = auvlVar2.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            njbVar2.g.c(apxfVar, null);
        }
    }
}
