package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahwf implements ayrs {
    public final /* synthetic */ LiveOverlayPresenter a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahwf(LiveOverlayPresenter liveOverlayPresenter, int i) {
        this.b = i;
        this.a = liveOverlayPresenter;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        astf h;
        int i = this.b;
        if (i == 0) {
            this.a.i((ahcx) obj);
            return;
        }
        if (i == 1) {
            LiveOverlayPresenter liveOverlayPresenter = this.a;
            ajbl ajblVar = (ajbl) ((Pair) obj).first;
            if (ajblVar == null || ajblVar.c() == null || (h = LiveOverlayPresenter.h(ajblVar.c().q())) == null || liveOverlayPresenter.i != null) {
                return;
            }
            liveOverlayPresenter.i = h;
            liveOverlayPresenter.q();
            return;
        }
        if (i == 2) {
            this.a.l((ahef) obj);
            return;
        }
        if (i == 3) {
            this.a.m((aheg) obj);
            return;
        }
        if (i == 4) {
            this.a.n((ahej) obj);
            return;
        }
        if (i != 5) {
            LiveOverlayPresenter liveOverlayPresenter2 = this.a;
            aryi aryiVar = (aryi) obj;
            if (LiveOverlayPresenter.h(aryiVar) == null && !liveOverlayPresenter2.l) {
                return;
            }
            if (!liveOverlayPresenter2.l) {
                liveOverlayPresenter2.i = LiveOverlayPresenter.h(aryiVar);
            }
            if (liveOverlayPresenter2.i != null) {
                if (liveOverlayPresenter2.l) {
                    liveOverlayPresenter2.q();
                } else {
                    liveOverlayPresenter2.p();
                    liveOverlayPresenter2.q();
                }
            }
            astf astfVar = liveOverlayPresenter2.i;
            if (astfVar != null) {
                aste asteVar = astfVar.h;
                if (asteVar == null) {
                    asteVar = aste.a;
                }
                if (asteVar.b) {
                    ahvy ahvyVar = liveOverlayPresenter2.a;
                    aste asteVar2 = astfVar.h;
                    if (asteVar2 == null) {
                        asteVar2 = aste.a;
                    }
                    ahvyVar.o(asteVar2.c);
                    return;
                }
                return;
            }
            return;
        }
        LiveOverlayPresenter liveOverlayPresenter3 = this.a;
        boolean z = ((ahel) obj).a().a() == 3;
        liveOverlayPresenter3.l = z;
        if (z) {
            PlayerResponseModel playerResponseModel = liveOverlayPresenter3.m;
            if (playerResponseModel != null) {
                liveOverlayPresenter3.i = LiveOverlayPresenter.h(playerResponseModel.q());
            }
            ayqx ayqxVar = liveOverlayPresenter3.j;
            if (ayqxVar != null && !ayqxVar.e()) {
                azqb.f((AtomicReference) liveOverlayPresenter3.j);
            }
            liveOverlayPresenter3.j = liveOverlayPresenter3.e.d.n().E(azre.b(liveOverlayPresenter3.d)).X(liveOverlayPresenter3.f);
        }
        liveOverlayPresenter3.a.r(liveOverlayPresenter3.l);
    }
}
