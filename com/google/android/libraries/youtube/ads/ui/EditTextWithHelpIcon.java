package com.google.android.libraries.youtube.ads.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.ui.EditTextWithHelpIcon;
import com.google.android.youtube.R;
import defpackage.gl;
import defpackage.jw;
import defpackage.sp;
import defpackage.whu;
import defpackage.xmf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditTextWithHelpIcon extends sp {
    public xmf a;
    private Context b;
    private View c;
    private Drawable d;
    private ImageView e;

    public EditTextWithHelpIcon(Context context) {
        super(context);
        this.b = context;
    }

    private final void c() {
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        whu.I(imageView, this.d != null);
        this.e.setImageDrawable(this.d);
        if (this.a != null) {
            this.e.setOnClickListener(new View.OnClickListener() { // from class: xme
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditTextWithHelpIcon.this.a.a();
                }
            });
        }
    }

    public final void b(Drawable drawable, xmf xmfVar) {
        Drawable drawable2;
        if (drawable != null) {
            drawable.mutate();
            drawable2 = gl.c(drawable);
            drawable2.setTint(getCurrentHintTextColor());
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        } else {
            drawable2 = null;
        }
        this.d = drawable2;
        this.a = xmfVar;
        c();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.c == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof FrameLayout)) {
                Log.e("EditTextWithHelpIcon", "Can't init image view. Must be a direct child of FrameLayout.");
                super.onMeasure(i, i2);
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.text_input_images, viewGroup, false);
            this.c = inflate;
            this.e = (ImageView) inflate.findViewById(R.id.help_image);
            viewGroup.addView(this.c);
            c();
        }
        int measuredWidth = this.c.getMeasuredWidth();
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setBounds(0, 0, measuredWidth, 1);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable, compoundDrawablesRelative[3]);
        if (getMinimumHeight() <= 0) {
            setMinimumHeight(jw.f(this.e));
        }
        super.onMeasure(i, i2);
    }

    public EditTextWithHelpIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
    }

    public EditTextWithHelpIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = context;
    }
}
