package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mpl implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ mpm b;

    public mpl(mpm mpmVar, aahd aahdVar) {
        this.b = mpmVar;
        this.a = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = this.b.b;
        if (apxfVar != null) {
            this.a.c(apxfVar, null);
        }
    }
}
