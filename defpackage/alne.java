package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alne extends AnimatorListenerAdapter {
    final /* synthetic */ alnf a;

    public alne(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alnf alnfVar = this.a;
        alnfVar.m.setChecked(alnfVar.e);
        this.a.j.start();
    }
}
