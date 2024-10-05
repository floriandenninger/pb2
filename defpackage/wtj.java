package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA, b = apae.SLOT_TYPE_PLAYER_BYTES, c = {xdu.class, xdr.class}, d = {xdf.class, xdg.class})
/* loaded from: classes4.dex */
public final class wtj implements wts, wok {
    private final woc a;
    private final xgh b;
    private final xev c;
    private final wno d;
    private final xeo e;

    public wtj(woc wocVar, wqa wqaVar, xgh xghVar, xev xevVar, wno wnoVar) {
        this.a = wocVar;
        this.b = xghVar;
        this.c = xevVar;
        this.d = wnoVar;
        this.e = xeo.a((String) xghVar.d(xdf.class), (PlayerResponseModel) xghVar.d(xdg.class));
        wqaVar.a(this);
    }

    @Override // defpackage.wsx
    public final xev a() {
        return this.c;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wok
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.wok
    public final void j(long j) {
        this.a.k(j, ((MediaAd) this.c.e(xdu.class)).m);
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.a.b((String) this.b.d(xdf.class), (InstreamAdBreak) this.c.e(xdr.class), (MediaAd) this.c.e(xdu.class));
        this.d.b(this.e, this.b, this.c);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.d.f(this.e, this.b, this.c, i);
    }
}
