package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zww implements View.OnClickListener {
    final /* synthetic */ zwx a;
    final /* synthetic */ zwy b;

    public zww(zwy zwyVar, zwx zwxVar) {
        this.b = zwyVar;
        this.a = zwxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zwy zwyVar = this.b;
        zxk zxkVar = zwyVar.d;
        zxkVar.e.c((zwv) zwyVar.e.get(this.a.b()));
    }
}
