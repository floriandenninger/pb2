package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class od extends of {
    private final ObjectAnimator a;
    private final boolean b;

    public od(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        oe oeVar = new oe(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(oeVar.a);
        ofInt.setInterpolator(oeVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.of
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.of
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.of
    public final void c() {
        this.a.reverse();
    }

    @Override // defpackage.of
    public final boolean d() {
        return this.b;
    }
}
