package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveFullscreenConfirmRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abyt implements afwx {
    final /* synthetic */ abxv a;
    final /* synthetic */ abzl b;

    public abyt(abzl abzlVar, abxv abxvVar) {
        this.b = abzlVar;
        this.a = abxvVar;
    }

    private final void d(final int i, final aqdt aqdtVar, final assu assuVar) {
        Handler handler = this.b.b;
        final abxv abxvVar = this.a;
        handler.post(new Runnable() { // from class: abyr
            @Override // java.lang.Runnable
            public final void run() {
                abxv.this.d(i, aqdtVar, assuVar);
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        cnh cnhVar;
        zga.d("Cannot load GetBroadcastSetupResponse from InnerTube.", cnqVar);
        if (cnqVar == null || (cnhVar = cnqVar.b) == null || cnhVar.a != 403) {
            abvt.b().n(3, 1, cnqVar);
            d(1, null, null);
        } else {
            abvt.b().n(3, 2, cnqVar);
            d(4, null, null);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aqdt aqdtVar;
        assu assuVar;
        int i;
        aulq aulqVar;
        aulq aulqVar2;
        aulq aulqVar3;
        final arqx arqxVar = (arqx) obj;
        if (arqxVar != null) {
            this.b.a.D(new acqx(arqxVar.g.I()));
        }
        aony<arqt> aonyVar = arqxVar.f;
        if (!aonyVar.isEmpty()) {
            for (arqt arqtVar : aonyVar) {
                if ((arqtVar.b & 1) != 0) {
                    asss asssVar = arqtVar.c;
                    if (asssVar == null) {
                        asssVar = asss.a;
                    }
                    int df = amkq.df(asssVar.d);
                    if (df == 0) {
                        df = 1;
                    }
                    int i2 = asssVar.b;
                    if (i2 == 5) {
                        ajcq.b((aqyg) asssVar.c).toString();
                    } else if (i2 == 6) {
                        if (!((aulq) asssVar.c).pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                            if (asssVar.b == 6) {
                                aulqVar = (aulq) asssVar.c;
                            } else {
                                aulqVar = aulq.a;
                            }
                            if (aulqVar.pY(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer)) {
                                if (asssVar.b == 6) {
                                    aulqVar2 = (aulq) asssVar.c;
                                } else {
                                    aulqVar2 = aulq.a;
                                }
                                i = df;
                                assuVar = (assu) aulqVar2.pX(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer);
                                aqdtVar = null;
                            }
                        } else {
                            if (asssVar.b == 6) {
                                aulqVar3 = (aulq) asssVar.c;
                            } else {
                                aulqVar3 = aulq.a;
                            }
                            aqdtVar = (aqdt) aulqVar3.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                            i = df;
                            assuVar = null;
                        }
                    }
                    aqdtVar = null;
                    i = df;
                    assuVar = null;
                } else {
                    aqdtVar = null;
                    assuVar = null;
                    i = 1;
                }
                if (i != 2 && i != 14) {
                    if (i == 4) {
                        i = 4;
                    }
                }
                abvt.b().n(3, abzl.o(i), null);
                d(abzl.p(i), aqdtVar, assuVar);
                return;
            }
        }
        if (arqxVar != null) {
            arqu arquVar = arqxVar.e;
            if (arquVar == null) {
                arquVar = arqu.a;
            }
            atfc atfcVar = arquVar.b;
            if (atfcVar == null) {
                atfcVar = atfc.a;
            }
            if ((atfcVar.b & 1) != 0) {
                atfd atfdVar = atfcVar.c;
                if (atfdVar == null) {
                    atfdVar = atfd.a;
                }
                if (atfdVar != null && (atfdVar.b & 1) != 0) {
                    atfn atfnVar = atfdVar.c;
                    if (atfnVar == null) {
                        atfnVar = atfn.a;
                    }
                    atfi atfiVar = atfnVar.g;
                    if (atfiVar == null) {
                        atfiVar = atfi.a;
                    }
                    apmg apmgVar = atfiVar.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    if (apmgVar != null && (apmgVar.b & 256) != 0) {
                        Handler handler = this.b.b;
                        final abxv abxvVar = this.a;
                        handler.post(new Runnable() { // from class: abys
                            @Override // java.lang.Runnable
                            public final void run() {
                                abxv.this.c(arqxVar);
                            }
                        });
                        return;
                    }
                }
            }
        }
        abvt.b().n(3, 1, null);
        d(1, null, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
