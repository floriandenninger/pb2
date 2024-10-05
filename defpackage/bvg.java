package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvg extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public bvg(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int i = swipeRefreshLayout.g;
        int abs = Math.abs(swipeRefreshLayout.f);
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        this.a.m((swipeRefreshLayout2.e + ((int) (((i - abs) - r2) * f))) - swipeRefreshLayout2.d.getTop());
        this.a.h.c(1.0f - f);
    }
}
