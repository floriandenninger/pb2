package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_AD_INFO_OVERLAY, b = apae.SLOT_TYPE_IN_PLAYER, d = {xel.class})
/* loaded from: classes4.dex */
public final class wsq implements wsx, xjk {
    public final anhy a;
    private final wsw b;
    private final xjl c;
    private final Executor d;
    private final xgh e;
    private final xev f;
    private final MediaAd g;
    private final xjp h;
    private aoxt i;
    private boolean j;
    private final wpl k;

    public wsq(wsw wswVar, xjl xjlVar, wpl wplVar, Executor executor, xgh xghVar, xev xevVar) {
        MediaAd mediaAd;
        this.b = wswVar;
        this.c = xjlVar;
        this.k = wplVar;
        this.d = executor;
        this.e = xghVar;
        this.f = xevVar;
        if (xghVar.e(xeb.class)) {
            mediaAd = (MediaAd) xghVar.d(xeb.class);
        } else {
            mediaAd = (MediaAd) xghVar.d(xdu.class);
        }
        this.g = mediaAd;
        this.a = (anhy) xghVar.d(xel.class);
        this.h = xjq.a();
    }

    private final void h() {
        xjp xjpVar = this.h;
        xjr a = xjpVar.b().a();
        a.c(true);
        a.d(-2);
        xjpVar.c = a.a();
        whl.j(this.h, true);
        wcy.e(this.h);
        this.c.p(this.h.a());
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.xjk
    public final void c(Bundle bundle) {
        aoxt aoxtVar;
        xhx a = this.c.a();
        if (a == null) {
            return;
        }
        apxf G = this.g.G();
        if (G == null && (aoxtVar = this.i) != null && (G = aoxtVar.i) == null) {
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
        this.k.c(G, adzVar);
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void e() {
    }

    public final void f(anhy anhyVar) {
        if (this.j) {
            return;
        }
        try {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anhyVar.get();
            if (watchNextResponseModel == null) {
                this.b.d(this.e, this.f, new wxd("WatchNext response is null"));
                return;
            }
            aseo aseoVar = watchNextResponseModel.a.f;
            if (aseoVar == null) {
                aseoVar = aseo.a;
            }
            if (aseoVar.b == 62960614) {
                aoxt aoxtVar = (aoxt) aseoVar.c;
                this.i = aoxtVar;
                if ((aoxtVar.b & 16384) != 0) {
                    h();
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            whu.m(this.e, this.f, e.toString());
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void i(xiv xivVar) {
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

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        try {
            this.c.c(this);
            if (this.g.G() != null) {
                h();
            } else if (this.a.isDone()) {
                f(this.a);
            } else {
                this.a.d(new Runnable() { // from class: wsp
                    @Override // java.lang.Runnable
                    public final void run() {
                        wsq wsqVar = wsq.this;
                        wsqVar.f(wsqVar.a);
                    }
                }, this.d);
            }
            this.b.a(this.e, this.f);
        } catch (wnw e) {
            this.b.d(this.e, this.f, new wxd(e.getMessage()));
        }
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.j = true;
        this.h.k();
        this.c.p(this.h.a());
        this.c.l(this);
        this.b.e(this.e, this.f, i);
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
