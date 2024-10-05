package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahti implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ HeatMarkerView a;

    public ahti(HeatMarkerView heatMarkerView) {
        this.a = heatMarkerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
