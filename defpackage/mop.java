package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mop implements View.OnTouchListener {
    final /* synthetic */ moq a;

    public mop(moq moqVar) {
        this.a = moqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.b.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
