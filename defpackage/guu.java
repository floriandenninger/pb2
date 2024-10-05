package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guu implements aaha {
    private final aahd a;
    private final acqz b;
    private final wzq c;

    public guu(aahd aahdVar, acqz acqzVar, wzq wzqVar) {
        this.a = aahdVar;
        this.b = acqzVar;
        wzqVar.getClass();
        this.c = wzqVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aone createBuilder;
        if (apxfVar.pY(AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand)) {
            AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand adsClickWrapperCommandOuterClass$AdsClickWrapperCommand = (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand) apxfVar.pX(AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand);
            aozz aozzVar = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.d;
            if (aozzVar == null) {
                aozzVar = aozz.a;
            }
            if (aozzVar.b && this.c.d(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"))) {
                return;
            }
            apxg apxgVar = apxfVar.e;
            if (apxgVar == null) {
                apxgVar = apxg.a;
            }
            if (apxgVar.pY(asit.a)) {
                createBuilder = ((asht) apxgVar.pX(asit.a)).toBuilder();
            } else {
                createBuilder = asht.a.createBuilder();
            }
            if (aozzVar.e && apxgVar.pY(ashl.b)) {
                ashl ashlVar = (ashl) apxgVar.pX(ashl.b);
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashlVar.getClass();
                ashtVar.w = ashlVar;
                ashtVar.c |= 8192;
            }
            asht ashtVar2 = (asht) createBuilder.build();
            if (aozzVar.d) {
                this.b.mM().I(3, new acqx(apxfVar.c), true != asht.a.equals(ashtVar2) ? ashtVar2 : null);
            }
            if (aozzVar.c && apxgVar.pY(ashl.b)) {
                View view = (View) yjj.s(map, "com.google.android.libraries.youtube.rendering.elements.sender_view");
                if (view != null) {
                    ashl ashlVar2 = (ashl) apxgVar.pX(ashl.b);
                    xbw xbwVar = new xbw(view);
                    xbwVar.d(ashlVar2.d, ashlVar2.e);
                    map.put("MacrosConverters.CustomConvertersKey", new afxe[]{xbwVar});
                } else {
                    afsi.b(2, 1, "The AdsClickWrapperCommandResolver has no View set in its event data.");
                }
            }
            if ((adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.b & 1) != 0) {
                apxf apxfVar2 = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                if (!asht.a.equals(ashtVar2)) {
                    aong aongVar = (aong) apxfVar2.toBuilder();
                    aong aongVar2 = (aong) apxg.a.createBuilder();
                    aongVar2.e(asit.a, ashtVar2);
                    apxg apxgVar2 = (apxg) aongVar2.build();
                    aongVar.copyOnWrite();
                    apxf apxfVar3 = (apxf) aongVar.instance;
                    apxgVar2.getClass();
                    apxfVar3.e = apxgVar2;
                    apxfVar3.b |= 2;
                    apxfVar2 = (apxf) aongVar.build();
                }
                this.a.c(apxfVar2, map);
            }
        }
    }
}
