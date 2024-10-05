package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordButtonView extends FrameLayout {
    public ImageView a;
    public FrameLayout b;
    public ProgressBar c;
    private FrameLayout d;

    public RecordButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.reel_camera_circular_progress_record_button_view, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.reel_camera_record_button);
        this.d = (FrameLayout) findViewById(R.id.reel_camera_record_button_touch_area);
        this.c = (ProgressBar) findViewById(R.id.reel_camera_circle_time_limit_progress_bar);
        this.b = (FrameLayout) findViewById(R.id.reel_record_button_view_container);
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.d.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.d.setOnTouchListener(onTouchListener);
    }
}
