package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbg extends akm {
    final /* synthetic */ BottomUiContainer a;

    public gbg(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    @Override // defpackage.akm
    public final int b(View view) {
        return view.getHeight();
    }

    @Override // defpackage.akm
    public final void c(View view, int i) {
        alh alhVar = this.a.i;
        if (alhVar != null) {
            alhVar.j();
        }
    }

    @Override // defpackage.akm
    public final void e(View view, float f, float f2) {
        int K = yjk.K(this.a.getResources().getDisplayMetrics(), 10);
        int top = view.getTop();
        BottomUiContainer bottomUiContainer = this.a;
        if (top <= bottomUiContainer.j + K || f2 < 0.0f) {
            int top2 = view.getTop();
            BottomUiContainer bottomUiContainer2 = this.a;
            if (top2 > bottomUiContainer2.j) {
                bottomUiContainer2.k(f2);
                return;
            }
            return;
        }
        View view2 = bottomUiContainer.e;
        if (view2 == null || view2 == bottomUiContainer.f) {
            return;
        }
        if (!bottomUiContainer.k) {
            bottomUiContainer.k(f2);
            return;
        }
        gav gavVar = bottomUiContainer.n;
        if (gavVar != null) {
            gavVar.a(0);
        }
        alh alhVar = bottomUiContainer.i;
        if (alhVar != null) {
            alhVar.j();
        }
        Animator animator = bottomUiContainer.g;
        if (animator != null) {
            animator.cancel();
        }
        alh f3 = bottomUiContainer.f(bottomUiContainer.e, f2);
        f3.f(new gar(bottomUiContainer, 0));
        bottomUiContainer.i = f3;
        bottomUiContainer.f = bottomUiContainer.e;
        bottomUiContainer.i.i(bottomUiContainer.j + r4.getHeight());
    }

    @Override // defpackage.akm
    public final boolean f(View view, int i) {
        BottomUiContainer bottomUiContainer = this.a;
        return bottomUiContainer.k && view == bottomUiContainer.e && view != bottomUiContainer.f;
    }

    @Override // defpackage.akm
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.akm
    public final int h(View view, int i) {
        int i2 = this.a.j;
        return aii.c(i, i2, view.getHeight() + i2);
    }

    @Override // defpackage.akm
    public final void i(View view, int i, int i2, int i3) {
        view.setAlpha(this.a.a(view, i2));
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.j(bottomUiContainer.b(view));
    }
}
