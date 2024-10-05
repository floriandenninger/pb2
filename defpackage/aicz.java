package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aicz extends FrameLayout implements aidc {
    private final acra a;
    public final Rect b;
    public final aidb c;
    public final axpg d;
    public final int e;
    public RecyclerView f;
    public byte[] g;
    public int h;
    public kgm i;
    private boolean j;
    private float k;
    private ObjectAnimator l;

    public aicz(Context context, acra acraVar, aidb aidbVar, axpg axpgVar, boolean z) {
        super(context);
        this.b = new Rect();
        acraVar.getClass();
        this.a = acraVar;
        aidbVar.getClass();
        this.c = aidbVar;
        this.d = axpgVar;
        this.e = z ? 0 : context.getResources().getDimensionPixelSize(R.dimen.related_end_screen_peek_margin);
    }

    private final int l(int i) {
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return b();
        }
        return 0;
    }

    private final void m(boolean z, float f) {
        if (!k() || this.c.e()) {
            this.j = false;
            return;
        }
        if (!this.j) {
            this.k = this.f.getTranslationY();
            this.j = true;
        }
        float min = Math.min(Math.max(this.k + f, l(2)), l(1));
        this.c.c(d(min), true);
        if (!z) {
            this.j = false;
            f(min);
            if (min > (l(1) + l(2)) / 2.0f) {
                j(1, true, 1);
                return;
            } else {
                j(2, true, 1);
                return;
            }
        }
        f(min);
    }

    @Override // defpackage.aidc
    public final void L(float f) {
        m(true, f);
    }

    @Override // defpackage.aidc
    public final void M(float f) {
        m(true, f);
    }

    @Override // defpackage.aidc
    public final void N(float f) {
        m(false, f);
    }

    protected abstract int a();

    protected abstract int b();

    protected void c(RecyclerView recyclerView) {
        throw null;
    }

    public final float d(float f) {
        int l = l(1);
        float l2 = l(2);
        return 1.0f - ((f - l2) / (l - l2));
    }

    public final void e(int i) {
        i(1, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(float f) {
        this.f.setTranslationY(f);
    }

    public final void g() {
        byte[] bArr;
        if (k()) {
            aicw aicwVar = (aicw) this.d.get();
            if (aicwVar.g != null) {
                if (aicwVar.e.e()) {
                    aicwVar.g.setContentDescription(null);
                }
                if (aicwVar.e.d()) {
                    aicwVar.g.setContentDescription(aicwVar.c.getResources().getString(R.string.accessibility_related_screen_swipe_down));
                } else if (aicwVar.e.f()) {
                    aicwVar.g.setContentDescription(aicwVar.c.getResources().getString(R.string.accessibility_related_screen_swipe_up));
                }
            }
        }
        if (this.c.e()) {
            this.f.setVisibility(8);
        }
        if (this.c.d() && (bArr = this.g) != null) {
            this.a.u(new acqx(bArr), null);
        }
        float l = l(this.c.a);
        f(l);
        this.c.c(d(l), false);
    }

    public final void h() {
        if (k() && (this.f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            yny.z(this.f, yny.k(this.h), ViewGroup.MarginLayoutParams.class);
            j(this.c.a, false, 0);
        }
    }

    public final void i(int i, int i2) {
        if (this.c.a != i) {
            j(i, true, i2);
        }
    }

    public final boolean k() {
        return this.f != null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i.d(this, motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i.d(this, motionEvent);
    }

    public final void j(int i, boolean z, int i2) {
        if (!k()) {
            if (i == 0) {
                return;
            }
            if (!k()) {
                aicw aicwVar = (aicw) this.d.get();
                RecyclerView recyclerView = aicwVar.g;
                if (recyclerView == null) {
                    aicwVar.g = (RecyclerView) LayoutInflater.from(aicwVar.c).inflate(R.layout.app_related_endscreen_results, (ViewGroup) this, false);
                    RecyclerView recyclerView2 = aicwVar.g;
                    recyclerView2.getClass();
                    recyclerView2.ae(null);
                    aicwVar.g.v(new aics(aicwVar));
                    aicwVar.h = aicwVar.g.getPaddingLeft();
                    aicwVar.i = aicwVar.g.getPaddingRight();
                    aicwVar.j = aicwVar.g.getPaddingBottom();
                    Context context = aicwVar.c;
                    aict aictVar = new aict(aicwVar);
                    aictVar.ab(0);
                    aicwVar.g.af(aictVar);
                    aicwVar.b.rU(new aicv(aicwVar));
                    aicwVar.b.h(aicwVar.a);
                    ((ajzt) aicwVar.f).a(aicwVar.g, aicwVar.b).a(aicwVar.g);
                    RecyclerView recyclerView3 = aicwVar.g;
                    recyclerView3.ab(new aicu(recyclerView3));
                    recyclerView = aicwVar.g;
                }
                this.f = recyclerView;
                if (recyclerView != null) {
                    ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f);
                    }
                    addView(this.f);
                    c(this.f);
                    ((aicw) this.d.get()).a(this.b);
                }
                if (this.h > 0) {
                    h();
                }
            }
        }
        aidb aidbVar = this.c;
        int i3 = aidbVar.a;
        aidbVar.a = i;
        Iterator it = aidbVar.c.iterator();
        while (it.hasNext()) {
            ((aida) it.next()).d(i3, i, i2);
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.l.removeAllListeners();
            this.l.cancel();
            this.l = null;
        }
        if (!z) {
            g();
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, l(i))).setDuration(300L);
        this.l = duration;
        duration.addListener(new aicy(this));
        this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aicx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aicz aiczVar = aicz.this;
                float translationY = aiczVar.f.getTranslationY();
                aiczVar.c.c(aiczVar.d(translationY), false);
                aiczVar.f(translationY);
            }
        });
        this.l.start();
    }
}
