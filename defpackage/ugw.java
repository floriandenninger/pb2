package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugw implements View.OnAttachStateChangeListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ vw b;

    public ugw(RecyclerView recyclerView, vw vwVar) {
        this.a = recyclerView;
        this.b = vwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.ac(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.ac(null);
    }
}
