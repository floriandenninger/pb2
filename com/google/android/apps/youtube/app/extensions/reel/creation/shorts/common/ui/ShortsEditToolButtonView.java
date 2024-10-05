package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.hab;
import defpackage.wcy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShortsEditToolButtonView extends FrameLayout {
    public final Context a;
    public TextView b;
    public ImageView c;

    public ShortsEditToolButtonView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.b;
        textView.getClass();
        textView.setEnabled(z);
        Context context = getContext();
        ImageView imageView = this.c;
        imageView.getClass();
        wcy.x(context, imageView, z);
    }

    public ShortsEditToolButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        LayoutInflater.from(context).inflate(R.layout.shorts_edit_tool_button, this);
        ImageView imageView = (ImageView) findViewById(R.id.shorts_edit_tool_icon);
        imageView.getClass();
        this.c = imageView;
        TextView textView = (TextView) findViewById(R.id.shorts_edit_tool_text);
        textView.getClass();
        this.b = textView;
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hab.b, 0, 0);
        if (obtainStyledAttributes.hasValue(4)) {
            ImageView imageView2 = this.c;
            imageView2.getClass();
            imageView2.setImageTintList(ColorStateList.valueOf(obtainStyledAttributes.getColor(4, -1)));
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId != -1) {
            ImageView imageView3 = this.c;
            imageView3.getClass();
            imageView3.setImageDrawable(context.getResources().getDrawable(resourceId));
        }
        String string = obtainStyledAttributes.getString(1);
        TextView textView2 = this.b;
        textView2.getClass();
        textView2.setText(string);
        setContentDescription(obtainStyledAttributes.getString(0));
    }
}
