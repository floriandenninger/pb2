package com.google.android.apps.youtube.app.ui.inline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.acqz;
import defpackage.ahdo;
import defpackage.ahef;
import defpackage.aign;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.aixh;
import defpackage.ajog;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.arhn;
import defpackage.arib;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azrw;
import defpackage.evr;
import defpackage.fbh;
import defpackage.fbj;
import defpackage.fbk;
import defpackage.fbl;
import defpackage.fbm;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.fkw;
import defpackage.fla;
import defpackage.flx;
import defpackage.gfq;
import defpackage.gfr;
import defpackage.gfy;
import defpackage.gfz;
import defpackage.gga;
import defpackage.gge;
import defpackage.ggf;
import defpackage.gof;
import defpackage.goi;
import defpackage.jbz;
import defpackage.kdc;
import defpackage.ktf;
import defpackage.lo;
import defpackage.mgu;
import defpackage.mhc;
import defpackage.mhe;
import defpackage.mhg;
import defpackage.mhi;
import defpackage.mhk;
import defpackage.mhv;
import defpackage.mia;
import defpackage.mib;
import defpackage.mic;
import defpackage.mif;
import defpackage.okf;
import defpackage.ypd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlaybackController extends lo implements View.OnClickListener, gge, ggf, fgp, aioa, any, ypd {
    private goi A;
    public final fgq a;
    public final mic b;
    public final mhg c;
    public final mib d;
    public gfr e;
    public mhv f;
    azrw g;
    public gga h;
    private final ScrollSelectionController i;
    private final gfy j;
    private final flx k;
    private final okf l;
    private final kdc m;
    private final aaea n;
    private final jbz o;
    private final InlinePlaybackLifecycleController p;
    private final mhk q;
    private final fbm r;
    private final LoopController s;
    private final mhe t;
    private final azrw u;
    private final acqz v;
    private final Set w;
    private boolean x;
    private boolean y = true;
    private final aadw z;

    public InlinePlaybackController(ScrollSelectionController scrollSelectionController, gfz gfzVar, gfy gfyVar, flx flxVar, okf okfVar, fgq fgqVar, mhi mhiVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mhg mhgVar, mif mifVar, mhk mhkVar, DefaultInlinePlayerControls defaultInlinePlayerControls, kdc kdcVar, mgu mguVar, aaea aaeaVar, jbz jbzVar, mhc mhcVar, fbm fbmVar, azrw azrwVar, LoopController loopController, mhe mheVar, azrw azrwVar2, acqz acqzVar, aadw aadwVar) {
        this.i = scrollSelectionController;
        this.m = kdcVar;
        this.j = gfyVar;
        this.k = flxVar;
        this.l = okfVar;
        this.a = fgqVar;
        this.p = inlinePlaybackLifecycleController;
        this.c = mhgVar;
        this.q = mhkVar;
        this.b = defaultInlinePlayerControls;
        this.n = aaeaVar;
        this.o = jbzVar;
        this.r = fbmVar;
        this.z = aadwVar;
        mib mibVar = new mib(this);
        this.d = mibVar;
        this.A = new goi(mibVar);
        this.g = azrwVar;
        this.s = loopController;
        this.t = mheVar;
        this.u = azrwVar2;
        this.v = acqzVar;
        HashSet hashSet = new HashSet();
        this.w = hashSet;
        hashSet.add(mhcVar);
        inlinePlaybackLifecycleController.l(this);
        inlinePlaybackLifecycleController.l(mhiVar);
        inlinePlaybackLifecycleController.l(mhgVar);
        inlinePlaybackLifecycleController.m(this);
        inlinePlaybackLifecycleController.m(defaultInlinePlayerControls);
        inlinePlaybackLifecycleController.m(mifVar);
        inlinePlaybackLifecycleController.m(mhkVar);
        inlinePlaybackLifecycleController.m(mguVar);
        inlinePlaybackLifecycleController.m(mhcVar);
        inlinePlaybackLifecycleController.m(mhiVar);
        fgqVar.i(this);
        fgqVar.i(mifVar);
        gfzVar.e.add(mhkVar);
    }

    private final void v() {
        this.A.a();
        gga ggaVar = this.h;
        if (ggaVar != null) {
            ggaVar.a();
            this.h = null;
        }
    }

    private final void w() {
        aixh k = this.b.k();
        if (k == null || this.f == null || k.b() - this.f.a().c() <= evr.t(this.n)) {
            return;
        }
        this.m.i();
    }

    private final boolean x() {
        mhv mhvVar = this.f;
        if (mhvVar == null) {
            return false;
        }
        arhn arhnVar = mhvVar.a.a().a;
        return arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED || arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION;
    }

    private final boolean y() {
        return this.a.g().d() && this.f != null;
    }

    private final boolean z(final int i, boolean z, gga ggaVar) {
        v();
        if ((i == 0 || i == 1) && !z && this.x) {
            this.h = ggaVar;
            this.A.c(new Runnable() { // from class: mhz
                @Override // java.lang.Runnable
                public final void run() {
                    InlinePlaybackController inlinePlaybackController = InlinePlaybackController.this;
                    int i2 = i;
                    mhv mhvVar = inlinePlaybackController.f;
                    if (mhvVar != null) {
                        mhvVar.b(i2, false);
                        gga ggaVar2 = inlinePlaybackController.h;
                        if (ggaVar2 != null) {
                            ggaVar2.a();
                            inlinePlaybackController.h = null;
                        }
                    }
                }
            }, 1000L);
            return false;
        }
        this.f.b(i, z);
        return true;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        boolean z = i == 2;
        this.x = z;
        if (z) {
            return;
        }
        this.A.b();
    }

    @Override // defpackage.ggf
    public final void g(gfq gfqVar) {
        k();
    }

    @Override // defpackage.ggf
    public final boolean j(gfq gfqVar, int i, gga ggaVar) {
        if (i == 0) {
            this.d.post(new Runnable() { // from class: mhy
                @Override // java.lang.Runnable
                public final void run() {
                    InlinePlaybackController.this.k();
                }
            });
        } else if (i == 3 && this.e != null && y()) {
            int g = this.p.g(gfqVar.b);
            boolean f = this.j.f();
            this.e.h();
            boolean z = g == 1 || (f && !(evr.aC(this.z) && gfqVar.b.a().d == arib.INLINE_PLAYBACK_TRIGGER_STYLE_USER));
            if (this.a.g().d() && z) {
                return z(g != 1 ? 0 : 2, this.p.g(gfqVar.b) == 2, ggaVar);
            }
        }
        return true;
    }

    public final void k() {
        mhv mhvVar = this.f;
        if (mhvVar == null) {
            return;
        }
        if (mhvVar.c) {
            w();
            if (y()) {
                this.b.r(this.f.a());
            }
        }
        if (x()) {
            this.y = this.f.d;
        }
        v();
        this.f = null;
        if (this.a.g().d()) {
            this.l.h(false);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: mhx
            public final /* synthetic */ InlinePlaybackController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.l((ahdo) obj);
                } else {
                    this.a.p((ahef) obj);
                }
            }
        }, ktf.o), aiocVar.t().d.Y(new ayrs(this) { // from class: mhx
            public final /* synthetic */ InlinePlaybackController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.l((ahdo) obj);
                } else {
                    this.a.p((ahef) obj);
                }
            }
        }, ktf.o)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdo.class, ahef.class};
        }
        if (i == 0) {
            l((ahdo) obj);
            return null;
        }
        if (i == 1) {
            p((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l(ahdo ahdoVar) {
        boolean a = ahdoVar.a();
        this.y = a;
        mhv mhvVar = this.f;
        if (mhvVar != null) {
            mhvVar.d = a;
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.w.clear();
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        boolean z;
        if (((fla) this.g.get()).b == fkw.WATCH_WHILE) {
            if (i2 == 0) {
                fbm fbmVar = this.r;
                if (evr.P(fbmVar.b)) {
                    fbmVar.a.d(new fbh());
                }
            } else if (i2 == 1) {
                fbm fbmVar2 = this.r;
                if (evr.P(fbmVar2.b)) {
                    fbmVar2.a.d(new fbl());
                }
            } else if (i2 == 2) {
                fbm fbmVar3 = this.r;
                if (evr.P(fbmVar3.b)) {
                    fbmVar3.a.d(new fbk());
                }
            } else if (i2 == 3) {
                fbm fbmVar4 = this.r;
                if (evr.P(fbmVar4.b)) {
                    fbmVar4.a.d(new fbj());
                }
            }
            if (i2 == 1) {
                gof gofVar = gfqVar.b;
                this.f = new mhv(this.k, this.b, gofVar);
                if (x()) {
                    mhv mhvVar = this.f;
                    boolean z2 = this.y;
                    mhvVar.d = z2;
                    this.t.b(z2);
                    z = this.y;
                } else {
                    this.t.b(true);
                    z = true;
                }
                Iterator it = this.w.iterator();
                while (it.hasNext()) {
                    ((mia) it.next()).a(z);
                }
                if (this.p.g(gofVar) == 1 || this.a.g().c()) {
                    if (this.f.a.j() || this.f.a.i()) {
                        this.l.h(false);
                    }
                }
            }
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        this.o.a = fhgVar2.d();
        if (this.e == null) {
            return;
        }
        if (!fhgVar2.b() || !this.e.e()) {
            this.e.d();
        } else {
            this.e.c();
        }
        if (this.f == null || !fhgVar.d() || fhgVar2.d()) {
            return;
        }
        v();
        w();
        this.f.c();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s(!this.b.t());
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public final void p(ahef ahefVar) {
        if (y()) {
            mhv mhvVar = this.f;
            if (mhvVar.c && mhvVar.d() && this.e != null && this.j.f() && ahefVar.c() == aign.ENDED && !this.s.c) {
                this.e.g();
            }
        }
    }

    public final void q(Map map) {
        mhv mhvVar = this.f;
        if (mhvVar != null) {
            final gof gofVar = mhvVar.a;
            apxf c = gofVar.c();
            if (this.c.b(gofVar, (aahd) this.u.get(), this.v.mM(), map, new ajog() { // from class: mhw
                @Override // defpackage.ajog
                public final void oh(Map map2) {
                    InlinePlaybackController inlinePlaybackController = InlinePlaybackController.this;
                    inlinePlaybackController.c.a(gofVar, map2);
                }
            })) {
                return;
            }
            ((aahd) this.u.get()).c(this.v.mM().h(c), map);
        }
    }

    public final void r(gfr gfrVar) {
        gfr gfrVar2 = this.e;
        if (gfrVar2 != gfrVar) {
            if (gfrVar2 != null) {
                ((RecyclerView) gfrVar2.a()).aF(this);
            }
            if (gfrVar != null) {
                ((RecyclerView) gfrVar.a()).aD(this);
            }
            gfr gfrVar3 = this.e;
            if (gfrVar3 != null) {
                gfrVar3.b(false);
            }
            this.p.p();
            this.e = gfrVar;
            this.i.i(gfrVar);
            this.q.g = gfrVar;
            if (gfrVar != null) {
                gfrVar.b(true);
            }
        }
    }

    public final void s(boolean z) {
        if (y()) {
            if (!z) {
                v();
                mhv mhvVar = this.f;
                if (mhvVar == null || !mhvVar.c) {
                    return;
                }
                mhvVar.b.p();
                return;
            }
            z(2, false, null);
        }
    }

    public final void t(gfr gfrVar) {
        if (this.e == gfrVar) {
            r(null);
        }
    }

    public final boolean u() {
        mhv mhvVar = this.f;
        return mhvVar != null && mhvVar.d;
    }
}
