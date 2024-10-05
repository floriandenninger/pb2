package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xlu implements xlo {
    private final aifw a;
    private final aifv b;
    private final wmt c;
    private final afxf d;
    private final xcl e;
    private final aahd f;
    private final xbq g;

    public xlu(aifw aifwVar, aifv aifvVar, wmt wmtVar, xbq xbqVar, afxf afxfVar, xcl xclVar, aahd aahdVar) {
        this.a = aifwVar;
        this.b = aifvVar;
        this.g = xbqVar;
        this.c = wmtVar;
        this.d = afxfVar;
        this.e = xclVar;
        this.f = aahdVar;
    }

    private final wmv c(PlayerAd playerAd) {
        asnd P = playerAd.l.P();
        if (!P.b) {
            return null;
        }
        baof baofVar = new baof();
        boolean z = P.c;
        boolean z2 = P.d;
        boolean z3 = P.e;
        baofVar.c = P.f;
        boolean z4 = P.g;
        baofVar.a = P.h;
        baofVar.b = P.i;
        return this.c.a(baofVar);
    }

    @Override // defpackage.xlo
    public final xlq a(xhi xhiVar, String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        xbs a = this.g.a();
        this.d.e(a);
        if (playerAd.i() != null) {
            a.e = TimeUnit.SECONDS.toMillis(playerAd.c());
        }
        return new xlx(this.e, xhiVar, instreamAdBreak, playerAd, str, this.a.d(), this.b, c(playerAd), a, this.e.a, this.f);
    }

    @Override // defpackage.xlo
    public final xlq b(xhi xhiVar, String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        return new xma(xhiVar, instreamAdBreak, playerAd, str, this.a.d(), this.b, c(playerAd), this.g.a(), this.f);
    }
}
