package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mec extends lyy implements mcs {
    public final axpg c;
    fzv d;
    public final int e;
    public int f;
    public fzt g;
    public mco h;
    public boolean i;
    private mcr j;
    private mcu k;
    private final axpg l;
    private final Activity m;
    private final aaea n;
    private int o;

    public mec(Activity activity, axpg axpgVar, axpg axpgVar2, aaea aaeaVar) {
        super(activity, axpgVar2);
        this.g = null;
        this.i = false;
        this.c = axpgVar;
        this.l = axpgVar2;
        this.m = activity;
        this.n = aaeaVar;
        this.e = activity.getResources().getDimensionPixelSize(R.dimen.bar_container_height) + activity.getResources().getDimensionPixelSize(R.dimen.bar_separator_height);
        this.f = 0;
        this.o = 1;
        this.g = (!r() || zev.e(activity)) ? fzt.a : fzt.b;
    }

    private final void p() {
        mcu mcuVar = this.k;
        if (mcuVar == null || mcuVar.b) {
            return;
        }
        mcuVar.a();
        RecyclerView recyclerView = this.d.b;
        if (recyclerView != null) {
            recyclerView.Y(this.k);
        }
    }

    private final void q(int i) {
        this.o = i;
        g();
        if (j()) {
            alfd alfdVar = (alfd) ((LinearLayout) this.c.get()).getLayoutParams();
            if ("static".equals(evr.y(this.n).c()) || "static_autohide".equals(evr.y(this.n).c()) || "prehide".equals(evr.y(this.n).c())) {
                alfdVar.a = 0;
            } else if (alfdVar != null) {
                if (this.o == 3) {
                    alfdVar.a = 0;
                } else {
                    alfdVar.a = 21;
                }
            }
        }
    }

    private final boolean r() {
        return "autohide".equals(evr.y(this.n).c()) || "static_autohide".equals(evr.y(this.n).c());
    }

    @Override // defpackage.lyy
    protected final int a() {
        alfd alfdVar = (alfd) ((LinearLayout) this.c.get()).getLayoutParams();
        if (this.g.a()) {
            if (alfdVar == null || alfdVar.height != 0) {
                return 0;
            }
        } else if (alfdVar == null || alfdVar.height != this.e) {
            return this.e;
        }
        return alfdVar.height;
    }

    @Override // defpackage.lyy
    protected final int b() {
        return 1;
    }

    @Override // defpackage.lyy
    protected final ViewGroup c() {
        return (ViewGroup) this.c.get();
    }

    @Override // defpackage.lyy
    protected final void f() {
        ((LinearLayout) this.c.get()).setVisibility(8);
        mco mcoVar = this.h;
        if (mcoVar != null) {
            mcoVar.a();
            this.h = null;
        }
        k();
        ViewGroup viewGroup = (ViewGroup) ((LinearLayout) this.c.get()).getParent();
        if (viewGroup == this.l.get()) {
            viewGroup.removeView((View) this.c.get());
        }
    }

    @Override // defpackage.lyy
    public final void h(gad gadVar) {
        fzv fzvVar = gadVar.d;
        if (fzvVar == null) {
            q(1);
            return;
        }
        this.d = fzvVar;
        if (!this.i) {
            if (!r() || zev.e(this.m)) {
                this.g = fzt.a;
            } else {
                this.g = fzt.b;
            }
        }
        q(true != this.d.a ? 2 : 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final void i() {
        if (!o()) {
            ((LinearLayout) this.c.get()).setVisibility(0);
        }
        if (this.g.a()) {
            l();
        } else if (this.g.d == 2 || o()) {
            final mdy mdyVar = new mdy(this, 0);
            ((LinearLayout) this.c.get()).post(new Runnable() { // from class: mea
                @Override // java.lang.Runnable
                public final void run() {
                    mec mecVar = mec.this;
                    mcn mcnVar = mdyVar;
                    try {
                        mecVar.f = mecVar.d.b.computeVerticalScrollOffset();
                        mecVar.h = new mco(mecVar.e, 0, (View) mecVar.c.get(), mcnVar, true != mecVar.o() ? 1200 : 0, true != mecVar.o() ? 400 : 100, false);
                        mecVar.h.b();
                    } catch (IllegalArgumentException e) {
                        zga.d("Error hiding search chip bar", e);
                    }
                }
            });
        }
    }

    @Override // defpackage.lyy
    public final boolean j() {
        LinearLayout linearLayout = (LinearLayout) ((LinearLayout) this.c.get()).findViewById(R.id.chip_bar_chips_container);
        if (linearLayout.getChildCount() > 1) {
            vw vwVar = ((RecyclerView) linearLayout.getChildAt(1)).m;
            if (this.o != 1 && vwVar != null && vwVar.b() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        mcr mcrVar = this.j;
        if (mcrVar != null) {
            mcrVar.k(this.d.b, (AppBarLayout) this.l.get());
        }
        p();
    }

    public final void l() {
        this.k = new mcu((View) this.c.get(), this.e, new meb(this), this.f, true);
        this.d.b.v(this.k);
        mcr mcrVar = new mcr(this);
        this.j = mcrVar;
        mcrVar.j(this.d.b, (AppBarLayout) this.l.get());
    }

    @Override // defpackage.mcs
    public final void m() {
        p();
    }

    @Override // defpackage.mcs
    public final void n() {
        if (((LinearLayout) this.c.get()).getVisibility() != 0) {
            ((LinearLayout) this.c.get()).setVisibility(0);
        }
        ((LinearLayout) this.c.get()).post(new Runnable() { // from class: mdz
            @Override // java.lang.Runnable
            public final void run() {
                mec mecVar = mec.this;
                try {
                    new mco(0, mecVar.e, (View) mecVar.c.get(), new mdy(mecVar, 1), 0, 400, true).b();
                } catch (IllegalArgumentException e) {
                    zga.d("Error revealing search chip bar", e);
                }
            }
        });
        k();
    }

    public final boolean o() {
        return "prehide".equals(evr.y(this.n).c());
    }
}
