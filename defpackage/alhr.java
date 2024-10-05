package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhr extends alhp {
    public alhr(FloatingActionButton floatingActionButton, alhe alheVar) {
        super(floatingActionButton, alheVar);
    }

    private final Animator o(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.x, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.alhp
    public final float a() {
        return this.x.getElevation();
    }

    @Override // defpackage.alhp
    public final void e(Rect rect) {
        if (this.z.b()) {
            super.e(rect);
        } else if (!n()) {
            int b = (this.q - this.x.b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.alhp
    public final void f(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b, o(f, f3));
            stateListAnimator.addState(c, o(f, f2));
            stateListAnimator.addState(d, o(f, f2));
            stateListAnimator.addState(e, o(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.x, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, this.x.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(f, animatorSet);
            stateListAnimator.addState(g, o(0.0f, 0.0f));
            this.x.setStateListAnimator(stateListAnimator);
        }
        if (l()) {
            j();
        }
    }

    @Override // defpackage.alhp
    public final boolean l() {
        return this.z.b() || !n();
    }
}
