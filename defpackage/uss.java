package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uss implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ usu a;
    private final AtomicReference b;

    public /* synthetic */ uss(usu usuVar, View view, usr usrVar) {
        this.a = usuVar;
        this.b = new AtomicReference(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(usu usuVar) {
        uqq.j();
        if (usuVar.b.g != 0) {
            return;
        }
        usuVar.b.g = SystemClock.elapsedRealtime();
        usuVar.b.m.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(usu usuVar) {
        uqq.j();
        if (usuVar.b.h != 0) {
            return;
        }
        usuVar.b.h = SystemClock.elapsedRealtime();
        usuVar.b.m.g = true;
        usw.a("Primes-ttfdd-end-and-length-ms", usuVar.b.h);
        usuVar.a.unregisterActivityLifecycleCallbacks(usuVar);
    }

    public /* synthetic */ void a(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: usp
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    uss.this.a(view);
                }
            });
            uqq.h().postAtFrontOfQueue(new usq(this.a, 1));
            uqq.l(new usq(this.a, 0));
        } catch (RuntimeException unused) {
        }
    }
}
