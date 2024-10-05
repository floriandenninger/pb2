package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjz implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ acka b;

    public acjz(acka ackaVar, int i) {
        this.b = ackaVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a < this.b.b.c.size()) {
            asgi asgiVar = this.b.b;
            aulq aulqVar = ((asgh) asgiVar.c.get(this.a)).k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                acka ackaVar = this.b;
                if (ackaVar.d == null || ackaVar.c == null) {
                    return;
                }
                asgi asgiVar2 = ackaVar.b;
                aulq aulqVar2 = ((asgh) asgiVar2.c.get(this.a)).k;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqdt aqdtVar = (aqdt) aulqVar2.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                if (aqdtVar == null || aqdtVar.g.size() <= 0 || (aqdtVar.b & 64) == 0) {
                    return;
                }
                apmh apmhVar = aqdtVar.i;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) != 0) {
                    acka ackaVar2 = this.b;
                    String charSequence = ahbl.p(aqdtVar, ackaVar2.c).toString();
                    apmh apmhVar2 = aqdtVar.i;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar = apmhVar2.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    aqyg aqygVar = apmgVar.i;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    new AlertDialog.Builder(ackaVar2.a).setMessage(charSequence).setNegativeButton(ajcq.b(aqygVar), new hgs(12)).create().show();
                }
            }
        }
    }
}
