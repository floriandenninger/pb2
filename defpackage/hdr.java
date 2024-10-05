package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hdr extends AnimatorListenerAdapter {
    final /* synthetic */ YouTubeTextView a;

    public hdr(YouTubeTextView youTubeTextView) {
        this.a = youTubeTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.animate().setStartDelay(1000L).alpha(0.0f).setDuration(67L).setListener(null);
    }
}
