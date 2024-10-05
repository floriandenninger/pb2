package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pom extends pld implements plr {
    private boolean A;
    private final ncf B;
    private final eun C;
    private final eun D;
    protected final poe[] b;
    public final pme c;
    public final CopyOnWriteArraySet d;
    public final avk e;
    public final plc f;
    public final poq g;
    public Object h;
    public Surface i;
    public int j;
    public asd k;
    public float l;
    public boolean m;
    public ptk n;
    public boolean o;
    public boolean p;
    public plo q;
    private final Context r;
    private final pok s;
    private final pol t;
    private final long u;
    private int v;
    private int w;
    private int x;
    private bgw y;
    private boolean z;

    public pom(poj pojVar) {
        pom pomVar;
        pok pokVar;
        pol polVar;
        Handler handler;
        pme pmeVar;
        eun eunVar = new eun((char[]) null);
        this.C = eunVar;
        try {
            Context applicationContext = pojVar.a.getApplicationContext();
            this.r = applicationContext;
            avk avkVar = pojVar.g;
            this.e = avkVar;
            this.n = pojVar.i;
            this.k = pojVar.j;
            this.v = pojVar.k;
            this.m = false;
            this.u = pojVar.o;
            pokVar = new pok(this);
            this.s = pokVar;
            polVar = new pol();
            this.t = polVar;
            this.d = new CopyOnWriteArraySet();
            handler = new Handler(pojVar.h);
            poe[] rl = pojVar.b.rl(handler, pokVar, pokVar, pokVar, pokVar);
            this.b = rl;
            this.l = 1.0f;
            int i = pts.a;
            this.j = plh.a(applicationContext);
            Collections.emptyList();
            this.z = true;
            psm psmVar = new psm();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                muf.G(iArr, psmVar);
                pmeVar = new pme(rl, pojVar.d, pojVar.e, pojVar.f, avkVar, pojVar.l, pojVar.m, pojVar.q, pojVar.n, pojVar.c, pojVar.h, this, muf.E(psmVar));
                pomVar = this;
            } catch (Throwable th) {
                th = th;
                pomVar = this;
            }
        } catch (Throwable th2) {
            th = th2;
            pomVar = this;
        }
        try {
            pomVar.c = pmeVar;
            pmeVar.u(pokVar);
            pmeVar.t(pokVar);
            pojVar.a.getApplicationContext();
            new pky(handler);
            pomVar.f = new plc(pojVar.a, handler, pokVar);
            plc.d();
            poq poqVar = new poq(pojVar.a, handler, pokVar);
            pomVar.g = poqVar;
            poqVar.a(pts.k(pomVar.k.c));
            ncf ncfVar = new ncf(pojVar.a);
            pomVar.B = ncfVar;
            ncfVar.a = false;
            eun eunVar2 = new eun(pojVar.a);
            pomVar.D = eunVar2;
            eunVar2.a = false;
            pomVar.q = t(poqVar);
            pomVar.F(1, 10, Integer.valueOf(pomVar.j));
            pomVar.F(2, 10, Integer.valueOf(pomVar.j));
            pomVar.F(1, 3, pomVar.k);
            pomVar.F(2, 4, Integer.valueOf(pomVar.v));
            pomVar.F(2, 5, 0);
            pomVar.F(1, 9, Boolean.valueOf(pomVar.m));
            pomVar.F(2, 7, polVar);
            pomVar.F(6, 8, polVar);
            eunVar.e();
        } catch (Throwable th3) {
            th = th3;
            pomVar.C.e();
            throw th;
        }
    }

    public static int o(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public static plo t(poq poqVar) {
        return new plo(pts.a >= 28 ? poqVar.c.getStreamMinVolume(poqVar.e) : 0, poqVar.c.getStreamMaxVolume(poqVar.e));
    }

    public final void A(bgw bgwVar) {
        Q();
        if (this.y != bgwVar) {
            return;
        }
        pod r = this.c.r(this.t);
        r.f(7);
        r.e(null);
        r.d();
    }

    @Override // defpackage.poa
    public final void B(pnu pnuVar) {
        Q();
        pme pmeVar = this.c;
        if (pmeVar.u.l.equals(pnuVar)) {
            return;
        }
        pnt d = pmeVar.u.d(pnuVar);
        pmeVar.m++;
        pmeVar.e.a.b(4, pnuVar).b();
        pmeVar.D(d, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void C(int i, int i2) {
        if (i == this.w && i2 == this.x) {
            return;
        }
        this.w = i;
        this.x = i2;
        this.e.ao();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).ao();
        }
    }

    public final void D(pny pnyVar) {
        pse.c(pnyVar);
        this.d.remove(pnyVar);
        this.c.f.e(pnyVar);
    }

    @Override // defpackage.poa
    public final boolean E() {
        Q();
        return this.c.E();
    }

    public final void F(int i, int i2, Object obj) {
        for (poe poeVar : this.b) {
            if (poeVar.ae() == i) {
                pod r = this.c.r(poeVar);
                r.f(i2);
                r.e(obj);
                r.d();
            }
        }
    }

    @Override // defpackage.poa
    public final boolean G() {
        Q();
        return this.c.G();
    }

    public final void H() {
        F(1, 2, Float.valueOf(this.l * this.f.b));
    }

    @Override // defpackage.poa
    public final void I() {
        Q();
    }

    @Override // defpackage.poa
    @Deprecated
    public final void J() {
        Q();
        this.f.e(E());
        this.c.K(null);
        Collections.emptyList();
    }

    public final void K(int i) {
        Q();
        pme pmeVar = this.c;
        if (pmeVar.l != i) {
            pmeVar.l = i;
            pmeVar.e.a.c(11, i, 0).b();
            pmeVar.f.c(8, new plw(i, 0));
            pmeVar.C();
            pmeVar.f.b();
        }
    }

    public final void L(bgw bgwVar) {
        Q();
        this.y = bgwVar;
        pod r = this.c.r(this.t);
        r.f(7);
        r.e(bgwVar);
        r.d();
    }

    public final void M(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (poe poeVar : this.b) {
            if (poeVar.ae() == 2) {
                pod r = this.c.r(poeVar);
                r.f(1);
                r.e(obj);
                r.d();
                arrayList.add(r);
            }
        }
        Object obj2 = this.h;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((pod) it.next()).b(this.u);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.h;
            Surface surface = this.i;
            if (obj3 == surface) {
                surface.release();
                this.i = null;
            }
        }
        this.h = obj;
        if (z) {
            this.c.K(plp.b(new pmp(3), 1003));
        }
    }

    public final void N(Surface surface) {
        Q();
        M(surface);
        C(-1, -1);
    }

    public final void O(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        this.c.A(z2, (!z2 || i == 1) ? 0 : 1, i2);
    }

    public final void P() {
        int l = l();
        if (l == 2 || l == 3) {
            Q();
            boolean z = this.c.u.n;
            E();
            E();
        }
    }

    public final void Q() {
        this.C.b();
        if (Thread.currentThread() != r().getThread()) {
            String D = pts.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (this.z) {
                throw new IllegalStateException(D);
            }
            prh.k("SimpleExoPlayer", D, this.A ? null : new IllegalStateException());
            this.A = true;
        }
    }

    @Deprecated
    public final void R() {
        this.z = false;
    }

    @Override // defpackage.poa
    public final int S() {
        Q();
        pme pmeVar = this.c;
        if (pmeVar.G()) {
            return pmeVar.u.s.b;
        }
        return -1;
    }

    @Override // defpackage.plr
    public final Looper b() {
        return this.c.e.b;
    }

    @Override // defpackage.plr
    public final pod d(poc pocVar) {
        Q();
        return this.c.r(pocVar);
    }

    @Override // defpackage.plr
    public final void e(boolean z) {
        Q();
        this.c.e.a.c(24, z ? 1 : 0, 0).b();
    }

    @Override // defpackage.plr
    public final void f(bbr bbrVar) {
        Q();
        this.c.y(Collections.singletonList(bbrVar), -1, -9223372036854775807L, true);
    }

    @Override // defpackage.plr
    public final void g(boolean z) {
        Q();
        pme pmeVar = this.c;
        if (pmeVar.r == z) {
            return;
        }
        pmeVar.r = z;
        pmeVar.e.a.c(23, z ? 1 : 0, 0).b();
    }

    @Override // defpackage.plr
    public final void i(poi poiVar) {
        Q();
        pme pmeVar = this.c;
        if (poiVar == null) {
            poiVar = poi.c;
        }
        if (pmeVar.q.equals(poiVar)) {
            return;
        }
        pmeVar.q = poiVar;
        pmeVar.e.a.b(5, poiVar).b();
    }

    @Override // defpackage.poa
    public final int j() {
        Q();
        pme pmeVar = this.c;
        if (pmeVar.G()) {
            return pmeVar.u.s.c;
        }
        return -1;
    }

    @Override // defpackage.poa
    public final int k() {
        Q();
        return this.c.k();
    }

    @Override // defpackage.poa
    public final int l() {
        Q();
        return this.c.l();
    }

    @Override // defpackage.poa
    public final int m() {
        Q();
        return this.c.m();
    }

    @Override // defpackage.poa
    public final int n() {
        Q();
        return this.c.l;
    }

    @Override // defpackage.poa
    public final long p() {
        Q();
        return this.c.p();
    }

    @Override // defpackage.poa
    public final long q() {
        Q();
        return this.c.q();
    }

    public final Looper r() {
        return this.c.j;
    }

    @Override // defpackage.poa
    public final pou s() {
        Q();
        return this.c.s();
    }

    public final void u(avm avmVar) {
        pse.c(avmVar);
        this.e.b(avmVar);
    }

    @Override // defpackage.poa
    public final void v() {
        Q();
        boolean E = E();
        int e = this.f.e(E);
        O(E, e, o(E, e));
        pme pmeVar = this.c;
        pnt pntVar = pmeVar.u;
        if (pntVar.d != 1) {
            return;
        }
        pnt c = pntVar.c(null);
        pnt e2 = c.e(true != c.a.z() ? 2 : 4);
        pmeVar.m++;
        pmeVar.e.a.a(0).b();
        pmeVar.D(e2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // defpackage.poa
    public final void w() {
        Q();
        int i = pts.a;
        poq poqVar = this.g;
        pop popVar = poqVar.d;
        if (popVar != null) {
            try {
                poqVar.a.unregisterReceiver(popVar);
            } catch (RuntimeException e) {
                prh.k("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            poqVar.d = null;
        }
        plc plcVar = this.f;
        plcVar.a = null;
        plcVar.a();
        pme pmeVar = this.c;
        String hexString = Integer.toHexString(System.identityHashCode(pmeVar));
        String str = pts.e;
        String a = pmo.a();
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        String.valueOf(a).length();
        if (!pmeVar.e.c()) {
            pmeVar.f.f(10, avd.a);
        }
        pmeVar.f.d();
        ((pto) pmeVar.d).b.removeCallbacksAndMessages(null);
        avk avkVar = pmeVar.i;
        if (avkVar != null) {
            ((bfi) pmeVar.k).h.c(avkVar);
        }
        pmeVar.u = pmeVar.u.e(1);
        pnt pntVar = pmeVar.u;
        pmeVar.u = pntVar.h(pntVar.s);
        pnt pntVar2 = pmeVar.u;
        pntVar2.o = pntVar2.q;
        pmeVar.u.p = 0L;
        final avk avkVar2 = this.e;
        avl a2 = avkVar2.a();
        avkVar2.c.put(1036, a2);
        avkVar2.H(a2, 1036, new avd(3));
        pso psoVar = avkVar2.f;
        pse.d(psoVar);
        psoVar.e(new Runnable() { // from class: avi
            @Override // java.lang.Runnable
            public final void run() {
                avk.this.d.d();
            }
        });
        Surface surface = this.i;
        if (surface != null) {
            surface.release();
            this.i = null;
        }
        if (this.o) {
            ptk ptkVar = this.n;
            pse.c(ptkVar);
            ptkVar.c(0);
            this.o = false;
        }
        Collections.emptyList();
        this.p = true;
    }

    @Override // defpackage.poa
    public final void x(int i, long j) {
        Q();
        avk avkVar = this.e;
        if (!avkVar.g) {
            avl a = avkVar.a();
            avkVar.g = true;
            avkVar.H(a, -1, new avf(a, 1));
        }
        this.c.x(i, j);
    }

    public final void y(pny pnyVar) {
        pse.c(pnyVar);
        this.d.add(pnyVar);
        pse.c(pnyVar);
        this.c.u(pnyVar);
    }

    @Override // defpackage.poa
    public final void z(boolean z) {
        Q();
        plc plcVar = this.f;
        l();
        int e = plcVar.e(z);
        O(z, e, o(z, e));
    }
}
