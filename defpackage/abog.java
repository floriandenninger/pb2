package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abog implements abjp {
    private final View.OnLayoutChangeListener a;
    protected final Context b;
    protected final ajvb c;
    protected final ajoy d;
    protected final acra e;
    protected abjo f;
    protected ajng g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    private final abof l;
    private final abiy m;
    private ajng n;
    private abor o;
    private boolean p;
    private boolean q;
    private CharSequence s;
    private Runnable t;
    private ajwe u;
    private int r = 0;
    private final Runnable v = new Runnable() { // from class: abod
        @Override // java.lang.Runnable
        public final void run() {
            abog.this.i();
        }
    };
    private final ajnf w = new aboe(this);

    public abog(Context context, ajvb ajvbVar, ajoy ajoyVar, acra acraVar, abiy abiyVar) {
        context.getClass();
        this.b = context;
        ajvbVar.getClass();
        this.c = ajvbVar;
        ajvbVar.a(asra.class);
        this.d = ajoyVar;
        acraVar.getClass();
        this.e = acraVar;
        this.a = new View.OnLayoutChangeListener() { // from class: abob
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                abog abogVar = abog.this;
                if (i4 - i2 != i8 - i6) {
                    abogVar.h();
                }
            }
        };
        this.l = new abof(this);
        this.m = abiyVar;
    }

    private static void I(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != null) {
                ajom q = ahbw.q(childAt);
                if (q instanceof abqd) {
                    abqd abqdVar = (abqd) q;
                    if (i == 0) {
                        abqdVar.mW();
                    } else if (i == 1) {
                        abqdVar.mV();
                    } else if (i != 2) {
                        abqdVar.mX();
                    } else {
                        abqdVar.mU();
                    }
                }
            }
        }
    }

    @Override // defpackage.abjp
    public final void A() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            D(false);
            ((LoadingFrameLayout) parent).c();
        }
        this.r = 1;
        s();
    }

    @Override // defpackage.abjp
    public final void B() {
    }

    public abor C() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(boolean z) {
        if (z == this.q) {
            return;
        }
        this.q = z;
        View d = d();
        if (d == null) {
            return;
        }
        if (z) {
            d.setImportantForAccessibility(1);
            d.animate().translationY(0.0f).setDuration(200L);
        } else {
            d.animate().translationY(this.b.getResources().getDimensionPixelOffset(R.dimen.live_chat_more_comments_button_horizontal_offset)).setDuration(200L);
            d.setImportantForAccessibility(2);
        }
    }

    public final void E() {
        RecyclerView b = b();
        if (b != null) {
            b.postDelayed(this.v, 10000L);
        }
    }

    public final void F() {
        RecyclerView b = b();
        if (b != null) {
            b.removeCallbacks(this.v);
        }
    }

    public final boolean G() {
        int L = ((LinearLayoutManager) a().n).L();
        return L == -1 || L == this.g.a() + (-1);
    }

    public final boolean H() {
        RecyclerView b = b();
        return b != null && ((LinearLayoutManager) b.n).J() == 0;
    }

    public abstract RecyclerView a();

    public abstract RecyclerView b();

    public abstract View d();

    public abstract ajwf f();

    @Override // defpackage.abgs
    public final void g(boolean z) {
        RecyclerView a = a();
        if (z) {
            if (a.E == null) {
                a.ae(new ub());
            }
        } else if (a.E != null) {
            a.ae(null);
        }
    }

    @Override // defpackage.abgs
    public final void h() {
        int a = this.g.a();
        if (a > 0) {
            RecyclerView a2 = a();
            int i = a - 10;
            if (((LinearLayoutManager) a2.n).L() < i) {
                a2.aa(i);
            }
            this.h = true;
            a2.ak(a - 1);
        }
    }

    @Override // defpackage.abgs
    public final void i() {
        Object obj;
        RecyclerView b = b();
        if (b == null || (obj = this.n) == null || ((you) obj).size() <= 0) {
            return;
        }
        b.removeCallbacks(this.v);
        if (((LinearLayoutManager) b.n).J() > 10) {
            b.aa(10);
        }
        this.j = true;
        b.ak(0);
    }

    @Override // defpackage.abgs
    public final boolean j() {
        return this.h || G();
    }

    @Override // defpackage.abgs
    public final boolean k() {
        return this.j || H();
    }

    @Override // defpackage.abgs
    public final boolean l() {
        return this.i == 1;
    }

    @Override // defpackage.abgs
    public final boolean m() {
        return this.k == 1;
    }

    @Override // defpackage.abqd
    public final void mU() {
        F();
        I(b(), 2);
    }

    @Override // defpackage.abqd
    public final void mV() {
        i();
        I(b(), 1);
    }

    @Override // defpackage.abqd
    public final void mW() {
        i();
        I(b(), 0);
    }

    @Override // defpackage.abqd
    public final void mX() {
        F();
        I(b(), 3);
    }

    @Override // defpackage.abjp
    public final int n() {
        return this.r;
    }

    @Override // defpackage.abjp
    public final CharSequence o() {
        return this.s;
    }

    @Override // defpackage.abjp
    public final Runnable p() {
        return this.t;
    }

    @Override // defpackage.abjp
    public final void q() {
        if (this.p) {
            return;
        }
        View d = d();
        if (d != null) {
            d.setOnClickListener(new View.OnClickListener() { // from class: aboa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abjp abjpVar;
                    abjo abjoVar = abog.this.f;
                    if (abjoVar == null || (abjpVar = ((abht) abjoVar).e) == null) {
                        return;
                    }
                    abjpVar.h();
                }
            });
        }
        RecyclerView a = a();
        RecyclerView b = b();
        a.addOnLayoutChangeListener(this.a);
        a.aD(this.l);
        if (b != null) {
            b.aD(this.l);
        }
        this.p = true;
    }

    @Override // defpackage.abjp
    public final void r() {
        RecyclerView a = a();
        ajwe ajweVar = this.u;
        if (ajweVar != null) {
            ajweVar.b(a);
            this.u = null;
        } else {
            a.ac(null);
        }
        a.af(null);
        a.removeOnLayoutChangeListener(this.a);
        a.aF(this.l);
        this.p = false;
        this.g = null;
        this.n = null;
        this.i = 0;
        RecyclerView b = b();
        if (b != null) {
            F();
            b.ac(null);
            b.af(null);
            b.aF(this.l);
        }
        this.k = 0;
    }

    @Override // defpackage.abjp
    public final void s() {
        abor aborVar = this.o;
        if (aborVar != null) {
            aborVar.b = -1;
            aborVar.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ajos, java.lang.Object] */
    @Override // defpackage.abjp
    public void t(ajng ajngVar, ajol ajolVar) {
        if (this.g == ajngVar) {
            return;
        }
        this.g = ajngVar;
        ajoy ajoyVar = this.d;
        ajox a = ajoyVar != 0 ? ajoyVar.a(this.c.get()) : new ajox(this.c.get());
        a.h(ajngVar);
        a.rU(new ajnw(this.e));
        if (ajolVar != null) {
            a.rU(ajolVar);
        }
        RecyclerView a2 = a();
        if (this.m.a.g && f() != null) {
            this.u = ((ajzt) f()).a(a2, a);
        }
        ajwe ajweVar = this.u;
        if (ajweVar != null) {
            ajweVar.a(a2);
        } else {
            a2.ac(a);
        }
        a2.af(new WrappedLinearLayoutManager());
        a2.ae(null);
        abor aborVar = this.o;
        if (aborVar != null) {
            a2.aE(aborVar);
        }
        abor C = C();
        this.o = C;
        if (C != null) {
            a2.aB(C);
        }
    }

    @Override // defpackage.abjp
    public final void u(CharSequence charSequence, Runnable runnable) {
        this.s = charSequence;
        this.t = runnable;
    }

    @Override // defpackage.abjp
    public final void v(abjo abjoVar) {
        this.f = abjoVar;
    }

    @Override // defpackage.abjp
    public final void w(int i) {
        if (i == 0 || i == 1) {
            A();
        } else if (i != 2) {
            z(this.s, this.t);
        } else {
            y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ajos, java.lang.Object] */
    @Override // defpackage.abjp
    public final void x(ajng ajngVar, ajol ajolVar) {
        ajng ajngVar2 = this.n;
        if (ajngVar2 == ajngVar) {
            return;
        }
        if (ajngVar2 != null) {
            ajngVar2.pf(this.w);
        }
        this.n = ajngVar;
        if (ajngVar != null) {
            ajngVar.lX(this.w);
        }
        RecyclerView b = b();
        if (b != null) {
            WrappedLinearLayoutManager wrappedLinearLayoutManager = new WrappedLinearLayoutManager();
            wrappedLinearLayoutManager.ab(0);
            b.af(wrappedLinearLayoutManager);
            if (b.getTag(R.id.live_chat_ticker_view_decorator_added_tag) == null) {
                b.aB(new abpr(this.b.getResources().getDimensionPixelOffset(R.dimen.live_chat_ticker_header_width)));
                b.setTag(R.id.live_chat_ticker_view_decorator_added_tag, true);
            }
            ajox a = this.d.a(this.c.get());
            a.h(ajngVar);
            a.rU(new ajnw(this.e));
            if (ajolVar != null) {
                a.rU(ajolVar);
            }
            b.ac(a);
        }
    }

    @Override // defpackage.abjp
    public final void y() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            ((LoadingFrameLayout) parent).a();
        }
        this.r = 2;
    }

    @Override // defpackage.abjp
    public final void z(CharSequence charSequence, final Runnable runnable) {
        ViewParent parent = a().getParent();
        this.r = 3;
        this.s = charSequence;
        this.t = runnable;
        if (parent instanceof LoadingFrameLayout) {
            final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) parent;
            boolean z = runnable != null;
            if (z) {
                loadingFrameLayout.f(new akdd() { // from class: aboc
                    @Override // defpackage.akdd
                    public final void qJ() {
                        LoadingFrameLayout loadingFrameLayout2 = LoadingFrameLayout.this;
                        Runnable runnable2 = runnable;
                        if (loadingFrameLayout2 instanceof VerticalShimmerLoadingFrameLayout) {
                            loadingFrameLayout2.a();
                        }
                        loadingFrameLayout2.c();
                        runnable2.run();
                    }
                });
            }
            loadingFrameLayout.b(charSequence, z);
        }
        s();
    }
}
