package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class nsp extends lo {
    protected final Context a;
    protected boolean b;
    protected RecyclerView c;
    protected FrameLayout d;
    protected FrameLayout e;
    protected TextView f;
    protected Animation g;
    protected Animation h;
    protected boolean i;
    protected final acra k;
    protected boolean m;
    private int n;
    protected ammv j = amlr.a;
    protected ammv l = amlr.a;

    public nsp(Context context, acra acraVar) {
        this.a = context;
        this.k = acraVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b = true;
        } else if (i == 0) {
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.e = frameLayout;
        this.c = recyclerView;
    }

    protected abstract void k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(int i) {
        this.n = i;
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(boolean z) {
        FrameLayout frameLayout;
        this.m = z;
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.setVisibility(true != z ? 8 : 0);
        if (z) {
            if (this.d.getParent() == null && (frameLayout = this.e) != null) {
                frameLayout.addView(this.d);
            }
            if (this.l.h()) {
                this.k.u((acsa) this.l.c(), null);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.e;
        if (frameLayout3 != null) {
            frameLayout3.removeView(this.d);
            if (this.l.h()) {
                this.k.q((acsa) this.l.c(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(String str) {
        k();
        if (this.h == null) {
            this.h = AnimationUtils.loadAnimation(this.a, R.anim.new_comments_fade_in);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.a, R.anim.new_comments_fade_out);
            this.g = loadAnimation;
            loadAnimation.setAnimationListener(new nso(this));
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText((CharSequence) this.j.e(str));
        }
        m(true);
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        Animation animation = this.g;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.h;
        if (animation2 != null) {
            animation2.cancel();
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.startAnimation(this.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        if (this.i) {
            return;
        }
        this.i = true;
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.aD(this);
        }
    }

    public void p() {
        if (this.i) {
            this.i = false;
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.aF(this);
            }
            m(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        yny.z(frameLayout, yny.k(this.n), ViewGroup.MarginLayoutParams.class);
    }
}
