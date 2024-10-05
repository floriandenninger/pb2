package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class naf implements View.OnClickListener {
    final /* synthetic */ nah a;
    private final /* synthetic */ int b;

    public naf(nah nahVar, int i) {
        this.b = i;
        this.a = nahVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            nah nahVar = this.a;
            apxf apxfVar = nahVar.h;
            if (apxfVar != null) {
                nahVar.a.g(apxfVar);
            }
            this.a.c.a();
            return;
        }
        nah nahVar2 = this.a;
        apxf apxfVar2 = nahVar2.i;
        if (apxfVar2 != null) {
            nahVar2.a.g(apxfVar2);
        }
    }
}
