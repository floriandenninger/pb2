package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.viewpager.widget.ViewPager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxv extends wo implements ValueAnimator.AnimatorUpdateListener, lxx {
    private final ValueAnimator a;
    private final Set b;
    private final zay c;
    private final int d;
    private boolean e;

    public lxv(zay zayVar, int i) {
        this.c = zayVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = ofFloat;
        this.d = i;
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        g(1.0f);
        ofFloat.addUpdateListener(this);
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    private final void g(float f) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setCurrentFraction(f);
        } else {
            this.a.setCurrentPlayTime(f * 250.0f);
        }
    }

    @Override // defpackage.lxx
    public final float a() {
        return this.a.getAnimatedFraction();
    }

    @Override // defpackage.lxx
    public final void b(lxw lxwVar) {
        this.b.add(lxwVar);
    }

    @Override // defpackage.lxx
    public final void c() {
        if (this.a.isRunning()) {
            this.a.reverse();
        } else if (a() >= 0.5f) {
            e(true);
        } else {
            f(true);
        }
    }

    @Override // defpackage.lxx
    public final void d(lxw lxwVar) {
        this.b.remove(lxwVar);
    }

    public final void e(boolean z) {
        if (z) {
            this.a.reverse();
        } else {
            g(0.0f);
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.a.start();
        } else {
            g(1.0f);
        }
    }

    @Override // defpackage.wo, defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            this.c.e(motionEvent);
                        }
                    }
                } else {
                    if (this.e) {
                        return false;
                    }
                    this.c.d(motionEvent);
                    if (this.c.h(motionEvent, 2)) {
                        return true;
                    }
                    if (this.c.h(motionEvent, 1)) {
                        this.e = true;
                        return false;
                    }
                }
            }
            this.c.f();
        } else {
            this.c.g(motionEvent);
            this.e = false;
            Object parent = recyclerView.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                View view = (View) parent;
                if (!(view instanceof ViewPager)) {
                    parent = view.getParent();
                } else {
                    ((ViewPager) view).requestDisallowInterceptTouchEvent(true);
                    break;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wo, defpackage.wh
    public final void o(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int a = this.c.a(motionEvent);
                if (a == 0) {
                    return;
                }
                float a2 = a();
                float f = this.d;
                g(Math.max(Math.min(((a2 * f) - a) / f, 1.0f), 0.0f));
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        if (a() == 0.0f || a() == 1.0f) {
            return;
        }
        int i = this.c.i(motionEvent, 2);
        if (i == 1) {
            f(true);
            return;
        }
        if (i == 2) {
            e(true);
        } else if (a() > 0.5f) {
            f(true);
        } else {
            e(true);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = this.a.getAnimatedFraction();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((lxw) it.next()).f(animatedFraction);
        }
    }
}
