package com.google.android.libraries.youtube.player.features.overlay.live;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Spanned;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.youtube.R;
import defpackage.aahd;
import defpackage.ahbw;
import defpackage.ahbz;
import defpackage.ahcx;
import defpackage.ahef;
import defpackage.aheg;
import defpackage.ahej;
import defpackage.ahfo;
import defpackage.ahvx;
import defpackage.ahvy;
import defpackage.ahwb;
import defpackage.ahwf;
import defpackage.ahwg;
import defpackage.ahwh;
import defpackage.aigf;
import defpackage.aign;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.ajae;
import defpackage.ajjz;
import defpackage.ajm;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aony;
import defpackage.apmg;
import defpackage.apmh;
import defpackage.apmp;
import defpackage.apxf;
import defpackage.arfr;
import defpackage.arfs;
import defpackage.aryc;
import defpackage.aryi;
import defpackage.astf;
import defpackage.asth;
import defpackage.asti;
import defpackage.avgg;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azre;
import defpackage.shf;
import defpackage.ykl;
import defpackage.ypd;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveOverlayPresenter implements any, ahvx, ykl, aioa, ypd {
    public final ahvy a;
    public final Resources b;
    public final ajm c;
    public final ScheduledExecutorService d;
    public final ajae e;
    public final ayrs f;
    public final shf g;
    public final ahwg h;
    public astf i;
    public ayqx j;
    public boolean k;
    public boolean l;
    public PlayerResponseModel m;
    public aign n;
    private final Executor o;
    private final ajjz p;
    private final Runnable q;
    private final Runnable r;
    private final aahd s;
    private final ahwh t;
    private Future u;
    private long v;
    private long w;
    private int x;

    public LiveOverlayPresenter(Context context, ahvy ahvyVar, ajae ajaeVar, Executor executor, ajjz ajjzVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, aahd aahdVar, ahwh ahwhVar) {
        ahvyVar.getClass();
        this.a = ahvyVar;
        executor.getClass();
        this.o = executor;
        ajjzVar.getClass();
        this.p = ajjzVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        ajaeVar.getClass();
        this.e = ajaeVar;
        shfVar.getClass();
        this.g = shfVar;
        this.s = aahdVar;
        this.b = context.getResources();
        this.t = ahwhVar;
        this.c = ajm.a();
        this.f = new ahwf(this, 6);
        this.q = new Runnable() { // from class: ahwa
            @Override // java.lang.Runnable
            public final void run() {
                aqyg aqygVar;
                aqyg aqygVar2;
                aqyg aqygVar3;
                aqyg aqygVar4;
                LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                astf astfVar = liveOverlayPresenter.i;
                if (astfVar != null) {
                    aqyg aqygVar5 = null;
                    if ((astfVar.b & 4) != 0) {
                        aqygVar = astfVar.d;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    CharSequence b = ajcq.b(aqygVar);
                    if ((astfVar.b & 2) != 0) {
                        long max = Math.max(0L, astfVar.c - TimeUnit.MILLISECONDS.toSeconds(liveOverlayPresenter.g.c()));
                        String b2 = liveOverlayPresenter.c.b(String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(TimeUnit.SECONDS.toMinutes(max)), Long.valueOf(max % 60)));
                        if (liveOverlayPresenter.l) {
                            String valueOf = String.valueOf(b.toString().split("\\d", -1)[0]);
                            String valueOf2 = String.valueOf(b2);
                            b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            b = liveOverlayPresenter.b.getString(R.string.live_event_starts_in, b2);
                        }
                    }
                    apmp s = LiveOverlayPresenter.s(astfVar);
                    if (s == null) {
                        if ((astfVar.b & 8) != 0) {
                            aqygVar2 = astfVar.e;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        Spanned b3 = ajcq.b(aqygVar2);
                        liveOverlayPresenter.a.t(b, b3, false, null, 0, null, 0);
                        apmg t = LiveOverlayPresenter.t(astfVar);
                        if (t != null) {
                            ahvy ahvyVar2 = liveOverlayPresenter.a;
                            if ((t.b & 256) != 0 && (aqygVar5 = t.i) == null) {
                                aqygVar5 = aqyg.a;
                            }
                            ahvyVar2.v(b, b3, ajcq.b(aqygVar5));
                        }
                    } else {
                        ahvy ahvyVar3 = liveOverlayPresenter.a;
                        if ((astfVar.b & 8) != 0) {
                            aqygVar3 = astfVar.e;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                        } else {
                            aqygVar3 = null;
                        }
                        Spanned b4 = ajcq.b(aqygVar3);
                        boolean z = s.e;
                        if ((s.b & 64) != 0) {
                            aqygVar4 = s.h;
                            if (aqygVar4 == null) {
                                aqygVar4 = aqyg.a;
                            }
                        } else {
                            aqygVar4 = null;
                        }
                        Spanned b5 = ajcq.b(aqygVar4);
                        arfs arfsVar = s.g;
                        if (arfsVar == null) {
                            arfsVar = arfs.a;
                        }
                        int g = LiveOverlayPresenter.g(arfsVar);
                        if ((s.b & 4096) != 0 && (aqygVar5 = s.n) == null) {
                            aqygVar5 = aqyg.a;
                        }
                        Spanned b6 = ajcq.b(aqygVar5);
                        arfs arfsVar2 = s.m;
                        if (arfsVar2 == null) {
                            arfsVar2 = arfs.a;
                        }
                        ahvyVar3.t(b, b4, z, b5, g, b6, LiveOverlayPresenter.g(arfsVar2));
                    }
                    liveOverlayPresenter.k = true;
                }
            }
        };
        this.r = new ahwb(this, 0);
        ahvyVar.q(this);
        this.h = new ahwg(this);
    }

    public static int g(arfs arfsVar) {
        arfr arfrVar = arfr.UNKNOWN;
        aign aignVar = aign.NEW;
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 257) {
            return R.drawable.quantum_ic_notifications_none_white_18;
        }
        if (ordinal != 258) {
            return 0;
        }
        return R.drawable.quantum_ic_notifications_active_white_18;
    }

    public static astf h(aryi aryiVar) {
        if (aryiVar == null) {
            return null;
        }
        aryc arycVar = aryiVar.n;
        if (arycVar == null) {
            arycVar = aryc.a;
        }
        asti astiVar = arycVar.c;
        if (astiVar == null) {
            astiVar = asti.a;
        }
        if ((astiVar.b & 64) == 0) {
            return null;
        }
        aryc arycVar2 = aryiVar.n;
        if (arycVar2 == null) {
            arycVar2 = aryc.a;
        }
        asti astiVar2 = arycVar2.c;
        if (astiVar2 == null) {
            astiVar2 = asti.a;
        }
        asth asthVar = astiVar2.g;
        if (asthVar == null) {
            asthVar = asth.a;
        }
        astf astfVar = asthVar.c;
        return astfVar == null ? astf.a : astfVar;
    }

    public static final apmp s(astf astfVar) {
        if (astfVar.g.size() <= 0 || (((apmh) astfVar.g.get(0)).b & 2) == 0) {
            return null;
        }
        apmp apmpVar = ((apmh) astfVar.g.get(0)).d;
        if (apmpVar == null) {
            apmpVar = apmp.a;
        }
        if (apmpVar.f) {
            return null;
        }
        apmp apmpVar2 = ((apmh) astfVar.g.get(0)).d;
        return apmpVar2 == null ? apmp.a : apmpVar2;
    }

    public static final apmg t(astf astfVar) {
        if (astfVar == null || astfVar.g.size() <= 0 || (((apmh) astfVar.g.get(0)).b & 1) == 0) {
            return null;
        }
        apmg apmgVar = ((apmh) astfVar.g.get(0)).c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if (apmgVar.h) {
            return null;
        }
        apmg apmgVar2 = ((apmh) astfVar.g.get(0)).c;
        return apmgVar2 == null ? apmg.a : apmgVar2;
    }

    private final void u() {
        j();
        this.a.p(null);
        this.a.k(true);
        this.a.o(0L);
        this.a.n();
        this.l = false;
        this.a.r(false);
        this.i = null;
        Future future = this.u;
        if (future != null) {
            future.cancel(true);
            this.u = null;
        }
        ayqx ayqxVar = this.j;
        if (ayqxVar != null && !ayqxVar.e()) {
            azqb.f((AtomicReference) this.j);
        }
        this.j = null;
        this.v = 0L;
        this.w = 0L;
        this.x = 0;
    }

    private final void v() {
        if (this.k || this.i == null || !y()) {
            if (this.k && w() && !y()) {
                if (this.l) {
                    this.o.execute(new ahwb(this, 2));
                    return;
                } else {
                    this.o.execute(new ahwb(this, 1));
                    return;
                }
            }
            return;
        }
        p();
        q();
    }

    private final boolean w() {
        return this.w > 0;
    }

    private final boolean x() {
        int i;
        long j = this.w;
        return j > 0 && j - this.v <= 1000 && (i = this.x) != 2 && i != 3;
    }

    private final boolean y() {
        return this.x == 5;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        this.o.execute(new Runnable() { // from class: ahwc
            @Override // java.lang.Runnable
            public final void run() {
                LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                liveOverlayPresenter.a.p(bitmap);
            }
        });
    }

    public final void i(ahcx ahcxVar) {
        this.a.w(ahcxVar.d() == aigf.FULLSCREEN);
    }

    public final void j() {
        this.k = false;
        this.a.kV();
        k();
    }

    public final void k() {
        ahwh ahwhVar = this.t;
        if (ahwhVar != null) {
            ahwhVar.e(false);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        int i = 5;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, 2), ahfo.s), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, 3), ahfo.s), aiocVar.G().i.h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, 4), ahfo.s), aiocVar.ab().h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, i), ahfo.s), aiocVar.V().h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, i), ahfo.s), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 16384L)).h(ahbw.e(1)).Y(new ahwf(this, 0), ahfo.s), ahbw.d(aiocVar.G().g, ahbz.m).h(ahbw.e(1)).Y(new ahwf(this, 1), ahfo.s)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class, aheg.class, ahej.class};
        }
        if (i == 0) {
            i((ahcx) obj);
            return null;
        }
        if (i == 1) {
            l((ahef) obj);
            return null;
        }
        if (i == 2) {
            m((aheg) obj);
            return null;
        }
        if (i == 3) {
            n((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l(ahef ahefVar) {
        this.n = ahefVar.c();
        arfr arfrVar = arfr.UNKNOWN;
        aign aignVar = aign.NEW;
        int ordinal = this.n.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            u();
            return;
        }
        if (ordinal == 2) {
            ayqx ayqxVar = this.j;
            if (ayqxVar == null || ayqxVar.e()) {
                this.m = ahefVar.b();
                this.j = this.e.d.n().E(azre.b(this.d)).X(this.f);
                return;
            }
            return;
        }
        if (ordinal != 9) {
            return;
        }
        this.a.k(false);
        this.a.n();
        final astf astfVar = this.i;
        if (!this.l || astfVar == null) {
            return;
        }
        this.o.execute(new Runnable() { // from class: ahwd
            @Override // java.lang.Runnable
            public final void run() {
                LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                avgg avggVar = astfVar.f;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                liveOverlayPresenter.r(avggVar);
            }
        });
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        u();
    }

    public final void m(aheg ahegVar) {
        this.v = ahegVar.e();
        this.w = ahegVar.f();
        v();
    }

    public final void n(ahej ahejVar) {
        int a = ahejVar.a();
        this.x = a;
        if (a == 5 || a == 2) {
            v();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    public final void o() {
        this.o.execute(this.q);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public final void p() {
        astf astfVar = this.i;
        if (astfVar == null || (astfVar.b & 16) != 0) {
            final avgg avggVar = astfVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (!w() || x()) {
                if (this.t != null) {
                    this.o.execute(new Runnable() { // from class: ahwe
                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveOverlayPresenter.this.r(avggVar);
                        }
                    });
                    return;
                }
                Uri C = ahbw.C(avggVar, this.a.getWidth(), this.a.getHeight());
                if (C == null) {
                    return;
                }
                this.p.l(C, this);
            }
        }
    }

    public final void r(avgg avggVar) {
        ahwh ahwhVar = this.t;
        if (ahwhVar != null) {
            ahwhVar.f(avggVar);
            this.t.e(true);
            this.k = true;
        }
    }

    @Override // defpackage.ahvx
    public final void rM() {
        apmg t = t(this.i);
        if (this.s == null || t == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ALLOW_RELOAD", true);
        aahd aahdVar = this.s;
        apxf apxfVar = t.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }

    @Override // defpackage.ahvx
    public final void rN() {
        apxf apxfVar;
        astf astfVar = this.i;
        if (astfVar != null) {
            aone builder = s(astfVar).toBuilder();
            if (this.s == null || builder == null) {
                return;
            }
            apmp apmpVar = (apmp) builder.instance;
            if (!apmpVar.e || (apmpVar.b & 16384) == 0) {
                apxfVar = null;
            } else {
                apxfVar = apmpVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            apmp apmpVar2 = (apmp) builder.instance;
            if (!apmpVar2.e && (apmpVar2.b & 512) != 0 && (apxfVar = apmpVar2.k) == null) {
                apxfVar = apxf.a;
            }
            this.s.c(apxfVar, null);
            boolean z = ((apmp) builder.instance).e;
            builder.copyOnWrite();
            apmp apmpVar3 = (apmp) builder.instance;
            apmpVar3.b |= 8;
            apmpVar3.e = !z;
            aone builder2 = astfVar.toBuilder();
            apmp apmpVar4 = (apmp) builder.build();
            if (((astf) builder2.instance).g.size() > 0 && (builder2.av().b & 2) != 0) {
                apmp apmpVar5 = builder2.av().d;
                if (apmpVar5 == null) {
                    apmpVar5 = apmp.a;
                }
                if (!apmpVar5.f) {
                    aone builder3 = builder2.av().toBuilder();
                    builder3.copyOnWrite();
                    apmh apmhVar = (apmh) builder3.instance;
                    apmpVar4.getClass();
                    apmhVar.d = apmpVar4;
                    apmhVar.b |= 2;
                    apmh apmhVar2 = (apmh) builder3.build();
                    builder2.copyOnWrite();
                    astf astfVar2 = (astf) builder2.instance;
                    apmhVar2.getClass();
                    aony aonyVar = astfVar2.g;
                    if (!aonyVar.c()) {
                        astfVar2.g = aonm.mutableCopy(aonyVar);
                    }
                    astfVar2.g.set(0, apmhVar2);
                }
            }
            this.i = (astf) builder2.build();
        }
    }

    public final void q() {
        astf astfVar = this.i;
        if (astfVar != null) {
            if ((astfVar.b & 2) != 0) {
                if (this.u == null) {
                    this.u = this.d.scheduleAtFixedRate(this.r, 0L, 1L, TimeUnit.SECONDS);
                    return;
                }
                return;
            }
            Future future = this.u;
            if (future != null) {
                future.cancel(true);
                this.u = null;
            }
            if (this.l || !w() || x()) {
                o();
            }
        }
    }
}
