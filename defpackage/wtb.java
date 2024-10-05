package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE, b = apae.SLOT_TYPE_FIXED_FOOTER, d = {xcs.class, xcv.class, xdb.class, xdg.class, xeb.class, xel.class})
/* loaded from: classes4.dex */
public final class wtb implements wsx, wof, xjk {
    public final anhy a;
    private final wsw b;
    private final Executor c;
    private final xcl d;
    private final xjl e;
    private final wog f;
    private final xgh g;
    private final xev h;
    private final RemoteVideoAd i;
    private final xcf j;
    private final PlayerResponseModel k;
    private final xfn l;
    private final xjp m;
    private boolean n;
    private aoxt o;
    private final wpl p;
    private final ajoy q;

    public wtb(wsw wswVar, xcl xclVar, xjl xjlVar, Executor executor, wog wogVar, wpl wplVar, ajoy ajoyVar, xgh xghVar, xev xevVar, byte[] bArr, byte[] bArr2) {
        wswVar.getClass();
        this.b = wswVar;
        xclVar.getClass();
        this.d = xclVar;
        xjlVar.getClass();
        this.e = xjlVar;
        executor.getClass();
        this.c = executor;
        wogVar.getClass();
        this.f = wogVar;
        wplVar.getClass();
        this.p = wplVar;
        ajoyVar.getClass();
        this.q = ajoyVar;
        this.g = xghVar;
        xevVar.getClass();
        this.h = xevVar;
        this.a = (anhy) xghVar.d(xel.class);
        this.i = (RemoteVideoAd) xghVar.d(xeb.class);
        this.j = (xcf) xghVar.d(xcs.class);
        this.k = (PlayerResponseModel) xghVar.d(xdg.class);
        this.l = (xfn) xghVar.d(xdb.class);
        this.m = xjq.a();
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xjk
    public final void d() {
        adz adzVar = new adz(1);
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e.a());
        Uri uri = this.i.q;
        if (uri != null) {
            aoxt aoxtVar = this.o;
            if (aoxtVar == null || (aoxtVar.b & 16) == 0) {
                this.p.c(aahg.f(uri), adzVar);
                return;
            }
            wpl wplVar = this.p;
            apxf apxfVar = aoxtVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            wplVar.c(apxfVar, adzVar);
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void i(xiv xivVar) {
    }

    public final void j(anhy anhyVar) {
        aoxt aoxtVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        avgg avggVar;
        if (this.n) {
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
            if (aseoVar.b == 62960614) {
                aseo aseoVar2 = watchNextResponseModel.a.f;
                if (aseoVar2 == null) {
                    aseoVar2 = aseo.a;
                }
                if (aseoVar2.b == 62960614) {
                    aoxtVar = (aoxt) aseoVar2.c;
                } else {
                    aoxtVar = aoxt.a;
                }
            } else {
                aoxtVar = null;
            }
            this.o = aoxtVar;
            if (aoxtVar != null) {
                if ((aoxtVar.b & 1) != 0) {
                    aqygVar = aoxtVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                Spanned b = ajcq.b(aqygVar);
                aoxt aoxtVar2 = this.o;
                if ((aoxtVar2.b & 4) != 0) {
                    aqygVar2 = aoxtVar2.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                Spanned b2 = ajcq.b(aqygVar2);
                aoxt aoxtVar3 = this.o;
                if ((aoxtVar3.b & 64) != 0) {
                    avggVar = aoxtVar3.g;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                } else {
                    avggVar = null;
                }
                xjo xjoVar = new xjo(b, b2, avggVar);
                boolean d = wcy.d(this.m, this.o, this.i.q, null);
                boolean z = (this.o.b & 16384) != 0;
                ajoy ajoyVar = this.q;
                adul adulVar = (adul) ajoyVar.a.get();
                CharSequence charSequence = xjoVar.c;
                if (!TextUtils.equals(charSequence, adulVar.i.f.b)) {
                    adtw b3 = adulVar.i.f.b();
                    b3.b = charSequence;
                    adulVar.i(b3);
                    adulVar.b(3);
                }
                adul adulVar2 = (adul) ajoyVar.a.get();
                if (adulVar2.b == d && adulVar2.c == z) {
                    return;
                }
                adulVar2.b = d;
                adulVar2.c = z;
                adulVar2.b(0);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void q(int i, int i2) {
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
        if (whl.k(this.m, this.k.c(), this.i.b, (int) j)) {
            this.q.o(1);
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
        this.e.l(this);
        this.f.c(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        try {
            this.e.c(this);
        } catch (wnw e) {
            this.b.d(this.g, this.h, new wxd(e.getMessage()));
        }
        this.f.a(this);
        xjp xjpVar = this.m;
        xcl xclVar = this.d;
        this.i.y();
        xcf xcfVar = this.j;
        PlayerResponseModel playerResponseModel = this.k;
        RemoteVideoAd remoteVideoAd = this.i;
        whl.i(xjpVar, xclVar, null, xcfVar, playerResponseModel, remoteVideoAd.r, this.l, remoteVideoAd.a, remoteVideoAd.b);
        ajoy ajoyVar = this.q;
        PlayerResponseModel playerResponseModel2 = this.i.r;
        if (playerResponseModel2 == null) {
            ((adul) ajoyVar.a.get()).d(null, null);
        } else {
            adul adulVar = (adul) ajoyVar.a.get();
            String x = playerResponseModel2.x();
            playerResponseModel2.b();
            adulVar.d(x, playerResponseModel2.b().e());
        }
        this.q.o(this.m.f().d);
        if (this.a.isDone()) {
            j(this.a);
        } else {
            this.a.d(new Runnable() { // from class: wta
                @Override // java.lang.Runnable
                public final void run() {
                    wtb wtbVar = wtb.this;
                    wtbVar.j(wtbVar.a);
                }
            }, this.c);
        }
        this.b.a(this.g, this.h);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.n = true;
        this.e.l(this);
        this.f.c(this);
        this.q.o(3);
        ((adul) this.q.a.get()).d(null, null);
        this.b.e(this.g, this.h, i);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void u(boolean z) {
    }
}
