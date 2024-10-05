package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.SurveyEndpointOuterClass$SurveyEndpoint;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezi implements aaha {
    private final HatsController a;

    public ezi(HatsController hatsController) {
        hatsController.getClass();
        this.a = hatsController;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        asoo asooVar = (asoo) apxfVar.pX(LiveChatAction.showLiveChatSurveyCommand);
        aulq aulqVar = asooVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(SurveyRenderer.surveyTriggerRenderer)) {
            aulq aulqVar2 = asooVar.b;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            avco avcoVar = (avco) aulqVar2.pX(SurveyRenderer.surveyTriggerRenderer);
            if ((avcoVar.b & 16) != 0) {
                HatsController hatsController = this.a;
                avcn avcnVar = avcoVar.c;
                if (avcnVar == null) {
                    avcnVar = avcn.a;
                }
                hatsController.j(avcnVar);
                return;
            }
            return;
        }
        if (apxfVar.pY(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)) {
            HatsController hatsController2 = this.a;
            avcn avcnVar2 = ((SurveyEndpointOuterClass$SurveyEndpoint) apxfVar.pX(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)).b;
            if (avcnVar2 == null) {
                avcnVar2 = avcn.a;
            }
            hatsController2.j(avcnVar2);
        }
    }
}
