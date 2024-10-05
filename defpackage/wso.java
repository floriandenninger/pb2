package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_COMPANION, b = apae.SLOT_TYPE_BELOW_PLAYER, c = {xdx.class}, d = {xdg.class})
/* loaded from: classes4.dex */
public final class wso implements wsx {
    private final wsw a;
    private final woo b;
    private final xgh c;
    private final xev d;
    private final PlayerResponseModel e;

    public wso(wsw wswVar, woo wooVar, xgh xghVar, xev xevVar) {
        this.a = wswVar;
        this.b = wooVar;
        this.c = xghVar;
        this.d = xevVar;
        this.e = (PlayerResponseModel) xghVar.d(xdg.class);
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
        woo wooVar = this.b;
        xev xevVar = this.d;
        String str = xevVar.a;
        PlayerResponseModel playerResponseModel = this.e;
        ashd ashdVar = (ashd) xevVar.i.f();
        wnc wncVar = (wnc) wooVar;
        wncVar.c();
        wncVar.d(wncVar.a(playerResponseModel, str, ashdVar));
        wncVar.d = true;
        wmz wmzVar = wncVar.b;
        if (wmzVar != null) {
            wmzVar.f();
        }
        this.a.a(this.c, this.d);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        ((wnc) this.b).c();
        this.a.e(this.c, this.d, i);
    }
}
