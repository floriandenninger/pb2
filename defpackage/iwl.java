package defpackage;

import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwl implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ iwn a;
    private final /* synthetic */ int b;

    public iwl(iwn iwnVar, int i) {
        this.b = i;
        this.a = iwnVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.b == 0) {
            this.a.al.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.aJ(true);
            return;
        }
        this.a.ah.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.aj.setAlpha(0.0f);
        this.a.aj.animate().alpha(1.0f).setDuration(this.a.af).start();
        this.a.an = false;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, r0.ai.getHeight(), 0.0f);
        translateAnimation.setDuration(this.a.ae);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.a.ai.startAnimation(translateAnimation);
    }
}
