package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kpn implements View.OnTouchListener {
    final /* synthetic */ kpr a;

    public kpn(kpr kprVar) {
        this.a = kprVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.h = (int) motionEvent.getRawX();
        this.a.i = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }
}
