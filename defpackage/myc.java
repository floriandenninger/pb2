package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class myc implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ mye b;

    public myc(mye myeVar, aahd aahdVar) {
        this.b = myeVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqco aqcoVar = this.b.b;
        if (aqcoVar != null) {
            aqcn aqcnVar = aqcoVar.p;
            if (aqcnVar == null) {
                aqcnVar = aqcn.a;
            }
            auib auibVar = aqcnVar.c;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            if ((auibVar.b & 4) != 0) {
                aahd aahdVar = this.a;
                aqcn aqcnVar2 = this.b.b.p;
                if (aqcnVar2 == null) {
                    aqcnVar2 = aqcn.a;
                }
                auib auibVar2 = aqcnVar2.c;
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
