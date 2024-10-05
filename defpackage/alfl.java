package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alfl implements Runnable {
    final /* synthetic */ alfm a;
    private final CoordinatorLayout b;
    private final View c;

    public alfl(alfm alfmVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = alfmVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.c) == null) {
            return;
        }
        if (overScroller.computeScrollOffset()) {
            alfm alfmVar = this.a;
            alfmVar.D(this.b, this.c, alfmVar.c.getCurrY());
            jw.H(this.c, this);
            return;
        }
        this.a.z(this.b, this.c);
    }
}
