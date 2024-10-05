package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zod extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    final /* synthetic */ zoe b;
    private final zob c;

    public zod(zoe zoeVar, zob zobVar) {
        this.b = zoeVar;
        this.c = zobVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.c.mi();
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) > Math.abs(y)) {
            if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                this.c.mj(3);
            } else {
                this.c.mj(1);
            }
        } else {
            if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
                return false;
            }
            if (y > 0.0f) {
                this.c.mj(4);
            } else {
                this.c.mj(2);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.c.c();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        if (this.b.a()) {
            this.c.e(motionEvent.getX(), motionEvent.getY());
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
