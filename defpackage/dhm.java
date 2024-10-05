package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhm implements View.OnTouchListener {
    public diy a;
    public diy b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        diy diyVar = this.b;
        if (diyVar != null) {
            did.b(diyVar, view, motionEvent);
        }
        diy diyVar2 = this.a;
        if (diyVar2 == null) {
            return false;
        }
        if (did.d == null) {
            did.d = new dlw();
        }
        did.d.a = view;
        did.d.b = motionEvent;
        Object K = diyVar2.a.l().K(diyVar2, did.d);
        did.d.a = null;
        did.d.b = null;
        return K != null && ((Boolean) K).booleanValue();
    }
}
