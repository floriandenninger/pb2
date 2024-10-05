package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.FullscreenEngagementCompanionRendererOuterClass;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, d = {xdw.class, xds.class, xel.class})
/* loaded from: classes3.dex */
public final class ejx extends wqz {
    public final wyn a;
    private final Executor b;
    private final Executor c;
    private final xgh e;

    public ejx(wrd wrdVar, wyn wynVar, Executor executor, Executor executor2, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = executor;
        this.c = executor2;
        this.e = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final anhy anhyVar = (anhy) this.e.d(xel.class);
        amml ammlVar = new amml() { // from class: ejw
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                ejx ejxVar = ejx.this;
                anhy anhyVar2 = anhyVar;
                xgh xghVar = (xgh) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xghVar.d(xds.class);
                String str = (String) xghVar.d(xdw.class);
                PlayerAd playerAd = instreamAdImpl.b;
                aowz aowzVar = null;
                if ((playerAd instanceof LocalVideoAd) && !TextUtils.isEmpty(playerAd.n())) {
                    try {
                        WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anhyVar2.get();
                        if (watchNextResponseModel != null) {
                            wyn wynVar = ejxVar.a;
                            asfc asfcVar = watchNextResponseModel.a;
                            if ((asfcVar.b & 256) == 0) {
                                return null;
                            }
                            aulq aulqVar = asfcVar.i;
                            if (aulqVar == null) {
                                aulqVar = aulq.a;
                            }
                            if (!aulqVar.pY(FullscreenEngagementCompanionRendererOuterClass.fullscreenEngagementCompanionRenderer)) {
                                return null;
                            }
                            aqzi aqziVar = (aqzi) aulqVar.pX(FullscreenEngagementCompanionRendererOuterClass.fullscreenEngagementCompanionRenderer);
                            if ((aqziVar.b & 4) != 0 && (aowzVar = aqziVar.e) == null) {
                                aowzVar = aowz.a;
                            }
                            aowz aowzVar2 = aowzVar;
                            String a = wynVar.c.a(apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, xghVar.a);
                            return xev.d(a, apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, amru.r(xfo.e(wynVar.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA)), amru.q(), amru.q(), ammv.i(aowzVar2), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, aowzVar2)), xcp.b(new xdp(aqziVar)));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IllegalStateException("Exception getting the WatchNextResponseFuture", e);
                    }
                }
                return null;
            }
        };
        if (anhyVar.isDone()) {
            this.d.c(ammlVar);
        } else {
            this.d.a(ammlVar, this.b, this.c);
        }
    }
}
