package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jmj extends TouchDelegate {
    private final Rect a;
    private final View b;
    private final int c;

    public jmj(Rect rect, View view) {
        super(rect, view);
        this.a = new Rect(rect);
        this.b = view;
        this.c = ViewConfiguration.get(view.getContext()).getScaledEdgeSlop();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0 && action != 1 && action != 2) {
            return false;
        }
        return this.b.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), action, motionEvent.getX(), this.b.getHeight() - this.c, motionEvent.getMetaState()));
    }
}
