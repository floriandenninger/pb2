package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class um implements Runnable {
    final /* synthetic */ un a;
    private final /* synthetic */ int b;

    public um(un unVar, int i) {
        this.b = i;
        this.a = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ViewParent parent = this.a.c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        un unVar = this.a;
        unVar.d();
        View view = unVar.c;
        if (view.isEnabled() && !view.isLongClickable() && unVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            unVar.d = true;
        }
    }
}
