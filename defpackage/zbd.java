package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbd {
    private final PointF a = new PointF();
    private final float b;
    private final View c;

    public zbd(View view) {
        this.b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        view.getClass();
        this.c = view;
    }

    public final void a(MotionEvent motionEvent) {
        ViewParent parent = this.c.getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.set(motionEvent.getX(), motionEvent.getY());
            parent.requestDisallowInterceptTouchEvent(true);
            return;
        }
        if (action != 2) {
            if (action == 3) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            } else {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
        }
        float abs = Math.abs(motionEvent.getX() - this.a.x);
        float abs2 = Math.abs(motionEvent.getY() - this.a.y);
        if (((float) Math.sqrt((abs * abs) + (abs2 * abs2))) >= this.b) {
            double atan2 = (float) Math.atan2(abs2, abs);
            Double.isNaN(atan2);
            if (((float) (atan2 * 57.29577951308232d)) < 40.0f) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            } else {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }
}
