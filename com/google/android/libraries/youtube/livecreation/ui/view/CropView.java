package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acfi;
import defpackage.amkq;
import defpackage.yny;
import defpackage.zga;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CropView extends FrameLayout {
    public Uri a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public int h;
    public Matrix i;
    public ImageView j;
    private int k;
    private int l;
    private int m;
    private CharSequence n;
    private Rect o;
    private View p;
    private View q;
    private View r;
    private Matrix s;
    private PointF t;
    private PointF u;
    private double v;
    private float[] w;
    private boolean x;
    private boolean y;
    private int z;

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.t = new PointF();
        this.u = new PointF();
        this.v = 1.0d;
        this.w = new float[9];
        boolean z = true;
        this.x = true;
        this.y = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.lc_view_crop, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acfi.b);
        try {
            this.b = obtainStyledAttributes.getInteger(7, 0);
            this.c = obtainStyledAttributes.getInteger(1, 0);
            this.d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.k = obtainStyledAttributes.getInteger(6, this.b);
            this.l = obtainStyledAttributes.getInteger(5, this.c);
            this.m = obtainStyledAttributes.getInteger(4, this.k);
            this.n = zhq.d(obtainStyledAttributes.getText(0));
            obtainStyledAttributes.recycle();
            int i2 = this.b;
            amkq.H(i2 > 0, "Width ratio must be positive. Was %s.", i2);
            int i3 = this.c;
            amkq.H(i3 > 0, "Height ratio must be positive. Was %s.", i3);
            int i4 = this.m;
            int i5 = this.k;
            amkq.K(i4 <= i5, "A double mask width ratio must be smaller or equal to a single mask width ratio. %s > %s", i4, i5);
            int i6 = this.d;
            if (i6 != 0 && (i = this.e) != 0 && (i6 * this.c) - (i * this.b) != 0) {
                z = false;
            }
            amkq.F(z, "Min width and height must match the given width and height ratio");
            this.i = new Matrix();
            this.s = new Matrix();
            this.z = 0;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static double b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return Math.sqrt((x * x) + (y * y));
    }

    private final Rect c() {
        this.i.getValues(this.w);
        int ceil = (int) Math.ceil(this.w[2]);
        int ceil2 = (int) Math.ceil(this.w[5]);
        float[] fArr = this.w;
        double floor = Math.floor((fArr[0] * this.g) + (fArr[3] * this.h));
        float[] fArr2 = this.w;
        Rect rect = new Rect(ceil, ceil2, ((int) floor) + ceil, ((int) Math.floor((fArr2[4] * this.h) + (fArr2[1] * this.g))) + ceil2);
        rect.sort();
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.view.CropView.d():void");
    }

    private static final void e(Matrix matrix, double d) {
        float f = (float) d;
        matrix.postScale(f, f);
    }

    public final Rect a() {
        Rect rect = new Rect(this.o);
        Rect c = c();
        rect.offset(-c.left, -c.top);
        double intValue = ((Integer) this.f.first).intValue();
        double width = c.width();
        Double.isNaN(intValue);
        Double.isNaN(width);
        double d = intValue / width;
        double d2 = rect.left;
        Double.isNaN(d2);
        int i = (int) (d2 * d);
        double d3 = rect.top;
        Double.isNaN(d3);
        int i2 = (int) (d3 * d);
        double width2 = rect.width();
        Double.isNaN(width2);
        int max = Math.max(1, (int) (width2 * d)) + i;
        double height = rect.height();
        Double.isNaN(height);
        rect.set(i, i2, max, Math.max(1, (int) (height * d)) + i2);
        return rect;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.j = (ImageView) findViewById(R.id.image);
        this.p = findViewById(R.id.crop_rectangle);
        this.q = findViewById(R.id.crop_left_mask);
        this.r = findViewById(R.id.crop_right_mask);
        CharSequence charSequence = this.n;
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        TextView textView = (TextView) findViewById(R.id.crop_info);
        textView.setVisibility(0);
        textView.setText(this.n);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Rect rect = new Rect(0, 0, View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        rect.sort();
        int dimension = (int) getResources().getDimension(R.dimen.lc_crop_rectangle_margin);
        int width = rect.width() - dimension;
        int height = rect.height() - dimension;
        if (width <= 0 || height <= 0) {
            zga.b("Crop rectangle width and height must be positive.");
        } else {
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = this.k;
            double d5 = this.l;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            if (d3 > d6) {
                Double.isNaN(d2);
                width = (int) (d2 * d6);
            } else if (d3 < d6) {
                Double.isNaN(d);
                height = (int) (d / d6);
            }
            yny.B(this.p, width, height);
            this.p.setVisibility(0);
            int i3 = this.m;
            if (i3 > 0.0f && this.k > i3) {
                int i4 = (width - ((i3 * height) / this.l)) / 2;
                yny.z(this.q, yny.x(i4), ViewGroup.LayoutParams.class);
                this.q.setVisibility(0);
                yny.z(this.r, yny.x(i4), ViewGroup.LayoutParams.class);
                this.r.setVisibility(0);
            }
            int i5 = this.b;
            int i6 = this.c;
            double d7 = i5;
            double d8 = i6;
            Double.isNaN(d7);
            Double.isNaN(d8);
            double d9 = d7 / d8;
            if (d9 > d6) {
                width = (i5 * height) / i6;
            } else if (d9 < d6) {
                height = (i6 * width) / i5;
            }
            int i7 = width / 2;
            int i8 = height / 2;
            this.o = new Rect(rect.centerX() - i7, rect.centerY() - i8, rect.centerX() + i7, rect.centerY() + i8);
            if (this.a != null) {
                d();
                this.j.setImageMatrix(this.i);
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r0 != 6) goto L37;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto Lb5
            r2 = 0
            if (r0 == r1) goto Lad
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r5 = 2
            if (r0 == r5) goto L49
            r6 = 5
            if (r0 == r6) goto L19
            r9 = 6
            if (r0 == r9) goto Lad
            goto Lcb
        L19:
            double r6 = b(r9)
            r8.v = r6
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lcb
            android.graphics.Matrix r0 = r8.s
            android.graphics.Matrix r3 = r8.i
            r0.set(r3)
            android.graphics.PointF r0 = r8.u
            float r3 = r9.getX(r2)
            float r4 = r9.getX(r1)
            float r3 = r3 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r9.getY(r2)
            float r9 = r9.getY(r1)
            float r2 = r2 + r9
            float r2 = r2 / r4
            r0.set(r3, r2)
            r8.z = r5
            goto Lcb
        L49:
            int r0 = r8.z
            if (r0 != r1) goto L6c
            android.graphics.Matrix r0 = r8.i
            android.graphics.Matrix r2 = r8.s
            r0.set(r2)
            android.graphics.Matrix r0 = r8.i
            float r2 = r9.getX()
            android.graphics.PointF r3 = r8.t
            float r3 = r3.x
            float r2 = r2 - r3
            float r9 = r9.getY()
            android.graphics.PointF r3 = r8.t
            float r3 = r3.y
            float r9 = r9 - r3
            r0.postTranslate(r2, r9)
            goto La9
        L6c:
            if (r0 != r5) goto La9
            double r5 = b(r9)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto La9
            double r2 = r8.v
            double r5 = r5 / r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 >= 0) goto L83
            boolean r9 = r8.x
            if (r9 != 0) goto L8b
        L83:
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 <= 0) goto La9
            boolean r9 = r8.y
            if (r9 == 0) goto La9
        L8b:
            android.graphics.Matrix r9 = r8.i
            android.graphics.Matrix r0 = r8.s
            r9.set(r0)
            float r9 = (float) r5
            android.graphics.Matrix r0 = r8.i
            android.graphics.PointF r4 = r8.u
            float r4 = r4.x
            android.graphics.PointF r7 = r8.u
            float r7 = r7.y
            r0.postScale(r9, r9, r4, r7)
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 >= 0) goto La7
            r8.y = r1
            goto La9
        La7:
            r8.x = r1
        La9:
            r8.d()
            goto Lcb
        Lad:
            r8.z = r2
            android.widget.ImageView r9 = r8.j
            r9.performClick()
            goto Lcb
        Lb5:
            android.graphics.Matrix r0 = r8.s
            android.graphics.Matrix r2 = r8.i
            r0.set(r2)
            android.graphics.PointF r0 = r8.t
            float r2 = r9.getX()
            float r9 = r9.getY()
            r0.set(r2, r9)
            r8.z = r1
        Lcb:
            android.widget.ImageView r9 = r8.j
            android.graphics.Matrix r0 = r8.i
            r9.setImageMatrix(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.view.CropView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
