package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjt extends tjc {
    final /* synthetic */ tju a;

    public tjt(tju tjuVar) {
        this.a = tjuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        tju tjuVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(tjuVar.c, false);
        this.a.b.cancel();
        this.a.a();
    }
}
