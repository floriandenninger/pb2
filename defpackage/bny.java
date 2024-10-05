package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bny implements Animation.AnimationListener {
    final /* synthetic */ bof a;
    private final /* synthetic */ int b;

    public bny(bof bofVar, int i) {
        this.b = i;
        this.a = bofVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b != 0) {
            this.a.nd(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            return;
        }
        OverlayListView overlayListView = this.a.o;
        for (boj bojVar : overlayListView.a) {
            if (!bojVar.k) {
                bojVar.j = overlayListView.getDrawingTime();
                bojVar.k = true;
            }
        }
        bof bofVar = this.a;
        bofVar.o.postDelayed(bofVar.W, bofVar.R);
    }
}
