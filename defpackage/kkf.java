package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkf extends zdb implements flt {
    public final ahmh a;

    public kkf(ahmh ahmhVar) {
        this.a = ahmhVar;
    }

    @Override // defpackage.zdg
    public final void c() {
    }

    @Override // defpackage.zdg
    public final boolean d(View view, MotionEvent motionEvent) {
        return this.a.onTouch(view, motionEvent);
    }
}
