package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajza implements View.OnClickListener {
    private final ajyz a;
    private final acqx b;
    private final acra c;

    public ajza(ajyz ajyzVar, acqx acqxVar, acra acraVar) {
        this.a = ajyzVar;
        this.b = acqxVar;
        this.c = acraVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajyz ajyzVar = this.a;
        if (ajyzVar != null) {
            ajyz ajyzVar2 = ((ajyy) ajyzVar).a.f;
            if (ajyzVar2 != null) {
                xoh xohVar = ((xnu) ajyzVar2).a;
                xohVar.l.e(xohVar.j);
                xohVar.l.b();
                xohVar.l.e(xohVar.i);
            }
            this.c.I(3, this.b, null);
        }
    }
}
