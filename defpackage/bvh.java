package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvh extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public bvh(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.g(f);
    }
}
