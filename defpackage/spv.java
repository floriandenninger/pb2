package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class spv implements GestureDetector.OnGestureListener {
    private final spt a;

    public spv(spt sptVar) {
        this.a = sptVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        spt sptVar;
        List list;
        if (!this.a.b() || (list = (sptVar = this.a).g) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sxm) it.next()).a((View) sptVar.a.get(), new szk(motionEvent.getX(), motionEvent.getY()));
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
