package com.google.android.apps.youtube.app.common.ui.inline;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import defpackage.amkq;
import defpackage.any;
import defpackage.aoae;
import defpackage.aok;
import defpackage.ayph;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azrj;
import defpackage.eoo;
import defpackage.gga;
import defpackage.ggc;
import defpackage.ggd;
import defpackage.gge;
import defpackage.ggf;
import defpackage.ggg;
import defpackage.ggk;
import defpackage.ggr;
import defpackage.gof;
import defpackage.yjk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlaybackLifecycleController implements any {
    public final Handler a;
    public ayqx b;
    private ggg e;
    private final aoae f = new aoae((short[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    private final List c = new ArrayList();
    private int d = 0;

    public InlinePlaybackLifecycleController(Handler handler) {
        this.a = handler;
    }

    public static final boolean r(int i, ggg gggVar) {
        int i2 = gggVar.g;
        return !(i2 == 3 || i2 == 2) || i == 0;
    }

    private final void s(int i, ggg gggVar) {
        int i2 = gggVar.g;
        if (i2 == 0) {
            gggVar.g = 1;
        } else if (i2 == 3 && i != 0) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Can't transition aborted requests to state ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        amkq.Q(!gggVar.b(), "Can't transition, request is already blocked %s", gggVar.c);
        for (ggf ggfVar : this.c) {
            gggVar.c.add(ggfVar);
            if (ggfVar.j(gggVar.a, i, new gga(this, gggVar, i, ggfVar))) {
                gggVar.a(ggfVar);
            } else {
                String.valueOf(String.valueOf(ggfVar)).length();
            }
        }
        if (gggVar.b()) {
            return;
        }
        this.a.post(new ggd(this, i, gggVar, 0));
    }

    private final boolean t(gof gofVar) {
        ggg gggVar = this.e;
        return gggVar != null && gggVar.a.b.k(gofVar);
    }

    private final boolean u(gof gofVar) {
        ggg gggVar;
        ggg gggVar2 = this.e;
        return (gggVar2 == null || (gggVar = gggVar2.h) == null || !gggVar.a.b.k(gofVar)) ? false : true;
    }

    private final void v(ggg gggVar) {
        final ggg gggVar2 = this.e;
        int i = gggVar2.g;
        boolean z = true;
        if (i != 3 && i != 2) {
            z = false;
        }
        if (!z) {
            gggVar2.g = 3;
        }
        ggg gggVar3 = gggVar2.h;
        if (gggVar3 != null) {
            gggVar3.g = 3;
        }
        gggVar2.h = gggVar;
        if (z) {
            return;
        }
        if (gggVar2.f == 3) {
            s(0, gggVar2);
            return;
        }
        gggVar2.g = 2;
        if (gggVar2.b()) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ggf) it.next()).g(gggVar2.a);
            }
            gggVar2.c.clear();
        }
        gggVar2.g = 3;
        this.a.post(new Runnable() { // from class: ggb
            @Override // java.lang.Runnable
            public final void run() {
                InlinePlaybackLifecycleController.this.n(0, gggVar2);
            }
        });
    }

    public final int g(gof gofVar) {
        ggg gggVar = this.e;
        if (gggVar == null) {
            return 0;
        }
        if (gggVar.a.b == gofVar) {
            return gggVar.b;
        }
        ggg gggVar2 = gggVar.h;
        if (gggVar2 == null || gggVar2.a.b != gofVar) {
            return 0;
        }
        return gggVar2.b;
    }

    public final ayph h() {
        yjk.f();
        ggg gggVar = this.e;
        if (gggVar == null || gggVar.g == 3) {
            return ayph.f();
        }
        azrj azrjVar = gggVar.e;
        v(null);
        return azrjVar;
    }

    public final ayph i(gof gofVar) {
        yjk.f();
        String.valueOf(String.valueOf(gofVar)).length();
        if (this.e == null) {
            return ayph.f();
        }
        if (t(gofVar) || u(gofVar)) {
            azrj azrjVar = this.e.e;
            v(null);
            return azrjVar;
        }
        return ayph.f();
    }

    public final ayph j(gof gofVar, ggr ggrVar, int i) {
        yjk.f();
        gofVar.getClass();
        String.valueOf(String.valueOf(gofVar)).length();
        if (t(gofVar)) {
            return this.e.d;
        }
        if (u(gofVar)) {
            return this.e.h.d;
        }
        ggg gggVar = new ggg(gofVar, ggrVar, i);
        ggg gggVar2 = this.e;
        if (gggVar2 == null) {
            this.e = gggVar;
            s(1, gggVar);
        } else {
            if (gggVar2.g == 0) {
                return ayph.s(new IllegalStateException("Requested Playback when currentRequest has status 0"));
            }
            v(gggVar);
        }
        return gggVar.d;
    }

    public final ayph k() {
        yjk.f();
        ggg gggVar = this.e;
        if (gggVar == null) {
            return ayph.f();
        }
        azrj azrjVar = gggVar.e;
        v(null);
        return azrjVar;
    }

    public final void l(gge ggeVar) {
        aoae aoaeVar = this.f;
        ggeVar.getClass();
        aoaeVar.b.add(ggeVar);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void m(ggf ggfVar) {
        ggfVar.getClass();
        this.c.add(ggfVar);
    }

    public final void n(int i, ggg gggVar) {
        String.valueOf(String.valueOf(gggVar)).length();
        gggVar.getClass();
        this.e = gggVar;
        if (r(i, gggVar)) {
            int i2 = this.d;
            this.d = i;
            ggg gggVar2 = this.e;
            gggVar2.f = i;
            aoae aoaeVar = this.f;
            int i3 = this.d;
            Iterator it = aoaeVar.b.iterator();
            while (it.hasNext()) {
                ((gge) it.next()).m(gggVar2.a, i2, i3);
            }
            if (i3 == 0) {
                gggVar2.e.sh();
            } else if (i3 == 3) {
                gggVar2.d.sh();
            }
        }
        int i4 = this.d;
        if (i4 == 3) {
            if (this.e.g != 3) {
                return;
            } else {
                i4 = 3;
            }
        }
        if (i4 == 0) {
            ggg gggVar3 = this.e.h;
            this.e = gggVar3;
            if (gggVar3 != null) {
                s(1, gggVar3);
                return;
            }
            return;
        }
        ggg gggVar4 = this.e;
        s(gggVar4.g == 3 ? 0 : i4 + 1, gggVar4);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayqx ayqxVar = this.b;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayrz.c((AtomicReference) this.b);
    }

    public final void o(gge ggeVar) {
        aoae aoaeVar = this.f;
        ggeVar.getClass();
        aoaeVar.b.remove(ggeVar);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public final void p() {
        ayqx ayqxVar = this.b;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.b);
        }
        this.b = h().S(ggc.a, eoo.t);
    }

    public final void q() {
        ayqx ayqxVar = this.b;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.b);
        }
        this.b = k().S(ggc.c, ggk.b);
    }
}
