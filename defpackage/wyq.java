package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyq {
    private static final wyp a = new wyp();
    private final shf b;
    private final azrw c;
    private final wpm d;
    private final ajoy e;

    public wyq(shf shfVar, ajoy ajoyVar, wpm wpmVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = shfVar;
        this.e = ajoyVar;
        this.d = wpmVar;
        this.c = azrwVar;
    }

    private final String c() {
        return this.e.x();
    }

    public final List a(PlayerResponseModel playerResponseModel) {
        int i;
        int bY;
        int bY2;
        List<aowc> z = playerResponseModel.z();
        if (z == null || z.isEmpty()) {
            return Collections.emptyList();
        }
        PriorityQueue priorityQueue = new PriorityQueue(z.size(), a);
        for (aowc aowcVar : z) {
            int bY3 = amkq.bY(aowcVar.d);
            if ((bY3 != 0 && bY3 == 3 && aowcVar.b > 0) || (((bY = amkq.bY(aowcVar.d)) != 0 && bY == 2) || ((bY2 = amkq.bY(aowcVar.d)) != 0 && bY2 == 4))) {
                priorityQueue.add(aowcVar);
            }
        }
        if (priorityQueue.isEmpty()) {
            return Collections.emptyList();
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
            arrayList.add(new InstreamAdBreak(adBreakRendererModel, i, playerResponseModel.B(), playerResponseModel.y(), c(), playerResponseModel.v(), playerResponseModel.G()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r3 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak r25, java.util.List r26, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyq.b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak, java.util.List, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):java.util.List");
    }
}
