package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class woy implements wob, xjk, wof {
    private final woz a;
    private xca b;

    public woy(woz wozVar) {
        this.a = wozVar;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void d() {
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
    public final void h(int i, String str) {
        xca xcaVar = this.b;
        if (xcaVar == null) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            xcaVar.k();
        } else if (xcaVar.c) {
            xcaVar.l();
        } else {
            xcaVar.j();
            xcaVar.c = true;
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void i(xiv xivVar) {
    }

    @Override // defpackage.wob
    public final tdt j() {
        xca xcaVar = this.b;
        if (xcaVar != null) {
            return xcaVar.e;
        }
        return null;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.wob
    public final tdt l(long j) {
        tdt tdtVar;
        xca xcaVar = this.b;
        if (xcaVar == null) {
            whu.l(null, "Ping migration null ActiveVieweClient on AdQuartileProgress");
            return null;
        }
        int i = 3;
        while (true) {
            if (i <= 0) {
                tdtVar = null;
                break;
            }
            if (j >= (xcaVar.d * i) / 4) {
                tdtVar = xcaVar.f(i);
                break;
            }
            i--;
        }
        if (tdtVar != null) {
            return tdtVar;
        }
        whu.l(null, "Ping migration ActiveViewApi cannot process quartile update");
        return null;
    }

    @Override // defpackage.wob
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
        xca xcaVar = this.b;
        if (xcaVar != null) {
            xcaVar.o(visibilityChangeEventData);
        }
    }

    @Override // defpackage.wob
    public final void n(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        xca xcaVar = this.b;
        if (xcaVar == null || rect == null || rect2 == null) {
            return;
        }
        xcaVar.s(yjk.P(displayMetrics, rect2.left - rect.left), yjk.P(displayMetrics, rect2.top - rect.top), yjk.P(displayMetrics, rect2.width()), yjk.P(displayMetrics, rect2.height()));
    }

    @Override // defpackage.wwp
    public final void o(xgh xghVar, xev xevVar) {
        woz wozVar = this.a;
        int a = woz.a(xghVar, xevVar);
        if (a != 1) {
            if (a != 2 || !wbs.l((aaea) wozVar.a.get())) {
                return;
            }
        } else if (!wbs.y((aaea) wozVar.a.get())) {
            return;
        }
        xca xcaVar = this.b;
        xca xcaVar2 = null;
        if (xcaVar != null) {
            if (xcaVar.g(xevVar).booleanValue()) {
                return;
            }
            this.b.n();
            this.b = null;
        }
        woz wozVar2 = this.a;
        int a2 = woz.a(xghVar, xevVar);
        if (a2 == 1) {
            asnd P = ((MediaAd) xevVar.e(xdu.class)).l.P();
            if (P.b) {
                wmt wmtVar = (wmt) wozVar2.c.get();
                baof baofVar = new baof();
                boolean z = P.c;
                boolean z2 = P.d;
                boolean z3 = P.e;
                baofVar.c = P.f;
                boolean z4 = P.g;
                baofVar.a = P.h;
                baofVar.b = P.i;
                wmv a3 = wmtVar.a(baofVar);
                if (a3 != null) {
                    xcaVar2 = new xcc(xevVar, (PlayerAd) xevVar.e(xdu.class), wozVar2, wozVar2.b.d().d() == aigf.FULLSCREEN, wozVar2.b.d().d() == aigf.BACKGROUND, a3);
                }
            }
        } else if (a2 == 2) {
            atyi atyiVar = ((aryr) xevVar.e(xdy.class)).e;
            if (atyiVar == null) {
                atyiVar = atyi.a;
            }
            asnd asndVar = atyiVar.n;
            if (asndVar == null) {
                asndVar = asnd.a;
            }
            if (asndVar.b) {
                xcaVar2 = new xcb(xevVar, (aryr) xevVar.e(xdy.class), wozVar2, (tdv) wozVar2.d.get(), ((xgb) xevVar.e(xea.class)).d);
            }
        }
        this.b = xcaVar2;
    }

    @Override // defpackage.xjk
    public final void p() {
        xca xcaVar = this.b;
        if (xcaVar != null) {
            xcaVar.m();
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final void qq(String str) {
        xca xcaVar = this.b;
        if (xcaVar != null) {
            xcaVar.p();
        }
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        xca xcaVar = this.b;
        if (xcaVar == null) {
            return;
        }
        xcaVar.q(aigfVar);
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        xca xcaVar = this.b;
        if (xcaVar != null) {
            xcaVar.r(j);
        }
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

    @Override // defpackage.wwq
    public final void s(xgh xghVar, xev xevVar, int i) {
        xca xcaVar = this.b;
        if (xcaVar == null || !xcaVar.g(xevVar).booleanValue()) {
            return;
        }
        if (i == 4) {
            this.b.h();
        } else if (i == 0) {
            this.b.i();
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.wws
    public final void v(xev xevVar) {
        xca xcaVar = this.b;
        if (xcaVar == null || !xcaVar.g(xevVar).booleanValue()) {
            return;
        }
        this.b.n();
        this.b = null;
    }
}
