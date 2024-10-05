package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkj implements Animator.AnimatorListener {
    public View a;
    public int b;
    final /* synthetic */ SwipeToContainerFrameLayout c;
    private boolean d;

    public nkj(SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        this.c = swipeToContainerFrameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        acra r;
        View view = this.a;
        if (view == null || this.d) {
            return;
        }
        view.setVisibility(8);
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.c;
        int i = this.b;
        swipeToContainerFrameLayout.c = i;
        this.a = null;
        nkh nkhVar = swipeToContainerFrameLayout.f;
        if (nkhVar != null) {
            if (i == 1) {
                int i2 = swipeToContainerFrameLayout.d;
                nkg nkgVar = (nkg) nkhVar;
                nkgVar.n = true;
                nkgVar.q(i2, 1.0f);
                if (nkgVar.o == null) {
                    nkf nkfVar = nkgVar.j;
                    htu htuVar = nkfVar.e.q;
                    if (htuVar != null) {
                        htuVar.au.a();
                    } else {
                        nkfVar.b = true;
                    }
                }
                nkgVar.i.c(new dsm(0));
                nkgVar.h.o(2);
                return;
            }
            nkg nkgVar2 = (nkg) nkhVar;
            nkgVar2.n = false;
            nkgVar2.e.m(2);
            if (nkgVar2.q != null) {
                dn k = nkgVar2.c.k();
                k.m(nkgVar2.q);
                k.a();
                if (!nkgVar2.p && (r = nkgVar2.q.au.a.r()) != null) {
                    r.I(3, new acqx(acsb.c(53010)), null);
                }
            }
            nkgVar2.j.a();
            nkgVar2.b.h(0);
            nkgVar2.t.d(nkgVar2.r);
            nkgVar2.q = null;
            nkgVar2.i.c(new dsm(1));
            nkgVar2.h.g();
            nkgVar2.p = false;
            nkgVar2.o = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }
}
