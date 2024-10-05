package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xbv implements View.OnTouchListener {
    final /* synthetic */ float a;
    final /* synthetic */ xbw b;

    public xbv(xbw xbwVar, float f) {
        this.b = xbwVar;
        this.a = f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.b.d((int) (motionEvent.getX() / this.a), (int) (motionEvent.getY() / this.a));
        return false;
    }
}
