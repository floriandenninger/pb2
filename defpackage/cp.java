package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cp implements View.OnAttachStateChangeListener {
    final /* synthetic */ dj a;
    final /* synthetic */ cq b;

    public cp(cq cqVar, dj djVar) {
        this.b = cqVar;
        this.a = djVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dj djVar = this.a;
        ce ceVar = djVar.b;
        djVar.e();
        eo.b((ViewGroup) ceVar.O.getParent(), this.b.a).c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
