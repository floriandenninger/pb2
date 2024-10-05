package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wvu implements wwp {
    public final azrw a;
    private final azrw b;
    private final amsx c;
    private final aaea d;

    public wvu(azrw azrwVar, azrw azrwVar2, amsx amsxVar, aaea aaeaVar) {
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = amsxVar;
        this.d = aaeaVar;
    }

    @Override // defpackage.wwp
    public final void o(xgh xghVar, final xev xevVar) {
        final aulq aulqVar;
        if (wbs.o(this.d) && this.c.contains(apae.SLOT_TYPE_IN_PLAYER) && xghVar.h(apae.SLOT_TYPE_PLAYBACK_TRACKING, xdf.class, xdg.class) && xevVar.g(apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, new Class[0])) {
            final String str = (String) xghVar.d(xdf.class);
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
            aryr aryrVar = playerResponseModel.a;
            if ((2 & aryrVar.c) != 0) {
                aulqVar = aryrVar.G;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            } else {
                aulqVar = null;
            }
            if (aulqVar == null) {
                return;
            }
            ((ajoy) this.b.get()).w(19, xeo.a(str, playerResponseModel), new wwc() { // from class: wvt
                @Override // defpackage.wwc
                public final List a() {
                    wvu wvuVar = wvu.this;
                    xev xevVar2 = xevVar;
                    String str2 = str;
                    aulq aulqVar2 = aulqVar;
                    String str3 = xevVar2.a;
                    wyt wytVar = (wyt) wvuVar.a.get();
                    String b = wytVar.b.b(apae.SLOT_TYPE_IN_PLAYER);
                    return Arrays.asList(xgh.j(b, apae.SLOT_TYPE_IN_PLAYER, amru.r(xfa.e(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str3)), amru.r(xgk.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b)), amru.s(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xcp.b(new xdi(aulqVar2), new xdk(str3))));
                }
            });
        }
    }
}
