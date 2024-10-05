package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ac implements Animation.AnimationListener {
    final /* synthetic */ ak a;

    public ac(ak akVar) {
        this.a = akVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ak akVar = this.a;
        if (animation == akVar.A) {
            akVar.nf();
        } else if (animation == akVar.B) {
            akVar.t.setVisibility(4);
            this.a.f166J = true;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
