package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xol extends AnimatorListenerAdapter {
    final /* synthetic */ xom a;
    private final Handler b = new Handler();
    private final View c;

    public xol(xom xomVar, View view) {
        this.a = xomVar;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Animator a = xom.a(this.c, 0L);
        if (a != null) {
            a.addListener(new xoj());
            this.b.post(new xok(a, 0));
            this.a.b.put(this.c, a);
        }
    }
}
