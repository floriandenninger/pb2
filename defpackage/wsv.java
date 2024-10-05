package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = apae.SLOT_TYPE_IN_PLAYER, d = {xdu.class, xdg.class, xcv.class, xcs.class, xdb.class, xel.class})
/* loaded from: classes4.dex */
public final class wsv implements wsx, wof, woq, xjk {
    private boolean A;
    private final wpv B;
    private final wpl C;
    private final wpn D;
    public final anhy a;
    private final wsw d;
    private final aaea e;
    private final wog f;
    private final xjl g;
    private final wor h;
    private final wni i;
    private final xcl j;
    private final wzq k;
    private final woc l;
    private final ypa m;
    private final Executor n;
    private final aifw o;
    private final xgh p;
    private final xev q;
    private final MediaAd r;
    private final PlayerResponseModel s;
    private final xci t;
    private final xcf u;
    private final xfn v;
    private boolean z;
    private int w = -1;
    private int x = -1;
    final xjp b = xjq.a();
    xjn c = xjn.a;
    private aoxt y = null;

    public wsv(wsw wswVar, aaea aaeaVar, wni wniVar, xcl xclVar, wzq wzqVar, wpn wpnVar, woc wocVar, ypa ypaVar, Executor executor, aifw aifwVar, wpl wplVar, xjl xjlVar, wor worVar, wog wogVar, wpv wpvVar, xgh xghVar, xev xevVar) {
        this.d = wswVar;
        this.e = aaeaVar;
        this.k = wzqVar;
        this.f = wogVar;
        this.B = wpvVar;
        this.C = wplVar;
        this.g = xjlVar;
        this.h = worVar;
        this.i = wniVar;
        this.j = xclVar;
        this.D = wpnVar;
        this.l = wocVar;
        this.m = ypaVar;
        this.n = executor;
        this.o = aifwVar;
        this.p = xghVar;
        this.q = xevVar;
        this.a = (anhy) xghVar.d(xel.class);
        this.r = (MediaAd) xghVar.d(xdu.class);
        this.s = (PlayerResponseModel) xghVar.d(xdg.class);
        this.t = (xci) xghVar.d(xcv.class);
        this.u = (xcf) xghVar.d(xcs.class);
        this.v = (xfn) xghVar.d(xdb.class);
    }

    private final void l() {
        if (wsl.h(this.c)) {
            this.D.a(new acqx(this.c.d));
            this.c = wsl.f(this.c);
        }
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
        apbs k = wbs.k(this.e);
        if ((k == null || !k.g) && TextUtils.isEmpty(this.r.n())) {
            this.d.d(this.p, this.q, new wxd("Got a non-yt hosted layout"));
        }
    }

    @Override // defpackage.xjk
    public final void c(Bundle bundle) {
        aoxt aoxtVar;
        xhx a = this.g.a();
        if (a == null) {
            return;
        }
        apxf G = this.r.G();
        if (G == null && (aoxtVar = this.y) != null && (G = aoxtVar.i) == null) {
            G = apxf.a;
        }
        if (G == null) {
            return;
        }
        adz adzVar = new adz(2);
        if (bundle != null) {
            adzVar.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
        this.C.c(G, adzVar);
    }

    @Override // defpackage.xjk
    public final void d() {
        aoxt aoxtVar;
        adz adzVar = new adz(1);
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.g.a());
        if (this.r.t() != null || this.r.x() != null) {
            this.l.h();
            if (this.i.j) {
                this.m.d(new xac());
            }
            apbs k = wbs.k(this.e);
            if (k != null && k.l && (aoxtVar = this.y) != null && (aoxtVar.b & 8) != 0) {
                aqyg aqygVar = aoxtVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                if (aqygVar.c.size() > 0) {
                    aqyg aqygVar2 = this.y.e;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    if ((((aqyi) aqygVar2.c.get(0)).b & 512) != 0) {
                        wpl wplVar = this.C;
                        aqyg aqygVar3 = this.y.e;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        apxf apxfVar = ((aqyi) aqygVar3.c.get(0)).m;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        wplVar.c(apxfVar, adzVar);
                    }
                }
            }
            aoxt aoxtVar2 = this.y;
            if (aoxtVar2 == null || (aoxtVar2.b & 16) == 0) {
                if (this.r.x() != null) {
                    this.C.c(this.r.x(), adzVar);
                } else {
                    this.C.c(aahg.f(this.r.t()), adzVar);
                }
            } else {
                wpl wplVar2 = this.C;
                apxf apxfVar2 = aoxtVar2.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                wplVar2.c(apxfVar2, adzVar);
            }
        }
        if (!wbs.y(this.e) || this.r.u() == null) {
            return;
        }
        this.C.a(this.r.u().i, null);
    }

    @Override // defpackage.xjk
    public final void e() {
        if (this.r.g() == null) {
            whu.m(this.p, this.q, "AdOverflowMenuClicked but MediaAd had no PlayerResponseModel.");
            return;
        }
        xhx a = this.g.a();
        aoxs m = this.r.g().m();
        if (a == null || (m.b & 1) == 0) {
            return;
        }
        adz adzVar = new adz(1);
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
        wpl wplVar = this.C;
        apxf apxfVar = m.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        wplVar.c(apxfVar, adzVar);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r8 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r8 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r8 != false) goto L21;
     */
    @Override // defpackage.xjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r8) {
        /*
            r7 = this;
            xjp r0 = r7.b
            xjy r0 = r0.d()
            aplp r0 = r0.f
            if (r0 != 0) goto L14
            xgh r8 = r7.p
            xev r0 = r7.q
            java.lang.String r1 = "BrandInteraction tapped but no renderer available"
            defpackage.whu.m(r8, r0, r1)
            return
        L14:
            int r1 = r0.c
            r2 = 20
            if (r1 != r2) goto L2f
            ypa r1 = r7.m
            java.lang.Object r0 = r0.d
            aulq r0 = (defpackage.aulq) r0
            aonk r2 = com.google.protos.youtube.api.innertube.NotificationActionRendererOuterClass.notificationActionRenderer
            java.lang.Object r0 = r0.pX(r2)
            atnc r0 = (defpackage.atnc) r0
            aaci r0 = defpackage.aaci.a(r0)
            r1.d(r0)
        L2f:
            xjp r0 = r7.b
            xjy r1 = r0.d()
            xjx r2 = r1.a()
            r3 = 0
            r2.e(r3)
            int r1 = r1.g
            int r3 = r1 + (-1)
            if (r1 == 0) goto L6e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L54
            if (r3 == r6) goto L50
            if (r3 == r5) goto L4d
            goto L59
        L4d:
            if (r8 == 0) goto L52
            goto L56
        L50:
            if (r8 == 0) goto L58
        L52:
            r1 = 1
            goto L59
        L54:
            if (r8 == 0) goto L58
        L56:
            r1 = 2
            goto L59
        L58:
            r1 = 3
        L59:
            r2.b(r1)
            xjy r8 = r2.a()
            r0.g = r8
            xjl r8 = r7.g
            xjp r0 = r7.b
            xjq r0 = r0.a()
            r8.p(r0)
            return
        L6e:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsv.g(boolean):void");
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.xjk
    public final void i(xiv xivVar) {
        if (xivVar != xiv.HIDE) {
            if (xivVar == xiv.SKIP) {
                this.z = false;
                this.t.e();
                return;
            }
            return;
        }
        this.z = true;
        this.B.a.a();
        aiwk aiwkVar = this.B.a.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.y();
    }

    public final void j(anhy anhyVar) {
        if (this.A) {
            return;
        }
        try {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anhyVar.get();
            if (watchNextResponseModel == null) {
                return;
            }
            aseo aseoVar = watchNextResponseModel.a.f;
            if (aseoVar == null) {
                aseoVar = aseo.a;
            }
            aoxt aoxtVar = null;
            aoxt aoxtVar2 = aseoVar.b == 62960614 ? (aoxt) aseoVar.c : null;
            if (aoxtVar2 != null || this.r.x() != null || this.r.t() != null || this.r.G() != null) {
                aoxtVar = aoxtVar2 == null ? aoxt.a : aoxtVar2;
            }
            this.y = aoxtVar;
            if (aoxtVar != null) {
                if (wcy.d(this.b, aoxtVar, this.r.t(), this.r.x())) {
                    this.g.p(this.b.a());
                }
                if (this.r.G() != null || (this.y.b & 16384) != 0) {
                    xjp xjpVar = this.b;
                    xjr a = xjpVar.b().a();
                    a.c(true);
                    xjpVar.c = a.a();
                }
            }
            if (this.r.g() == null) {
                whu.m(this.p, this.q, "Expected MediaAd PlayerResponseModel not to be null.");
                return;
            }
            if (this.r.g().m() != null && (this.r.g().m().b & 1) != 0) {
                this.b.m(true);
            }
            this.g.g(this.y);
            this.g.p(this.b.a());
        } catch (Exception e) {
            whu.m(this.p, this.q, e.toString());
        }
    }

    @Override // defpackage.xjk
    public final void k() {
        xjp xjpVar = this.b;
        xjt a = xjpVar.c().a();
        a.b(false);
        xjpVar.f = a.a();
        xjp xjpVar2 = this.b;
        xjx a2 = xjpVar2.d().a();
        a2.c(false);
        xjpVar2.g = a2.a();
        this.g.p(this.b.a());
    }

    @Override // defpackage.xjk
    public final void p() {
        xci xciVar;
        if (this.b.f().d != 1 || (xciVar = this.t) == null) {
            xgh xghVar = this.p;
            xev xevVar = this.q;
            int i = this.b.f().d;
            StringBuilder sb = new StringBuilder(65);
            sb.append("Skip ad was clicked but unable to process. skipState: ");
            sb.append(i);
            whu.m(xghVar, xevVar, sb.toString());
            return;
        }
        xciVar.d(this.w, this.x);
    }

    @Override // defpackage.xjk
    public final void q(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        xjp xjpVar = this.b;
        boolean z5 = xjpVar.f().k;
        boolean z6 = true;
        boolean z7 = aigfVar2 == aigf.FULLSCREEN;
        if (z5 == z7) {
            z3 = false;
        } else {
            xkc a = xjpVar.f().a();
            a.h(z7);
            xjpVar.a = a.a();
            z3 = true;
        }
        xjp xjpVar2 = this.b;
        boolean z8 = xjpVar2.d().e;
        boolean z9 = aigfVar2 == aigf.FULLSCREEN;
        if (z8 == z9) {
            z4 = false;
        } else {
            xjx a2 = xjpVar2.d().a();
            a2.f(z9);
            xjpVar2.g = a2.a();
            z4 = true;
        }
        xjp xjpVar3 = this.b;
        boolean z10 = xjpVar3.c().c;
        boolean z11 = aigfVar2 == aigf.FULLSCREEN;
        if (z10 == z11) {
            z6 = false;
        } else {
            xjt a3 = xjpVar3.c().a();
            a3.e(z11);
            xjpVar3.f = a3.a();
        }
        if (z3 || z4 || z6) {
            this.g.p(this.b.a());
        }
        xjn c = wsl.c(this.c, aigfVar);
        this.c = c;
        if (c.j) {
            this.h.r(c.k, c.g);
            l();
        }
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        int i = (int) j;
        int i2 = (int) j3;
        xjp xjpVar = this.b;
        xjpVar.i(i);
        xjpVar.h((int) j2);
        xjpVar.j(i2);
        xjp xjpVar2 = this.b;
        xjr a = xjpVar2.b().a();
        a.d(i2 - i);
        xjpVar2.c = a.a();
        if (whl.k(this.b, this.s.c(), this.r.c(), i)) {
            this.l.m();
            this.g.h(new xae(1, this.t));
        }
        this.g.p(this.b.a());
        xjn a2 = wsl.a(this.c, j);
        this.c = a2;
        if (a2.j) {
            this.h.r(a2.k, a2.g);
            l();
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
        this.g.l(this);
        this.f.c(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        aomf aomfVar;
        try {
            this.g.c(this);
            if (wbs.o(this.e)) {
                this.h.o(this);
            }
            this.f.a(this);
            whl.i(this.b, this.j, this.r.y(), this.u, this.s, this.r.g(), this.v, this.r.ae(), this.r.c());
            xjp xjpVar = this.b;
            aigf g = this.o.g();
            apmg w = this.r.w();
            PlayerResponseModel g2 = this.r.g();
            if (w != null) {
                xjt b = xju.b();
                b.f(w);
                b.d(true);
                if (g2 != null) {
                    aryr aryrVar = g2.a;
                    b.b(wbs.E(aryrVar.o) != null);
                    b.c((aryrVar.b & 536870912) != 0);
                }
                b.e(g == aigf.FULLSCREEN);
                xjpVar.f = b.a();
            }
            xjp xjpVar2 = this.b;
            aigf g3 = this.o.g();
            aplp v = this.r.v();
            PlayerResponseModel g4 = this.r.g();
            boolean z = v != null;
            xjx b2 = xjy.b();
            if (z) {
                b2.h(v);
            }
            if (g4 != null) {
                aryr aryrVar2 = g4.a;
                b2.c(wbs.E(aryrVar2.o) != null);
                b2.d((aryrVar2.b & 536870912) != 0);
            }
            b2.f(g3 == aigf.FULLSCREEN);
            b2.e(z);
            b2.g(!z);
            xjpVar2.g = b2.a();
            xjp xjpVar3 = this.b;
            xcf xcfVar = this.u;
            xjr b3 = xjs.b();
            b3.b(xcfVar);
            xjpVar3.c = b3.a();
            wcy.e(this.b);
            xjp xjpVar4 = this.b;
            MediaAd mediaAd = this.r;
            if (mediaAd instanceof LocalVideoAd) {
                LocalVideoAd localVideoAd = (LocalVideoAd) mediaAd;
                aomfVar = localVideoAd.k() != null ? localVideoAd.k().i : aomf.b;
            } else {
                aomfVar = aomf.b;
            }
            xjpVar4.n(aomfVar);
            if (this.q.i.h()) {
                xjp xjpVar5 = this.b;
                aone createBuilder = asht.a.createBuilder();
                ashd ashdVar = (ashd) this.q.i.c();
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashtVar.t = ashdVar;
                ashtVar.c |= 1024;
                xjpVar5.l((asht) createBuilder.build());
            }
            this.g.h(new xae(this.b.f().d, this.t));
            this.g.p(this.b.a());
            if (wbs.o(this.e) && (this.r.g().a.b & 536870912) != 0) {
                aigf g5 = this.o.g();
                argp argpVar = this.r.g().a.D;
                if (argpVar == null) {
                    argpVar = argp.a;
                }
                xjn d = wsl.d(g5, argpVar);
                this.c = d;
                if (d.b.h()) {
                    this.h.p((aooy) this.c.b.c());
                    this.h.q(false);
                }
            }
            if (this.a.isDone()) {
                j(this.a);
            } else {
                this.a.d(new Runnable() { // from class: wsu
                    @Override // java.lang.Runnable
                    public final void run() {
                        wsv wsvVar = wsv.this;
                        wsvVar.j(wsvVar.a);
                    }
                }, this.n);
            }
            this.d.a(this.p, this.q);
        } catch (wnw e) {
            this.d.d(this.p, this.q, new wxd(e.getMessage()));
        }
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.A = true;
        wsl.g(this.c, this.k);
        if (this.z) {
            this.m.d(new xhu(1));
        }
        this.g.h(new xae(3, xci.e));
        this.b.k();
        this.g.p(this.b.a());
        this.h.k();
        this.g.l(this);
        this.f.c(this);
        this.d.e(this.p, this.q, i);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.woq
    public final void qx(Object obj, List list) {
        if (this.k.d(obj)) {
            if (wbs.v(this.e)) {
                whu.l(this.p, "CTA Exp: click is blocked by debounce.");
            }
        } else {
            this.c = wsl.b(this.c, obj);
            this.C.a(list, acrc.i(obj, false));
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.xjk
    public final void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        if (rect2 != null) {
            this.l.n(yjk.P(displayMetrics, rect2.left - rect.left), yjk.P(displayMetrics, rect2.top - rect.top), yjk.P(displayMetrics, rect2.width()), yjk.P(displayMetrics, rect2.height()));
        }
    }

    @Override // defpackage.xjk
    public final void t(boolean z) {
        xjp xjpVar = this.b;
        if (z == xjpVar.e().a) {
            return;
        }
        xka e = xjpVar.e();
        xjz a = xka.a();
        a.c(e.a);
        a.b(e.b);
        a.d(e.c);
        a.c(z);
        xjpVar.d = a.a();
        this.g.p(this.b.a());
    }

    @Override // defpackage.xjk
    public final void u(boolean z) {
        if (whl.j(this.b, z)) {
            this.g.p(this.b.a());
        }
    }
}
