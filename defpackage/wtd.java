package defpackage;

import android.text.Spanned;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR, b = apae.SLOT_TYPE_LOCKSCREEN, d = {xcs.class, xcv.class, xdb.class, xdg.class, xeb.class, xel.class})
/* loaded from: classes4.dex */
public final class wtd implements wsx, wof {
    public final anhy a;
    private final wsw b;
    private final Executor c;
    private final xcl d;
    private final wog e;
    private final wot f;
    private final xgh g;
    private final xev h;
    private final RemoteVideoAd i;
    private final xcf j;
    private final PlayerResponseModel k;
    private final xci l;
    private final xfn m;
    private final xjp n;
    private boolean o;

    public wtd(wsw wswVar, Executor executor, xcl xclVar, wog wogVar, wot wotVar, xgh xghVar, xev xevVar) {
        wswVar.getClass();
        this.b = wswVar;
        executor.getClass();
        this.c = executor;
        xclVar.getClass();
        this.d = xclVar;
        wogVar.getClass();
        this.e = wogVar;
        wotVar.getClass();
        this.f = wotVar;
        this.g = xghVar;
        xevVar.getClass();
        this.h = xevVar;
        this.i = (RemoteVideoAd) xghVar.d(xeb.class);
        this.j = (xcf) xghVar.d(xcs.class);
        this.k = (PlayerResponseModel) xghVar.d(xdg.class);
        this.l = (xci) xghVar.d(xcv.class);
        this.m = (xfn) xghVar.d(xdb.class);
        this.a = (anhy) xghVar.d(xel.class);
        this.n = xjq.a();
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    public final void i(anhy anhyVar) {
        aoxt aoxtVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        if (this.o) {
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
            avgg avggVar = null;
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
                if ((aoxtVar.b & 4) != 0) {
                    aqygVar2 = aoxtVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                Spanned b2 = ajcq.b(aqygVar2);
                if ((aoxtVar.b & 64) != 0 && (avggVar = aoxtVar.g) == null) {
                    avggVar = avgg.a;
                }
                this.f.a(new xjo(b, b2, avggVar));
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
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
        if (whl.k(this.n, this.k.c(), this.i.b, (int) j)) {
            this.f.b(this.l, 1);
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
        this.e.c(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.e.a(this);
        xjp xjpVar = this.n;
        xcl xclVar = this.d;
        this.i.y();
        xcf xcfVar = this.j;
        PlayerResponseModel playerResponseModel = this.k;
        RemoteVideoAd remoteVideoAd = this.i;
        whl.i(xjpVar, xclVar, null, xcfVar, playerResponseModel, remoteVideoAd.r, this.m, remoteVideoAd.a, remoteVideoAd.b);
        this.f.d(this.i.r);
        this.f.b(this.l, this.n.f().d);
        if (this.a.isDone()) {
            i(this.a);
        } else {
            this.a.d(new Runnable() { // from class: wtc
                @Override // java.lang.Runnable
                public final void run() {
                    wtd wtdVar = wtd.this;
                    wtdVar.i(wtdVar.a);
                }
            }, this.c);
        }
        this.b.a(this.g, this.h);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.o = true;
        this.e.c(this);
        this.f.b(xci.e, 3);
        this.f.c();
        this.b.e(this.g, this.h, i);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
