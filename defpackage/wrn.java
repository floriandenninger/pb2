package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.VideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER, d = {xdw.class, xdc.class, xdg.class, xde.class, xcs.class, xds.class, xdf.class})
/* loaded from: classes4.dex */
public final class wrn extends wqz {
    public final wyn a;
    public final xgh b;
    private final Executor c;
    private final Executor e;

    public wrn(wrd wrdVar, Executor executor, Executor executor2, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.c = executor;
        this.e = executor2;
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final anhy anhyVar = (anhy) this.b.d(xdc.class);
        amml ammlVar = new amml() { // from class: wrm
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wrn wrnVar = wrn.this;
                anhy anhyVar2 = anhyVar;
                xgh xghVar = (xgh) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xghVar.d(xds.class);
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                xcf xcfVar = (xcf) xghVar.d(xcs.class);
                String str = (String) xghVar.d(xde.class);
                String str2 = (String) xghVar.d(xdw.class);
                PlayerAd playerAd = instreamAdImpl.b;
                aowz aowzVar = null;
                if (!(playerAd instanceof VideoAd) || TextUtils.isEmpty(((VideoAd) playerAd).n())) {
                    whu.l(null, "Missing ad video id.");
                } else {
                    try {
                        aqde aqdeVar = (aqde) anhyVar2.get();
                        if (aqdeVar != null && !amkq.b(aqdeVar, aqde.a)) {
                            wyn wynVar = wrnVar.a;
                            xgh xghVar2 = wrnVar.b;
                            int i = aqdeVar.b;
                            if ((i & 512) != 0) {
                                aple apleVar = aqdeVar.l;
                                if (apleVar == null) {
                                    apleVar = aple.a;
                                }
                                aoxb aoxbVar = apleVar.b;
                                if (aoxbVar == null) {
                                    aoxbVar = aoxb.a;
                                }
                                return wynVar.j(xghVar2, apleVar, wynVar.h(aoxbVar.b, str, str2, instreamAdImpl, xcfVar), amru.q(), amru.q());
                            }
                            if ((i & 256) != 0) {
                                aoxa aoxaVar = aqdeVar.k;
                                if (aoxaVar == null) {
                                    aoxaVar = aoxa.a;
                                }
                                aowzVar = aoxaVar.b;
                                if (aowzVar == null) {
                                    aowzVar = aowz.a;
                                }
                            }
                            aowz aowzVar2 = aowzVar;
                            String a = wynVar.c.a(apac.LAYOUT_TYPE_COMPANION, xghVar2.a);
                            ashd c = wynVar.d.c(xghVar2, a, apac.LAYOUT_TYPE_COMPANION, 1, aowzVar2);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new xds(instreamAdImpl));
                            arrayList.add(new xdg(playerResponseModel));
                            arrayList.add(new xdd(aqdeVar));
                            return xev.d(a, apac.LAYOUT_TYPE_COMPANION, 1, wynVar.h(a, str, str2, instreamAdImpl, xcfVar), amru.q(), amru.q(), ammv.i(aowzVar2), ammv.j(c), xcp.a(arrayList));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
                return null;
            }
        };
        if (anhyVar.isDone()) {
            this.d.c(ammlVar);
        } else {
            this.d.a(ammlVar, this.c, this.e);
        }
    }
}
