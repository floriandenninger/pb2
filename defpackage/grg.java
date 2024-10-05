package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.GetSurveyCommandOuterClass$GetSurveyCommand;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grg implements aaha {
    public final HatsController a;
    public final acqz b;
    private final Executor c;
    private final aaxn d;

    public grg(aaxn aaxnVar, HatsController hatsController, Executor executor, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = aaxnVar;
        this.a = hatsController;
        this.c = executor;
        this.b = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand)) {
            GetSurveyCommandOuterClass$GetSurveyCommand getSurveyCommandOuterClass$GetSurveyCommand = (GetSurveyCommandOuterClass$GetSurveyCommand) apxfVar.pX(GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand);
            asce asceVar = getSurveyCommandOuterClass$GetSurveyCommand.b;
            if (asceVar == null) {
                asceVar = asce.a;
            }
            abdg p = this.d.p();
            p.k();
            p.a = asceVar;
            int du = amkq.du(getSurveyCommandOuterClass$GetSurveyCommand.c);
            if (du == 0) {
                du = 1;
            }
            p.b = du;
            ynm.k(this.d.q(p), this.c, egw.s, new ynl() { // from class: grf
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    aulq aulqVar;
                    grg grgVar = grg.this;
                    ascg ascgVar = (ascg) obj;
                    grgVar.b.mM().D(new acqx(ascgVar.e));
                    if ((ascgVar.b & 2) != 0) {
                        aulqVar = ascgVar.d;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                    } else {
                        aulqVar = null;
                    }
                    avco avcoVar = (avco) ahbj.n(aulqVar, SurveyRenderer.surveyTriggerRenderer);
                    if (avcoVar == null || (avcoVar.b & 16) == 0) {
                        return;
                    }
                    HatsController hatsController = grgVar.a;
                    avcn avcnVar = avcoVar.c;
                    if (avcnVar == null) {
                        avcnVar = avcn.a;
                    }
                    hatsController.j(avcnVar);
                }
            });
        }
    }
}
