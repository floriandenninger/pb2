package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wgz implements View.OnClickListener {
    final /* synthetic */ wib a;
    final /* synthetic */ whb b;

    public wgz(whb whbVar, wib wibVar) {
        this.b = whbVar;
        this.a = wibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aatb aatbVar = this.b.a;
        if (aatbVar != null) {
            this.a.i(aatbVar);
        }
    }
}
