package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kux extends zdb implements ScaleGestureDetector.OnScaleGestureListener {
    public final Context a;
    public ScaleGestureDetector b;
    public GestureDetector c;
    public boolean e;
    private final aeb g = new aeb();
    public boolean d = false;

    public kux(Context context) {
        this.a = context;
    }

    @Override // defpackage.zdg
    public final void c() {
        this.d = false;
    }

    @Override // defpackage.zdg
    public final boolean d(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.c;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        ScaleGestureDetector scaleGestureDetector = this.b;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.d && motionEvent.getPointerCount() == 1 && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            int i = 0;
            while (true) {
                aeb aebVar = this.g;
                if (i >= aebVar.b) {
                    break;
                }
                ((kuw) aebVar.b(i)).t(this.e);
                i++;
            }
            this.d = false;
            this.e = false;
        }
        return this.d;
    }

    public final void e(kuw kuwVar) {
        this.g.add(kuwVar);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        int i = 0;
        while (true) {
            aeb aebVar = this.g;
            if (i >= aebVar.b) {
                return true;
            }
            ((kuw) aebVar.b(i)).u(scaleFactor);
            i++;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.d = true;
        int i = 0;
        while (true) {
            aeb aebVar = this.g;
            if (i >= aebVar.b) {
                return true;
            }
            ((kuw) aebVar.b(i)).f();
            i++;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
