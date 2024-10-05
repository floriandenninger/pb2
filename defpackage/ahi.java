package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahi implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout a;

    public ahi(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.k(0);
        return true;
    }
}
