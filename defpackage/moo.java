package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class moo implements View.OnClickListener {
    final /* synthetic */ moq a;

    public moo(moq moqVar) {
        this.a = moqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        moq moqVar = this.a;
        apxf apxfVar = moqVar.c;
        if (apxfVar != null) {
            moqVar.a.c(apxfVar, null);
        }
    }
}
