package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akll implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ aklp b;

    public akll(aklp aklpVar, aahd aahdVar) {
        this.b = aklpVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = this.b.a;
        if (apxfVar != null) {
            this.a.c(apxfVar, null);
        }
        apxf apxfVar2 = this.b.b;
        if (apxfVar2 != null) {
            this.a.c(apxfVar2, null);
        }
    }
}
