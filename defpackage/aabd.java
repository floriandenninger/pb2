package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aabd implements View.OnClickListener {
    final /* synthetic */ aabg a;

    public aabd(aabg aabgVar) {
        this.a = aabgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aabq aabqVar = this.a.f;
        if (aabqVar != null) {
            aabqVar.r();
            this.a.f.d();
        }
    }
}
