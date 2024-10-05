package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aklm implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ aklo b;
    final /* synthetic */ aklp c;

    public aklm(aklp aklpVar, aahd aahdVar, aklo akloVar) {
        this.c = aklpVar;
        this.a = aahdVar;
        this.b = akloVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = this.c.c;
        if (apxfVar != null) {
            this.a.c(apxfVar, null);
        }
        this.b.d(this.c.d);
    }
}
