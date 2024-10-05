package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vaf {
    public MotionEvent a;
    private final vap b;

    public vaf(vap vapVar) {
        this.b = vapVar;
    }

    private final void d(MotionEvent motionEvent, int i) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i);
        this.b.a(obtainNoHistory);
        obtainNoHistory.recycle();
    }

    public final void a() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.setAction(3);
            this.b.a(this.a);
            this.a.recycle();
            this.a = null;
        }
    }

    public final void b() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.a = null;
        }
    }

    public final void c(MotionEvent motionEvent) {
        int actionMasked;
        int pointerCount;
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 3) {
            int pointerCount2 = motionEvent.getPointerCount();
            if (actionMasked2 == 5 || actionMasked2 == 0) {
                pointerCount2--;
            }
            MotionEvent motionEvent2 = this.a;
            if (motionEvent2 == null || (actionMasked = motionEvent2.getActionMasked()) == 3) {
                pointerCount = 0;
            } else {
                pointerCount = this.a.getPointerCount();
                if (actionMasked == 6 || actionMasked == 1) {
                    pointerCount--;
                }
            }
            if (pointerCount < pointerCount2) {
                if (pointerCount == 0) {
                    d(motionEvent, 0);
                    pointerCount = 1;
                }
                while (pointerCount < pointerCount2) {
                    d(motionEvent, (pointerCount << 8) | 5);
                    pointerCount++;
                }
            } else if (pointerCount > pointerCount2) {
                MotionEvent motionEvent3 = this.a;
                int max = Math.max(pointerCount2, 1);
                while (pointerCount > max) {
                    pointerCount--;
                    d(motionEvent3, (pointerCount << 8) | 6);
                }
                if (pointerCount2 == 0) {
                    d(motionEvent3, 1);
                }
            }
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 3) {
            b();
        } else {
            this.a = MotionEvent.obtain(motionEvent);
        }
        this.b.a(motionEvent);
    }
}
