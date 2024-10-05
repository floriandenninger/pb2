package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmr implements azrw {
    final /* synthetic */ fmt a;
    private final /* synthetic */ int b;

    public fmr(fmt fmtVar, int i) {
        this.b = i;
        this.a = fmtVar;
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.b != 0 ? a() : a();
    }

    public final ValueAnimator a() {
        if (this.b == 0) {
            ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("timed_markers_width", Keyframe.ofInt(0.0f, this.a.c.h), Keyframe.ofInt(1.0f, this.a.c.i)), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", Keyframe.ofFloat(0.0f, this.a.c.p), Keyframe.ofFloat(1.0f, this.a.c.q)), PropertyValuesHolder.ofKeyframe("timed_markers_color", Keyframe.ofInt(0.0f, Color.red(this.a.c.n)), Keyframe.ofInt(1.0f, Color.red(this.a.c.m)))).setDuration(200L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fmq
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fmr.this.a.invalidate();
                }
            });
            return duration;
        }
        int red = Color.red(this.a.c.n);
        ValueAnimator duration2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("timed_markers_width", Keyframe.ofInt(0.0f, 0), Keyframe.ofInt(0.2f, 0), Keyframe.ofInt(0.35f, this.a.c.i), Keyframe.ofInt(1.0f, this.a.c.h)), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", Keyframe.ofFloat(0.0f, this.a.h), Keyframe.ofFloat(0.2f, this.a.h), Keyframe.ofFloat(0.35f, this.a.c.q), Keyframe.ofFloat(1.0f, this.a.c.p)), PropertyValuesHolder.ofKeyframe("timed_markers_color", Keyframe.ofInt(0.0f, red), Keyframe.ofInt(0.2f, red), Keyframe.ofInt(0.35f, Color.red(this.a.c.m)), Keyframe.ofInt(1.0f, red))).setDuration(1200L);
        final byte[] bArr = null;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(bArr) { // from class: fmp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fmr.this.a.invalidate();
            }
        });
        return duration2;
    }
}
