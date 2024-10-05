package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = apae.SLOT_TYPE_PLAYER_BYTES, c = {xdr.class, xec.class}, d = {xdg.class, xej.class, xdf.class})
/* loaded from: classes4.dex */
public final class wtn implements wsx, wtr, wof {
    public final wsw a;
    public final List b;
    public final xgh c;
    public final xev d;
    public final List e;
    public int f;
    public final wpw g;
    private final wno h;
    private final wog i;
    private final woc j;
    private final InstreamAdBreak k;
    private final PlayerResponseModel l;
    private final String m;
    private final Executor n;
    private final wwo o;
    private final wtm p;
    private final xeo q;
    private final wxz r;

    public wtn(wsw wswVar, wno wnoVar, wog wogVar, wxz wxzVar, woc wocVar, wwo wwoVar, wpw wpwVar, xgh xghVar, xev xevVar, PlayerResponseModel playerResponseModel, Executor executor) {
        xgu xguVar;
        this.a = wswVar;
        this.h = wnoVar;
        this.i = wogVar;
        this.r = wxzVar;
        this.j = wocVar;
        this.o = wwoVar;
        this.g = wpwVar;
        this.c = xghVar;
        this.d = xevVar;
        this.k = (InstreamAdBreak) xevVar.e(xdr.class);
        List list = (List) xevVar.e(xec.class);
        this.e = list;
        this.l = playerResponseModel;
        this.m = (String) xghVar.d(xdf.class);
        this.n = executor;
        this.b = new ArrayList(list.size());
        wtm wtmVar = null;
        if (!list.isEmpty()) {
            int i = 0;
            if (((xev) list.get(0)).f(xdu.class)) {
                MediaAd mediaAd = (MediaAd) ((xev) list.get(0)).e(xdu.class);
                amru amruVar = xghVar.d;
                int i2 = ((amvj) amruVar).c;
                while (true) {
                    if (i >= i2) {
                        xguVar = null;
                        break;
                    }
                    xgx xgxVar = (xgx) amruVar.get(i);
                    i++;
                    if (xgxVar instanceof xfl) {
                        long j = ((xfl) xgxVar).d.a;
                        xguVar = new xgu((-15000) + j, j);
                        break;
                    }
                }
                if (xguVar != null) {
                    wtmVar = new wtm(this, mediaAd, xguVar);
                }
            }
        }
        this.p = wtmVar;
        this.f = -1;
        this.q = xeo.a(this.m, (PlayerResponseModel) xghVar.d(xdg.class));
    }

    public static PlayerAd j(xev xevVar) {
        if (xevVar.f(xdu.class)) {
            return (PlayerAd) xevVar.e(xdu.class);
        }
        if (xevVar.f(xdv.class)) {
            return (PlayerAd) xevVar.e(xdv.class);
        }
        return null;
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wts) it.next()).b();
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            this.h.g(this.q, this.c, (xev) it2.next());
        }
        if (this.p != null) {
            this.i.a(this);
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    public final xci i(xev xevVar) {
        PlayerAd j = j(xevVar);
        int qB = j != null ? j.qB() : 0;
        String str = xevVar.a;
        if (PlayerAd.af(qB)) {
            return this.o.d(this.c, xevVar, new wtk(this, str, qB));
        }
        return this.o.b(this.c, xevVar);
    }

    @Override // defpackage.wtr
    public final void k(wxd wxdVar) {
        this.a.d(this.c, this.d, wxdVar);
    }

    @Override // defpackage.wtr
    public final void l(xev xevVar) {
        if (o()) {
            if (!TextUtils.equals(xevVar.a, ((xev) this.e.get(this.f)).a)) {
                this.a.d(this.c, this.d, new wxd("Exited subLayout when a different subLayout was anticipated to be playing"));
                return;
            } else {
                n();
                return;
            }
        }
        this.a.d(this.c, this.d, new wxd("Exited subLayout when currIndex not valid"));
    }

    public final void m(int i) {
        wts wtsVar = o() ? (wts) this.b.get(this.f) : null;
        if (wtsVar != null) {
            wtsVar.qv(i);
        }
    }

    public final void n() {
        this.f++;
        if (!o()) {
            this.r.b(this.d, 0);
            return;
        }
        wts wtsVar = (wts) this.b.get(this.f);
        if (this.f == 0) {
            this.a.a(this.c, this.d);
            this.j.g(this.k);
        }
        wtsVar.qu();
    }

    public final boolean o() {
        int i = this.f;
        return i >= 0 && i < this.e.size();
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
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        float f;
        PlayerResponseModel playerResponseModel;
        if (this.p != null && TextUtils.equals(str, this.m)) {
            wtm wtmVar = this.p;
            if (wtmVar.d.f == -1 && !wtmVar.c && wtmVar.b.a(j)) {
                wtmVar.c = true;
                wpw wpwVar = wtmVar.d.g;
                MediaAd mediaAd = wtmVar.a;
                if (mediaAd.g() == null) {
                    f = 0.0f;
                } else {
                    auae auaeVar = mediaAd.g().c().c.F;
                    if (auaeVar == null) {
                        auaeVar = auae.a;
                    }
                    f = auaeVar.b;
                }
                if (mediaAd.g() != null) {
                    playerResponseModel = mediaAd.g();
                } else if (mediaAd.e() == null || mediaAd.f() == null) {
                    playerResponseModel = null;
                } else {
                    PlayerConfigModel playerConfigModel = mediaAd.l;
                    playerResponseModel = new PlayerResponseModel(mediaAd.e(), mediaAd.f(), mediaAd.l);
                }
                if (playerResponseModel == null || f <= 0.0f || ((Boolean) wpwVar.b.getAndSet(true)).booleanValue()) {
                    return;
                }
                ((aeeo) wpwVar.a.get()).a(playerResponseModel, 0L, f * 1000.0f, wpwVar);
            }
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            this.h.v((xev) it.next());
        }
        this.i.c(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        if (this.k.b() == xfn.POST_ROLL) {
            this.n.execute(new Runnable() { // from class: wtl
                @Override // java.lang.Runnable
                public final void run() {
                    wtn wtnVar = wtn.this;
                    if (wtnVar.f != -2) {
                        wtnVar.n();
                    }
                }
            });
        } else {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.wsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qv(int r4) {
        /*
            r3 = this;
            r3.m(r4)
            wog r0 = r3.i
            r0.c(r3)
            r0 = -2
            r3.f = r0
            r0 = 2
            if (r4 == 0) goto L14
            r1 = 4
            if (r4 == r1) goto L14
            if (r4 != r0) goto L19
            r4 = 2
        L14:
            woc r1 = r3.j
            r1.f()
        L19:
            com.google.android.libraries.youtube.ads.model.InstreamAdBreak r1 = r3.k
            xfn r1 = r1.b()
            xfn r2 = defpackage.xfn.PRE_ROLL
            if (r1 != r2) goto L35
            r1 = 3
            if (r4 == 0) goto L2b
            if (r4 == r0) goto L2b
            if (r4 != r1) goto L35
            r4 = 3
        L2b:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r3.l
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel$MutableContext r0 = r0.d
            r1 = 1
            java.lang.String r2 = "PREROLL_SHOWN"
            r0.a(r2, r1)
        L35:
            wsw r0 = r3.a
            xgh r1 = r3.c
            xev r2 = r3.d
            r0.e(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtn.qv(int):void");
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
