package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mrp implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ mrr b;

    public mrp(mrr mrrVar, aahd aahdVar) {
        this.b = mrrVar;
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
