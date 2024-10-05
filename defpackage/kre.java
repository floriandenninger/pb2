package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class kre implements kqt, fqy {
    private final acra A;
    protected final ajjz a;
    protected final Context b;
    protected View c;
    protected View d;
    protected View e;
    protected ImageView f;
    protected View g;
    protected View h;
    protected aomf i;
    protected aomf j;
    protected AnimatorSet k;
    protected AnimatorSet l;
    protected AnimatorSet m;
    protected AnimatorSet n;
    protected AnimatorSet o;
    protected AnimatorSet p;
    protected AnimatorSet q;
    protected Object r;
    protected woq s;
    protected boolean t;
    protected boolean u = false;
    protected int v;
    protected int w;
    protected int x;
    protected int y;
    private final aaea z;

    public kre(Context context, ajjz ajjzVar, aaea aaeaVar, acra acraVar) {
        ajjzVar.getClass();
        this.a = ajjzVar;
        this.b = context;
        aaeaVar.getClass();
        this.z = aaeaVar;
        this.A = acraVar;
        d();
    }

    @Override // defpackage.fqy
    public final void a(Object obj, List list) {
        woq woqVar = this.s;
        if (woqVar != null) {
            woqVar.qx(obj, list);
        } else {
            k("Null listener when resolving clicks");
        }
    }

    @Override // defpackage.kqt
    public final void b(View view) {
        try {
            if (this.c != null) {
                return;
            }
            new zau(this.b);
            h(view);
            ArrayList arrayList = new ArrayList();
            this.k = new AnimatorSet();
            Animator clone = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_icon).clone();
            clone.setTarget(this.f);
            arrayList.add(clone);
            this.k.playTogether(arrayList);
            ArrayList arrayList2 = new ArrayList();
            this.l = new AnimatorSet();
            Animator clone2 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_icon).clone();
            clone2.setTarget(this.f);
            arrayList2.add(clone2);
            this.l.playTogether(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            this.m = new AnimatorSet();
            Animator clone3 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_expanded_background).clone();
            clone3.setTarget(this.d);
            arrayList3.add(clone3);
            Animator clone4 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_metadata).clone();
            clone4.setTarget(this.e);
            arrayList3.add(clone4);
            this.m.playTogether(arrayList3);
            this.n = new AnimatorSet();
            ArrayList arrayList4 = new ArrayList();
            Animator clone5 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_expanded_background).clone();
            clone5.setTarget(this.d);
            arrayList4.add(clone5);
            Animator clone6 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_metadata).clone();
            clone6.setTarget(this.e);
            arrayList4.add(clone6);
            this.n.playTogether(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            this.o = new AnimatorSet();
            Animator clone7 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_collapsed_button).clone();
            clone7.setTarget(this.h);
            arrayList5.add(clone7);
            this.o.playTogether(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            this.p = new AnimatorSet();
            Animator clone8 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_collapsed_button).clone();
            clone8.setTarget(this.h);
            arrayList6.add(clone8);
            this.p.playTogether(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            this.q = new AnimatorSet();
            arrayList7.add(this.l.clone());
            arrayList7.add(this.n.clone());
            arrayList7.add(this.p.clone());
            this.q.playTogether(arrayList7);
            this.q.setDuration(0L);
            l();
            m();
            i();
        } catch (Exception e) {
            afsi.c(1, 1, "Error inflating YouTubeBaseCollapsibleAdCtaInnerOverlay:", e);
        }
    }

    @Override // defpackage.kqt
    public void c() {
        View view = this.c;
        if (view != null) {
            yny.z(view, yny.k(true != this.u ? 0 : 30), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.kqt
    public void d() {
        this.v = 1;
        this.w = 1;
        this.x = 1;
        this.y = 1;
        if (this.c != null) {
            i();
            l();
            m();
        }
        this.s = null;
        this.t = false;
        this.r = null;
    }

    @Override // defpackage.kqt
    public final void e(boolean z) {
        this.u = z;
    }

    @Override // defpackage.kqt
    public final void f(woq woqVar) {
        this.s = woqVar;
    }

    @Override // defpackage.kqt
    public final void g(int i, boolean z) {
        if (this.f == null) {
            return;
        }
        int i2 = this.v;
        if (i2 == i && this.t == z) {
            return;
        }
        this.w = i2;
        this.v = i;
        this.t = z;
        l();
        m();
        int i3 = this.v;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            j(this.t);
            return;
        }
        if (i4 == 2) {
            i();
            return;
        }
        if (i4 == 3) {
            boolean z2 = this.t;
            j(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.m.clone());
            if (this.w == 5) {
                arrayList.add(this.p.clone());
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (!z2) {
                animatorSet.setDuration(0L);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            aomf aomfVar = this.i;
            if (aomfVar != null) {
                this.A.u(new acqx(aomfVar), null);
                return;
            }
            return;
        }
        if (i4 != 4) {
            return;
        }
        boolean z3 = this.t;
        j(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.o.clone());
        if (this.w == 4) {
            arrayList2.add(this.n.clone());
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (!z3) {
            animatorSet2.setDuration(0L);
        }
        animatorSet2.playTogether(arrayList2);
        animatorSet2.start();
        aomf aomfVar2 = this.j;
        if (aomfVar2 != null) {
            this.A.u(new acqx(aomfVar2), null);
        }
    }

    protected abstract void h(View view);

    protected final void i() {
        this.q.start();
    }

    protected final void j(boolean z) {
        AnimatorSet clone = this.k.clone();
        if (!z) {
            clone.setDuration(0L);
        }
        clone.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(String str) {
        if (wbs.v(this.z)) {
            String str2 = true != wbs.o(this.z) ? "PACF CTA Ctrl: " : "PACF CTA Exp: ";
            afsi.b(2, 1, str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }

    protected final void l() {
        this.h.setClickable(false);
        this.f.setClickable(false);
        boolean z = this.v == 5;
        if (this.y == 2) {
            this.h.setClickable(z);
            this.f.setClickable(false);
        }
        if (this.y == 3) {
            this.h.setClickable(z);
            this.f.setClickable(z);
        }
    }

    protected final void m() {
        this.g.setClickable(false);
        this.d.setClickable(false);
        boolean z = this.v == 4;
        if (this.x == 2) {
            this.g.setClickable(z);
            this.d.setClickable(false);
        }
        if (this.x == 3) {
            this.g.setClickable(z);
            this.d.setClickable(z);
        }
    }
}
