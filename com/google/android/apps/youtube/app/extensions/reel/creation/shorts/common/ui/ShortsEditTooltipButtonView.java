package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.hab;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShortsEditTooltipButtonView extends LinearLayout {
    private TextView a;
    private ImageView b;

    public ShortsEditTooltipButtonView(Context context) {
        this(context, null);
    }

    public ShortsEditTooltipButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView;
        LayoutInflater.from(getContext()).inflate(R.layout.shorts_edit_tooltip_button, this);
        setVerticalGravity(16);
        setOrientation(0);
        this.b = (ImageView) findViewById(R.id.shorts_edit_tooltip_icon);
        this.a = (TextView) findViewById(R.id.shorts_edit_tooltip_text);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, hab.d, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(2, -1);
            if (resourceId != -1 && (imageView = this.b) != null) {
                imageView.setImageDrawable(getContext().getResources().getDrawable(resourceId));
            }
            String string = obtainStyledAttributes.getString(1);
            TextView textView = this.a;
            if (textView != null && string != null) {
                textView.setText(string);
            }
            setContentDescription(obtainStyledAttributes.getString(0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
