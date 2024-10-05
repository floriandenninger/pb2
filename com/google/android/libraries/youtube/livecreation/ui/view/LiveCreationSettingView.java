package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acfi;
import defpackage.acjd;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveCreationSettingView extends LinearLayout implements View.OnClickListener {
    public acjd a;
    private final TextView b;
    private final ImageView c;
    private final ImageView d;
    private final CharSequence e;

    public LiveCreationSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.lc_setting_view, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, acfi.c, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            CharSequence text = obtainStyledAttributes.getText(2);
            this.e = text;
            CharSequence text2 = obtainStyledAttributes.getText(3);
            CharSequence text3 = obtainStyledAttributes.getText(0);
            obtainStyledAttributes.recycle();
            TextView textView = (TextView) findViewById(R.id.setting_text);
            this.b = textView;
            ImageView imageView = (ImageView) findViewById(R.id.set_setting_button);
            this.c = imageView;
            ImageView imageView2 = (ImageView) findViewById(R.id.clear_setting_button);
            this.d = imageView2;
            textView.setText(text);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setOnClickListener(this);
            imageView.setOnClickListener(this);
            imageView2.setOnClickListener(this);
            imageView.setContentDescription(text2);
            imageView2.setContentDescription(text3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(CharSequence charSequence) {
        boolean z = !TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (!z) {
            charSequence = this.e;
        }
        textView.setText(charSequence);
        whu.I(this.c, !z);
        whu.I(this.d, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.b || view == this.c) {
            acjd acjdVar = this.a;
            if (acjdVar != null) {
                acjdVar.a.c.b(R.id.game_title_search);
                return;
            }
            return;
        }
        if (view == this.d) {
            a(null);
            acjd acjdVar2 = this.a;
            if (acjdVar2 != null) {
                acjdVar2.a.at = null;
            }
        }
    }
}
