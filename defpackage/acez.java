package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acez extends acfl {
    final /* synthetic */ LiveCreationActivity a;

    public acez(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // defpackage.acfl, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.I.setVisibility(8);
    }
}
