package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SurveyRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class eiw implements ynl {
    public final /* synthetic */ eix a;
    private final /* synthetic */ int b;

    public /* synthetic */ eiw(eix eixVar, int i) {
        this.b = i;
        this.a = eixVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        aqrf aqrfVar;
        aqrf aqrfVar2;
        aulq aulqVar = null;
        aqrf aqrfVar3 = null;
        if (this.b == 0) {
            eix eixVar = this.a;
            ascg ascgVar = (ascg) obj;
            if ((ascgVar.b & 2) != 0 && (aulqVar = ascgVar.d) == null) {
                aulqVar = aulq.a;
            }
            avco avcoVar = (avco) ahbj.n(aulqVar, SurveyRenderer.surveyTriggerRenderer);
            if (avcoVar == null || (avcoVar.b & 16) == 0 || eixVar.am.g() != fhg.WATCH_WHILE_MAXIMIZED) {
                return;
            }
            HatsController hatsController = eixVar.ak;
            avcn avcnVar = avcoVar.c;
            if (avcnVar == null) {
                avcnVar = avcn.a;
            }
            hatsController.j(avcnVar);
            return;
        }
        eix eixVar2 = this.a;
        arrz arrzVar = (arrz) obj;
        eixVar2.aH();
        eixVar2.ar = arrzVar.g;
        ((acqq) eixVar2.aq).D(new acqx(arrzVar.f.I()));
        aulq aulqVar2 = arrzVar.c;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(ElementRendererOuterClass.elementRenderer)) {
            aulq aulqVar3 = arrzVar.c;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            aqrfVar = (aqrf) aulqVar3.pX(ElementRendererOuterClass.elementRenderer);
        } else {
            aqrfVar = null;
        }
        if (aqrfVar != null) {
            ajfh ajfhVar = eixVar2.ag;
            aulq aulqVar4 = arrzVar.c;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            eixVar2.ao.add(ajds.a((aqrf) aulqVar4.pX(ElementRendererOuterClass.elementRenderer)));
        }
        aulq aulqVar5 = arrzVar.e;
        if (aulqVar5 == null) {
            aulqVar5 = aulq.a;
        }
        if (aulqVar5.pY(ElementRendererOuterClass.elementRenderer)) {
            aulq aulqVar6 = arrzVar.e;
            if (aulqVar6 == null) {
                aulqVar6 = aulq.a;
            }
            aqrfVar2 = (aqrf) aulqVar6.pX(ElementRendererOuterClass.elementRenderer);
        } else {
            aqrfVar2 = null;
        }
        if (aqrfVar2 != null) {
            ajfh ajfhVar2 = eixVar2.ag;
            aulq aulqVar7 = arrzVar.e;
            if (aulqVar7 == null) {
                aulqVar7 = aulq.a;
            }
            eixVar2.ao.add(ajds.a((aqrf) aulqVar7.pX(ElementRendererOuterClass.elementRenderer)));
        }
        aulq aulqVar8 = arrzVar.d;
        if (aulqVar8 == null) {
            aulqVar8 = aulq.a;
        }
        if (aulqVar8.pY(ElementRendererOuterClass.elementRenderer)) {
            aulq aulqVar9 = arrzVar.d;
            if (aulqVar9 == null) {
                aulqVar9 = aulq.a;
            }
            aqrfVar3 = (aqrf) aulqVar9.pX(ElementRendererOuterClass.elementRenderer);
        }
        if (aqrfVar3 != null) {
            ajfh ajfhVar3 = eixVar2.ag;
            aulq aulqVar10 = arrzVar.d;
            if (aulqVar10 == null) {
                aulqVar10 = aulq.a;
            }
            eixVar2.ao.add(ajds.a((aqrf) aulqVar10.pX(ElementRendererOuterClass.elementRenderer)));
        }
    }
}
