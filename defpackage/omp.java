package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class omp implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final WeakReference b;

    public omp(Activity activity, View view) {
        this.a = new WeakReference(activity);
        this.b = new WeakReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final View view = (View) this.b.get();
        if (view != null) {
            usw uswVar = usw.a;
            Activity activity = (Activity) this.a.get();
            if (uqq.n() && uswVar.k == 0) {
                uswVar.k = SystemClock.elapsedRealtime();
                usw.a("Primes-tti-end-and-length-ms", uswVar.k);
                uswVar.m.k = true;
                if (activity != null) {
                    try {
                        activity.reportFullyDrawn();
                    } catch (RuntimeException unused) {
                    }
                }
            }
            view.post(new Runnable() { // from class: omo
                @Override // java.lang.Runnable
                public final void run() {
                    view.getViewTreeObserver().removeOnPreDrawListener(omp.this);
                }
            });
        }
        return true;
    }
}
