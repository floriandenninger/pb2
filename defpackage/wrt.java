package defpackage;

import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_PLAYBACK_TRACKING, d = {xei.class, xdf.class, xdg.class})
/* loaded from: classes4.dex */
public final class wrt extends wqz {
    public final wyn a;
    private final xgh b;

    public wrt(wrd wrdVar, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final avwa avwaVar = (avwa) this.b.d(xei.class);
        final PlayerResponseModel playerResponseModel = (PlayerResponseModel) this.b.d(xdg.class);
        this.d.c(new amml() { // from class: wrs
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wrt wrtVar = wrt.this;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                avwa avwaVar2 = avwaVar;
                xgh xghVar = (xgh) obj;
                String str = (String) xghVar.d(xdf.class);
                VideoTrackingAd videoTrackingAd = new VideoTrackingAd(playerResponseModel2.y(), playerResponseModel2.G(), playerResponseModel2.v(), playerResponseModel2.B(), playerResponseModel2.c(), playerResponseModel2.a(), avwaVar2);
                wyn wynVar = wrtVar.a;
                aowz o = videoTrackingAd.o();
                String a = wynVar.c.a(apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, xghVar.a);
                ashd c = wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, 1, o);
                apac apacVar = apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER;
                amru r = amru.r(xfs.a(wynVar.c.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str));
                amru q = amru.q();
                amru q2 = amru.q();
                ammv i = ammv.i(o);
                ammv j = ammv.j(c);
                wyo wyoVar = wynVar.a;
                aoyi aoyiVar = videoTrackingAd.a.c;
                if (aoyiVar == null) {
                    aoyiVar = aoyi.a;
                }
                return xev.i(a, apacVar, r, q, q2, i, j, ammv.j(wyoVar.a(new VideoAdTrackingModel(aoyiVar))), xcp.b(new xek(videoTrackingAd)));
            }
        });
    }
}
