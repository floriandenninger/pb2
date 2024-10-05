package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afnj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ afnl a;

    public afnj(afnl afnlVar) {
        this.a = afnlVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        afnl afnlVar = this.a;
        if (afnlVar.d.t == 4) {
            afnlVar.e();
        }
    }
}
