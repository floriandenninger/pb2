package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShortsCameraFeatureDescriptionView extends LinearLayout {
    public final TextView a;
    public AnimationSet b;

    public ShortsCameraFeatureDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.shorts_camera_feature_description_view, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.title);
    }
}
