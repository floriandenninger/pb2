package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akft implements Animation.AnimationListener {
    final /* synthetic */ MicrophoneView a;

    public akft(MicrophoneView microphoneView) {
        this.a = microphoneView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a.setAlpha(0.0f);
        this.a.g();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.a.setAlpha(1.0f);
    }
}
