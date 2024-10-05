package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bl implements Animation.AnimationListener {
    final /* synthetic */ en a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ bn d;

    public bl(en enVar, ViewGroup viewGroup, View view, bn bnVar) {
        this.a = enVar;
        this.b = viewGroup;
        this.c = view;
        this.d = bnVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new bk(this));
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.a);
            sb.append(" has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.a);
            sb.append(" has reached onAnimationStart.");
        }
    }
}
