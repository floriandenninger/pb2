package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_FORECASTING, d = {xdn.class})
/* loaded from: classes4.dex */
public final class wqv extends wqz {
    public final wyn a;

    public wqv(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wqu
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                xgh xghVar = (xgh) obj;
                return wqv.this.a.b(xghVar.a, null, (ForecastingAd) xghVar.d(xdn.class));
            }
        });
    }
}
