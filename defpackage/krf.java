package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class krf implements View.OnClickListener {
    final /* synthetic */ krh a;
    private final /* synthetic */ int b;

    public krf(krh krhVar, int i) {
        this.b = i;
        this.a = krhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            krh krhVar = this.a;
            Object obj = krhVar.r;
            if (obj == null) {
                krhVar.k("Expanded view has null renderer on click");
                return;
            }
            apxb apxbVar = ((apxa) obj).d;
            if (apxbVar == null) {
                apxbVar = apxb.a;
            }
            aulq aulqVar = apxbVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                apxb apxbVar2 = ((apxa) this.a.r).d;
                if (apxbVar2 == null) {
                    apxbVar2 = apxb.a;
                }
                aulq aulqVar2 = apxbVar2.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aowm aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                ArrayList arrayList = new ArrayList(aowmVar.n);
                if ((aowmVar.b & 512) != 0) {
                    apxf apxfVar = aowmVar.m;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    arrayList.add(apxfVar);
                }
                this.a.a(aowmVar, arrayList);
                return;
            }
            return;
        }
        krh krhVar2 = this.a;
        Object obj2 = krhVar2.r;
        if (obj2 == null) {
            krhVar2.k("Thumbnail view has null renderer on click");
            return;
        }
        apwz apwzVar = ((apxa) obj2).e;
        if (apwzVar == null) {
            apwzVar = apwz.a;
        }
        aulq aulqVar3 = apwzVar.b;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            apwz apwzVar2 = ((apxa) this.a.r).e;
            if (apwzVar2 == null) {
                apwzVar2 = apwz.a;
            }
            aulq aulqVar4 = apwzVar2.b;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            aowm aowmVar2 = (aowm) aulqVar4.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            ArrayList arrayList2 = new ArrayList(aowmVar2.n);
            if ((aowmVar2.b & 512) != 0) {
                apxf apxfVar2 = aowmVar2.m;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                arrayList2.add(apxfVar2);
            }
            this.a.a(aowmVar2, arrayList2);
        }
    }
}
