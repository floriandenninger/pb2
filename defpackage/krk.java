package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class krk implements View.OnTouchListener {
    final /* synthetic */ krm a;

    public krk(krm krmVar) {
        this.a = krmVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.i = (int) motionEvent.getRawX();
        this.a.j = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }
}
