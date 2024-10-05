package com.google.android.libraries.youtube.edit.camera;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryCameraRecordButtonView extends FrameLayout {
    public final ImageView a;
    public final ImageView b;
    public final View c;
    public final float d;
    public final float e;
    public AnimatorSet f;

    public GalleryCameraRecordButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gallery_camera_record_button_view, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.gallery_camera_record_button_record_circle);
        ImageView imageView = (ImageView) findViewById(R.id.gallery_camera_record_button_stop_rectangle);
        this.b = imageView;
        this.c = findViewById(R.id.record_button_touch_area);
        Resources resources = getResources();
        this.d = resources.getDimension(R.dimen.gallery_camera_record_button_record_circle_max_size) / resources.getDimension(R.dimen.gallery_camera_record_button_record_circle_init_size);
        float dimension = resources.getDimension(R.dimen.gallery_camera_record_button_stop_rectangle_min_size) / resources.getDimension(R.dimen.gallery_camera_record_button_stop_rectangle_init_size);
        this.e = dimension;
        imageView.setScaleX(dimension);
        imageView.setScaleY(dimension);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
