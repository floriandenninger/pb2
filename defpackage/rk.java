package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rk implements View.OnAttachStateChangeListener {
    final /* synthetic */ rl a;

    public rk(rl rlVar) {
        this.a = rlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            rl rlVar = this.a;
            rlVar.d.removeGlobalOnLayoutListener(rlVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
