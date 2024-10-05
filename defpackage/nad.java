package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nad implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ nae b;

    public nad(nae naeVar, aahd aahdVar) {
        this.b = naeVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arcw arcwVar = this.b.a;
        if (arcwVar != null) {
            arcv arcvVar = arcwVar.p;
            if (arcvVar == null) {
                arcvVar = arcv.a;
            }
            auib auibVar = arcvVar.c;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            if ((auibVar.b & 4) != 0) {
                aahd aahdVar = this.a;
                arcv arcvVar2 = this.b.a.p;
                if (arcvVar2 == null) {
                    arcvVar2 = arcv.a;
                }
                auib auibVar2 = arcvVar2.c;
                if (auibVar2 == null) {
                    auibVar2 = auib.a;
                }
                apxf apxfVar = auibVar2.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
    }
}
