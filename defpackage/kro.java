package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kro implements View.OnTouchListener {
    final /* synthetic */ krq a;

    public kro(krq krqVar) {
        this.a = krqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.o = (int) motionEvent.getRawX();
        this.a.p = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }
}
