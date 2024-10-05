package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.argf;
import defpackage.yny;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ImagePreviewSelectView extends FrameLayout {
    public ImageView a;
    public View b;
    public View c;
    public View d;
    public View e;
    public Drawable f;
    public argf g;
    public float h;
    public PointF i;
    public Matrix j;
    public Matrix k;
    public boolean l;
    public RectF m;
    public float n;
    public int o;
    public int p;
    private View q;

    public ImagePreviewSelectView(Context context) {
        super(context);
        d();
    }

    private final float a(MotionEvent motionEvent) {
        float y;
        float f;
        if (this.p == 2) {
            y = motionEvent.getX();
            f = this.i.x;
        } else {
            y = motionEvent.getY();
            f = this.i.y;
        }
        return y - f;
    }

    private final float b(float f) {
        float f2 = this.h;
        float f3 = -f2;
        return f < f3 ? f3 : f > f2 ? f2 : f;
    }

    private final int c(float f, float f2) {
        return (int) ((((f - f2) + (this.o / 2.0f)) * 100.0f) / (this.p == 2 ? this.m.width() : this.m.height()));
    }

    private final void d() {
        LayoutInflater.from(getContext()).inflate(R.layout.image_preview_select_view, this);
        this.i = new PointF();
        this.k = new Matrix();
        this.j = new Matrix();
        this.m = new RectF();
        this.h = 0.0f;
        this.n = 0.0f;
        this.a = (ImageView) findViewById(R.id.image);
        this.q = findViewById(R.id.select_square);
        this.b = findViewById(R.id.start_mark);
        this.c = findViewById(R.id.end_mark);
        this.d = findViewById(R.id.top_mark);
        this.e = findViewById(R.id.bottom_mark);
    }

    private final void e(float f) {
        this.k.reset();
        this.k.set(this.j);
        if (this.p == 2) {
            this.k.postTranslate(b(this.n + f), 0.0f);
        } else {
            this.k.postTranslate(0.0f, b(this.n + f));
        }
        this.a.setImageMatrix(this.k);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Pair pair;
        if (this.f != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            double d = size;
            Double.isNaN(d);
            int i3 = (int) (d * 0.8d);
            this.o = i3;
            yny.z(this.q, yny.y(i3, i3), ViewGroup.LayoutParams.class);
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            RectF rectF = new RectF();
            int i4 = this.p;
            if (i4 == 2) {
                float intrinsicWidth = (this.o * this.f.getIntrinsicWidth()) / this.f.getIntrinsicHeight();
                float f = this.o;
                float f2 = (intrinsicWidth - f) / 2.0f;
                this.h = f2;
                float f3 = (f2 * 4.0f) + f;
                float f4 = size;
                if (f3 > f4) {
                    float f5 = (intrinsicWidth - f4) / 2.0f;
                    rectF.set(f5, 0.0f, this.f.getIntrinsicWidth() - f5, this.f.getIntrinsicHeight());
                } else {
                    size = (int) f3;
                    rectF.set(0.0f, 0.0f, this.f.getIntrinsicWidth(), this.f.getIntrinsicHeight());
                }
                int i5 = this.o;
                this.m.set(0.0f, 0.0f, intrinsicWidth, i5);
                pair = new Pair(Integer.valueOf(size), Integer.valueOf(i5));
            } else if (i4 == 3) {
                int i6 = this.o;
                float intrinsicHeight = (i6 * this.f.getIntrinsicHeight()) / this.f.getIntrinsicWidth();
                float f6 = this.o;
                float f7 = (intrinsicHeight - f6) / 2.0f;
                this.h = f7;
                float f8 = (f7 * 4.0f) + f6;
                float f9 = size2;
                if (f8 > f9) {
                    float f10 = (intrinsicHeight - f9) / 2.0f;
                    rectF.set(0.0f, f10, this.f.getIntrinsicWidth(), this.f.getIntrinsicHeight() - f10);
                } else {
                    size2 = (int) f8;
                    rectF.set(0.0f, 0.0f, this.f.getIntrinsicWidth(), this.f.getIntrinsicHeight());
                }
                this.m.set(0.0f, 0.0f, this.o, intrinsicHeight);
                pair = new Pair(Integer.valueOf(i6), Integer.valueOf(size2));
            } else if (i4 != 4) {
                pair = null;
            } else {
                this.h = 0.0f;
                RectF rectF2 = this.m;
                float f11 = this.o;
                rectF2.set(0.0f, 0.0f, f11, f11);
                rectF.set(0.0f, 0.0f, this.f.getIntrinsicWidth(), this.f.getIntrinsicHeight());
                pair = new Pair(Integer.valueOf(this.o), Integer.valueOf(this.o));
            }
            if (pair != null) {
                yny.z(this.a, yny.y(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()), ViewGroup.LayoutParams.class);
            }
            this.j.setRectToRect(rectF, new RectF(0.0f, 0.0f, layoutParams.width, layoutParams.height), Matrix.ScaleToFit.CENTER);
            argf argfVar = this.g;
            if (argfVar != null) {
                int i7 = this.p;
                if (i7 == 2) {
                    double d2 = this.h;
                    double d3 = argfVar.c;
                    double width = this.m.width();
                    Double.isNaN(width);
                    Double.isNaN(d2);
                    this.n = b((float) (d2 - (d3 * width)));
                } else if (i7 != 3) {
                    this.n = 0.0f;
                } else {
                    double d4 = this.h;
                    double d5 = argfVar.d;
                    double height = this.m.height();
                    Double.isNaN(height);
                    Double.isNaN(d4);
                    this.n = b((float) (d4 - (d5 * height)));
                }
            }
            e(0.0f);
            int c = c(this.h, this.n);
            StringBuilder sb = new StringBuilder();
            int i8 = this.p;
            if (i8 == 2) {
                sb.append(getContext().getString(R.string.accessibility_preview_horizontal_select_result, Integer.valueOf(c), Integer.valueOf(100 - c)));
                sb.append(" ");
                sb.append(getContext().getString(R.string.accessibility_preview_available_horizontal_gesture));
            } else if (i8 == 3) {
                sb.append(getContext().getString(R.string.accessibility_preview_portrait_select_result, Integer.valueOf(c), Integer.valueOf(100 - c)));
                sb.append(" ");
                sb.append(getContext().getString(R.string.accessibility_preview_available_portrait_gesture));
            } else if (i8 == 4) {
                sb.append(getContext().getString(R.string.accessibility_preview_portrait_select_result, Integer.valueOf(c), Integer.valueOf(100 - c)));
            }
            this.q.setContentDescription(sb.toString());
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String string;
        int i = this.p;
        if (i != 2 && i != 3) {
            return false;
        }
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            Rect rect = new Rect();
            this.q.getHitRect(rect);
            this.l = false;
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.i.set(motionEvent.getX(), motionEvent.getY());
                this.l = true;
            }
        } else if (action != 1) {
            if (action != 2) {
                return false;
            }
            if (!this.l) {
                return true;
            }
            e(a(motionEvent));
        } else {
            if (!this.l) {
                return true;
            }
            e(a(motionEvent));
            this.l = false;
            float b = b(this.n + a(motionEvent));
            this.n = b;
            float f = this.h;
            int i2 = this.p;
            if (i2 != 2) {
                if (i2 != 3) {
                    string = "";
                } else if (Math.round(b) == Math.round(f)) {
                    string = getContext().getString(R.string.accessibility_preview_reach_top);
                } else if (Math.round(b) == Math.round(-f)) {
                    string = getContext().getString(R.string.accessibility_preview_reach_bottom);
                } else {
                    int c = c(f, b);
                    string = getContext().getString(R.string.accessibility_preview_portrait_select_result, Integer.valueOf(c), Integer.valueOf(100 - c));
                }
            } else if (Math.round(b) == Math.round(f)) {
                string = getContext().getString(R.string.accessibility_preview_reach_left);
            } else if (Math.round(b) == Math.round(-f)) {
                string = getContext().getString(R.string.accessibility_preview_reach_right);
            } else {
                int c2 = c(f, b);
                string = getContext().getString(R.string.accessibility_preview_horizontal_select_result, Integer.valueOf(c2), Integer.valueOf(100 - c2));
            }
            this.q.setContentDescription(string);
            this.q.announceForAccessibility(string);
            performClick();
        }
        return true;
    }

    public ImagePreviewSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public ImagePreviewSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
