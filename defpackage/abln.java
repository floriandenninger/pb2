package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abln implements View.OnClickListener {
    final /* synthetic */ apmg a;
    final /* synthetic */ ablo b;

    public abln(ablo abloVar, apmg apmgVar) {
        this.b = abloVar;
        this.a = apmgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aahd aahdVar = this.b.b;
        apxf apxfVar = this.a.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
    }
}
