package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qg implements View.OnAttachStateChangeListener {
    final /* synthetic */ qk a;

    public qg(qk qkVar) {
        this.a = qkVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            qk qkVar = this.a;
            qkVar.e.removeGlobalOnLayoutListener(qkVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
