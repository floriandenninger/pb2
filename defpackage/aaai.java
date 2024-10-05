package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaai implements View.OnClickListener {
    final /* synthetic */ aabq a;
    final /* synthetic */ apxf b;

    public aaai(aabq aabqVar, apxf apxfVar) {
        this.a = aabqVar;
        this.b = apxfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aabq aabqVar = this.a;
        if (aabqVar.o) {
            aabqVar.x.c(this.b, null);
        }
    }
}
