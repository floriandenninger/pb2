package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_FORECASTING, d = {xdr.class, xdg.class, xdo.class})
/* loaded from: classes4.dex */
public final class wqx extends wqz {
    public final wyn a;
    public final shf b;
    public final ajoy c;

    public wqx(wrd wrdVar, ajoy ajoyVar, wyn wynVar, shf shfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(wrdVar);
        this.c = ajoyVar;
        this.a = wynVar;
        this.b = shfVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wqw
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wqx wqxVar = wqx.this;
                xgh xghVar = (xgh) obj;
                InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xghVar.d(xdr.class);
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                return wqxVar.a.b(xghVar.a, null, new ForecastingAd(instreamAdBreak, playerResponseModel.c(), wqxVar.c.x(), wqxVar.b.c(), (aqxo) xghVar.d(xdo.class)));
            }
        });
    }
}
