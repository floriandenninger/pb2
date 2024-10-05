package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kku implements View.OnTouchListener {
    final /* synthetic */ kkv a;

    public kku(kkv kkvVar) {
        this.a = kkvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.k.getClass();
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.k.e((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        view.performClick();
        return true;
    }
}
