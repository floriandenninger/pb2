package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aih;
import defpackage.avjw;
import defpackage.xkp;
import defpackage.xkr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SkipAdButton extends FrameLayout {
    private static final SparseArray o = new SparseArray();
    private static final float[] p = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public xkr a;
    public xkp b;
    public CharSequence c;
    public CharSequence d;
    public ImageView e;
    public TextView f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ColorDrawable k;
    public avjw l;
    public int m;
    public int n;
    private LinearLayout q;
    private final Paint r;
    private final Paint s;
    private boolean t;

    public SkipAdButton(Context context) {
        super(context);
        this.r = new Paint();
        this.s = new Paint();
        d(context);
    }

    public static void a(Drawable drawable, float f) {
        if (f == 0.0f) {
            drawable.setColorFilter(null);
            return;
        }
        int round = Math.round(f * 20.0f);
        ColorFilter colorFilter = (ColorFilter) o.get(round);
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        float f2 = round / 20.0f;
        float[] fArr = (float[]) p.clone();
        for (int i = 0; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 < 0.0f) {
                fArr[i] = f3 * f2;
            }
        }
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(fArr);
        drawable.setColorFilter(colorMatrixColorFilter);
        o.put(round, colorMatrixColorFilter);
    }

    private final void d(Context context) {
        LayoutInflater.from(context).inflate(R.layout.skip_ad_button, (ViewGroup) this, true);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.ad_skip_ad_button_min_height));
        this.q = (LinearLayout) findViewById(R.id.skip_ad_button_container);
        this.e = (ImageView) findViewById(R.id.skip_ad_button_icon);
        this.i = aih.d(context, R.color.skip_ad_button_background_color);
        this.j = aih.d(context, R.color.skip_ad_button_inverted_background_color);
        this.r.setColor(this.i);
        this.r.setStyle(Paint.Style.FILL);
        this.s.setColor(aih.d(context, R.color.skip_ad_button_border_color));
        this.s.setStrokeWidth(getResources().getDimension(R.dimen.ad_skip_ad_button_border_width));
        this.s.setStyle(Paint.Style.STROKE);
        TextView textView = (TextView) findViewById(R.id.skip_ad_button_text);
        this.f = textView;
        this.c = textView.getText();
        this.g = this.f.getCurrentTextColor();
        this.h = aih.d(context, R.color.skip_ad_button_inverted_foreground_color);
        TextView textView2 = this.f;
        this.b = new xkp(textView2, this.c, this.g, textView2.getTextSize(), this.f.getBackground(), this.f.getAlpha());
        this.k = new ColorDrawable(this.i);
        LinearLayout linearLayout = this.q;
        this.a = new xkr(linearLayout, this.k, linearLayout.getAlpha());
        b(this.t);
        Resources resources = context.getResources();
        this.m = resources.getDimensionPixelSize(R.dimen.skip_button_default_bottom_margin);
        this.n = resources.getDimensionPixelSize(R.dimen.skip_button_cta_bottom_margin);
        this.d = resources.getText(R.string.skip_ads);
    }

    public final void b(boolean z) {
        this.t = z;
        this.b.c(aih.d(getContext(), true != z ? R.color.skip_ad_button_foreground_color : R.color.skip_ad_button_high_contrast_foreground_color));
    }

    public final boolean c() {
        return this.l != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        int width = this.q.getWidth();
        int height = this.q.getHeight();
        int top = this.q.getTop();
        int left = this.q.getLeft();
        float f = left;
        float f2 = top;
        float f3 = left + width;
        float f4 = top + height;
        canvas.drawRect(f, f2, f3, f4, this.r);
        if (!this.t) {
            canvas.drawLines(new float[]{f3, f2, f, f2, f, f2, f, f4, f, f4, f3, f4}, this.s);
        }
        super.dispatchDraw(canvas);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new Paint();
        this.s = new Paint();
        d(context);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new Paint();
        this.s = new Paint();
        d(context);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = new Paint();
        this.s = new Paint();
        d(context);
    }
}
