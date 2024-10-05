package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alic {
    public final ArrayList a = new ArrayList();
    private final Animator.AnimatorListener b = new alib(this);

    public final void a(ValueAnimator valueAnimator) {
        akwg akwgVar = new akwg();
        valueAnimator.addListener(this.b);
        this.a.add(akwgVar);
    }
}
