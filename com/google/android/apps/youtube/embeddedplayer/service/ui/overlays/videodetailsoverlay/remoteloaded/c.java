package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class c implements Animation.AnimationListener {
    final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        a aVar;
        d dVar = this.a;
        if (dVar.b == 2) {
            dVar.b();
            this.a.l();
            d dVar2 = this.a;
            if (dVar2.a != 3 || (aVar = dVar2.e) == null) {
                return;
            }
            aVar.K(dVar2.b);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
