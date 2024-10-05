package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdo implements wny {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public agdo(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.wny
    public final void a(PlayerAd playerAd) {
        if (this.c != 0) {
            if (playerAd instanceof ForecastingAd) {
                return;
            }
            wzn wznVar = (wzn) this.a.get();
            long c = ((shf) this.b.get()).c();
            wznVar.h = anaf.O(Long.valueOf(c));
            ynm.m(wznVar.c.b(new fjv(c, 7)), lra.m);
            return;
        }
        if (playerAd == null) {
            return;
        }
        agsn a = ((agof) this.b.get()).a();
        if (playerAd.k) {
            a.g().g(playerAd.g, playerAd.j);
            if (!TextUtils.isEmpty(playerAd.n())) {
                a.g().h(playerAd.n());
            }
        }
        ((agdo) this.a.get()).a(playerAd);
    }
}
