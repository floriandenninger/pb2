package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ka {
    public final WeakReference a;

    public ka(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void c(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void d(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void e(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void f(kb kbVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (kbVar != null) {
                view.animate().setListener(new jy(kbVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void g(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    public final void h(nu nuVar) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(nuVar != null ? new jz(nuVar) : null);
        }
    }

    public final void i(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
    }

    public final void j(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void k(Runnable runnable) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
    }

    public final void l() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().withLayer();
        }
    }
}
