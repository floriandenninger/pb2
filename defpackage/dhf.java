package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhf implements View.OnFocusChangeListener {
    public diy a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        diy diyVar = this.a;
        if (diyVar != null) {
            if (did.b == null) {
                did.b = new djd();
            }
            did.b.a = view;
            did.b.b = z;
            diyVar.a.l().K(diyVar, did.b);
            did.b.a = null;
        }
    }
}
