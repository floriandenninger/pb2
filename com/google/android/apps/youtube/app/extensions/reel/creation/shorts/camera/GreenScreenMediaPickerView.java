package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GreenScreenMediaPickerView extends LinearLayout {
    public final HorizontalScrollView a;
    public final LinearLayout b;

    public GreenScreenMediaPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.choose_asset_view, (ViewGroup) this, true);
        this.a = (HorizontalScrollView) findViewById(R.id.asset_list_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.asset_list);
        this.b = linearLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.green_screen_media_list_vertical_margin);
        layoutParams.topMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize;
        linearLayout.setLayoutParams(layoutParams);
        setImportantForAccessibility(1);
    }
}
