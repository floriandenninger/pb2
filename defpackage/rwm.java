package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rwm implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final ruv a;
    public final List b = rwh.x();
    private final List c = rwh.x();

    public rwm(ruv ruvVar) {
        this.a = ruvVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((rwj) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((rwj) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        for (rwh rwhVar : this.b) {
        }
        return !this.b.isEmpty();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (rwh rwhVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        for (rwh rwhVar : this.b) {
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        for (rwh rwhVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        for (rwh rwhVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        for (rwh rwhVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (rwh rwhVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        for (rwh rwhVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.c.isEmpty()) {
            return false;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((rwh) it.next()).a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        Iterator it = this.b.iterator();
        loop0: while (true) {
            z = false;
            while (!z && it.hasNext()) {
                rwh rwhVar = (rwh) it.next();
                boolean c = rwhVar.c();
                if (!this.c.isEmpty()) {
                    z = c;
                } else if (c || rwhVar.a(motionEvent)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
