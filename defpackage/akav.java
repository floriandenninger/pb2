package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akav implements View.OnTouchListener {
    private final akau a = new akau((byte[]) null);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.a(akaw.b(view, 1.0f, akaw.a(view), 100));
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.a.b(akaw.b(view, akaw.a(view), 1.0f, 400));
        return false;
    }
}
