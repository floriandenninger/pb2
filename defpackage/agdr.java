package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_PLAYER_BYTES, d = {xdg.class, xdf.class, xej.class})
/* loaded from: classes.dex */
public final class agdr extends wqz {
    public final wyn a;
    public final wzn b;
    public final acud c;
    public final aapf e;
    public final shf f;
    public final long g;
    public final long h;
    public final long i;
    public final ajoy j;
    public final yfl k;
    private final Executor l;
    private final Executor m;

    public agdr(wrd wrdVar, ajoy ajoyVar, wyn wynVar, yfl yflVar, wzn wznVar, acud acudVar, aapf aapfVar, shf shfVar, Executor executor, Executor executor2, aghr aghrVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(wrdVar);
        this.j = ajoyVar;
        this.a = wynVar;
        this.k = yflVar;
        this.b = wznVar;
        this.c = acudVar;
        this.e = aapfVar;
        this.f = shfVar;
        this.l = executor;
        this.m = executor2;
        this.g = aghrVar.a() * 1000;
        this.h = aghrVar.c() * 1000;
        this.i = aghrVar.b() * 1000;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.b(new amml() { // from class: agdq
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                InstreamAdBreak instreamAdBreak;
                PlayerAd playerAd;
                agdr agdrVar = agdr.this;
                xgh xghVar = (xgh) obj;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                if (playerResponseModel.B()) {
                    List e = agdrVar.j.k().e(playerResponseModel.y());
                    if (e == null || e.isEmpty()) {
                        instreamAdBreak = null;
                    } else {
                        if (e.size() > 1) {
                            throw new IllegalStateException("Got more than one adBreak for offline");
                        }
                        instreamAdBreak = (InstreamAdBreak) e.get(0);
                        if (instreamAdBreak.b() != xfn.PRE_ROLL) {
                            throw new IllegalStateException("Got non-preroll adBreak for offline");
                        }
                        if (!instreamAdBreak.e) {
                            throw new IllegalStateException("Fulfilled adBreak that was not for offline");
                        }
                    }
                    if (instreamAdBreak != null) {
                        InstreamAdImpl c = agdrVar.j.k().c(instreamAdBreak.f, instreamAdBreak.g);
                        if (c != null) {
                            ArrayList arrayList = new ArrayList();
                            long b = agdrVar.b.b();
                            if (b > 0) {
                                long j = agdrVar.g;
                                if (j > 0 && b + j > agdrVar.f.c()) {
                                    arrayList.add(aamo.REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP);
                                }
                            }
                            zbw zbwVar = agdrVar.b.e;
                            if (zbwVar != null) {
                                long a = zbwVar.a();
                                if (a != -1) {
                                    long j2 = c.m() ? agdrVar.h : agdrVar.i;
                                    if (j2 > 0 && a > j2) {
                                        arrayList.add(aamo.REASON_CLIENT_OFFLINE_INACTIVE_USER);
                                    }
                                }
                            }
                            if (c.c() != -1) {
                                if (Math.max(c.i() == null ? 0 : agdrVar.j.k().b(c.i()), agdrVar.j.k().a(c.j(), c.g())) >= c.c()) {
                                    arrayList.add(aamo.REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP);
                                }
                            }
                            if (c.k(agdrVar.f)) {
                                arrayList.add(aamo.REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED);
                            }
                            if (c.i() != null) {
                                if (agdrVar.j.k().d(c.i()) != agnf.COMPLETE) {
                                    arrayList.add(aamo.REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                if (TextUtils.isEmpty(c.i())) {
                                    playerAd = c.b;
                                } else {
                                    agnn a2 = agdrVar.j.l().d().a(c.i(), agdrVar.f.d() + (c.a() - agdrVar.f.c()));
                                    agej b2 = agdrVar.j.l().b();
                                    if (a2 != null && b2 != null) {
                                        FormatStreamModel d = a2.d(b2.g());
                                        FormatStreamModel b3 = a2.b(b2.g());
                                        if (d != null && b3 != null) {
                                            PlayerResponseModel D = aedn.D(c.b.g(), agdrVar.e, d, b3);
                                            agdrVar.f.c();
                                            LocalVideoAd localVideoAd = (LocalVideoAd) c.b;
                                            playerAd = new InstreamAdImpl(new LocalVideoAd(localVideoAd.g, localVideoAd.h, localVideoAd.i, localVideoAd.j, localVideoAd.k, localVideoAd.m, localVideoAd.n, localVideoAd.b, D, localVideoAd.d)).b;
                                        }
                                    }
                                    playerAd = null;
                                }
                                if (playerAd != null) {
                                    return agdrVar.a.k(xghVar.a, instreamAdBreak, Arrays.asList(playerAd));
                                }
                            } else {
                                agdrVar.c.c("DISALLOW", TextUtils.join(",", arrayList));
                                agdrVar.c.b(c.b.E());
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Got non-offline fulfillment request");
            }
        }, this.l, this.m, new wrc() { // from class: agdp
            @Override // defpackage.wrc
            public final xev a(xgh xghVar, xev xevVar) {
                agdr agdrVar = agdr.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                String str = (String) xghVar.d(xdf.class);
                aixh aixhVar = (aixh) xghVar.d(xej.class);
                if (xevVar != null) {
                    if (xevVar.b == apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        return xevVar;
                    }
                    if (xevVar.g(apac.LAYOUT_TYPE_FORECASTING, xdn.class, xdr.class)) {
                        agdrVar.k.b(xghVar, str, aixhVar, playerResponseModel, (InstreamAdBreak) xevVar.e(xdr.class), (ForecastingAd) xevVar.e(xdn.class));
                        return null;
                    }
                }
                return null;
            }
        });
    }
}
