package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alew implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alkg a;
    final /* synthetic */ AppBarLayout b;

    public alew(AppBarLayout appBarLayout, alkg alkgVar) {
        this.b = appBarLayout;
        this.a = alkgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.k(floatValue);
        Drawable drawable = this.b.g;
        if (drawable instanceof alkg) {
            ((alkg) drawable).k(floatValue);
        }
        for (alfe alfeVar : this.b.f) {
            int i = this.a.f;
            alfeVar.a();
        }
    }
}
