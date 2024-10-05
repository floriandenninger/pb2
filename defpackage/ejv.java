package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, d = {xdw.class, xds.class, xdp.class})
/* loaded from: classes3.dex */
public final class ejv extends wqz {
    public final wyn a;
    private final xgh b;

    public ejv(wrd wrdVar, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final aqzi aqziVar = (aqzi) this.b.d(xdp.class);
        this.d.c(new amml() { // from class: eju
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                ejv ejvVar = ejv.this;
                aqzi aqziVar2 = aqziVar;
                xgh xghVar = (xgh) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xghVar.d(xds.class);
                String str = (String) xghVar.d(xdw.class);
                PlayerAd playerAd = instreamAdImpl.b;
                aowz aowzVar = null;
                if (!(playerAd instanceof LocalVideoAd) || TextUtils.isEmpty(playerAd.n())) {
                    return null;
                }
                wyn wynVar = ejvVar.a;
                if ((aqziVar2.b & 4) != 0 && (aowzVar = aqziVar2.e) == null) {
                    aowzVar = aowz.a;
                }
                aowz aowzVar2 = aowzVar;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, xghVar.a);
                return xev.d(a, apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, amru.r(xfo.e(wynVar.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA)), amru.q(), amru.q(), ammv.i(aowzVar2), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, aowzVar2)), xcp.b(new xdp(aqziVar2)));
            }
        });
    }
}
