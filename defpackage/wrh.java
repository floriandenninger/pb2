package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_IN_PLAYER, d = {xdj.class, xdu.class, xdw.class})
/* loaded from: classes4.dex */
public final class wrh extends wqz {
    public final wyn a;

    public wrh(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wrg
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aowz aowzVar;
                wrh wrhVar = wrh.this;
                xgh xghVar = (xgh) obj;
                String str = (String) xghVar.d(xdw.class);
                MediaAd mediaAd = (MediaAd) xghVar.d(xdu.class);
                wyn wynVar = wrhVar.a;
                if (mediaAd.k() != null) {
                    aowzVar = mediaAd.k().j;
                    if (aowzVar == null) {
                        aowzVar = aowz.a;
                    }
                } else {
                    aowzVar = null;
                }
                aowz aowzVar2 = aowzVar;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_AD_INFO_OVERLAY, xghVar.a);
                return xev.d(a, apac.LAYOUT_TYPE_AD_INFO_OVERLAY, 1, amru.r(xfb.e(wynVar.c.c(apah.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), amru.q(), amru.q(), ammv.i(aowzVar2), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_AD_INFO_OVERLAY, 1, aowzVar2)), xcp.b(new xcy[0]));
            }
        });
    }
}
