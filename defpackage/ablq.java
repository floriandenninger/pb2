package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ablq implements View.OnClickListener {
    final /* synthetic */ asqj a;
    final /* synthetic */ acqx b;
    final /* synthetic */ ablr c;

    public ablq(ablr ablrVar, asqj asqjVar, acqx acqxVar) {
        this.c = ablrVar;
        this.a = asqjVar;
        this.b = acqxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aahd aahdVar = this.c.a;
        apxf apxfVar = this.a.q;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, this.c.m);
        this.c.b.I(3, this.b, null);
    }
}
