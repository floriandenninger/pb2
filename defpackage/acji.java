package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveFullscreenConfirmRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acji implements abxv {
    final /* synthetic */ int a;
    final /* synthetic */ acjl b;

    public acji(acjl acjlVar, int i) {
        this.b = acjlVar;
        this.a = i;
    }

    @Override // defpackage.abxv
    public final void c(arqx arqxVar) {
        aulq aulqVar;
        if (acfm.b(this.b)) {
            this.b.al.a(2);
            acjl acjlVar = this.b;
            String str = acjlVar.am;
            atey ateyVar = null;
            if (str != null) {
                abxp abxpVar = acjlVar.aJ;
                abxn abxnVar = new abxn(abxpVar.f, abxpVar.a.c(), str, null, null, null);
                abxnVar.k();
                ynm.n(acjlVar, abxpVar.g.b(abxnVar, abxpVar.b), zxq.r, new acjb(acjlVar, 3));
                acjlVar.am = null;
            }
            acjl acjlVar2 = this.b;
            arqu arquVar = arqxVar.e;
            if (arquVar == null) {
                arquVar = arqu.a;
            }
            atfc atfcVar = arquVar.b;
            if (atfcVar == null) {
                atfcVar = atfc.a;
            }
            atfd atfdVar = atfcVar.c;
            if (atfdVar == null) {
                atfdVar = atfd.a;
            }
            atfn atfnVar = atfdVar.c;
            if (atfnVar == null) {
                atfnVar = atfn.a;
            }
            acjlVar2.ar = atfnVar;
            arqu arquVar2 = arqxVar.e;
            if (arquVar2 == null) {
                arquVar2 = arqu.a;
            }
            atfc atfcVar2 = arquVar2.b;
            if (atfcVar2 == null) {
                atfcVar2 = atfc.a;
            }
            atfb atfbVar = atfcVar2.d;
            if (atfbVar == null) {
                atfbVar = atfb.a;
            }
            acjk acjkVar = this.b.aB;
            if ((atfbVar.b & 1) != 0 && (ateyVar = atfbVar.c) == null) {
                ateyVar = atey.a;
            }
            acjkVar.I(ateyVar);
            this.b.aJ();
            aone builder = this.b.ar.toBuilder();
            acjl acjlVar3 = this.b;
            acjlVar3.aP(acjlVar3.O, builder);
            this.b.ar = (atfn) builder.build();
            this.b.aK();
            int i = arqxVar.b;
            if (i == 5) {
                acjl acjlVar4 = this.b;
                aqdt aqdtVar = ((arqv) arqxVar.c).b;
                if (aqdtVar == null) {
                    aqdtVar = aqdt.a;
                }
                aqdtVar.getClass();
                acjlVar4.aB.ac(aqdtVar);
                return;
            }
            if (i != 6) {
                if (i != 10 || !((aulq) arqxVar.c).pY(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer)) {
                    acjl acjlVar5 = this.b;
                    if (!acjlVar5.aM() && acjlVar5.ag.getText().length() == 0) {
                        acjlVar5.ag.requestFocus();
                        ((InputMethodManager) acjlVar5.C().getSystemService("input_method")).showSoftInput(acjlVar5.ag, 1);
                    }
                    aulq aulqVar2 = this.b.ar.n;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    avul avulVar = (avul) ahbj.n(aulqVar2, UpsellDialogRendererOuterClass.upsellDialogRenderer);
                    if (avulVar != null) {
                        ci C = this.b.C();
                        acjl acjlVar6 = this.b;
                        advq advqVar = acjlVar6.aN;
                        ajjs b = acjlVar6.aw.b();
                        acjl acjlVar7 = this.b;
                        new abne(avulVar, C, advqVar, b, acjlVar7.av, acjlVar7.aK, null).a();
                        return;
                    }
                    return;
                }
                acjl acjlVar8 = this.b;
                if (arqxVar.b == 10) {
                    aulqVar = (aulq) arqxVar.c;
                } else {
                    aulqVar = aulq.a;
                }
                assu assuVar = (assu) aulqVar.pX(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer);
                assuVar.getClass();
                acjlVar8.aB.aa(assuVar);
                return;
            }
            acjl acjlVar9 = this.b;
            atvc atvcVar = ((arqs) arqxVar.c).b;
            if (atvcVar == null) {
                atvcVar = atvc.a;
            }
            atvcVar.getClass();
            acjlVar9.aB.Y(atvcVar);
        }
    }

    @Override // defpackage.abxv
    public final void d(int i, aqdt aqdtVar, assu assuVar) {
        if (acfm.b(this.b)) {
            if (i == 4) {
                Toast.makeText(this.b.C(), R.string.lc_error_state_account_not_enabled, 1).show();
                this.b.aB.V();
                return;
            }
            if (i != 22) {
                if (i == 27) {
                    this.b.aB.X();
                    return;
                } else {
                    this.b.au.postDelayed(new acjh(this), 400L);
                    return;
                }
            }
            acjl acjlVar = this.b;
            if (aqdtVar == null && assuVar == null) {
                return;
            }
            acjlVar.aB.ak();
            if (aqdtVar != null) {
                acjlVar.aK.n(new acqx(aqdtVar.n));
                ajdf.c(acjlVar.C(), aqdtVar, acjlVar.av, acjlVar.aK, new acjj(acjlVar), null);
                return;
            }
            if ((assuVar.b & 1) != 0) {
                aulq aulqVar = assuVar.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                    acra acraVar = acjlVar.aK;
                    aulq aulqVar2 = assuVar.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    acraVar.n(new acqx(((aqdt) aulqVar2.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer)).n));
                }
            }
            acjlVar.aB.B(assuVar);
        }
    }
}
