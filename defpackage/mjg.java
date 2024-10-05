package defpackage;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjg implements GestureDetector.OnGestureListener {
    final /* synthetic */ PivotBar a;
    private boolean b = false;
    private View c = null;

    public mjg(PivotBar pivotBar) {
        this.a = pivotBar;
    }

    private final void a() {
        View view = this.c;
        if (view != null) {
            view.setPressed(false);
            this.c = null;
        }
    }

    private final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return Math.abs(motionEvent.getY() - motionEvent2.getY()) > ((float) this.a.d);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        a();
        this.b = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a();
        if (!b(motionEvent, motionEvent2) && !this.b) {
            return true;
        }
        if (!this.b) {
            this.a.f(motionEvent);
            this.b = true;
        }
        this.a.f(motionEvent2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("Long presses not supported");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a();
        if (!b(motionEvent, motionEvent2) && !this.b) {
            return true;
        }
        if (!this.b) {
            this.a.f(motionEvent);
            this.b = true;
        }
        this.a.f(motionEvent2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fav.r(point, this.a);
        View o = fav.o(this.a, point, juz.r);
        a();
        if (o != null) {
            o.setPressed(true);
            this.c = o;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.b) {
            this.a.f(motionEvent);
            return true;
        }
        a();
        PivotBar pivotBar = this.a;
        Point point = new Point();
        point.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fav.r(point, pivotBar);
        View o = fav.o(pivotBar, point, juz.q);
        if (o == null) {
            return true;
        }
        o.performClick();
        return true;
    }
}
