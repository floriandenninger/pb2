package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htg implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ htl b;
    private final /* synthetic */ int c;

    public htg(htl htlVar, boolean z, int i) {
        this.c = i;
        this.b = htlVar;
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c == 0) {
            if (this.a) {
                this.b.at.setVisibility(8);
                this.b.au.setVisibility(8);
                return;
            } else {
                this.b.av.setVisibility(8);
                return;
            }
        }
        if (!this.a) {
            this.b.at.setVisibility(8);
            this.b.au.setVisibility(8);
        } else {
            this.b.aw.setVisibility(8);
        }
        this.b.aq.setEnabled(true);
        this.b.as.setEnabled(true);
        this.b.au.setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.c == 0) {
            if (this.a) {
                this.b.av.setVisibility(0);
                return;
            } else {
                this.b.at.setVisibility(0);
                this.b.au.setVisibility(0);
                return;
            }
        }
        if (this.a) {
            this.b.at.setVisibility(0);
            this.b.au.setVisibility(0);
        } else {
            this.b.aw.setVisibility(0);
        }
        this.b.aq.setEnabled(false);
        this.b.as.setEnabled(false);
        this.b.au.setEnabled(false);
    }
}
