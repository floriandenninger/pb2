package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.aii;
import defpackage.amkq;
import defpackage.amru;
import defpackage.hfq;
import defpackage.hgo;
import defpackage.hjh;
import defpackage.hjn;
import defpackage.hjo;
import defpackage.hjq;
import defpackage.hjx;
import defpackage.hrv;
import defpackage.jqr;
import defpackage.uzu;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextTrackView extends hjh {
    public hgo a;
    public hrv b;
    public hjx c;
    public final ImageView d;
    public final ImageView e;
    public final uzu f;
    public final int g;
    public boolean h;
    public jqr i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final TextView m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private HashMap r;
    private HashMap s;
    private float t;
    private float u;
    private int v;
    private hjq w;
    private float x;
    private float y;
    private long z;

    public TextTrackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.f = new uzu();
        this.z = TimeUnit.SECONDS.toMillis(15L);
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.text_color_white);
        this.p = color;
        this.q = resources.getColor(R.color.text_color_white_translucent_background);
        int color2 = resources.getColor(R.color.text_color_grey8);
        int color3 = resources.getColor(R.color.text_color_black);
        int color4 = resources.getColor(R.color.text_color_yellow);
        int color5 = resources.getColor(R.color.text_color_grey6);
        int color6 = resources.getColor(R.color.text_color_grey7);
        int color7 = resources.getColor(R.color.text_color_grey8);
        int color8 = resources.getColor(R.color.text_color_grey9);
        int color9 = resources.getColor(R.color.text_color_khaki);
        int color10 = resources.getColor(R.color.track_text_color_khaki);
        HashMap hashMap = new HashMap();
        this.r = hashMap;
        Integer valueOf = Integer.valueOf(color);
        Integer valueOf2 = Integer.valueOf(color3);
        hashMap.put(valueOf, valueOf2);
        this.r.put(Integer.valueOf(color4), valueOf2);
        this.r.put(Integer.valueOf(color5), valueOf2);
        this.r.put(Integer.valueOf(color6), valueOf2);
        this.r.put(Integer.valueOf(color7), valueOf2);
        HashMap hashMap2 = this.r;
        Integer valueOf3 = Integer.valueOf(color8);
        hashMap2.put(valueOf3, valueOf2);
        this.r.put(Integer.valueOf(color9), Integer.valueOf(color10));
        HashMap hashMap3 = new HashMap();
        this.s = hashMap3;
        Integer valueOf4 = Integer.valueOf(color);
        Integer valueOf5 = Integer.valueOf(color2);
        hashMap3.put(valueOf4, valueOf5);
        this.s.put(valueOf3, valueOf5);
        int intrinsicWidth = aii.a(context, R.drawable.ic_timeline_track_left_handle).getIntrinsicWidth();
        this.g = intrinsicWidth;
        this.n = intrinsicWidth / 2;
        this.o = resources.getDimensionPixelSize(R.dimen.trim_handle_touchable_width);
        TextView textView = new TextView(context);
        this.m = textView;
        addView(textView);
        ImageView n = n(context, R.drawable.ic_timeline_track_left_handle);
        this.d = n;
        ImageView n2 = n(context, R.drawable.ic_timeline_track_right_handle);
        this.e = n2;
        addView(n);
        addView(n2);
        textView.setImportantForAccessibility(2);
        n.setAccessibilityDelegate(new hjn(this, getContext()));
        n2.setAccessibilityDelegate(new hjo(this, getContext()));
    }

    private final float k() {
        return this.d.getX() + this.n;
    }

    private final float l() {
        return this.e.getX() + this.n;
    }

    private static float m(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(findPointerIndex);
    }

    private static ImageView n(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(aii.a(context, i));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final void o(ImageView imageView, RectF rectF) {
        float f = this.o / 2.0f;
        float x = imageView.getX() + this.n;
        float f2 = x - f;
        float f3 = x + f;
        float f4 = 0.0f;
        if (f2 < 0.0f) {
            f4 = -f2;
        } else if (f3 > getWidth()) {
            f4 = getWidth() - f3;
        }
        rectF.left = f2 + f4;
        rectF.top = imageView.getTop();
        rectF.right = f3 + f4;
        rectF.bottom = imageView.getBottom();
    }

    private final void p() {
        long f;
        amkq.N(this.h);
        q(false);
        this.b.q();
        jqr jqrVar = this.i;
        if (jqrVar != null) {
            jqrVar.a(acsb.c(116672)).f();
        }
        if (this.w == hjq.BEGIN) {
            f = f(k() - this.n);
        } else {
            f = f(l() - (this.n * 3));
        }
        r(f, this.w, false);
        this.w = null;
        this.m.setText(this.c.a);
    }

    private final void q(boolean z) {
        this.h = z;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final long j, hjq hjqVar, boolean z) {
        hjq hjqVar2 = hjq.BEGIN;
        int ordinal = hjqVar.ordinal();
        final int i = 1;
        if (ordinal == 0) {
            if (z) {
                this.a.h(j, new Runnable(this) { // from class: hjm
                    public final /* synthetic */ TextTrackView a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i != 0) {
                            TextTrackView textTrackView = this.a;
                            textTrackView.c.c(j);
                        } else {
                            TextTrackView textTrackView2 = this.a;
                            textTrackView2.c.b(j);
                        }
                    }
                });
                return;
            } else {
                this.c.c(j);
                this.a.g(j);
                return;
            }
        }
        if (ordinal != 1) {
            return;
        }
        if (z) {
            final int i2 = 0;
            this.a.h(j, new Runnable(this) { // from class: hjm
                public final /* synthetic */ TextTrackView a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 != 0) {
                        TextTrackView textTrackView = this.a;
                        textTrackView.c.c(j);
                    } else {
                        TextTrackView textTrackView2 = this.a;
                        textTrackView2.c.b(j);
                    }
                }
            });
        } else {
            this.c.b(j);
            this.a.g(j);
        }
    }

    private static final int s(int i) {
        return Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public final int c(long j) {
        return (int) ((((float) j) * this.u) / ((float) g()));
    }

    public final long f(float f) {
        return Math.min((f / this.u) * ((float) g()), g());
    }

    public final long g() {
        long b = this.a.b();
        if (b > 0) {
            this.z = b;
        }
        return this.z;
    }

    public final void h(float f) {
        int i = (int) f;
        this.d.setLeft(i);
        this.d.setRight(this.g + i);
        this.m.setLeft(i + this.n);
    }

    public final void i(float f) {
        int i = (int) f;
        this.e.setLeft(this.g + i);
        ImageView imageView = this.e;
        int i2 = this.g;
        imageView.setRight(i2 + i2 + i);
        this.m.setRight(i + this.g);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        hjq hjqVar = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.w = null;
            }
        } else if (motionEvent.getPointerCount() == 1) {
            int pointerId = motionEvent.getPointerId(0);
            this.v = pointerId;
            float m = m(motionEvent, pointerId);
            RectF rectF = new RectF();
            o(this.d, rectF);
            float f = rectF.left;
            float f2 = rectF.right;
            o(this.e, rectF);
            float f3 = rectF.left;
            float f4 = rectF.right;
            if (f2 > f3) {
                float f5 = (f2 - f3) / 2.0f;
                f -= f5;
                f2 -= f5;
                f3 += f5;
                f4 += f5;
            }
            if (m >= f && m <= f2) {
                hjqVar = hjq.BEGIN;
            } else if (m >= f3 && m <= f4) {
                hjqVar = hjq.END;
            }
            this.w = hjqVar;
        }
        return this.w != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.j.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int i6 = this.n;
        this.x = paddingLeft + i6;
        this.y = width - i6;
        hjx hjxVar = this.c;
        int paddingTop = getPaddingTop();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        hjxVar.e.left = paddingLeft;
        hjxVar.e.top = paddingTop;
        hjxVar.e.right = width;
        hjxVar.e.bottom = height - paddingBottom;
        float f = (this.y - this.x) - this.g;
        this.u = f;
        this.t = (f * 100.0f) / ((float) g());
        hjx hjxVar2 = this.c;
        Rect rect = hjxVar2.e;
        long j = hjxVar2.g;
        if (j == 0 || j > g()) {
            this.c.b(g());
        }
        this.l.left = c(this.c.f) + this.n;
        this.l.right = c(this.c.g) + (this.n * 3);
        int i7 = rect.top;
        int i8 = rect.bottom;
        int i9 = this.l.left;
        int i10 = this.n;
        int i11 = i9 - i10;
        this.d.layout(i11, i7, i10 + i10 + i11, i8);
        int i12 = this.l.right;
        int i13 = this.n;
        int i14 = i12 - i13;
        this.e.layout(i14, i7, i13 + i13 + i14, i8);
        this.m.setText(this.c.a);
        TextView textView = this.m;
        hjx hjxVar3 = this.c;
        int i15 = hjxVar3.b;
        int i16 = hjxVar3.c;
        if (s(i16) != this.q && i16 != 0) {
            i15 = i16;
        }
        int s = s(i15);
        HashMap hashMap = this.r;
        Integer valueOf = Integer.valueOf(s);
        if (hashMap.containsKey(valueOf)) {
            i5 = ((Integer) this.r.get(valueOf)).intValue();
        } else {
            i5 = this.p;
        }
        textView.setTextColor(i5);
        int i17 = this.p;
        if (i15 != i17) {
            i17 = s(i15);
        }
        HashMap hashMap2 = this.s;
        Integer valueOf2 = Integer.valueOf(i15);
        if (hashMap2.containsKey(valueOf2)) {
            i17 = ((Integer) this.s.get(valueOf2)).intValue();
        }
        textView.setBackgroundColor(i17);
        int height2 = getHeight();
        int paddingTop2 = getPaddingTop();
        int lineHeight = this.m.getLineHeight();
        this.m.setIncludeFontPadding(false);
        TextView textView2 = this.m;
        int i18 = this.n;
        int i19 = i18 + i18;
        textView2.setPadding(i19, ((height2 - (paddingTop2 + paddingTop2)) - lineHeight) / 2, i19, 0);
        this.m.setEllipsize(TextUtils.TruncateAt.END);
        this.m.setMaxLines(1);
        this.m.layout(this.l.left, i7, this.l.right, i8);
        this.d.setContentDescription(getResources().getString(R.string.accessibility_left_trim_handle, this.c.a));
        this.e.setContentDescription(getResources().getString(R.string.accessibility_right_trim_handle, this.c.a));
        getHitRect(this.k);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(amru.r(this.k));
            this.e.setSystemGestureExclusionRects(amru.r(this.k));
        }
        this.b.q();
        jqr jqrVar = this.i;
        if (jqrVar != null) {
            hfq a = jqrVar.a(acsb.c(116672));
            a.h(true);
            a.a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w == null) {
            return super.onTouchEvent(motionEvent);
        }
        float m = m(motionEvent, this.v);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.h) {
                    amkq.N(this.w != null);
                    float k = k();
                    float l = l();
                    hjq hjqVar = hjq.BEGIN;
                    int ordinal = this.w.ordinal();
                    if (ordinal == 0) {
                        k = Math.max(this.x, Math.min(m, (l - this.g) - this.t));
                        int i = (int) k;
                        this.m.setLeft(i);
                        this.j.left = i;
                        r(f(k - this.n), this.w, true);
                    } else if (ordinal == 1) {
                        l = Math.min(this.y, Math.max(m, this.g + k + this.t));
                        int i2 = (int) l;
                        this.m.setRight(i2);
                        this.j.right = i2;
                        r(f(l - (this.n * 3)), this.w, true);
                    }
                    int i3 = (int) k;
                    this.d.setLeft(i3 - this.n);
                    this.d.setRight(i3 + this.n);
                    int i4 = (int) l;
                    this.e.setLeft(i4 - this.n);
                    this.e.setRight(i4 + this.n);
                } else {
                    amkq.N(this.w != null);
                    amkq.N(!this.h);
                    this.a.e();
                    q(true);
                }
            } else if (actionMasked == 3 && this.h) {
                p();
            }
        } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.v) && this.h) {
            p();
        }
        return true;
    }
}
