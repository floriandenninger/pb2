package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znw extends AnimatorListenerAdapter {
    final /* synthetic */ GalleryCameraRecordButtonView a;

    public znw(GalleryCameraRecordButtonView galleryCameraRecordButtonView) {
        this.a = galleryCameraRecordButtonView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(0);
    }
}
