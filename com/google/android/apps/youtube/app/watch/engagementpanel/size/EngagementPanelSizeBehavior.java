package com.google.android.apps.youtube.app.watch.engagementpanel.size;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ahe;
import defpackage.aypn;
import defpackage.azqv;
import defpackage.azqy;
import defpackage.nqg;
import defpackage.ntu;
import defpackage.nua;
import defpackage.nuo;
import defpackage.nvz;
import defpackage.nwx;
import defpackage.nwy;
import defpackage.nxh;
import defpackage.nxt;
import defpackage.nxu;
import defpackage.nxv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EngagementPanelSizeBehavior extends ahe implements nxv {
    private final int a;
    private final nvz b;
    private final nuo c;
    private final nwy d;
    private nwx e;
    private final azqy f = azqy.ap();
    private final azqv g;
    private final aypn h;
    private final azqy i;
    private boolean j;
    private View k;

    public EngagementPanelSizeBehavior(Context context, nuo nuoVar, nvz nvzVar, nwy nwyVar) {
        this.b = nvzVar;
        this.c = nuoVar;
        this.d = nwyVar;
        azqv aq = azqv.aq(false);
        this.g = aq;
        this.i = azqy.ap();
        this.a = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 32;
        this.h = aq.n().q(new nua(6)).h(ntu.e);
    }

    private final boolean B() {
        Boolean bool = (Boolean) this.g.ar();
        return bool != null && bool.booleanValue();
    }

    public final void A() {
        if (B()) {
            this.i.c(nxu.NO_FLING);
            this.g.c(false);
        }
        this.j = false;
    }

    @Override // defpackage.ahe
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (this.j) {
            nwx nwxVar = this.e;
            if (i2 <= 0 || !B() || nwxVar == null) {
                return;
            }
            int i4 = nwxVar.n;
            this.f.c(Integer.valueOf(-i2));
            int max = Math.max(0, Math.min(i2, -(nwxVar.n - i4)));
            if (max > 0) {
                iArr[1] = iArr[1] + max;
            }
        }
    }

    @Override // defpackage.ahe
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.j) {
            if (i4 < 0) {
                this.g.c(true);
                this.f.c(Integer.valueOf(-i4));
                iArr[1] = iArr[1] + i4;
                nwx nwxVar = this.e;
                nwxVar.getClass();
                if (nwxVar.n > this.d.b().bottom) {
                    A();
                    return;
                }
                return;
            }
            if (i4 != 0 || B()) {
                return;
            }
            this.j = false;
        }
    }

    @Override // defpackage.ahe
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        A();
    }

    @Override // defpackage.ahe
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (!this.j) {
            return false;
        }
        float abs = Math.abs(f2);
        if (f2 > 0.0f || abs < this.a || !B()) {
            return false;
        }
        this.i.c(nxu.FLING_DOWN);
        this.g.c(false);
        return true;
    }

    @Override // defpackage.ahe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        nqg nqgVar = this.c.d;
        if (nqgVar != null) {
            View view4 = this.k;
            boolean z = view4 == null || view4 == view2;
            nwx nwxVar = this.e;
            if (nwxVar != null && nwxVar.o != nxh.HIDDEN && this.b.e() && !nqgVar.s() && z) {
                r3 = i == 2;
                this.j = r3;
            }
        }
        return r3;
    }

    @Override // defpackage.nxv
    public final nxt v() {
        return nxt.DOWN_ONLY;
    }

    @Override // defpackage.nxv
    public final aypn w() {
        return this.h;
    }

    @Override // defpackage.nxv
    public final aypn x() {
        return this.i;
    }

    @Override // defpackage.nxv
    public final aypn y() {
        return this.f;
    }

    public final void z(nwx nwxVar, View view) {
        this.e = nwxVar;
        this.k = view;
    }
}
