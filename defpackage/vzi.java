package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.video.trim.VideoTrimView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzi extends AnimatorListenerAdapter {
    final /* synthetic */ vye a;
    final /* synthetic */ VideoTrimView b;

    public vzi(VideoTrimView videoTrimView, vye vyeVar) {
        this.b = videoTrimView;
        this.a = vyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.i(this.a);
    }
}
