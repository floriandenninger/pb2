package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpm extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ abpo c;

    public abpm(abpo abpoVar, boolean z, boolean z2) {
        this.c = abpoVar;
        this.a = z;
        this.b = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        abpo abpoVar = this.c;
        abpoVar.s = false;
        abpoVar.j.setVisibility(8);
        this.c.j.setTranslationY(0.0f);
        if (this.a) {
            this.c.d();
            abpo abpoVar2 = this.c;
            abpoVar2.d.a(abpoVar2);
        }
        if (this.b) {
            return;
        }
        this.c.f();
    }
}
