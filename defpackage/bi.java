package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bi extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ en d;
    final /* synthetic */ bn e;

    public bi(ViewGroup viewGroup, View view, boolean z, en enVar, bn bnVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = enVar;
        this.e = bnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            ej.r(this.d.e, this.b);
        }
        this.e.b();
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(this.d);
            sb.append(" has ended.");
        }
    }
}
