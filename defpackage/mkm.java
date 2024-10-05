package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkm {
    aubs a;
    final boolean b;
    final boolean c;

    public mkm(aubs aubsVar, aama aamaVar) {
        this.a = aubsVar;
        this.b = aamaVar != null && aamaVar.c();
        this.c = aamaVar != null && aamaVar.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final apmp a() {
        aulq aulqVar;
        aubs aubsVar = this.a;
        if (!(aubsVar.e == 34 ? (aulq) aubsVar.f : aulq.a).pY(ButtonRendererOuterClass.toggleButtonRenderer)) {
            return null;
        }
        aubs aubsVar2 = this.a;
        if (aubsVar2.e == 34) {
            aulqVar = (aulq) aubsVar2.f;
        } else {
            aulqVar = aulq.a;
        }
        return (apmp) aulqVar.pX(ButtonRendererOuterClass.toggleButtonRenderer);
    }
}
