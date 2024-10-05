package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaab implements View.OnClickListener {
    final /* synthetic */ aabq a;
    final /* synthetic */ arhe b;

    public aaab(aabq aabqVar, arhe arheVar) {
        this.a = aabqVar;
        this.b = arheVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aabq aabqVar = this.a;
        if (aabqVar.o) {
            aahd aahdVar = aabqVar.x;
            apxf apxfVar = this.b.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
