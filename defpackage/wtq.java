package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA, b = apae.SLOT_TYPE_PLAYER_BYTES, c = {xdu.class, xdr.class, xcs.class}, d = {xdf.class, xdg.class})
/* loaded from: classes4.dex */
public final class wtq implements wts, wol, wof {
    public final wtr a;
    public final xev b;
    public final boolean c;
    wpu d;
    private final wno e;
    private final aaea f;
    private final wog g;
    private final woc h;
    private final wny i;
    private final ypa j;
    private final xgh k;
    private final String l;
    private final InstreamAdBreak m;
    private final MediaAd n;
    private final xah o;
    private boolean p;
    private boolean q;
    private aigf r;
    private final xeo s;
    private final PriorityQueue t;
    private final wpl u;
    private final wqg v;

    public wtq(wno wnoVar, wtr wtrVar, aaea aaeaVar, wqg wqgVar, wog wogVar, wpl wplVar, woc wocVar, wny wnyVar, xci xciVar, ypa ypaVar, xgh xghVar, xev xevVar, boolean z, wpu wpuVar) {
        PriorityQueue priorityQueue;
        this.e = wnoVar;
        this.a = wtrVar;
        this.f = aaeaVar;
        this.v = wqgVar;
        this.g = wogVar;
        this.u = wplVar;
        this.h = wocVar;
        this.i = wnyVar;
        this.j = ypaVar;
        this.k = xghVar;
        this.b = xevVar;
        String str = (String) xghVar.d(xdf.class);
        this.l = str;
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xevVar.e(xdr.class);
        this.m = instreamAdBreak;
        MediaAd mediaAd = (MediaAd) xevVar.e(xdu.class);
        this.n = mediaAd;
        this.c = z;
        this.d = wpuVar;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
        this.o = mediaAd instanceof AdIntro ? null : new xah(ypaVar, mediaAd, instreamAdBreak.b(), playerResponseModel, xciVar, (xcf) xevVar.e(xcs.class));
        String str2 = mediaAd.m;
        this.s = new xeo(xeo.c(str, playerResponseModel, false), new xck(true == TextUtils.isEmpty(str2) ? "" : str2));
        if (!wbs.y(aaeaVar) || mediaAd.u() == null) {
            priorityQueue = new PriorityQueue();
        } else {
            priorityQueue = new PriorityQueue();
            Iterator it = mediaAd.u().h.iterator();
            while (it.hasNext()) {
                xfy a = xfy.a((aozf) it.next(), mediaAd.c() * 1000);
                if (a != null) {
                    priorityQueue.add(a);
                }
            }
        }
        this.t = priorityQueue;
    }

    private final boolean j(int i) {
        return i == 0 && (this.n instanceof LocalVideoAd) && !this.c;
    }

    @Override // defpackage.wsx
    public final xev a() {
        return this.b;
    }

    @Override // defpackage.wsx
    public final void b() {
        if (!wbs.n(this.f) || this.v.b()) {
            return;
        }
        try {
            PlayerResponseModel g = this.n.g();
            if (g == null) {
                throw new IllegalStateException("Null Ad PlayerResponse when attempting to queue");
            }
            this.d.a(g, this.n.m, (aixh) this.k.d(xej.class), this.m.a());
        } catch (wnw e) {
            whu.l(this.k, e.toString());
        }
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (this.p && aignVar.h() && TextUtils.equals(this.n.m, str2)) {
            xah xahVar = this.o;
            if (xahVar != null) {
                xahVar.b(aignVar, str);
            }
            if (this.q || aignVar != aign.INTERSTITIAL_PLAYING) {
                return;
            }
            this.q = true;
            if (wbs.y(this.f) && this.n.u() != null) {
                this.u.a(this.n.u().b, null);
            }
            this.e.b(this.s, this.k, this.b);
        }
    }

    @Override // defpackage.wof
    public final void h(int i, String str) {
        if (this.p && wbs.y(this.f) && TextUtils.equals(str, this.n.m) && i == 4 && this.n.u() != null) {
            this.u.a(this.n.u().g, null);
        }
    }

    @Override // defpackage.wol
    public final void i() {
        qv(0);
        this.a.l(this.b);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        if (this.p) {
            if (this.r != aigf.FULLSCREEN && aigfVar == aigf.FULLSCREEN && wbs.y(this.f) && this.n.u() != null) {
                this.u.a(this.n.u().j, null);
            }
            this.r = aigfVar;
        }
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        if (wbs.y(this.f) && this.p && TextUtils.equals(str, this.n.m)) {
            while (!this.t.isEmpty() && j >= ((xfy) this.t.peek()).a) {
                this.u.c(((xfy) this.t.poll()).b, null);
            }
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.p = true;
        if (!wbs.y(this.f)) {
            this.h.d(this.l, this.m, this.n);
        }
        this.j.d(new xaq());
        this.g.a(this);
        if (!wbs.n(this.f)) {
            try {
                wqg wqgVar = this.v;
                PlayerResponseModel g = this.n.g();
                String str = this.n.m;
                ajbd ajbdVar = wqgVar.a;
                if (ajbdVar == null) {
                    throw new wnw("Null interrupt when trying to play interstitial video");
                }
                wqe wqeVar = new wqe(this);
                ajbdVar.b();
                ajbdVar.c = wqeVar;
                ajbdVar.b.a.b(g, str);
                ajbdVar.a = true;
                return;
            } catch (wnw e) {
                this.a.k(new wxd(e.getMessage()));
                return;
            }
        }
        if (this.v.b()) {
            try {
                wpu wpuVar = this.d;
                PlayerResponseModel g2 = this.n.g();
                String str2 = this.n.m;
                aixh aixhVar = (aixh) this.k.d(xej.class);
                ajbv e2 = aixhVar.e();
                if (e2 == null) {
                    throw new wnw("Null playback timeline for Ad queue via interrupt");
                }
                wpuVar.a(g2, str2, aixhVar, e2.a(aixhVar.f(), aixhVar.b()));
                this.v.a();
            } catch (wnw e3) {
                this.a.k(new wxd(e3.getMessage()));
            }
        }
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        xce xceVar;
        this.p = false;
        this.q = false;
        this.g.c(this);
        if ((this.n instanceof LocalVideoAd) && i != 4 && i != 1) {
            if (i == 0) {
                xceVar = xce.VIDEO_ENDED;
            } else if (i == 1) {
                xceVar = xce.VIDEO_ERROR;
            } else if (i != 2) {
                xceVar = xce.USER_MUTED;
            } else {
                xceVar = xce.USER_SKIPPED;
            }
            this.h.i(xceVar);
            this.j.d(new xad(this.n, xceVar));
        }
        if (j(i)) {
            this.h.l();
        }
        if (wbs.y(this.f) && this.n.u() != null) {
            ArrayList arrayList = new ArrayList();
            if (i == 0) {
                while (!this.t.isEmpty()) {
                    arrayList.add(((xfy) this.t.poll()).b);
                }
                if (j(i)) {
                    arrayList.addAll(this.n.u().p);
                }
            } else if (i == 1) {
                arrayList.addAll(this.n.u().c);
            } else if (i == 2) {
                arrayList.addAll(this.n.u().f);
            } else if (i == 4) {
                arrayList.addAll(this.n.u().o);
            }
            if (!arrayList.isEmpty()) {
                this.u.a(arrayList, null);
            }
        }
        if (wbs.n(this.f) && i == 2) {
            try {
                Iterator it = ((wtn) this.a).b.iterator();
                while (it.hasNext()) {
                    MediaAd mediaAd = (MediaAd) ((wts) it.next()).a().e(xdu.class);
                    if (mediaAd != null) {
                        aixh aixhVar = (aixh) this.k.d(xej.class);
                        String str = mediaAd.m;
                        ajbv e = aixhVar.e();
                        if (e != null) {
                            e.e(str);
                            e.x();
                        } else {
                            throw new wnw("Null playback timeline for Ad skip");
                        }
                    }
                }
            } catch (wnw e2) {
                whu.l(this.k, e2.toString());
            }
            i = 2;
        }
        if (i != 4 && i != 1) {
            this.i.a(this.n);
        }
        this.h.a();
        xah xahVar = this.o;
        if (xahVar != null) {
            xahVar.a();
        }
        this.e.f(this.s, this.k, this.b, i);
    }

    @Override // defpackage.wof
    public final void qw(String str, int i) {
        if (wbs.n(this.f) && this.p && i != 1) {
            i();
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
