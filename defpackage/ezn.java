package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezn implements aaha {
    private final /* synthetic */ int a;

    public ezn(int i) {
        this.a = i;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        askd askdVar;
        abgl abglVar;
        switch (this.a) {
            case 0:
                UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction) apxfVar.pX(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.updateHorizontalCardListAction);
                String str = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.b == 3 ? (String) updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.c : "";
                ajwx ajwxVar = (ajwx) yjj.u(map, "sectionListController", ajwx.class);
                if (ajwxVar == null) {
                    zga.b("Cannot perform UpdateHorizontalCardListAction on a null section list controller.");
                    return;
                }
                if (str.isEmpty()) {
                    zga.b("Cannot perform UpdateHorizontalCardListAction without a section identifier.");
                    return;
                }
                avsc avscVar = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
                if (avscVar == null) {
                    avscVar = avsc.a;
                }
                if (avscVar.b != 50195462) {
                    zga.b("Cannot perform UpdateHorizontalCardListAction with a null replacement ItemSectionRenderer.");
                    return;
                }
                avsc avscVar2 = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
                if (avscVar2 == null) {
                    avscVar2 = avsc.a;
                }
                if (avscVar2.b == 50195462) {
                    askdVar = (askd) avscVar2.c;
                } else {
                    askdVar = askd.a;
                }
                ajvj ajvjVar = (ajvj) ajwxVar.s(str);
                if (ajvjVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103);
                    sb.append("Cannot perform UpdateHorizontalCardListAction. An ItemSectionController identified by \"");
                    sb.append(str);
                    sb.append("\" was not found.");
                    zga.b(sb.toString());
                    return;
                }
                ajvjVar.i(new aalz(askdVar));
                if (ajvjVar.lC().a() <= 0 || !(ajwxVar instanceof ajwi)) {
                    return;
                }
                RecyclerView recyclerView = ((ajwi) ajwxVar).K;
                if (recyclerView.canScrollVertically(-1)) {
                    return;
                }
                wd wdVar = recyclerView.n;
                if (wdVar instanceof LinearLayoutManager) {
                    int I = ((LinearLayoutManager) wdVar).I();
                    ajng r = ajwxVar.r();
                    Object c = ajvjVar.lC().c(0);
                    for (int i = 0; i <= I; i++) {
                        if (r.c(i) == c) {
                            ajwxVar.lr(str);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                apxfVar.pY(aqkk.b);
                return;
            case 3:
                ((hvx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", hvx.class)).d();
                return;
            case 4:
                ijr ijrVar = (ijr) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", ijr.class);
                amkq.E(apxfVar.pY(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand));
                ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand = (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand) apxfVar.pX(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand);
                int bQ = aobq.bQ(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.c);
                int i2 = bQ != 0 ? bQ : 1;
                if (i2 == 2) {
                    ijrVar.f(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                    return;
                } else {
                    if (i2 == 3) {
                        ijrVar.c(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                        return;
                    }
                    return;
                }
            case 5:
                xqm xqmVar = (xqm) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xqm.class);
                if (!apxfVar.pY(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction) || xqmVar == null) {
                    return;
                }
                xqmVar.a((UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) apxfVar.pX(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction));
                return;
            case 6:
                return;
            case 7:
                if (apxfVar.pY(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
                    LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
                    if ((liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) == 0 || (abglVar = (abgl) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", abgl.class)) == null) {
                        return;
                    }
                    asrc asrcVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar == null) {
                        asrcVar = asrc.a;
                    }
                    if ((asrcVar.b & 1) != 0) {
                        asrc asrcVar2 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar2 == null) {
                            asrcVar2 = asrc.a;
                        }
                        aulm aulmVar = asrcVar2.c;
                        if (aulmVar == null) {
                            aulmVar = aulm.a;
                        }
                        abglVar.m(ahbj.o(aulmVar));
                        return;
                    }
                    asrc asrcVar3 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar3 == null) {
                        asrcVar3 = asrc.a;
                    }
                    if ((asrcVar3.b & 2) != 0) {
                        asrc asrcVar4 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar4 == null) {
                            asrcVar4 = asrc.a;
                        }
                        avgs avgsVar = asrcVar4.d;
                        if (avgsVar == null) {
                            avgsVar = avgs.a;
                        }
                        abglVar.m(ahbj.o(avgsVar));
                        return;
                    }
                    asrc asrcVar5 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar5 == null) {
                        asrcVar5 = asrc.a;
                    }
                    if ((asrcVar5.b & 4) != 0) {
                        asrc asrcVar6 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar6 == null) {
                            asrcVar6 = asrc.a;
                        }
                        asjj asjjVar = asrcVar6.e;
                        if (asjjVar == null) {
                            asjjVar = asjj.a;
                        }
                        abglVar.m(ahbj.o(asjjVar));
                        return;
                    }
                    asrc asrcVar7 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar7 == null) {
                        asrcVar7 = asrc.a;
                    }
                    if ((asrcVar7.b & 8) != 0) {
                        asrc asrcVar8 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar8 == null) {
                            asrcVar8 = asrc.a;
                        }
                        asrd asrdVar = asrcVar8.f;
                        if (asrdVar == null) {
                            asrdVar = asrd.a;
                        }
                        abglVar.m(ahbj.o(asrdVar));
                        return;
                    }
                    asrc asrcVar9 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar9 == null) {
                        asrcVar9 = asrc.a;
                    }
                    if ((asrcVar9.b & 16) != 0) {
                        asrc asrcVar10 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar10 == null) {
                            asrcVar10 = asrc.a;
                        }
                        auah auahVar = asrcVar10.g;
                        if (auahVar == null) {
                            auahVar = auah.a;
                        }
                        abglVar.m(ahbj.o(auahVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (apxfVar.pY(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)) {
                    aulq aulqVar = ((OpenDialogCommandOuterClass$OpenDialogCommand) apxfVar.pX(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    aulqVar.pY(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer);
                    return;
                }
                return;
        }
    }
}
