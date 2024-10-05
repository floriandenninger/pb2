package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zzy implements View.OnClickListener {
    final /* synthetic */ aabq a;
    final /* synthetic */ argq b;

    public zzy(aabq aabqVar, argq argqVar) {
        this.a = aabqVar;
        this.b = argqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aabq aabqVar = this.a;
        if (aabqVar.o) {
            aahd aahdVar = aabqVar.x;
            apxf apxfVar = this.b.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
