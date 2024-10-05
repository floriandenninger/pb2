package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpp implements View.OnClickListener {
    final /* synthetic */ kpq a;
    private final /* synthetic */ int b;

    public kpp(kpq kpqVar, int i) {
        this.b = i;
        this.a = kpqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            xix xixVar = this.a.d;
            if (xixVar != null) {
                xixVar.a();
                return;
            }
            return;
        }
        kpq kpqVar = this.a;
        if (kpqVar.d == null || kpqVar.e == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        aulq aulqVar = this.a.e.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aowm aowmVar = (aowm) ahbj.n(aulqVar, AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        if (aowmVar != null) {
            arrayList.addAll(aowmVar.n);
            if ((aowmVar.b & 512) != 0) {
                apxf apxfVar = aowmVar.m;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                arrayList.add(apxfVar);
            }
        }
        this.a.d.b(arrayList);
    }
}
