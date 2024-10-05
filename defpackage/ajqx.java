package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqx implements View.OnTouchListener {
    final /* synthetic */ ajra a;

    public ajqx(ajra ajraVar) {
        this.a = ajraVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        whu.C(this.a.getCurrentFocus());
        return false;
    }
}
