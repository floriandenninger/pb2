package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jmk {
    private int A;
    private Animator B;
    private final rxm C;
    public final int a;
    public final int b;
    public final int c;
    public ViewGroup d;
    public ViewGroup e;
    public SlimStatusBar f;
    public SlimStatusBar g;
    public int h;
    public AnimatorSet i;
    public Runnable j;
    public Runnable k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public Runnable o;
    public Runnable p;
    public Runnable q;
    public Runnable r;
    public Runnable s;
    public Runnable t;
    public Runnable u;
    public LayoutTransition v;
    public LayoutTransition w;
    public final jmi x;
    private final acqz y;
    private final long z;

    public jmk(Context context, rxm rxmVar, acqz acqzVar, byte[] bArr) {
        this.C = rxmVar;
        this.y = acqzVar;
        Resources resources = context.getResources();
        this.a = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.b = resources.getColor(R.color.slim_status_bar_inactive_background_color);
        this.c = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.z = resources.getInteger(android.R.integer.config_longAnimTime);
        this.x = new jmi(this);
    }

    public static boolean r(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }

    private static Animator s(SlimStatusBar slimStatusBar) {
        return ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, PropertyValuesHolder.ofInt("top", slimStatusBar.getTop(), slimStatusBar.getBottom()));
    }

    private final void t(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if (z) {
            j();
        } else {
            i();
        }
        h();
        ViewGroup b = b(z);
        SlimStatusBar c = c(z);
        this.h = 3;
        c.a(R.string.offline_bottom_status_bar_connection_regained);
        if (!z) {
            Animator bR = evr.bR(c, this.b, this.a, 250L);
            this.B = bR;
            bR.addListener(new jmg(this, c));
            this.B.start();
        } else {
            c.setBackgroundColor(this.a);
        }
        if (z) {
            runnable = this.n;
            runnable.getClass();
        } else {
            runnable = this.j;
            runnable.getClass();
        }
        b.post(runnable);
        if (!z2 || z) {
            if (!z) {
                runnable2 = this.l;
                runnable2.getClass();
            } else {
                runnable2 = this.p;
                runnable2.getClass();
            }
            b.postDelayed(runnable2, 2000L);
        } else {
            Runnable runnable3 = this.t;
            runnable3.getClass();
            b.postDelayed(runnable3, 2000L);
        }
        this.C.c(false);
    }

    public final LayoutTransition a(boolean z) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(this.z);
        if (z) {
            layoutTransition.addTransitionListener(new lhn(1));
        }
        return layoutTransition;
    }

    public final ViewGroup b(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.e;
            viewGroup.getClass();
            return viewGroup;
        }
        ViewGroup viewGroup2 = this.d;
        viewGroup2.getClass();
        return viewGroup2;
    }

    public final SlimStatusBar c(boolean z) {
        if (z) {
            SlimStatusBar slimStatusBar = this.g;
            slimStatusBar.getClass();
            return slimStatusBar;
        }
        SlimStatusBar slimStatusBar2 = this.f;
        slimStatusBar2.getClass();
        return slimStatusBar2;
    }

    public final Runnable d(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar, final boolean z, final boolean z2) {
        return new Runnable() { // from class: jmd
            @Override // java.lang.Runnable
            public final void run() {
                jmk jmkVar = jmk.this;
                final ViewGroup viewGroup2 = viewGroup;
                final SlimStatusBar slimStatusBar2 = slimStatusBar;
                boolean z3 = z;
                boolean z4 = z2;
                if (!jmk.r(viewGroup2, slimStatusBar2)) {
                    if (slimStatusBar2.getParent() != null) {
                        viewGroup2.endViewTransition(slimStatusBar2);
                    }
                    jmkVar.p(viewGroup2, slimStatusBar2);
                    viewGroup2.addView(slimStatusBar2);
                    slimStatusBar2.post(new Runnable() { // from class: jmb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewGroup viewGroup3 = viewGroup2;
                            SlimStatusBar slimStatusBar3 = slimStatusBar2;
                            int indexOfChild = viewGroup3.indexOfChild(slimStatusBar3) - 1;
                            if (indexOfChild < 0) {
                                return;
                            }
                            View childAt = viewGroup3.getChildAt(indexOfChild);
                            Rect rect = new Rect();
                            childAt.getHitRect(rect);
                            rect.bottom += slimStatusBar3.getHeight();
                            viewGroup3.setTouchDelegate(new jmj(rect, childAt));
                        }
                    });
                }
                if (!z3) {
                    jmkVar.h = 2;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.offline_bottom_status_bar_connection_lost));
                    jmkVar.l(37929);
                } else if (z4) {
                    jmkVar.h = 5;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.bottom_status_bar_incognito_mode));
                } else {
                    jmkVar.h = 4;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.offline_bottom_status_bar_connection_regained));
                    jmkVar.l(37930);
                }
            }
        };
    }

    public final Runnable e(boolean z) {
        return new jmf(this, z, 1);
    }

    public final Runnable f(boolean z) {
        return new jmf(this, z, 0);
    }

    public final Runnable g(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        return new Runnable() { // from class: jmc
            @Override // java.lang.Runnable
            public final void run() {
                jmk jmkVar = jmk.this;
                ViewGroup viewGroup2 = viewGroup;
                SlimStatusBar slimStatusBar2 = slimStatusBar;
                jmkVar.p(viewGroup2, slimStatusBar2);
                viewGroup2.removeView(slimStatusBar2);
                viewGroup2.setTouchDelegate(null);
                jmkVar.h = 0;
            }
        };
    }

    public final void h() {
        Animator animator = this.B;
        if (animator != null) {
            animator.cancel();
            this.B = null;
        }
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.i = null;
        }
    }

    public final void i() {
        ViewGroup viewGroup = this.d;
        viewGroup.getClass();
        Runnable runnable = this.k;
        runnable.getClass();
        viewGroup.removeCallbacks(runnable);
        ViewGroup viewGroup2 = this.d;
        Runnable runnable2 = this.j;
        runnable2.getClass();
        viewGroup2.removeCallbacks(runnable2);
        ViewGroup viewGroup3 = this.d;
        Runnable runnable3 = this.l;
        runnable3.getClass();
        viewGroup3.removeCallbacks(runnable3);
        ViewGroup viewGroup4 = this.d;
        Runnable runnable4 = this.m;
        runnable4.getClass();
        viewGroup4.removeCallbacks(runnable4);
        ViewGroup viewGroup5 = this.d;
        Runnable runnable5 = this.r;
        runnable5.getClass();
        viewGroup5.removeCallbacks(runnable5);
        ViewGroup viewGroup6 = this.d;
        Runnable runnable6 = this.t;
        runnable6.getClass();
        viewGroup6.removeCallbacks(runnable6);
    }

    public final void j() {
        ViewGroup viewGroup = this.e;
        viewGroup.getClass();
        Runnable runnable = this.o;
        runnable.getClass();
        viewGroup.removeCallbacks(runnable);
        ViewGroup viewGroup2 = this.e;
        Runnable runnable2 = this.n;
        runnable2.getClass();
        viewGroup2.removeCallbacks(runnable2);
        ViewGroup viewGroup3 = this.e;
        Runnable runnable3 = this.p;
        runnable3.getClass();
        viewGroup3.removeCallbacks(runnable3);
        ViewGroup viewGroup4 = this.e;
        Runnable runnable4 = this.q;
        runnable4.getClass();
        viewGroup4.removeCallbacks(runnable4);
        ViewGroup viewGroup5 = this.e;
        Runnable runnable5 = this.u;
        runnable5.getClass();
        viewGroup5.removeCallbacks(runnable5);
    }

    public final void k(boolean z) {
        if (z) {
            j();
        } else {
            i();
        }
    }

    public final void l(int i) {
        this.A++;
        acra mM = this.y.mM();
        mM.n(adyu.ce(mM.j(Integer.valueOf(this.A), acsb.c(i), this.A)));
    }

    public final void m(boolean z, long j) {
        Runnable runnable;
        this.h = 1;
        ViewGroup b = b(z);
        if (z) {
            runnable = this.q;
            runnable.getClass();
        } else {
            runnable = this.m;
            runnable.getClass();
        }
        b.postDelayed(runnable, j);
    }

    public final void n(boolean z, boolean z2) {
        Runnable runnable;
        if (z2) {
            j();
        } else {
            i();
        }
        h();
        ViewGroup b = b(z2);
        SlimStatusBar c = c(z2);
        c.a(R.string.offline_bottom_status_bar_connection_lost);
        c.setBackgroundColor(this.b);
        if (z2) {
            runnable = this.o;
            runnable.getClass();
        } else {
            runnable = this.k;
            runnable.getClass();
        }
        b.post(runnable);
        if (z2) {
            this.h = 4;
            Runnable runnable2 = this.p;
            runnable2.getClass();
            b.postDelayed(runnable2, 5000L);
        }
        if (z) {
            this.C.c(true);
        }
    }

    public final void o(boolean z) {
        Runnable runnable;
        if (z) {
            j();
        } else {
            i();
        }
        ViewGroup b = b(z);
        SlimStatusBar c = c(z);
        c.a(R.string.bottom_status_bar_incognito_mode);
        c.setBackgroundColor(this.b);
        if (!z) {
            runnable = this.r;
            runnable.getClass();
        } else {
            runnable = this.s;
            runnable.getClass();
        }
        b.post(runnable);
        if (z) {
            this.h = 4;
            Runnable runnable2 = this.p;
            runnable2.getClass();
            b.postDelayed(runnable2, 5000L);
        }
    }

    public final void p(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        if (viewGroup == this.d) {
            LayoutTransition layoutTransition = this.v;
            layoutTransition.getClass();
            layoutTransition.setAnimator(3, s(slimStatusBar));
        } else {
            LayoutTransition layoutTransition2 = this.w;
            layoutTransition2.getClass();
            layoutTransition2.setAnimator(3, s(slimStatusBar));
        }
    }

    public final void q(boolean z, boolean z2, boolean z3) {
        ViewGroup viewGroup = this.d;
        viewGroup.getClass();
        LayoutTransition layoutTransition = this.v;
        layoutTransition.getClass();
        viewGroup.setLayoutTransition(layoutTransition);
        ViewGroup viewGroup2 = this.e;
        viewGroup2.getClass();
        LayoutTransition layoutTransition2 = this.w;
        layoutTransition2.getClass();
        viewGroup2.setLayoutTransition(layoutTransition2);
        int i = this.h;
        if (i == 0) {
            k(z);
            if (!z2) {
                if (z) {
                    n(true, true);
                    return;
                } else {
                    m(false, 3000L);
                    return;
                }
            }
            if (z3) {
                o(z);
            } else if (z) {
                t(true, false);
            }
            this.C.c(false);
            return;
        }
        if (i == 1) {
            if (z2) {
                k(z);
                this.h = 0;
                if (z3) {
                    o(z);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            k(z);
            if (z2) {
                t(z, z3);
                return;
            } else {
                n(true, z);
                return;
            }
        }
        if (i == 3) {
            if (!z2) {
                k(z);
                n(true, z);
                return;
            } else {
                if (z3) {
                    o(z);
                    return;
                }
                return;
            }
        }
        if (i == 4) {
            if (!z2) {
                k(z);
                n(true, z);
                return;
            } else {
                if (z3) {
                    o(z);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            k(z);
            n(true, z);
        } else {
            if (!z3) {
                i();
                ViewGroup b = b(false);
                Runnable runnable = this.l;
                runnable.getClass();
                b.post(runnable);
                return;
            }
            o(z);
        }
    }
}
