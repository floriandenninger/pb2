package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mu extends kc {
    final /* synthetic */ mv a;

    public mu(mv mvVar) {
        this.a = mvVar;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void a(View view) {
        this.a.a.k.setVisibility(8);
        ne neVar = this.a.a;
        PopupWindow popupWindow = neVar.l;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (neVar.k.getParent() instanceof View) {
            jw.K((View) this.a.a.k.getParent());
        }
        this.a.a.k.i();
        this.a.a.n.f(null);
        ne neVar2 = this.a.a;
        neVar2.n = null;
        jw.K(neVar2.p);
    }
}
