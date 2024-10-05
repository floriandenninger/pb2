package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ust implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ usu a;
    private final AtomicReference b;

    public ust(usu usuVar, View view) {
        this.a = usuVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            uqq.h().postAtFrontOfQueue(new usq(this.a, 2));
            uqq.l(new usq(this.a, 3));
        } catch (RuntimeException unused) {
        }
        return true;
    }
}
