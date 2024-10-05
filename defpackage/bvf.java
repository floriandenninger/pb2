package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvf implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;
    private final /* synthetic */ int b;

    public bvf(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.b = i;
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        bvi bviVar;
        if (this.b == 0) {
            this.a.n(null);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout.b) {
            swipeRefreshLayout.h.setAlpha(PrivateKeyType.INVALID);
            this.a.h.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.a;
            if (swipeRefreshLayout2.i && (bviVar = swipeRefreshLayout2.a) != null) {
                bviVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.a;
            swipeRefreshLayout3.c = swipeRefreshLayout3.d.getTop();
            return;
        }
        swipeRefreshLayout.h();
    }
}
