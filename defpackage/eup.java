package defpackage;

import com.google.protos.youtube.api.innertube.AdsDebounceCommandOuterClass$AdsDebounceCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eup implements aaha {
    private final wzq a;
    private final aahd b;

    public eup(wzq wzqVar, aahd aahdVar) {
        wzqVar.getClass();
        this.a = wzqVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar == null || !apxfVar.pY(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand)) {
            return;
        }
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = (AdsDebounceCommandOuterClass$AdsDebounceCommand) apxfVar.pX(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand);
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.a.d(s)) {
            return;
        }
        apxf apxfVar2 = adsDebounceCommandOuterClass$AdsDebounceCommand.b;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        apxg apxgVar = apxfVar.e;
        if (apxgVar == null) {
            apxgVar = apxg.a;
        }
        if (apxgVar.pY(asit.a)) {
            apxg apxgVar2 = apxfVar.e;
            if (apxgVar2 == null) {
                apxgVar2 = apxg.a;
            }
            asht ashtVar = (asht) apxgVar2.pX(asit.a);
            aong aongVar = (aong) apxfVar2.toBuilder();
            apxg apxgVar3 = apxfVar2.e;
            if (apxgVar3 == null) {
                apxgVar3 = apxg.a;
            }
            aong aongVar2 = (aong) apxgVar3.toBuilder();
            aongVar2.e(asit.a, ashtVar);
            apxg apxgVar4 = (apxg) aongVar2.build();
            aongVar.copyOnWrite();
            apxf apxfVar3 = (apxf) aongVar.instance;
            apxgVar4.getClass();
            apxfVar3.e = apxgVar4;
            apxfVar3.b |= 2;
            apxfVar2 = (apxf) aongVar.build();
        }
        this.b.c(apxfVar2, map);
        if (adsDebounceCommandOuterClass$AdsDebounceCommand.c) {
            this.a.c(s, apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE);
        }
    }
}
