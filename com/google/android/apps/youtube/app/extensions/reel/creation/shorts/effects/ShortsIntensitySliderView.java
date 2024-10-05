package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import android.content.Context;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.research.xeno.effect.Control;
import defpackage.hla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsIntensitySliderView extends LinearLayout {
    public Control.FloatSetting a;
    public YouTubeTextView b;
    public AppCompatSeekBar c;

    public ShortsIntensitySliderView(Context context) {
        super(context);
        c(context);
    }

    public static float a(int i) {
        return i / 100.0f;
    }

    public static int b(float f) {
        return Math.round(f * 100.0f);
    }

    private final void c(Context context) {
        LayoutInflater.from(context).inflate(R.layout.shorts_intensity_slider_view_layout, (ViewGroup) this, true);
        this.b = (YouTubeTextView) findViewById(R.id.progress_label);
        this.c = (AppCompatSeekBar) findViewById(R.id.seek_bar);
        this.c.setOnSeekBarChangeListener(new hla(this, this.c.getPaddingLeft() + this.c.getPaddingRight(), (LinearLayout.LayoutParams) this.b.getLayoutParams()));
    }

    public ShortsIntensitySliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }
}
