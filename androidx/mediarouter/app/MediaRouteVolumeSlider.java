package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import defpackage.ji;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {
    public int a;
    public int b;
    private final float c;
    private boolean d;
    private Drawable e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        super.setThumb(z ? null : this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? PrivateKeyType.INVALID : (int) (this.c * 255.0f);
        this.e.setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        this.e.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.b, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.e = drawable;
        if (this.d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = ji.s(context);
    }
}
