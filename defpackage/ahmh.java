package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmh extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    public ahmd a;
    private View c;
    private final GestureDetector d;
    private final ScaleGestureDetector f;
    private boolean e = false;
    private boolean g = false;
    public boolean b = false;

    public ahmh(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f = new ScaleGestureDetector(context, this);
    }

    private static final void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        a(this.c, true);
        ahmd ahmdVar = this.a;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.c.getWidth();
        this.c.getHeight();
        ahfz ahfzVar = ((ahmg) ahmdVar).a.k;
        if (ahfzVar == null) {
            return false;
        }
        ahfzVar.b.g(x, y);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a(this.c, true);
        this.e = false;
        ahmd ahmdVar = this.a;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        ahfz ahfzVar = ((ahmg) ahmdVar).a.k;
        if (ahfzVar != null) {
            ahir ahirVar = ahfzVar.b;
            if (!ahirVar.c) {
                ahirVar.c();
            }
            float pow = (float) Math.pow(scaleFactor, 1.2000000476837158d);
            float f = ahirVar.f / pow;
            if (f <= 0.69816f) {
                ahirVar.f = pow * 0.69815f;
                f = 0.69815f;
            } else if (f >= 2.35617f) {
                ahirVar.f = pow * 2.35618f;
                f = 2.35618f;
            } else {
                float f2 = ahirVar.e;
                if ((f2 < 1.74533f && f >= 1.74533f) || (f2 > 1.74533f && f <= 1.74533f)) {
                    ahirVar.f(ahirVar.p);
                    ahirVar.b = true;
                }
            }
            ahirVar.e = f;
            ahirVar.r = ahirVar.r || (ahirVar.g < f && f < 2.1816635f) || (f > 0.8726665f && f < ahirVar.h);
            ahirVar.b = ahirVar.b && Math.abs(f + (-1.74533f)) < 0.2094395f;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.g = true;
        ahfz ahfzVar = ((ahmg) this.a).a.k;
        if (ahfzVar != null) {
            ahfzVar.b.c();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ahfz ahfzVar = ((ahmg) this.a).a.k;
        if (ahfzVar != null) {
            ahir ahirVar = ahfzVar.b;
            if (ahirVar.b && Math.abs(ahirVar.e - 1.74533f) < 0.2094395f) {
                ahirVar.e = 1.74533f;
            }
            float f = ahirVar.e;
            boolean z = true;
            if (f > 0.78541f && f < 2.26892f) {
                z = false;
            }
            ahirVar.j = z;
            ahirVar.o = ahirVar.a.a() + 100000008;
            ahirVar.c = false;
        }
        this.g = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ahmd ahmdVar = this.a;
        if (ahmdVar == null) {
            return false;
        }
        this.e = true;
        int x = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        ahfz ahfzVar = ((ahmg) ahmdVar).a.k;
        if (ahfzVar != null) {
            ahir ahirVar = ahfzVar.b;
            if (!ahirVar.k || Math.abs(ahirVar.l - x) > 100 || Math.abs(ahirVar.m - y) > 100) {
                ahirVar.g(x, y);
            }
            ahirVar.e(x, y, width, height);
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.c = view;
        boolean z = true;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.e) {
                this.e = false;
                ahmd ahmdVar = this.a;
                if (ahmdVar != null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    ahfz ahfzVar = ((ahmg) ahmdVar).a.k;
                    if (ahfzVar != null) {
                        ahir ahirVar = ahfzVar.b;
                        if (Math.abs(ahirVar.l - x) < 100 && Math.abs(ahirVar.m - y) < 100) {
                            ahirVar.e(x, y, width, height);
                        }
                        if (ahirVar.E > 0) {
                            float f = 0.0f;
                            if (!ahirVar.d || ahirVar.n >= 500) {
                                float f2 = 0.0f;
                                for (int i = 0; i < 5; i++) {
                                    f += ahirVar.C[i];
                                    f2 += ahirVar.D[i];
                                }
                                float f3 = ahirVar.E;
                                ahirVar.y = f / f3;
                                ahirVar.z = f2 / f3;
                            }
                        }
                        long a = ahirVar.a.a();
                        ahirVar.B = a;
                        ahirVar.A = a;
                        if (ahirVar.d) {
                            ahirVar.o = a;
                        }
                        ahirVar.k = false;
                        ahirVar.d = false;
                    }
                }
            } else {
                z = false;
            }
            a(this.c, false);
            return z;
        }
        if (this.b) {
            this.f.onTouchEvent(motionEvent);
        }
        if (!this.g) {
            this.d.onTouchEvent(motionEvent);
        }
        return this.g || this.e;
    }
}
