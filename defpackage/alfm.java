package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alfm extends alfp {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public alfm() {
        this.d = -1;
        this.f = -1;
    }

    public boolean A(View view) {
        throw null;
    }

    public final int C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return y(coordinatorLayout, view, x() - i, i2, i3);
    }

    public final void D(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
    }

    @Override // defpackage.ahe
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = A(view) && coordinatorLayout.m(view, x, y2);
            this.b = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    @Override // defpackage.ahe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alfm.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int v(View view) {
        throw null;
    }

    public int w(View view) {
        throw null;
    }

    public int x() {
        throw null;
    }

    public int y(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void z(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public alfm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
