package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhd implements View.OnClickListener {
    public diy a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        diy diyVar = this.a;
        if (diyVar != null) {
            if (did.a == null) {
                did.a = new dgs();
            }
            did.a.a = view;
            diyVar.a.l().K(diyVar, did.a);
            did.a.a = null;
        }
    }
}
