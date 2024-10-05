package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.android.youtube.R;
import defpackage.axpj;
import defpackage.axxp;
import defpackage.jw;
import defpackage.tgd;
import defpackage.vnv;
import defpackage.vnw;
import defpackage.voc;
import defpackage.vod;
import defpackage.voe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditablePhotoView extends voc {
    private final Matrix A;
    private final Matrix B;
    private boolean C;
    private final Path D;
    private final RectF E;
    private final float[] F;
    private int G;
    private int H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private int f170J;
    public Drawable a;
    public final Matrix b;
    public final Rect c;
    float d;
    GestureDetector e;
    public boolean f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public long l;
    public ValueAnimator m;
    public boolean n;
    public final RectF o;
    public final RectF p;
    public voe q;
    public tgd r;
    public ScaleGestureDetector s;
    ScaleGestureDetector.OnScaleGestureListener t;
    GestureDetector.SimpleOnGestureListener u;
    private Paint w;
    private Paint x;
    private int y;
    private final Matrix z;

    public EditablePhotoView(Context context) {
        super(context);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new vnv(this);
        this.u = new vnw(this);
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k() {
        float a;
        Context context = getContext();
        if (!this.v) {
            ((axpj) context).g().g(this);
        }
        Resources resources = context.getApplicationContext().getResources();
        this.y = resources.getColor(R.color.photo_picker_edit_background);
        Paint paint = new Paint();
        this.w = paint;
        paint.setAntiAlias(true);
        this.w.setColor(resources.getColor(R.color.photo_picker_edit_crop_dim));
        this.w.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setAntiAlias(true);
        this.x.setColor(resources.getColor(R.color.photo_picker_edit_crop_highlight));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_border_stroke_width));
        this.e = new GestureDetector(context, this.u, null, !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"));
        this.s = new ScaleGestureDetector(context, this.t);
        Resources resources2 = getResources();
        Object[] objArr = new Object[1];
        if (axxp.e()) {
            a = b();
        } else {
            a = a();
        }
        objArr[0] = Float.valueOf(a);
        setContentDescription(resources2.getString(R.string.op3_edit_photo_a11y_label, objArr));
    }

    private final void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, vod.a, 0, 0);
        try {
            this.G = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.H = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.I = obtainStyledAttributes.getDimensionPixelSize(4, 0) + obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f170J = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        this.b.postRotate(-this.q.a, this.c.centerX(), this.c.centerY());
        this.b.getValues(this.F);
        float f = this.F[0];
        this.b.postRotate(this.q.a, this.c.centerX(), this.c.centerY());
        return f;
    }

    public final float b() {
        if (this.i != 0.0f) {
            return a() / this.i;
        }
        return 1.0f;
    }

    public final void c() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.a = null;
        this.f = false;
    }

    public final void f(boolean z) {
        Drawable drawable = this.a;
        if (drawable == null || !this.C) {
            return;
        }
        this.a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        if (z || (this.i == 0.0f && this.a != null && this.C)) {
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            int i = this.c.right;
            int i2 = this.c.left;
            int i3 = this.c.bottom;
            int i4 = this.c.top;
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            this.o.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.d = f3;
            float f4 = i3 - i4;
            float f5 = i - i2;
            if (f3 > f4 / f5) {
                int i5 = (this.c.top + this.c.bottom) / 2;
                int round = Math.round(f5 * this.d) / 2;
                this.E.set(this.c.left, i5 - round, this.c.right, i5 + round);
            } else {
                int i6 = (this.c.right + this.c.left) / 2;
                int round2 = Math.round(f4 / this.d) / 2;
                this.E.set(i6 - round2, this.c.top, i6 + round2, this.c.bottom);
            }
            this.b.setRectToRect(this.o, this.E, Matrix.ScaleToFit.CENTER);
            this.b.getValues(this.F);
            float f6 = this.F[0];
            this.i = f6;
            this.j = f6 * ((float) axxp.a.get().a());
            this.z.set(this.b);
            this.z.invert(this.A);
            this.b.preConcat(this.q.b);
        }
    }

    public final void g() {
        this.B.setConcat(this.A, this.b);
        this.q.b = this.B;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.y);
        if (this.a == null) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
        this.p.set(this.a.getBounds());
        this.b.mapRect(this.p);
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.w);
        canvas.save();
        canvas.clipPath(this.D);
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(this.c, this.x);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.C = true;
        int width = getWidth();
        int height = getHeight();
        int i5 = (width - this.G) - this.H;
        int min = Math.min(i5, (height - this.I) - this.f170J);
        int i6 = (jw.e(this) == 0 ? this.G : this.H) + ((i5 - min) / 2);
        int i7 = this.I;
        this.c.set(i6, i7, i6 + min, min + i7);
        this.D.reset();
        this.D.addCircle(this.c.centerX(), this.c.centerY(), this.c.width() / 2.0f, Path.Direction.CCW);
        f(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r0 != 6) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.ScaleGestureDetector r0 = r6.s
            r1 = 1
            if (r0 == 0) goto L69
            android.view.GestureDetector r2 = r6.e
            if (r2 != 0) goto La
            goto L69
        La:
            boolean r2 = r6.f
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r0.onTouchEvent(r7)
            android.view.GestureDetector r0 = r6.e
            r0.onTouchEvent(r7)
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L63
            if (r0 == r1) goto L26
            r2 = 5
            if (r0 == r2) goto L63
            r2 = 6
            if (r0 == r2) goto L26
            goto L69
        L26:
            int r0 = r6.g
            int r2 = r7.getPointerCount()
            int r2 = r2 + (-1)
            int r0 = r0 - r2
            r6.g = r0
            int r0 = r7.getPointerCount()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L42
            long r4 = r7.getEventTime()
            r6.l = r4
            r6.h = r3
            goto L4c
        L42:
            int r7 = r7.getPointerCount()
            if (r7 != r1) goto L4c
            r4 = 0
            r6.l = r4
        L4c:
            boolean r7 = r6.n
            if (r7 == 0) goto L69
            tgd r7 = r6.r
            awns r0 = new awns
            r2 = 31
            r0.<init>(r2)
            tgc r0 = r0.f()
            r7.a(r0, r6)
            r6.n = r3
            goto L69
        L63:
            int r7 = r7.getPointerCount()
            r6.g = r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new vnv(this);
        this.u = new vnw(this);
        l(context, attributeSet);
        k();
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new vnv(this);
        this.u = new vnw(this);
        l(context, attributeSet);
        k();
    }
}
