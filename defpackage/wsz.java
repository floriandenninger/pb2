package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT, b = apae.SLOT_TYPE_IN_PLAYER, d = {xel.class})
/* loaded from: classes4.dex */
public final class wsz implements wsx {
    public final anhy a;
    private final wsw b;
    private final Executor c;
    private final xjl d;
    private final xgh e;
    private final xev f;
    private final xjp g;
    private boolean h;
    private aoxt i;

    public wsz(wsw wswVar, Executor executor, xjl xjlVar, xgh xghVar, xev xevVar) {
        wswVar.getClass();
        this.b = wswVar;
        executor.getClass();
        this.c = executor;
        this.d = xjlVar;
        this.e = xghVar;
        xevVar.getClass();
        this.f = xevVar;
        this.a = (anhy) xghVar.d(xel.class);
        this.g = xjq.a();
    }

    private final void g() {
        this.g.k();
        this.d.p(this.g.a());
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
        g();
    }

    public final void f(anhy anhyVar) {
        aoxt aoxtVar;
        if (this.h) {
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
            this.i = aoxtVar;
            if (aoxtVar != null) {
                xjp xjpVar = this.g;
                boolean z = (aoxtVar.b & 16384) != 0;
                xjr a = xjpVar.b().a();
                a.c(z);
                xjpVar.c = a.a();
                this.d.p(this.g.a());
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        xjp xjpVar = this.g;
        ajhi a = xkb.a();
        a.d(true);
        xjpVar.b = a.c();
        wcy.e(this.g);
        this.d.p(this.g.a());
        if (this.a.isDone()) {
            f(this.a);
        } else {
            this.a.d(new Runnable() { // from class: wsy
                @Override // java.lang.Runnable
                public final void run() {
                    wsz wszVar = wsz.this;
                    wszVar.f(wszVar.a);
                }
            }, this.c);
        }
        this.b.a(this.e, this.f);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.h = true;
        g();
        this.b.e(this.e, this.f, i);
    }
}
