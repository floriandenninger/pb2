package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jxa extends FrameLayout {
    public ProgressBar e;
    public TintableImageView f;
    public ProgressBar g;
    public AnimationDrawable h;
    public LottieAnimationView i;
    public Drawable j;
    public int k;
    public int l;
    public int m;
    public int n;
    public ColorStateList o;

    public jxa(Context context) {
        super(context);
    }

    public abstract void i(int i);

    public final void j() {
        whu.I(this.i, false);
        whu.I(this.f, true);
    }

    public final void k() {
        whu.I(this.e, false);
        whu.I(this.g, false);
    }

    public final void l(float f) {
        i((int) (Math.min(f, 1.0f) * 100.0f));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public jxa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jxa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public jxa(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
