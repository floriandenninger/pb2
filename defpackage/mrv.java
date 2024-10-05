package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mrv implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ mrw b;

    public mrv(mrw mrwVar, aahd aahdVar) {
        this.b = mrwVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aubp aubpVar = this.b.a;
        if (aubpVar == null || (aubpVar.b & 2) == 0) {
            return;
        }
        aahd aahdVar = this.a;
        apxf apxfVar = aubpVar.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
    }
}
