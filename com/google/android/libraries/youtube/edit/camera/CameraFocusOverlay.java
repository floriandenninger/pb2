package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.wcy;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CameraFocusOverlay extends FrameLayout {
    ImageView a;
    ImageView b;

    public CameraFocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.camera_focus_overlay, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.camera_focus_animation_outer_circle);
        this.b = (ImageView) findViewById(R.id.camera_focus_animation_inner_circle);
    }

    public final void a(int i, int i2) {
        if (wcy.V(getResources())) {
            i = getWidth() - i;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.focus_inner_circle_anim);
        this.b.setAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.focus_outer_circle_anim);
        this.a.setAnimation(loadAnimation2);
        ImageView imageView = this.a;
        yny.z(imageView, yny.h(yny.r(i - (imageView.getWidth() / 2)), yny.v(i2 - (this.a.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
        ImageView imageView2 = this.b;
        yny.z(imageView2, yny.h(yny.r(i - (imageView2.getWidth() / 2)), yny.v(i2 - (this.b.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
        loadAnimation2.start();
        loadAnimation.start();
    }
}
