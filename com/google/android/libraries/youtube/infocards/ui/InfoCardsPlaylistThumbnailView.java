package com.google.android.libraries.youtube.infocards.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.ajct;
import defpackage.jw;
import defpackage.wbs;
import defpackage.zzx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InfoCardsPlaylistThumbnailView extends ViewGroup {
    public ImageView a;
    public YouTubeTextView b;
    private Rect c;
    private Rect d;
    private Paint e;
    private float f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private Drawable k;
    private Rect l;

    public InfoCardsPlaylistThumbnailView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new Rect();
        this.d = new Rect();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        this.b = youTubeTextView;
        youTubeTextView.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        this.b.setGravity(81);
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i = true;
        Resources resources = getResources();
        this.f = resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zzx.a, i, i2);
        this.j = obtainStyledAttributes.getBoolean(5, false);
        this.b.setTextSize(0, obtainStyledAttributes.getDimension(2, resources.getDimension(R.dimen.large_font_size)));
        this.b.setTextColor(obtainStyledAttributes.getColor(1, wbs.W(context, R.attr.ytTextPrimary).orElse(0)));
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.k = aii.a(context, resourceId);
        }
        this.g = resources.getColor(obtainStyledAttributes.getResourceId(3, R.color.info_card_thumbnail_overlay_background_solid));
        this.h = resources.getColor(obtainStyledAttributes.getResourceId(4, R.color.info_card_thumbnail_overlay_background_transparent));
        obtainStyledAttributes.recycle();
        this.l = new Rect();
        addView(this.a);
        addView(this.b);
    }

    private final boolean b() {
        return jw.e(this) == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.i && view == this.a) {
            this.e.setColor(this.j ? this.g : this.h);
            canvas.drawRect(this.d, this.e);
            Drawable drawable = this.k;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (b()) {
            i5 = i6 - i7;
            this.b.layout(0, 0, i5, i7 / 2);
        } else {
            this.b.layout(i7, 0, i6, i7 / 2);
            i5 = 0;
        }
        if (this.j) {
            this.a.layout(i5, 0, i7 + i5, i7);
        } else {
            this.a.layout(0, 0, i6, i7);
        }
        Drawable drawable = this.k;
        Rect rect = this.c;
        if (rect.width() != 0 && rect.height() != 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = rect.width();
            int height = rect.height();
            if (intrinsicWidth > width || intrinsicHeight > height) {
                float f = width;
                float f2 = intrinsicWidth / f;
                float f3 = height;
                float f4 = intrinsicHeight / f3;
                if (f2 > f4) {
                    height = (int) (f3 / f2);
                } else {
                    width = (int) (f / f4);
                }
            } else {
                width = intrinsicWidth;
                height = intrinsicHeight;
            }
            Gravity.apply(49, width, height, rect, this.l, jw.e(this));
            drawable.setBounds(this.l.left, this.l.top, this.l.right, this.l.bottom);
        }
        int childCount = getChildCount();
        if (childCount > 2) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt != this.a && childAt != this.b) {
                    childAt.layout(0, 0, i6, i7);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i);
            i5 = (int) (i4 / this.f);
            i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i5 = View.MeasureSpec.getSize(i2);
            int i6 = (int) (i5 * this.f);
            i4 = i6;
            i = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            i3 = i2;
        } else {
            i3 = i2;
            i4 = 0;
            i5 = 0;
        }
        if (i4 > 0 && i5 > 0) {
            if (this.j) {
                this.a.measure(i3, i3);
            } else {
                this.a.measure(i, i3);
            }
            if (b()) {
                this.d.set(0, 0, i4 - i5, i5);
            } else {
                this.d.set(i5, 0, i4, i5);
            }
            this.c.set(this.d.left, this.d.top + (this.d.height() / 2) + ((int) (i5 * 0.1f)), this.d.right, this.d.bottom);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.height() / 2, 1073741824));
            int childCount = getChildCount();
            if (childCount > 2) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != this.a && childAt != this.b) {
                        childAt.measure(i, i3);
                    }
                }
            }
        }
        setMeasuredDimension(i4, i5);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }
}
