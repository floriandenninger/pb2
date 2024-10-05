package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhl implements View.OnLongClickListener {
    public diy a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        diy diyVar = this.a;
        if (diyVar != null) {
            if (did.c == null) {
                did.c = new dkr();
            }
            did.c.a = view;
            Object K = diyVar.a.l().K(diyVar, did.c);
            did.c.a = null;
            if (K != null && ((Boolean) K).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
