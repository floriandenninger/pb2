package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezh implements aaha {
    public static final /* synthetic */ int a = 0;
    private final akbv b;
    private final acqz c;
    private final akcp d;

    public ezh(akbv akbvVar, acqz acqzVar, akcp akcpVar) {
        this.b = akbvVar;
        this.c = acqzVar;
        this.d = akcpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        auum auumVar = (auum) apxfVar.pX(ShowTooltipCommandOuterClass.showTooltipCommand);
        if ((auumVar.b & 1) != 0) {
            Object s = yjj.s(map, "hint_anchor_tag");
            aulq aulqVar = auumVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (!aulqVar.pY(HintRendererOuterClass.hintRenderer) || !(s instanceof View)) {
                aulq aulqVar2 = auumVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                if (aulqVar2.pY(TooltipRendererOuterClass.tooltipRenderer)) {
                    akcp akcpVar = this.d;
                    aulq aulqVar3 = auumVar.c;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    akcpVar.e((avhy) aulqVar3.pX(TooltipRendererOuterClass.tooltipRenderer), eri.k);
                    return;
                }
                return;
            }
            akbv akbvVar = this.b;
            aulq aulqVar4 = auumVar.c;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            akbvVar.b((arej) aulqVar4.pX(HintRendererOuterClass.hintRenderer), (View) s, yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.c.mM());
        }
    }
}
