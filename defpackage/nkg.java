package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkg implements nka {
    public final Activity a;
    public final gjz b;
    public final dd c;
    public final acqz d;
    public final gfz e;
    public final gje f;
    public final fgq g;
    public final zaz h;
    public final azrs i = azrh.e().aT();
    public final nkf j;
    public SwipeToContainerFrameLayout k;
    public FrameLayout l;
    public apxf m;
    public boolean n;
    public apxf o;
    public boolean p;
    public htu q;
    public Object r;
    public final ygc s;
    public final gjr t;
    private final SharedPreferences u;
    private final fgn v;
    private final ainy w;
    private final aypn x;

    public nkg(ml mlVar, SharedPreferences sharedPreferences, gjz gjzVar, dd ddVar, gfz gfzVar, acqz acqzVar, fgq fgqVar, gje gjeVar, fxj fxjVar, zaz zazVar, fgn fgnVar, gjr gjrVar, ygc ygcVar, ainy ainyVar, aioc aiocVar) {
        mlVar.getSavedStateRegistry().b("swipe_to_camera_bundle", new bub() { // from class: nkb
            @Override // defpackage.bub
            public final Bundle a() {
                nkg nkgVar = nkg.this;
                Bundle bundle = new Bundle(1);
                apxf apxfVar = nkgVar.m;
                if (apxfVar != null) {
                    bundle.putByteArray("on_swipe_left_endpoint", apxfVar.toByteArray());
                }
                return bundle;
            }
        });
        Bundle a = mlVar.getSavedStateRegistry().a("swipe_to_camera_bundle");
        this.a = mlVar;
        this.u = sharedPreferences;
        this.b = gjzVar;
        this.c = ddVar;
        this.e = gfzVar;
        this.d = acqzVar;
        this.g = fgqVar;
        this.f = gjeVar;
        this.h = zazVar;
        apxf apxfVar = null;
        byte[] byteArray = a != null ? a.getByteArray("on_swipe_left_endpoint") : null;
        if (byteArray != null) {
            try {
                apxfVar = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
            } catch (aoob unused) {
            }
        }
        this.m = apxfVar;
        this.v = fgnVar;
        this.j = new nkf(this);
        this.t = gjrVar;
        this.s = ygcVar;
        this.w = ainyVar;
        this.x = aiocVar.aa();
        fxjVar.g(new nke(this));
    }

    private final void u() {
        if (this.m == null) {
            FrameLayout frameLayout = this.l;
            if (frameLayout != null) {
                SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
                swipeToContainerFrameLayout.f = null;
                swipeToContainerFrameLayout.removeView(frameLayout);
                this.l = null;
                return;
            }
            return;
        }
        if (this.l == null) {
            SwipeToContainerFrameLayout swipeToContainerFrameLayout2 = this.k;
            if (swipeToContainerFrameLayout2.h) {
                swipeToContainerFrameLayout2.f = this;
                LayoutInflater.from(this.a).inflate(R.layout.swipe_to_camera_container, this.k);
                this.l = (FrameLayout) this.k.findViewById(R.id.swipe_to_camera_container);
            }
        }
    }

    @Override // defpackage.fgr
    public final boolean a(apxf apxfVar) {
        this.o = apxfVar;
        return this.l != null && this.k.f();
    }

    @Override // defpackage.nka
    public final dd b() {
        htu htuVar = this.q;
        if (htuVar == null) {
            return null;
        }
        return htuVar.mN();
    }

    @Override // defpackage.htw
    public final void c() {
        this.p = true;
        t();
    }

    @Override // defpackage.nka
    public final aypy d() {
        return this.i.U();
    }

    @Override // defpackage.nka
    public final void e() {
        this.k = (SwipeToContainerFrameLayout) this.a.findViewById(R.id.slim_status_bar_player_container);
        this.j.a();
        this.i.c(new dsm(1));
        u();
        if (this.k.h) {
            htu htuVar = (htu) this.c.f("creation_fragment");
            this.q = htuVar;
            if (htuVar != null) {
                htuVar.ar = this;
                this.r = this.t.c(1);
            }
        }
        final nkf nkfVar = this.j;
        nkfVar.getClass();
        final ayrm ayrmVar = new ayrm() { // from class: nkc
            @Override // defpackage.ayrm
            public final void a() {
                nkf.this.run();
            }
        };
        this.x.A(mmt.g).s(niy.c).X(new ayrs() { // from class: nkd
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ayrm.this.a();
            }
        });
    }

    @Override // defpackage.htw
    public final void f() {
        this.h.o(2);
    }

    @Override // defpackage.nka
    public final void g(apxf apxfVar) {
        if (!htu.bc(apxfVar)) {
            this.m = null;
            t();
            u();
            return;
        }
        this.m = apxfVar;
        u();
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
        if (swipeToContainerFrameLayout.h) {
            return;
        }
        SharedPreferences sharedPreferences = this.u;
        if (swipeToContainerFrameLayout.i || sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean("enable_swipe_container", true).apply();
        swipeToContainerFrameLayout.i = true;
    }

    @Override // defpackage.nka
    public final void h(Rect rect) {
        this.k.g.set(rect);
    }

    @Override // defpackage.nka
    public final void i(int i, int i2, int i3, int i4) {
        if (this.l == null) {
            return;
        }
        if (this.v.b() == null || this.v.b().d() == 0) {
            i2 = 0;
        }
        this.l.setPadding(i, i2, i3, i4);
    }

    @Override // defpackage.nka
    public final boolean j() {
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
        return swipeToContainerFrameLayout != null && swipeToContainerFrameLayout.h;
    }

    @Override // defpackage.nka
    public final boolean k() {
        htu htuVar = this.q;
        return htuVar == null ? t() : htuVar.be();
    }

    @Override // defpackage.nka
    public final boolean l(int i, KeyEvent keyEvent) {
        htu htuVar;
        return this.n && (htuVar = this.q) != null && htuVar.aq.a(i, keyEvent);
    }

    @Override // defpackage.nka
    public final boolean m(int i) {
        htu htuVar;
        return this.n && (htuVar = this.q) != null && htuVar.aq.b(i);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar != fhg.NONE) {
            t();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.nka
    public final boolean p(int i) {
        htu htuVar;
        return this.n && (htuVar = this.q) != null && htuVar.aq.c(i);
    }

    public final void q(int i, float f) {
        nkf nkfVar = this.j;
        nkfVar.d = i;
        nkfVar.c = f;
        nkfVar.a = true;
        if (this.q == null) {
            this.b.h(3);
            this.r = this.t.c(1);
            this.e.g(2);
        }
        if (this.w.N()) {
            return;
        }
        this.j.run();
    }

    @Override // defpackage.nkh
    public final void r(int i, float f) {
        s(f >= 0.5f);
        q(i, f);
    }

    public final void s(boolean z) {
        this.h.k(true == z ? 2 : 1);
    }

    public final boolean t() {
        return this.l != null && this.k.c();
    }
}
