package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = apae.SLOT_TYPE_PLAYER_BYTES, c = {xdr.class, xec.class, xej.class}, d = {xdj.class, xej.class, xdg.class, xdf.class, xcr.class})
/* loaded from: classes4.dex */
public final class wti implements wsx, wtr, wok, wof {
    public final Executor b;
    public final xgh c;
    public final List e;
    public final long f;
    public final aaea g;
    public ajbu[] h;
    private final wog i;
    private final woc j;
    private final ypa k;
    private final Executor l;
    private final xev m;
    private final wsw n;
    private final wno o;
    private final xeo p;
    private wts q;
    private boolean r;
    private final wqa s;
    public final AtomicReference a = new AtomicReference();
    public final List d = new ArrayList();

    public wti(wog wogVar, wqa wqaVar, woc wocVar, ypa ypaVar, Executor executor, Executor executor2, xgh xghVar, xev xevVar, wsw wswVar, wno wnoVar, aeqn aeqnVar, aaea aaeaVar) {
        this.i = wogVar;
        this.s = wqaVar;
        this.j = wocVar;
        this.k = ypaVar;
        this.l = executor;
        this.b = executor2;
        this.c = xghVar;
        this.m = xevVar;
        this.n = wswVar;
        this.o = wnoVar;
        this.p = xeo.a((String) xghVar.d(xdf.class), (PlayerResponseModel) xghVar.d(xdg.class));
        this.g = aaeaVar;
        Iterator it = ((List) xevVar.e(xec.class)).iterator();
        while (it.hasNext()) {
            this.d.add((MediaAd) ((xev) it.next()).e(xdu.class));
        }
        this.e = new ArrayList(this.d.size());
        Iterator it2 = this.d.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += TimeUnit.SECONDS.toMillis(((MediaAd) it2.next()).c());
        }
        this.f = j;
        this.a.set(new xgu(aeqnVar.a(), aeqnVar.a() + aeqnVar.d));
    }

    private final void m(String str, boolean z) {
        if (!z) {
            if (this.q != null) {
                this.k.d(new xav("ad", "video"));
                this.q.qv(0);
                this.q = null;
                return;
            }
            return;
        }
        for (wts wtsVar : this.e) {
            if (TextUtils.equals(((MediaAd) wtsVar.a().e(xdu.class)).m, str)) {
                if (!this.r) {
                    whu.m(this.c, this.m, "Trying to active SubLayoutRenderingAdapter without primary started");
                    return;
                }
                wts wtsVar2 = this.q;
                if (wtsVar2 != wtsVar) {
                    this.k.d(new xav(wtsVar2 != null ? "ad" : "video", "ad"));
                    wts wtsVar3 = this.q;
                    if (wtsVar3 != null) {
                        wtsVar3.qv(0);
                    }
                    this.q = wtsVar;
                    wtsVar.qu();
                } else {
                    whu.m(this.c, this.m, "SubLayoutRenderingAdapter has already been activated");
                    return;
                }
            }
        }
    }

    private final void n() {
        this.l.execute(new Runnable() { // from class: wtg
            @Override // java.lang.Runnable
            public final void run() {
                wti wtiVar = wti.this;
                xgu xguVar = (xgu) wtiVar.a.getAndSet(null);
                if (xguVar != null) {
                    ajbv e = ((aixh) wtiVar.c.d(xej.class)).e();
                    if (e == null) {
                        whu.l(wtiVar.c, "Null playback timeline for DAI update");
                        return;
                    }
                    if (wtiVar.h == null) {
                        wtiVar.h = new ajbu[wtiVar.d.size()];
                        for (int i = 0; i < wtiVar.d.size(); i++) {
                            MediaAd mediaAd = (MediaAd) wtiVar.d.get(i);
                            wtiVar.h[i] = e.m(xfm.a(mediaAd), mediaAd.m, 1);
                        }
                    }
                    try {
                        for (ajbu ajbuVar : wtiVar.h) {
                            e.e(ajbuVar.e);
                        }
                        long j = (xguVar.b - xguVar.a) - wtiVar.f;
                        apbs k = wbs.k(wtiVar.g);
                        if (k != null && k.k && j > 0) {
                            long j2 = xguVar.a;
                            e.C(j2, wtiVar.f + j2, ((aeqn) wtiVar.c.d(xdj.class)).a, wtiVar.h);
                            return;
                        }
                        e.C(xguVar.a, xguVar.b, ((aeqn) wtiVar.c.d(xdj.class)).a, wtiVar.h);
                        if (j >= 0) {
                            return;
                        }
                        long j3 = -j;
                        int size = wtiVar.d.size();
                        while (true) {
                            size--;
                            if (j3 <= 0 || size < 0) {
                                break;
                            }
                            MediaAd mediaAd2 = (MediaAd) wtiVar.d.get(size);
                            long millis = TimeUnit.SECONDS.toMillis(mediaAd2.c());
                            if (j3 >= millis) {
                                ajbu d = e.d(mediaAd2.m);
                                if (d == null || !d.d()) {
                                    e.e(mediaAd2.m);
                                } else {
                                    d.c(0L);
                                }
                            } else {
                                ajbu ajbuVar2 = wtiVar.h[size];
                                if (ajbuVar2 != null) {
                                    ajbuVar2.c(millis - j3);
                                }
                            }
                            j3 -= millis;
                        }
                    } finally {
                        wtiVar.b.execute(new wth(e, 0));
                    }
                }
            }
        });
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
        n();
        Iterator it = ((List) this.m.e(xec.class)).iterator();
        while (it.hasNext()) {
            this.o.g(this.p, this.c, (xev) it.next());
        }
        this.i.a(this);
        this.s.a(this);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wok
    public final void i(String str) {
        m(str, Collection.EL.stream(this.d).anyMatch(new opz(str, 4)));
    }

    @Override // defpackage.wok
    public final /* synthetic */ void j(long j) {
    }

    @Override // defpackage.wtr
    public final void k(wxd wxdVar) {
    }

    @Override // defpackage.wtr
    public final void l(xev xevVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wsx
    public final void qt() {
        Iterator it = ((List) this.m.e(xec.class)).iterator();
        while (it.hasNext()) {
            this.o.v((xev) it.next());
        }
        this.i.c(this);
        this.s.b(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.r = true;
        this.j.c((InstreamAdBreak) this.m.e(xdr.class), (PlayerAd) ((wts) amkq.bj(this.e)).a().e(xdu.class));
        this.n.a(this.c, this.m);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.r = false;
        this.j.e();
        this.n.e(this.c, this.m, i);
    }

    @Override // defpackage.wof
    public final void qw(String str, int i) {
        m(str, i == 1);
    }

    @Override // defpackage.wof
    public final void qy(ahcm ahcmVar) {
        aeqn a = ahcmVar.a();
        if (TextUtils.equals(a.a, ((aeqn) this.c.d(xdj.class)).a)) {
            this.a.set(new xgu(a.a(), a.a() + a.d));
            n();
        }
    }
}
