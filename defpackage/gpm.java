package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpm implements View.OnTouchListener {
    private final /* synthetic */ int d;
    public static final /* synthetic */ gpm c = new gpm(5);
    public static final /* synthetic */ gpm b = new gpm(3);
    public static final /* synthetic */ gpm a = new gpm(2);

    public gpm(int i) {
        this.d = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.d;
        if (i == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            view.onTouchEvent(motionEvent);
            return true;
        }
        if (i == 2) {
            long j = hel.a;
            return true;
        }
        if (i == 3) {
            view.performClick();
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return true;
            }
            String str = uhf.ae;
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        view.onTouchEvent(motionEvent);
        return true;
    }
}
