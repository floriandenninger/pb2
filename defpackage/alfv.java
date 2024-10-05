package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alfv implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public alfv(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        allg allgVar;
        akn aknVar = this.a.e;
        if (aknVar == null || !aknVar.n()) {
            if (!this.c || (allgVar = this.a.j) == null) {
                return;
            }
            allgVar.a(this.b);
            return;
        }
        jw.H(this.b, this);
    }
}
