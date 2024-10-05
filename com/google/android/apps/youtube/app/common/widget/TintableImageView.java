package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.wbs;
import defpackage.yjk;
import defpackage.zau;
import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TintableImageView extends ImageView {
    public static final ColorStateList a = new ColorStateList((int[][]) Array.newInstance((Class<?>) int.class, 0, 0), new int[0]);
    private zau b;
    private ColorStateList c;
    private boolean d;

    public TintableImageView(Context context) {
        super(yjk.p(context, null, R.style.Widget_YouTube_Control_Light));
        b();
    }

    private final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = a;
        c();
    }

    private final void c() {
        setImageDrawable(getDrawable());
    }

    public final void a(ColorStateList colorStateList) {
        if (this.c == colorStateList) {
            return;
        }
        this.c = colorStateList;
        c();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null || !this.d) {
            super.setImageDrawable(drawable);
            return;
        }
        if (this.b == null) {
            this.b = new zau(getContext());
        }
        zau zauVar = this.b;
        ColorStateList colorStateList = this.c;
        if (colorStateList != a) {
            super.setImageDrawable(zauVar.c(drawable, colorStateList));
            return;
        }
        if (zauVar.b == null) {
            int orElse = wbs.W(zauVar.a, R.attr.colorControlNormal).orElse(0);
            int orElse2 = wbs.W(zauVar.a, R.attr.colorControlActivated).orElse(0);
            zauVar.b = zauVar.a(orElse2, orElse2, orElse2, orElse2, wbs.W(zauVar.a, R.attr.colorControlSelected).orElse(orElse2), orElse);
        }
        super.setImageDrawable(zauVar.d(drawable, zauVar.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    public TintableImageView(Context context, AttributeSet attributeSet) {
        super(yjk.p(context, attributeSet, R.style.Widget_YouTube_Control_Light), attributeSet);
        b();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i) {
        super(yjk.p(context, attributeSet, R.style.Widget_YouTube_Control_Light), attributeSet, i);
        b();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(yjk.p(context, attributeSet, R.style.Widget_YouTube_Control_Light), attributeSet, i, i2);
        b();
    }
}
