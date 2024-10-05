package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaal implements View.OnClickListener {
    final /* synthetic */ aabq a;
    final /* synthetic */ arhk b;

    public aaal(aabq aabqVar, arhk arhkVar) {
        this.a = aabqVar;
        this.b = arhkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aabq aabqVar = this.a;
        if (aabqVar.o) {
            aahd aahdVar = aabqVar.x;
            apxf apxfVar = this.b.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
