package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdk implements agdm {
    private final wqj a;

    public agdk(wqj wqjVar) {
        this.a = wqjVar;
    }

    @Override // defpackage.agdm
    public final List a(PlayerResponseModel playerResponseModel) {
        int i;
        int bY;
        int bY2;
        playerResponseModel.getClass();
        wqj wqjVar = this.a;
        List<aowc> z = playerResponseModel.z();
        if (z == null || z.isEmpty()) {
            return amru.q();
        }
        PriorityQueue priorityQueue = new PriorityQueue(z.size(), wqj.a);
        for (aowc aowcVar : z) {
            int bY3 = amkq.bY(aowcVar.d);
            if ((bY3 != 0 && bY3 == 3 && aowcVar.b > 0) || (((bY = amkq.bY(aowcVar.d)) != 0 && bY == 2) || ((bY2 = amkq.bY(aowcVar.d)) != 0 && bY2 == 4))) {
                priorityQueue.add(aowcVar);
            }
        }
        if (priorityQueue.isEmpty()) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (priorityQueue.size() > 0) {
            aowc aowcVar2 = (aowc) priorityQueue.poll();
            AdBreakRendererModel adBreakRendererModel = new AdBreakRendererModel(aowcVar2);
            int bY4 = amkq.bY(aowcVar2.d);
            if (bY4 != 0 && bY4 == 2) {
                i = 0;
            } else {
                i = i2;
                i2++;
            }
            arrayList.add(new InstreamAdBreak(adBreakRendererModel, i, playerResponseModel.B(), playerResponseModel.y(), wqjVar.b(), playerResponseModel.v(), playerResponseModel.G()));
        }
        return amru.o(arrayList);
    }

    @Override // defpackage.agdm
    public final List b(InstreamAdBreak instreamAdBreak) {
        PlayerAd playerAd;
        yjk.e();
        wqj wqjVar = this.a;
        List<aowd> c = instreamAdBreak.c();
        PlayerConfigModel playerConfigModel = PlayerConfigModel.b;
        ArrayList arrayList = new ArrayList(c.size());
        for (aowd aowdVar : c) {
            if ((aowdVar.b & 16) != 0) {
                ArrayList arrayList2 = new ArrayList();
                aumr aumrVar = aowdVar.f;
                if (aumrVar == null) {
                    aumrVar = aumr.a;
                }
                if ((aumrVar.b & 1) != 0) {
                    aulq aulqVar = aumrVar.c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    arrayList2.add(wqjVar.a(instreamAdBreak, aulqVar, playerConfigModel, wqjVar.b()));
                }
                if ((aumrVar.b & 2) != 0) {
                    aulq aulqVar2 = aumrVar.d;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    arrayList2.add(wqjVar.a(instreamAdBreak, aulqVar2, playerConfigModel, wqjVar.b()));
                }
                if ((aumrVar.b & 4) != 0) {
                    aulq aulqVar3 = aumrVar.e;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    arrayList2.add(wqjVar.a(instreamAdBreak, aulqVar3, playerConfigModel, wqjVar.b()));
                }
                arrayList.addAll(arrayList2);
            } else {
                String b = wqjVar.b();
                instreamAdBreak.getClass();
                if (instreamAdBreak.b() == xfn.PRE_ROLL) {
                    yjk.e();
                }
                aapf aapfVar = (aapf) wqjVar.d.get();
                aarr aarrVar = wqjVar.c;
                long c2 = wqjVar.b.c();
                int i = aowdVar.b;
                if ((i & 1) != 0) {
                    avvy avvyVar = aowdVar.c;
                    if (avvyVar == null) {
                        avvyVar = avvy.a;
                    }
                    playerAd = new LocalVideoAd(instreamAdBreak, playerConfigModel, b, avvyVar, aapfVar, aarrVar, c2);
                } else if ((i & 2) != 0) {
                    aqxo aqxoVar = aowdVar.d;
                    if (aqxoVar == null) {
                        aqxoVar = aqxo.a;
                    }
                    playerAd = new ForecastingAd(instreamAdBreak, playerConfigModel, b, c2, aqxoVar);
                } else if ((i & 4) != 0) {
                    avbm avbmVar = aowdVar.e;
                    if (avbmVar == null) {
                        avbmVar = avbm.a;
                    }
                    playerAd = new SurveyAd(instreamAdBreak, playerConfigModel, b, avbmVar, 0);
                } else {
                    zga.b("Received unsupported ad type, this should never happen.");
                    playerAd = null;
                }
                InstreamAdImpl instreamAdImpl = playerAd != null ? new InstreamAdImpl(playerAd) : null;
                if (instreamAdImpl == null) {
                    return amru.q();
                }
                arrayList.add(instreamAdImpl);
            }
        }
        return amru.o(arrayList);
    }
}
