package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ qk a;

    public qf(qk qkVar) {
        this.a = qkVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.u() || this.a.b.size() <= 0 || ((qj) this.a.b.get(0)).a.o) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.k();
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((qj) it.next()).a.s();
        }
    }
}
