package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gmu implements wh {
    final /* synthetic */ gna a;

    public gmu(gna gnaVar) {
        this.a = gnaVar;
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.m = motionEvent.getY();
        return false;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
    }
}
