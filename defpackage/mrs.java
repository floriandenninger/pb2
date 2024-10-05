package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mrs implements View.OnClickListener {
    final /* synthetic */ mrt a;

    public mrs(mrt mrtVar) {
        this.a = mrtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mrt mrtVar = this.a;
        jai jaiVar = mrtVar.b;
        if (jaiVar != null) {
            aqwe aqweVar = jaiVar.a;
            if ((aqweVar.b & 4) != 0) {
                aahd aahdVar = mrtVar.a;
                apxf apxfVar = aqweVar.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
    }
}
