package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdl implements View.OnTouchListener {
    final /* synthetic */ acdn a;

    public acdl(acdn acdnVar) {
        this.a = acdnVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.a.E || motionEvent.getAction() != 4 || motionEvent.getX() != 0.0f || motionEvent.getY() != 0.0f) {
            return false;
        }
        this.a.c();
        return false;
    }
}
