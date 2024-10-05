package defpackage;

import com.google.protos.youtube.api.innertube.AdsFireOnceCommandOuterClass$AdsFireOnceCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class euo implements aaha {
    private final euv a;
    private final aahd b;

    public euo(euv euvVar, aahd aahdVar) {
        euvVar.getClass();
        this.a = euvVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar == null || !apxfVar.pY(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.adsFireOnceCommand)) {
            return;
        }
        AdsFireOnceCommandOuterClass$AdsFireOnceCommand adsFireOnceCommandOuterClass$AdsFireOnceCommand = (AdsFireOnceCommandOuterClass$AdsFireOnceCommand) apxfVar.pX(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.adsFireOnceCommand);
        int i = adsFireOnceCommandOuterClass$AdsFireOnceCommand.b;
        if ((i & 1) != 0) {
            if ((i & 2) != 0) {
                eun eunVar = (eun) this.a.b(adsFireOnceCommandOuterClass$AdsFireOnceCommand.d, eun.class, "AFOCState", nbo.b);
                boolean z = eunVar.a;
                eunVar.a = true;
                if (!(!z)) {
                    return;
                }
            }
            aahd aahdVar = this.b;
            apxf apxfVar2 = adsFireOnceCommandOuterClass$AdsFireOnceCommand.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.c(apxfVar2, map);
        }
    }
}
