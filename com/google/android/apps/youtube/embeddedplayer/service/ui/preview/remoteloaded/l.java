package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class l implements Animation.AnimationListener {
    public final ImageView a;
    public final Animation b;
    public final float c;
    private final float d;

    public l(ImageView imageView, Animation animation) {
        this.a = imageView;
        this.b = animation;
        this.c = a(imageView.getResources(), R.dimen.preview_to_player_anim_start_alpha);
        this.d = a(imageView.getResources(), R.dimen.preview_to_player_anim_end_alpha);
    }

    static float a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.clearAnimation();
        this.a.setAlpha(this.d);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
