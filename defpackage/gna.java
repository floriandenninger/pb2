package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gna {
    public final RecyclerView a;
    public final vw b;
    public final ViewGroup c;
    public final gmo d;
    public final gmm e;
    public final wh f;
    public final float g;
    public final gmz h;
    public View i;
    public long j;
    public boolean k;
    public View l;
    public float m;
    public int n;
    public Runnable o;
    public final lo p;
    public ll q;
    private float r;
    private View s;
    private boolean t;

    public gna(StickyHeaderContainer stickyHeaderContainer, vw vwVar, gmm gmmVar) {
        vwVar.getClass();
        this.b = vwVar;
        this.e = gmmVar;
        stickyHeaderContainer.getClass();
        RecyclerView recyclerView = stickyHeaderContainer.a;
        this.a = recyclerView;
        this.c = (ViewGroup) recyclerView.getParent();
        this.g = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.expansion_start);
        this.f = new gmu(this);
        this.p = new gmv(this);
        this.h = new gmz(recyclerView.getContext());
        gmo gmoVar = new gmo(vwVar, gmmVar);
        this.d = gmoVar;
        gmoVar.d = new gmq(this);
        gmoVar.r();
    }

    public static final float e(View view, float f) {
        return 1.0f - Math.max(0.0f, Math.min(1.0f, view.getTop() / f));
    }

    private final void f() {
        if (this.t) {
            return;
        }
        this.a.ad(gmp.a);
        this.t = true;
    }

    private final void g() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.c.post(new gms(this, this.i, 1));
            this.i = null;
            this.j = 0L;
        }
    }

    private final void h() {
        if (this.t) {
            this.a.ad(null);
            this.t = false;
        }
    }

    private final void i() {
        View view = this.s;
        if (view != null) {
            view.setAlpha(this.r);
            this.s.setVisibility(this.r == 0.0f ? 8 : 0);
            this.s = null;
        }
    }

    private static final boolean j(int i) {
        return (i & 28) == 28;
    }

    public final View a(wd wdVar) {
        if (wdVar == null) {
            return null;
        }
        gmo gmoVar = this.d;
        int i = gmoVar.b;
        if (i == -1) {
            if (!gmoVar.t()) {
                return null;
            }
        } else if (i >= gmoVar.a.size() - 1) {
            return null;
        }
        return wdVar.S(this.d.p());
    }

    public final void b() {
        ll llVar = this.q;
        if (llVar != null) {
            this.a.aE(llVar);
            this.a.Y(this.f);
            this.q = null;
        }
    }

    public final void c() {
        if (this.i != null) {
            g();
        }
        this.a.aF(this.p);
        this.d.s();
        if (this.q != null) {
            this.a.post(new gmr(this, 0));
        }
        i();
        h();
        this.l = null;
        this.o = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        if (r5 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gna.d():void");
    }
}
