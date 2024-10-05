package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjq extends tjc {
    final /* synthetic */ tjr a;

    public tjq(tjr tjrVar) {
        this.a = tjrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        tjr tjrVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(tjrVar.h, false);
        this.a.a();
    }
}
