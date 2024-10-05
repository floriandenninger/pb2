package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abls implements View.OnClickListener {
    final /* synthetic */ asqk a;
    final /* synthetic */ acqx b;
    final /* synthetic */ ablt c;

    public abls(ablt abltVar, asqk asqkVar, acqx acqxVar) {
        this.c = abltVar;
        this.a = asqkVar;
        this.b = acqxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aahd aahdVar = this.c.b;
        apxf apxfVar = this.a.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        this.c.a.I(3, this.b, null);
    }
}
