package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lff implements View.OnTouchListener {
    final /* synthetic */ awcx a;
    final /* synthetic */ ajok b;

    public lff(awcx awcxVar, ajok ajokVar) {
        this.a = awcxVar;
        this.b = ajokVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        awcx awcxVar = this.a;
        if ((awcxVar.b & 4) == 0) {
            return false;
        }
        this.b.a.I(3, new acqx(awcxVar.g.I()), null);
        return false;
    }
}
