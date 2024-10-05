package com.google.android.apps.youtube.app.extensions.reel.watch.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPlayerProgressPresenter extends View {
    public volatile long a;
    public volatile long b;
    public long c;
    private int d;
    private int e;
    private int f;
    private volatile long g;
    private volatile float h;
    private volatile float i;
    private volatile boolean j;
    private int k;
    private float l;
    private long m;
    private final float[] n;
    private final float[] o;
    private final float[] p;
    private final float[] q;
    private final float[] r;
    private final float[] s;
    private boolean t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final RectF x;
    private final Runnable y;

    public ReelPlayerProgressPresenter(Context context) {
        super(context);
        this.g = 0L;
        this.j = true;
        this.m = -1L;
        this.n = new float[101];
        this.o = new float[101];
        this.p = new float[101];
        this.q = new float[101];
        this.r = new float[101];
        this.s = new float[101];
        this.t = true;
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.x = new RectF();
        this.y = new Runnable() { // from class: ilz
            @Override // java.lang.Runnable
            public final void run() {
                ReelPlayerProgressPresenter.this.c();
            }
        };
    }

    private static float e(DisplayMetrics displayMetrics, float f) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    private final void f(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.l;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
    }

    protected final void a() {
        if (this.m < 0) {
            try {
                this.m = Settings.System.getFloat(getContext().getContentResolver(), "animator_duration_scale") * 500.0f;
            } catch (Settings.SettingNotFoundException unused) {
                this.m = 500L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2 A[LOOP:0: B:26:0x00ed->B:28:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[EDGE_INSN: B:29:0x00fb->B:30:0x00fb BREAK  A[LOOP:0: B:26:0x00ed->B:28:0x00f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff A[LOOP:1: B:31:0x00fd->B:32:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112 A[LOOP:2: B:35:0x0110->B:36:0x0112, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.aukk r17, boolean r18, int r19, int r20, int r21, float r22) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.b(aukk, boolean, int, int, int, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            boolean r0 = r10.isAttachedToWindow()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = r10.a
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3f
            long r0 = r10.b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3f
            boolean r0 = r10.j
            if (r0 != 0) goto L3f
            long r0 = r10.b
            long r6 = android.os.SystemClock.elapsedRealtime()
            r10.b = r6
            long r6 = r10.b
            long r8 = r10.c
            long r6 = r6 - r0
            long r8 = r8 + r6
            r10.c = r8
            long r0 = r10.a
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 > 0) goto L3b
            long r0 = r10.c
            float r0 = (float) r0
            long r6 = r10.a
            float r1 = (float) r6
            float r0 = r0 / r1
            r10.i = r0
            goto L40
        L3b:
            r10.a = r4
            r10.j = r2
        L3f:
            r2 = 0
        L40:
            long r0 = r10.g
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L69
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.g
            long r0 = r0 - r6
            long r6 = r10.m
            r3 = 0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L57
            r10.h = r3
            goto L5f
        L57:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r0 = (float) r0
            float r1 = (float) r6
            float r0 = r0 / r1
            float r8 = r8 - r0
            r10.h = r8
        L5f:
            float r0 = r10.h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6b
            r10.h = r3
            r10.g = r4
        L69:
            if (r2 == 0) goto L79
        L6b:
            r10.postInvalidateOnAnimation()
            long r0 = r10.m
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L79
            java.lang.Runnable r0 = r10.y
            r10.postOnAnimation(r0)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.c():void");
    }

    public final void d(boolean z) {
        if (this.j && !z) {
            this.b = SystemClock.elapsedRealtime();
        }
        this.j = z;
        c();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        if (this.d <= 0) {
            return;
        }
        float f = this.x.top;
        float f2 = this.x.bottom;
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            int length = fArr.length;
            if (i >= 101) {
                return;
            }
            float f3 = fArr[i];
            float f4 = this.o[i];
            if (f4 > f3) {
                if (this.h > 0.0f) {
                    f3 -= this.h * this.r[i];
                    f4 -= this.h * this.s[i];
                }
                float f5 = f3;
                float f6 = f4;
                int i2 = this.f;
                if (i < i2) {
                    paint = this.w;
                } else {
                    paint = i == i2 ? this.v : this.u;
                }
                f(canvas, f5, f, f6, f2, paint);
                if (i == this.f && this.i > 0.0f) {
                    try {
                        canvas.save();
                        float f7 = f5 + (this.i * (f6 - f5));
                        canvas.clipRect(f5, f, f7, f2);
                        f(canvas, f5, f, f7, f2, this.w);
                    } finally {
                        canvas.restore();
                    }
                }
            }
            i++;
        }
    }

    public ReelPlayerProgressPresenter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0L;
        this.j = true;
        this.m = -1L;
        this.n = new float[101];
        this.o = new float[101];
        this.p = new float[101];
        this.q = new float[101];
        this.r = new float[101];
        this.s = new float[101];
        this.t = true;
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.x = new RectF();
        this.y = new Runnable() { // from class: ilz
            @Override // java.lang.Runnable
            public final void run() {
                ReelPlayerProgressPresenter.this.c();
            }
        };
    }
}
