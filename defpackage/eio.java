package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eio implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ eip b;

    public eio(eip eipVar, aahd aahdVar) {
        this.b = eipVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = this.b.a;
        if (apxfVar != null) {
            this.a.c(apxfVar, null);
        }
    }
}
