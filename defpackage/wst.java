package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_FORECASTING, b = apae.SLOT_TYPE_FORECASTING, c = {xdn.class}, d = {xdf.class, xdr.class})
/* loaded from: classes4.dex */
public final class wst implements wsx {
    private final wsw a;
    private final woc b;
    private final xgh c;
    private final xev d;
    private final String e;
    private final InstreamAdBreak f;
    private final ForecastingAd g;
    private final wxz h;

    public wst(wsw wswVar, wxz wxzVar, woc wocVar, xgh xghVar, xev xevVar) {
        this.a = wswVar;
        this.h = wxzVar;
        this.b = wocVar;
        this.c = xghVar;
        this.d = xevVar;
        this.e = (String) xghVar.d(xdf.class);
        this.f = (InstreamAdBreak) xghVar.d(xdr.class);
        this.g = (ForecastingAd) xevVar.e(xdn.class);
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.a.a(this.c, this.d);
        this.b.o(this.e, this.f, this.g);
        this.h.b(this.d, 0);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.a.e(this.c, this.d, i);
    }
}
