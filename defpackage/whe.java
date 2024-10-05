package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class whe implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ whg a;

    public whe(whg whgVar) {
        this.a = whgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        aata aataVar;
        if (this.a.a.getVisibility() == 0) {
            whg whgVar = this.a;
            if (whgVar.c || (aataVar = whgVar.b) == null || !aataVar.o()) {
                return;
            }
            this.a.a.requestFocus();
            this.a.a.sendAccessibilityEvent(8);
            this.a.c = true;
        }
    }
}
