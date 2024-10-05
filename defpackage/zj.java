package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zj extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ zn b;

    public zj(zn znVar) {
        this.b = znVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View h;
        wv k;
        if (!this.a || (h = this.b.h(motionEvent)) == null || (k = this.b.m.k(h)) == null) {
            return;
        }
        zn znVar = this.b;
        if (znVar.j.i(znVar.m, k)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = this.b.i;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                zn znVar2 = this.b;
                znVar2.c = x;
                znVar2.d = y;
                znVar2.f = 0.0f;
                znVar2.e = 0.0f;
                if (znVar2.j.j()) {
                    this.b.n(k, 2);
                }
            }
        }
    }
}
