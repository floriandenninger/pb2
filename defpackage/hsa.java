package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hsa implements zdd {
    final /* synthetic */ hsb a;
    final /* synthetic */ wv b;

    public hsa(hsb hsbVar, wv wvVar) {
        this.a = hsbVar;
        this.b = wvVar;
    }

    @Override // defpackage.zdd
    public final void nG(MotionEvent motionEvent, boolean z) {
        ((hse) this.a.e.c()).a(this.b.a());
    }

    @Override // defpackage.zdd
    public final boolean nL(MotionEvent motionEvent, boolean z) {
        return true;
    }
}
