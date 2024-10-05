package com.google.android.libraries.youtube.player.features.overlay.timebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.ahap;
import defpackage.ahyf;
import defpackage.ahyg;
import defpackage.ahyi;
import defpackage.ahyk;
import defpackage.ahyl;
import defpackage.ahyn;
import defpackage.ahyo;
import defpackage.ajct;
import defpackage.amru;
import defpackage.yjk;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TimeBar extends ahyf {
    private boolean A;
    private int B;
    private String C;
    private final Rect D;
    private final Rect E;
    private int F;
    private int G;
    private int H;
    public final int a;
    protected final Rect b;
    protected final Paint c;
    public ahyn d;
    private int e;
    private final DisplayMetrics f;
    private final Rect g;
    private final Rect h;
    private final Rect i;
    private final Rect j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private final Paint o;
    private final Paint p;
    private final ahyi q;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private boolean z;

    public TimeBar(Context context, AttributeSet attributeSet) {
        super(new ahyg(), context, attributeSet);
        this.e = 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f = displayMetrics;
        ViewConfiguration.get(context);
        this.z = true;
        this.A = true;
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.b = new Rect();
        this.k = new Paint();
        this.l = new Paint();
        this.m = new Paint();
        this.n = new Paint();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(Color.parseColor("#B2FFFF00"));
        float K = yjk.K(displayMetrics, 12);
        Rect rect = new Rect();
        this.D = rect;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ahap.b, 0, 0);
        this.C = I(0L);
        this.F = PrivateKeyType.INVALID;
        int color = obtainStyledAttributes.hasValue(6) ? obtainStyledAttributes.getColor(6, -1) : -1;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        paint2.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        paint2.setShadowLayer(6.0f, 1.0f, 1.0f, Color.parseColor("#50000000"));
        paint2.setColor(color);
        paint2.setTextSize(K);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.getTextBounds("0:00:00", 0, 7, rect);
        Rect rect2 = new Rect();
        this.E = rect2;
        Paint paint3 = new Paint(1);
        this.p = paint3;
        paint3.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        paint3.setShadowLayer(6.0f, 1.0f, 1.0f, Color.parseColor("#50000000"));
        paint3.setColor(color);
        paint3.setTextSize(K);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.getTextBounds("-0:00:00", 0, 8, rect2);
        this.v = obtainStyledAttributes.getDimensionPixelOffset(3, yjk.K(displayMetrics, 13));
        this.w = obtainStyledAttributes.getDimensionPixelOffset(4, yjk.K(displayMetrics, 8));
        this.a = obtainStyledAttributes.getDimensionPixelOffset(5, yjk.K(displayMetrics, 42));
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(2, yjk.K(displayMetrics, 12));
        this.x = dimensionPixelOffset;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(1, yjk.K(displayMetrics, 20));
        this.y = dimensionPixelOffset2;
        obtainStyledAttributes.recycle();
        this.q = new ahyi(this, dimensionPixelOffset, dimensionPixelOffset2);
        this.d = new ahyn();
        l();
        kR(new ahyl() { // from class: ahyh
            @Override // defpackage.ahyl
            public final void h(int i, long j) {
            }
        });
    }

    private final float g() {
        ahyi ahyiVar = this.q;
        int i = ahyiVar.c;
        ahyiVar.a();
        int i2 = i / 2;
        return Math.max(this.h.left - i2, Math.min((this.h.right - i) + i2, this.G));
    }

    private final void h(int i, int i2) {
        int i3 = (int) (this.f.density * this.e);
        int paddingLeft = getPaddingLeft();
        if (!i()) {
            paddingLeft += this.B;
        }
        int i4 = (i2 / 2) - (i3 / 2);
        this.h.set(paddingLeft, i4, (i - getPaddingRight()) - this.B, i3 + i4);
    }

    private final boolean i() {
        return this.r.t() && kL() > 0;
    }

    private final boolean j() {
        return this.r.u() && kL() > 0;
    }

    private final boolean l() {
        int i;
        int i2 = this.B;
        if (i()) {
            i = this.E.width() + (this.q.c / 2);
            this.B = i;
        } else if (!j() || i()) {
            this.B = 0;
            i = 0;
        } else {
            int width = this.D.width();
            int i3 = this.w;
            i = width + i3 + i3 + (this.q.c / 2);
            this.B = i;
        }
        if (i != i2) {
            h(getMeasuredWidth(), getMeasuredHeight());
        }
        return this.B != i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void B() {
        if (kO() && !isEnabled()) {
            kP();
            kN();
            return;
        }
        ahyi ahyiVar = this.q;
        if (!ahyiVar.e.isEnabled()) {
            ahyiVar.a.cancel();
            return;
        }
        boolean z = !ahyiVar.e.kO();
        if (!ahyiVar.a.isRunning() && ahyiVar.a() == ahyiVar.d && !z) {
            ahyiVar.a.start();
            ahyiVar.b = false;
            return;
        }
        if (!ahyiVar.a.isRunning() && ahyiVar.a() == ahyiVar.c && z) {
            ahyiVar.a.reverse();
            ahyiVar.b = true;
        } else {
            if (!ahyiVar.a.isRunning() || z == ahyiVar.b) {
                return;
            }
            ahyiVar.a.reverse();
            ahyiVar.b = z;
        }
    }

    @Override // defpackage.ahyf
    protected final boolean C(float f, float f2) {
        int i = this.H + this.q.c;
        int i2 = this.h.left;
        int i3 = this.q.c;
        int i4 = this.h.right + this.q.c;
        if (i2 - i3 >= f || f >= i4) {
            return false;
        }
        int i5 = this.H;
        int i6 = this.v;
        return ((float) (i5 - i6)) < f2 && f2 < ((float) (i + i6));
    }

    @Override // defpackage.ahyf
    public final long c() {
        long j = ((ahyg) this.r).d;
        if (this.h.width() <= 0) {
            return j;
        }
        return ((((this.G + (this.q.c / 2)) - this.h.left) * kL()) / this.h.width()) + j;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        String f;
        TimelineMarker[] timelineMarkerArr;
        super.draw(canvas);
        ahyk ahykVar = this.r;
        if (kL() > 0) {
            canvas.drawRect(this.h, this.k);
            if (ahykVar.r()) {
                canvas.drawRect(this.i, this.l);
            }
            canvas.drawRect(this.j, this.m);
            if (this.z) {
                float a = this.q.a() / 2.0f;
                float f2 = this.q.c / 2;
                if (a > 0.0f) {
                    if (this.n.getColor() == 0) {
                        int alpha = this.m.getAlpha();
                        this.m.setAlpha(this.F);
                        canvas.drawCircle(g() + f2, this.H + f2, a, this.m);
                        this.m.setAlpha(alpha);
                    } else {
                        this.n.setAlpha(this.F);
                        canvas.drawCircle(g() + f2, this.H + f2, a, this.n);
                    }
                }
            }
        }
        if (i()) {
            if (!ahykVar.o()) {
                canvas.drawText(I(kQ()), getWidth() - ((this.B * 3) / 7), (getHeight() / 2) + (this.E.height() / 2), this.p);
            }
        } else if (j()) {
            float f3 = (this.B * 3) / 7;
            float height = (getHeight() / 2) + (this.D.height() / 2);
            if (!this.A || !kO()) {
                f = f();
            } else {
                f = I(c());
            }
            canvas.drawText(f, f3, height, this.o);
            canvas.drawText(this.C, getWidth() - f3, height, this.o);
        }
        Map k = ahykVar.k();
        long kL = kL();
        if (!ahykVar.q() || k == null || kL <= 0 || (timelineMarkerArr = (TimelineMarker[]) k.get(ahyo.AD_MARKER)) == null) {
            return;
        }
        for (TimelineMarker timelineMarker : timelineMarkerArr) {
            this.b.left = this.h.left + ((int) (((this.h.width() * Math.min(kL, Math.max(0L, timelineMarker.a))) / kL) - 2));
            Rect rect = this.b;
            rect.right = rect.left + 4;
            canvas.drawRect(this.b, this.c);
        }
    }

    public final String f() {
        return I(((ahyg) this.r).c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void kN() {
        if (l()) {
            requestLayout();
        }
        this.i.set(this.h);
        this.j.set(this.h);
        this.b.set(this.h);
        if (Build.VERSION.SDK_INT >= 29) {
            this.g.set(getLeft(), getTop(), getRight(), getBottom());
            setSystemGestureExclusionRects(amru.r(this.g));
        }
        ahyk ahykVar = this.r;
        long kL = kL();
        long E = E();
        long F = F();
        if (true != kO()) {
            F = E;
        }
        String I = I(((ahyg) this.r).a);
        this.C = I;
        this.o.getTextBounds(I, 0, I.length(), this.D);
        if (kL > 0) {
            this.i.right = this.h.left + ((int) ((this.h.width() * kK()) / kL));
            this.j.right = this.h.left + ((int) ((this.h.width() * E) / kL));
            this.G = (this.h.left - (this.q.c / 2)) + ((int) ((this.h.width() * F) / kL));
        } else {
            this.i.right = this.h.left;
            this.j.right = this.z ? this.h.left : this.h.right;
            this.G = this.h.left - (this.q.c / 2);
        }
        this.j.left = Math.min(this.h.right, Math.max(this.j.left, this.h.left));
        this.j.right = Math.max(this.h.left, Math.min(this.j.right, this.h.right));
        this.i.left = Math.min(this.h.right, Math.max(this.i.left, this.h.left));
        this.i.right = Math.max(this.h.left, Math.min(this.i.right, this.h.right));
        this.m.setColor(ahykVar.d());
        this.n.setColor(ahykVar.f());
        this.l.setColor(ahykVar.a());
        this.k.setColor(ahykVar.c());
        boolean p = ahykVar.p();
        if (this.z != p) {
            this.z = p;
            if (!p && kO()) {
                kP();
            }
            setFocusable(p);
            requestLayout();
        }
        setEnabled(ahykVar.p());
        invalidate();
    }

    @Override // defpackage.ahyf
    protected final void o(float f) {
        int i = this.q.c / 2;
        int i2 = this.h.right - i;
        int i3 = this.h.left - i;
        int i4 = ((int) f) - i;
        this.G = i4;
        int min = Math.min(i2, Math.max(i3, i4));
        this.G = min;
        if (min - i3 <= 0) {
            this.G = i3;
        } else if (i2 - min <= 0) {
            this.G = i2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(f());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float f = this.f.density;
        int i3 = (int) (f + f);
        if (j() || this.z) {
            i3 = this.a;
        }
        int defaultSize = getDefaultSize(0, i);
        int resolveSize = resolveSize(i3, i2);
        setMeasuredDimension(defaultSize, resolveSize);
        if (!j() && !this.z) {
            this.h.set(0, 0, defaultSize, resolveSize);
        } else {
            this.H = (resolveSize / 2) - (this.q.c / 2);
            h(defaultSize, resolveSize);
        }
        kN();
    }

    public TimeBar(Context context, ahyl ahylVar) {
        this(context, (AttributeSet) null);
        kR(ahylVar);
    }
}
