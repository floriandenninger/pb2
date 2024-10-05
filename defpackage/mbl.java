package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbl extends lyy implements mcs {
    public int c;
    public fzl d;
    public mcu e;
    public final axpg f;
    public final mbr g;
    public final int h;
    public fzn i;
    public mco j;
    private final boolean k;
    private boolean l;
    private mcr m;
    private final axpg n;
    private ayqx o;

    public mbl(Activity activity, axpg axpgVar, axpg axpgVar2, ammv ammvVar, aaea aaeaVar, axzg axzgVar, ayqi ayqiVar, yqw yqwVar, byte[] bArr) {
        super(activity, axpgVar2);
        this.f = axpgVar;
        this.n = axpgVar2;
        this.g = (mbr) ammvVar.f();
        this.c = 1;
        this.h = activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_height) + activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_separator_height);
        aswb aswbVar = aaeaVar.a().e;
        this.k = (aswbVar == null ? aswb.a : aswbVar).aL;
        this.d = fzl.b;
        yqwVar.g(new mdo(axzgVar, ayqiVar, ((LinearLayout) axpgVar.get()).findViewById(R.id.feed_filter_bar_separator), 1, null));
    }

    private final void t() {
        mcu mcuVar = this.e;
        if (mcuVar == null || mcuVar.b) {
            return;
        }
        Cfor cfor = this.i.e;
        int i = 1;
        if (cfor != null) {
            cfor.c(1);
        }
        this.e.a();
        RecyclerView recyclerView = this.i.f;
        if (recyclerView != null) {
            recyclerView.post(new mbi(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final int a() {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) this.f.get()).getLayoutParams();
        if (this.d.a()) {
            if (layoutParams == null || layoutParams.height != 0) {
                return 0;
            }
        } else if (layoutParams == null || layoutParams.height != this.h) {
            return this.h;
        }
        return layoutParams.height;
    }

    @Override // defpackage.lyy
    protected final int b() {
        return this.i.c() ? 2 : 1;
    }

    @Override // defpackage.lyy
    protected final ViewGroup c() {
        return (ViewGroup) this.f.get();
    }

    @Override // defpackage.lyy
    protected final void f() {
        mco mcoVar = this.j;
        if (mcoVar != null) {
            mcoVar.a();
            this.j = null;
        }
        if (r()) {
            Object obj = this.o;
            obj.getClass();
            ayrz.c((AtomicReference) obj);
            this.o = null;
        }
        k();
        ViewGroup viewGroup = (ViewGroup) ((LinearLayout) this.f.get()).getParent();
        if (viewGroup == this.n.get()) {
            viewGroup.removeView((View) this.f.get());
        }
    }

    @Override // defpackage.lyy
    public final void h(gad gadVar) {
        fzo fzoVar;
        fzn fznVar = gadVar.b;
        final int i = 1;
        if (fznVar == null || fznVar.b == null) {
            q(1);
            return;
        }
        if (r()) {
            Object obj = this.o;
            obj.getClass();
            ayrz.c((AtomicReference) obj);
            this.o = null;
        }
        fzn fznVar2 = this.i;
        final int i2 = 0;
        if (fznVar2 == null || fznVar2.b != fznVar.b) {
            this.l = false;
            if (this.c != 1 && (fzoVar = fznVar.d) != null) {
                fzoVar.a();
            }
        }
        this.i = fznVar;
        if (!fznVar.c()) {
            this.o = this.i.b.az(new ayrs(this) { // from class: mbh
                public final /* synthetic */ mbl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    if (i == 0) {
                        this.a.q(1);
                        return;
                    }
                    mbl mblVar = this.a;
                    Boolean bool = (Boolean) obj2;
                    mblVar.q(true != bool.booleanValue() ? 4 : 5);
                    if (!bool.booleanValue() || mblVar.c == 1) {
                        return;
                    }
                    mco mcoVar = mblVar.j;
                    if (mcoVar != null) {
                        mcoVar.a();
                    }
                    if (((LinearLayout) mblVar.f.get()).getVisibility() == 0 && mblVar.a() == 0) {
                        mblVar.s();
                        mblVar.k();
                    }
                }
            }, new ayrs(this) { // from class: mbh
                public final /* synthetic */ mbl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    if (i2 == 0) {
                        this.a.q(1);
                        return;
                    }
                    mbl mblVar = this.a;
                    Boolean bool = (Boolean) obj2;
                    mblVar.q(true != bool.booleanValue() ? 4 : 5);
                    if (!bool.booleanValue() || mblVar.c == 1) {
                        return;
                    }
                    mco mcoVar = mblVar.j;
                    if (mcoVar != null) {
                        mcoVar.a();
                    }
                    if (((LinearLayout) mblVar.f.get()).getVisibility() == 0 && mblVar.a() == 0) {
                        mblVar.s();
                        mblVar.k();
                    }
                }
            }, new ayrm() { // from class: mbf
                @Override // defpackage.ayrm
                public final void a() {
                    mbl.this.q(1);
                }
            });
        }
        fzn fznVar3 = this.i;
        if (fznVar3.g || TextUtils.equals(fznVar3.a, "FEactivity") || TextUtils.equals(this.i.a, "FEnotifications_inbox") || this.i.c() || (this.i.b() && this.k)) {
            this.d = fzl.a;
        }
        if (this.d == fzl.c) {
            this.d = fzl.a;
        }
        int i3 = 4;
        if (!this.i.c() && true == this.i.c) {
            i3 = 5;
        }
        q(i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final void i() {
        if (!this.d.a()) {
            ((LinearLayout) this.f.get()).setVisibility(0);
            l();
        }
        if (this.d.a()) {
            ((LinearLayout) this.f.get()).setVisibility(0);
            p();
        } else if (this.d.b()) {
            final mbd mbdVar = new mbd(this, 0);
            ((LinearLayout) this.f.get()).post(new Runnable() { // from class: mbj
                @Override // java.lang.Runnable
                public final void run() {
                    mbl mblVar = mbl.this;
                    try {
                        mblVar.j = new mco(mblVar.h, 0, (View) mblVar.f.get(), mbdVar, 1200, 400, true);
                        mblVar.j.b();
                    } catch (IllegalArgumentException e) {
                        zga.d("Error hiding feed filter bar", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final boolean j() {
        return this.c != 1;
    }

    public final void k() {
        mcr mcrVar = this.m;
        if (mcrVar != null) {
            mcrVar.k(this.i.f, (AppBarLayout) this.n.get());
        }
        t();
    }

    public final void l() {
        final mbr mbrVar;
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.i.h) {
            o();
        }
        if (this.i.b() && (mbrVar = this.g) != null) {
            ynm.i(ynm.c(mbrVar.e, mbrVar.d.a(), new amml() { // from class: mbo
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
                
                    if (r0 < defpackage.mbr.a) goto L4;
                 */
                @Override // defpackage.amml
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r9) {
                    /*
                        r8 = this;
                        mbr r0 = defpackage.mbr.this
                        mcz r9 = (defpackage.mcz) r9
                        int r1 = r9.d
                        r2 = 1
                        r3 = 0
                        r4 = 3
                        if (r1 < r4) goto Ld
                    Lb:
                        r2 = 0
                        goto L2a
                    Ld:
                        shf r0 = r0.f
                        long r4 = r9.c
                        r6 = -1
                        int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r9 != 0) goto L18
                        goto L2a
                    L18:
                        long r0 = r0.c()
                        long r0 = r0 - r4
                        r4 = 0
                        int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r9 >= 0) goto L24
                        goto Lb
                    L24:
                        long r4 = defpackage.mbr.a
                        int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r9 < 0) goto Lb
                    L2a:
                        java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mbo.apply(java.lang.Object):java.lang.Object");
                }
            }), new ynl() { // from class: mbe
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    fzn fznVar;
                    mbr mbrVar2;
                    mbl mblVar = mbl.this;
                    if (!((Boolean) obj).booleanValue() || (fznVar = mblVar.i) == null || !fznVar.b() || (mbrVar2 = mblVar.g) == null) {
                        return;
                    }
                    Context context = mblVar.a;
                    if (mbrVar2.b != null) {
                        View view = (View) mbrVar2.c.get();
                        String string = context.getResources().getString(R.string.feed_filter_bar_tutorial_description);
                        akci a = akcj.a();
                        a.a = view;
                        a.c = string;
                        a.i(2);
                        a.c(2);
                        a.g(-1);
                        a.f = new mbq(mbrVar2);
                        mbrVar2.b.c(a.a());
                        mblVar.o();
                    }
                }
            });
        }
        fzo fzoVar = this.i.d;
        if (fzoVar != null) {
            fzoVar.a();
        }
    }

    @Override // defpackage.mcs
    public final void m() {
        t();
    }

    @Override // defpackage.mcs
    public final void n() {
        s();
        k();
    }

    public final void o() {
        mco mcoVar = this.j;
        if (mcoVar != null) {
            if (mcoVar.a.isStarted()) {
                return;
            } else {
                this.j.a();
            }
        }
        if (this.d.b()) {
            this.d = fzl.a;
        }
    }

    public final void p() {
        this.i.e.c(3);
        this.e = new mcu((View) this.f.get(), this.h, new mbk(this), 0, false);
        this.i.f.v(this.e);
        mcr mcrVar = new mcr(this);
        this.m = mcrVar;
        mcrVar.j(this.i.f, (AppBarLayout) this.n.get());
    }

    public final void q(int i) {
        alfd alfdVar;
        if (this.k || this.c != i) {
            this.c = i;
            g();
            if (j() && (alfdVar = (alfd) ((LinearLayout) this.f.get()).getLayoutParams()) != null) {
                int i2 = this.c == 5 ? 0 : 21;
                if (i2 != alfdVar.a) {
                    alfdVar.a = i2;
                }
            }
        }
    }

    final boolean r() {
        return this.o != null;
    }

    public final void s() {
        ((LinearLayout) this.f.get()).post(new mbi(this, 0));
    }
}
