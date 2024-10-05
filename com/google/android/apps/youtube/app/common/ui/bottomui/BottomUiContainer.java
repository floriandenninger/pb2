package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.akbl;
import defpackage.akn;
import defpackage.ald;
import defpackage.alh;
import defpackage.ali;
import defpackage.gar;
import defpackage.gat;
import defpackage.gav;
import defpackage.gaw;
import defpackage.gay;
import defpackage.gaz;
import defpackage.gba;
import defpackage.gbb;
import defpackage.gbc;
import defpackage.gbd;
import defpackage.gbf;
import defpackage.gbg;
import defpackage.gbi;
import defpackage.gbj;
import defpackage.hiq;
import defpackage.omq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomUiContainer extends FrameLayout {
    public gbf a;
    public Snackbar b;
    public FrameLayout c;
    public Mealbar d;
    public View e;
    public View f;
    public Animator g;
    public akn h;
    public alh i;
    public int j;
    public boolean k;
    public int l;
    public final Object m;
    public gav n;
    private HatsContainer o;
    private Runnable p;
    private boolean q;
    private int r;
    private gat s;

    public BottomUiContainer(Context context) {
        super(context);
        this.j = 0;
        this.k = false;
        this.l = 0;
        this.m = new Object();
        t();
    }

    public static gav m(akbl akblVar, Object obj) {
        return new gav(akblVar, obj);
    }

    private static int q(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void r(Animator animator) {
        if (this.q) {
            animator.start();
        } else {
            animator.end();
        }
    }

    private final void s(Animator animator, final View view) {
        final int q = q(view.getLayoutParams());
        animator.addListener(new gbb(this, view, q));
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gaq
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomUiContainer bottomUiContainer = BottomUiContainer.this;
                    bottomUiContainer.j(bottomUiContainer.c(view, q));
                }
            });
        }
    }

    private final void t() {
        this.r = getVisibility();
        this.q = true;
    }

    public final float a(View view, int i) {
        return 1.0f - ((i - this.j) / view.getHeight());
    }

    public final int b(View view) {
        return c(view, q(view.getLayoutParams()));
    }

    public final int c(View view, int i) {
        int height = view.getHeight();
        float top = height - ((view.getTop() - this.j) + view.getTranslationY());
        return aii.c((int) (top + (i * aii.d(top / Math.min(height, 1)))), 0, height + i);
    }

    public final View d(int i) {
        return e(getContext(), i);
    }

    public final View e(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
    }

    public final alh f(final View view, float f) {
        alh alhVar = new alh(new hiq(null), (byte[]) null);
        ali aliVar = new ali(0.0f);
        aliVar.c();
        aliVar.e(1500.0f);
        alhVar.n = aliVar;
        alhVar.h(view.getTop());
        alhVar.g = f;
        final int i = 1;
        alhVar.g(new ald(this) { // from class: gas
            public final /* synthetic */ BottomUiContainer a;

            {
                this.a = this;
            }

            @Override // defpackage.ald
            public final void a(float f2) {
                if (i == 0) {
                    BottomUiContainer bottomUiContainer = this.a;
                    bottomUiContainer.j(bottomUiContainer.b(view));
                    return;
                }
                BottomUiContainer bottomUiContainer2 = this.a;
                View view2 = view;
                int i2 = (int) f2;
                jw.E(view2, i2 - view2.getTop());
                view2.setAlpha(bottomUiContainer2.a(view2, i2));
            }
        });
        final int i2 = 0;
        alhVar.g(new ald(this) { // from class: gas
            public final /* synthetic */ BottomUiContainer a;

            {
                this.a = this;
            }

            @Override // defpackage.ald
            public final void a(float f2) {
                if (i2 == 0) {
                    BottomUiContainer bottomUiContainer = this.a;
                    bottomUiContainer.j(bottomUiContainer.b(view));
                    return;
                }
                BottomUiContainer bottomUiContainer2 = this.a;
                View view2 = view;
                int i22 = (int) f2;
                jw.E(view2, i22 - view2.getTop());
                view2.setAlpha(bottomUiContainer2.a(view2, i22));
            }
        });
        return alhVar;
    }

    public final HatsContainer g() {
        if (this.o == null) {
            this.o = (HatsContainer) d(R.layout.hats_survey_container);
        }
        return this.o;
    }

    public final void h(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", view.getHeight(), 0.0f));
        ofPropertyValuesHolder.addListener(new gbc(view));
        s(ofPropertyValuesHolder, view);
        r(ofPropertyValuesHolder);
        gav gavVar = this.n;
        if (gavVar != null) {
            gavVar.b();
        }
    }

    public final void i(int i) {
        View view = this.e;
        if (view == null || view == this.f) {
            return;
        }
        if (i == 2) {
            synchronized (this.m) {
                if (this.l == 1) {
                    this.l = 2;
                    return;
                } else {
                    this.l = 0;
                    i = 2;
                }
            }
        }
        akn aknVar = this.h;
        if (aknVar != null) {
            aknVar.d();
        }
        gav gavVar = this.n;
        if (gavVar != null) {
            gavVar.a(i);
        }
        alh alhVar = this.i;
        if (alhVar != null) {
            alhVar.j();
        }
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
        View view2 = this.e;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f, view2.getHeight()));
        ofPropertyValuesHolder.addListener(new gbd(view2));
        s(ofPropertyValuesHolder, view2);
        this.g = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addListener(new gba(this));
        r(this.g);
    }

    public final void j(int i) {
        gbf gbfVar = this.a;
        if (gbfVar != null) {
            omq omqVar = (omq) gbfVar;
            omqVar.O.s(1, -i);
            omqVar.o.h(1, i);
        }
    }

    public final void k(float f) {
        View view = this.e;
        if (view == null || view == this.f) {
            return;
        }
        alh alhVar = this.i;
        if (alhVar != null) {
            alhVar.j();
        }
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
        alh f2 = f(this.e, f);
        f2.f(new gar(this, 1));
        this.i = f2;
        f2.i(this.j);
    }

    public final void l(boolean z) {
        this.q = z;
        setVisibility(this.r);
    }

    public final void n(View view, gav gavVar) {
        removeAllViews();
        this.e = view;
        this.n = gavVar;
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
            this.g = null;
        }
        alh alhVar = this.i;
        if (alhVar != null) {
            alhVar.j();
            this.i = null;
        }
        if (view != null) {
            addView(view);
            if (view.getLayoutDirection() != getLayoutDirection()) {
                view.setLayoutDirection(getLayoutDirection());
            }
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public final void o(gbi gbiVar, gbj gbjVar, gav gavVar) {
        i(4);
        Animator animator = this.g;
        if (animator == null) {
            p(gbiVar, gbjVar, gavVar);
        } else {
            animator.addListener(new gaw(this, gbiVar, gbjVar, gavVar));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = akn.c(this, 1.0f, new gbg(this));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.p == null) {
            this.p = new Runnable() { // from class: gau
                @Override // java.lang.Runnable
                public final void run() {
                    BottomUiContainer bottomUiContainer = BottomUiContainer.this;
                    View view = bottomUiContainer.e;
                    if (view == null) {
                        return;
                    }
                    bottomUiContainer.j(bottomUiContainer.b(view));
                }
            };
        }
        Handler handler = getHandler();
        if (handler == null) {
            return;
        }
        handler.post(this.p);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e != null ? this.h.k(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.e;
        if (view != null) {
            this.j = view.getTop();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h.f(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            return (action == 1 || action == 3) ? false : true;
        }
        View view = this.e;
        return view != null && this.h.i(view, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void p(gbi gbiVar, gbj gbjVar, gav gavVar) {
        if (this.s == null) {
            this.s = new gat(this);
        }
        View a = gbjVar.a(gbiVar, this.s);
        a.setClickable(true);
        a.setAccessibilityDelegate(new gay(this));
        n(a, gavVar);
        if (a.getHeight() == 0) {
            a.addOnLayoutChangeListener(new gaz(this));
            a.setVisibility(0);
        } else {
            h(a);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.r = i;
        if (true != this.q) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 0;
        this.k = false;
        this.l = 0;
        this.m = new Object();
        t();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 0;
        this.k = false;
        this.l = 0;
        this.m = new Object();
        t();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = 0;
        this.k = false;
        this.l = 0;
        this.m = new Object();
        t();
    }
}
