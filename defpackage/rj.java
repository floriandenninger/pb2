package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ rl a;

    public rj(rl rlVar) {
        this.a = rlVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.u()) {
            rl rlVar = this.a;
            if (rlVar.a.o) {
                return;
            }
            View view = rlVar.c;
            if (view == null || !view.isShown()) {
                this.a.k();
            } else {
                this.a.a.s();
            }
        }
    }
}
