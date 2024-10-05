package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gaw extends AnimatorListenerAdapter {
    final /* synthetic */ gbi a;
    final /* synthetic */ gbj b;
    final /* synthetic */ BottomUiContainer c;
    final /* synthetic */ gav d;

    public gaw(BottomUiContainer bottomUiContainer, gbi gbiVar, gbj gbjVar, gav gavVar) {
        this.c = bottomUiContainer;
        this.a = gbiVar;
        this.b = gbjVar;
        this.d = gavVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.p(this.a, this.b, this.d);
    }
}
