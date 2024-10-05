package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class in {
    public final im a;

    public in(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public final void a(MotionEvent motionEvent) {
        this.a.a.onTouchEvent(motionEvent);
    }

    public in(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new im(context, onGestureListener, handler);
    }
}
