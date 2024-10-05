package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kuh implements kig {
    public final boolean a;
    public final kih b;
    ValueAnimator c;
    public int d;
    public View e;
    public int f;
    private final int g;
    private final int h;
    private boolean i;
    private boolean j;

    public kuh(Context context, kih kihVar, aadw aadwVar) {
        this.b = kihVar;
        this.g = context.getResources().getInteger(R.integer.config_mediumAnimTime);
        this.h = context.getResources().getDimensionPixelSize(com.google.android.youtube.R.dimen.suggested_action_no_controls_bottom_margin);
        asvu asvuVar = aadwVar.b().e;
        this.a = (asvuVar == null ? asvu.a : asvuVar).bd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        View view;
        if (this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (i == 0 || (view = this.e) == null) {
                return;
            }
            int[] iArr = new int[2];
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            iArr[0] = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            iArr[1] = i == 2 ? this.h : this.f;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            this.c = ofInt;
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kug
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    kuh.this.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                }
            });
            this.c.setDuration(i == 2 ? this.d : this.g);
            this.c.start();
        }
    }

    public final void b(int i) {
        View view = this.e;
        if (view == null) {
            return;
        }
        yny.z(view, yny.k(i), FrameLayout.LayoutParams.class);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        this.i = fhgVar.b();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (!this.i || this.j) {
            return;
        }
        a(true != z ? 2 : 1);
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        this.j = false;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.j = true;
    }
}
