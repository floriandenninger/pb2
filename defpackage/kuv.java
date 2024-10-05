package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kuv extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ kux a;

    public kuv(kux kuxVar) {
        this.a = kuxVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        kux kuxVar = this.a;
        double hypot = Math.hypot(f, f2);
        boolean z = false;
        if (kuxVar.d && hypot >= 1500.0d) {
            z = true;
        }
        kuxVar.e = z;
        return true;
    }
}
