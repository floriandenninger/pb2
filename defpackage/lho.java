package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lho {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public Runnable e;
    public Runnable f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    public AnimatorSet k;
    public ViewGroup l;
    public SlimStatusBar m;
    public LayoutTransition n;
    public int o;
    private Animator p;

    public lho(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.b = resources.getColor(R.color.slim_status_bar_inactive_background_color);
        this.c = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.d = resources.getInteger(android.R.integer.config_longAnimTime);
    }

    public static boolean g(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }

    private final void h() {
        this.l.removeCallbacks(this.e);
        this.l.removeCallbacks(this.f);
        this.l.removeCallbacks(this.h);
        this.l.removeCallbacks(this.g);
        this.l.removeCallbacks(this.i);
        this.l.removeCallbacks(this.j);
    }

    public final Runnable a(final boolean z, final boolean z2) {
        return new Runnable() { // from class: lhl
            @Override // java.lang.Runnable
            public final void run() {
                lho lhoVar = lho.this;
                boolean z3 = z;
                boolean z4 = z2;
                if (!lho.g(lhoVar.l, lhoVar.m)) {
                    if (lhoVar.m.getParent() != null) {
                        lhoVar.l.endViewTransition(lhoVar.m);
                    }
                    lhoVar.e();
                    lhoVar.l.addView(lhoVar.m);
                }
                if (!z3) {
                    lhoVar.o = 2;
                    SlimStatusBar slimStatusBar = lhoVar.m;
                    slimStatusBar.announceForAccessibility(slimStatusBar.getContext().getString(R.string.offline_bottom_status_bar_connection_lost));
                } else if (z4) {
                    lhoVar.o = 5;
                    SlimStatusBar slimStatusBar2 = lhoVar.m;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.bottom_status_bar_incognito_mode));
                } else {
                    lhoVar.o = 4;
                    SlimStatusBar slimStatusBar3 = lhoVar.m;
                    slimStatusBar3.announceForAccessibility(slimStatusBar3.getContext().getString(R.string.offline_bottom_status_bar_connection_regained));
                }
            }
        };
    }

    public final void b() {
        Animator animator = this.p;
        if (animator != null) {
            animator.cancel();
            this.p = null;
        }
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.k = null;
        }
    }

    public final void c() {
        h();
        b();
        this.m.a(R.string.offline_bottom_status_bar_connection_lost);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.f);
    }

    public final void d() {
        h();
        this.m.a(R.string.bottom_status_bar_incognito_mode);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.h);
    }

    public final void e() {
        LayoutTransition layoutTransition = this.n;
        SlimStatusBar slimStatusBar = this.m;
        layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, PropertyValuesHolder.ofInt("top", slimStatusBar.getTop(), slimStatusBar.getBottom())));
    }

    public final void f(boolean z, boolean z2) {
        this.l.setLayoutTransition(this.n);
        int i = this.o;
        if (i == 0) {
            h();
            if (!z) {
                this.o = 1;
                this.l.postDelayed(this.g, 3000L);
                return;
            } else {
                if (z2) {
                    d();
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (z) {
                h();
                this.o = 0;
                if (z2) {
                    d();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            h();
            if (z) {
                h();
                b();
                this.o = 3;
                this.m.a(R.string.offline_bottom_status_bar_connection_regained);
                Animator G = mcy.G(this.m, this.b, this.a, 250L);
                this.p = G;
                G.addListener(new lhm(this));
                this.p.start();
                this.l.post(this.e);
                if (z2) {
                    this.l.postDelayed(this.i, 2000L);
                    return;
                } else {
                    this.l.postDelayed(this.j, 2000L);
                    return;
                }
            }
            c();
            return;
        }
        if (i == 3 || i == 4) {
            if (!z) {
                h();
                c();
                return;
            } else {
                if (z2) {
                    d();
                    return;
                }
                return;
            }
        }
        if (!z) {
            h();
            c();
        } else if (!z2) {
            h();
            this.l.post(this.j);
        } else {
            d();
        }
    }
}
