package com.google.android.apps.youtube.app.playlist.ui;

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
import defpackage.kyk;
import defpackage.wbs;
import defpackage.whu;
import defpackage.zau;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistThumbnailView extends ViewGroup {
    public int a;
    public ImageView b;
    public YouTubeTextView c;
    protected zau d;
    private Rect e;
    private Rect f;
    private Paint g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Drawable s;
    private Rect t;
    private int u;

    public PlaylistThumbnailView(Context context) {
        super(context);
        g(context, null, 0, 0);
    }

    private final void g(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new Rect();
        this.f = new Rect();
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        this.c = youTubeTextView;
        youTubeTextView.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        this.c.setGravity(81);
        Paint paint = new Paint();
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.p = true;
        this.d = new zau(context);
        Resources resources = getResources();
        this.h = resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kyk.a, i, i2);
        this.q = obtainStyledAttributes.getBoolean(5, false);
        this.i = obtainStyledAttributes.getDimension(2, resources.getDimension(R.dimen.large_font_size));
        this.j = resources.getDimension(R.dimen.full_bleed_mixes_text_label_size);
        this.c.setTextSize(0, this.i);
        int Q = wbs.Q(context, R.attr.ytOverlayTextPrimary);
        this.o = Q;
        this.c.setTextColor(Q);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.k = resourceId;
        this.l = R.drawable.quantum_ic_youtube_mix_white_48;
        this.m = R.drawable.quantum_ic_youtube_mix_white_20;
        b(resourceId);
        this.n = resources.getColor(obtainStyledAttributes.getResourceId(3, R.color.thumbnail_overlay_background_solid));
        this.a = resources.getColor(obtainStyledAttributes.getResourceId(4, R.color.thumbnail_overlay_background_transparent));
        obtainStyledAttributes.recycle();
        this.u = 1;
        this.t = new Rect();
        addView(this.b);
        addView(this.c);
    }

    private final void h(Drawable drawable, Rect rect, int i) {
        int i2;
        int i3;
        if (rect.width() == 0 || rect.height() == 0) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = rect.width();
        int height = rect.height();
        int i4 = this.u;
        if (i4 == 4 || i4 == 6) {
            intrinsicWidth = (int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size);
            intrinsicHeight = (int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size);
        } else if (intrinsicWidth > width || intrinsicHeight > height) {
            float f = width;
            float f2 = intrinsicWidth / f;
            float f3 = height;
            float f4 = intrinsicHeight / f3;
            i3 = f2 > f4 ? (int) (f / f2) : (int) (f3 / f4);
            i2 = i3;
            Gravity.apply(i, i3, i2, rect, this.t, jw.e(this));
            drawable.setBounds(this.t.left, this.t.top, this.t.right, this.t.bottom);
        }
        i3 = intrinsicWidth;
        i2 = intrinsicHeight;
        Gravity.apply(i, i3, i2, rect, this.t, jw.e(this));
        drawable.setBounds(this.t.left, this.t.top, this.t.right, this.t.bottom);
    }

    private final boolean i() {
        return jw.e(this) == 1;
    }

    public final void a(boolean z) {
        int i;
        this.r = z;
        this.c.setTextSize(0, z ? this.j : this.i);
        if (this.u == 3) {
            b(this.m);
        } else {
            if (!z) {
                i = this.k;
            } else {
                i = this.l;
            }
            b(i);
        }
        requestLayout();
    }

    public final void b(int i) {
        if (i != 0) {
            Drawable a = aii.a(getContext(), i);
            this.s = a;
            h(a, this.e, 49);
            this.s = this.d.b(this.s, this.o);
        }
        invalidate();
    }

    public final void c(int i) {
        this.c.setTextSize(0, getResources().getDimension(i));
    }

    public final void d(boolean z) {
        if (this.q != z) {
            this.q = z;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.p && view == this.b) {
            this.g.setColor(this.q ? this.n : this.a);
            canvas.drawRect(this.f, this.g);
            Drawable drawable = this.s;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        return drawChild;
    }

    public final void e(boolean z) {
        if (this.p != z) {
            this.p = z;
            whu.I(this.c, z);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int i8 = this.r ? (i6 + i6) / 3 : i7;
        if (i()) {
            i5 = i6 - i8;
            this.c.layout(0, 0, i5, i7 / 2);
        } else {
            this.c.layout(i8, 0, i6, i7 / 2);
            i5 = 0;
        }
        if (this.q) {
            this.b.layout(i5, 0, i7 + i5, i7);
        } else {
            this.b.layout(0, 0, i6, i7);
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            if (this.u == 3) {
                h(drawable, this.e, 17);
            } else {
                h(drawable, this.e, 49);
            }
        }
        int childCount = getChildCount();
        if (childCount > 2) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != this.b && childAt != this.c) {
                    childAt.layout(0, 0, i6, i7);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010c A[ADDED_TO_REGION, LOOP:0: B:27:0x010c->B:34:0x011d, LOOP_START, PHI: r8
  0x010c: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:26:0x010a, B:34:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView.onMeasure(int, int):void");
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context, attributeSet, 0, 0);
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context, attributeSet, i, 0);
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g(context, attributeSet, i, i2);
    }

    public final void f(int i) {
        this.u = i;
        int i2 = i - 1;
        if (i2 == 1) {
            a(true);
            return;
        }
        if (i2 == 2) {
            removeView(this.c);
            a(true);
        } else if (i2 == 3) {
            this.a = getResources().getColor(R.color.yt_black_pure_opacity60);
            removeView(this.c);
            a(true);
        } else if (i2 != 5) {
            a(false);
        } else {
            removeView(this.c);
        }
    }
}
