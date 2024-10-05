package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wye implements xci {
    final /* synthetic */ xgh a;
    final /* synthetic */ xev b;
    final /* synthetic */ wyf c;
    final /* synthetic */ wtk d;

    public wye(wyf wyfVar, wtk wtkVar, xgh xghVar, xev xevVar) {
        this.c = wyfVar;
        this.d = wtkVar;
        this.a = xghVar;
        this.b = xevVar;
    }

    @Override // defpackage.xci
    public final void d(int i, int i2) {
        ((woc) this.c.c.get()).j(i, i2);
        wtk wtkVar = this.d;
        wtn wtnVar = wtkVar.a;
        String str = wtkVar.b;
        int i3 = wtkVar.c;
        if (!wtnVar.o() || !TextUtils.equals(str, ((xev) wtnVar.e.get(wtnVar.f)).a)) {
            wtnVar.a.d(wtnVar.c, wtnVar.d, new wxd("Skipped subLayout when a different subLayout was anticipated to be playing"));
            return;
        }
        wtnVar.m(2);
        while (wtnVar.f < wtnVar.e.size() - 1) {
            List list = wtnVar.b;
            int i4 = wtnVar.f + 1;
            wtnVar.f = i4;
            wts wtsVar = (wts) list.get(i4);
            PlayerAd j = wtn.j(wtsVar.a());
            if (j == null) {
                wtnVar.a.d(wtnVar.c, wtnVar.d, new wxd("SubLayout does not have a valid PlayerAd"));
                return;
            } else if (j.p() == i3) {
                wtsVar.qu();
                return;
            }
        }
        wtnVar.a.d(wtnVar.c, wtnVar.d, new wxd("Skip-to-index was requested but target index was not found"));
    }

    @Override // defpackage.xci
    public final void e() {
        wyf wyfVar = this.c;
        xgh xghVar = this.a;
        xev xevVar = this.b;
        wyfVar.e(xghVar, xevVar, xevVar.a, wyf.b);
    }
}
