package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mum implements View.OnClickListener {
    final /* synthetic */ mun a;

    public mum(mun munVar) {
        this.a = munVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        mun munVar = this.a;
        auuf auufVar = munVar.n;
        if (auufVar != null) {
            apsq apsqVar = auufVar.f;
            if (apsqVar == null) {
                apsqVar = apsq.a;
            }
            apsr apsrVar = apsqVar.c;
            if (apsrVar == null) {
                apsrVar = apsr.a;
            }
            if ((apsrVar.b & 2) != 0) {
                apsq apsqVar2 = munVar.n.f;
                if (apsqVar2 == null) {
                    apsqVar2 = apsq.a;
                }
                apsr apsrVar2 = apsqVar2.c;
                if (apsrVar2 == null) {
                    apsrVar2 = apsr.a;
                }
                apxfVar = apsrVar2.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            if (apxfVar != null) {
                this.a.b.c(apxfVar, null);
                return;
            }
            mun munVar2 = this.a;
            auuf auufVar2 = munVar2.n;
            if ((auufVar2.b & 8) != 0) {
                aahd aahdVar = munVar2.b;
                apxf apxfVar2 = auufVar2.g;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.c(apxfVar2, null);
            }
        }
    }
}
