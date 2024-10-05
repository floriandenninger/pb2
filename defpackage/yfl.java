package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfl {
    public final azrw a;
    public final azrw b;

    public yfl(azrw azrwVar, azrw azrwVar2, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public yfl(azrw azrwVar, azrw azrwVar2, short[] sArr) {
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public final void a(xeq xeqVar) {
        ((wqd) this.a.get()).a((xhk) this.b.get(), xeqVar);
    }

    public final void b(final xgh xghVar, final String str, final aixh aixhVar, final PlayerResponseModel playerResponseModel, final InstreamAdBreak instreamAdBreak, final ForecastingAd forecastingAd) {
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        ((ajoy) this.b.get()).w(9, xeo.a(str, playerResponseModel), new wwc(xghVar, str, aixhVar, playerResponseModel, instreamAdBreak, forecastingAd, bArr, bArr2) { // from class: wvv
            public final /* synthetic */ xgh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ aixh c;
            public final /* synthetic */ PlayerResponseModel d;
            public final /* synthetic */ InstreamAdBreak e;
            public final /* synthetic */ ForecastingAd f;

            @Override // defpackage.wwc
            public final List a() {
                xgu xguVar;
                yfl yflVar = yfl.this;
                xgh xghVar2 = this.a;
                String str2 = this.b;
                aixh aixhVar2 = this.c;
                PlayerResponseModel playerResponseModel2 = this.d;
                InstreamAdBreak instreamAdBreak2 = this.e;
                ForecastingAd forecastingAd2 = this.f;
                xgh[] xghVarArr = new xgh[1];
                wyt wytVar = (wyt) yflVar.a.get();
                aqxo aqxoVar = forecastingAd2.b;
                if (instreamAdBreak2.b() == xfn.PRE_ROLL) {
                    xguVar = new xgu(0L, 0L);
                } else {
                    amru amruVar = xghVar2.d;
                    int i = ((amvj) amruVar).c;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            xgx xgxVar = (xgx) amruVar.get(i2);
                            i2++;
                            if (xgxVar instanceof xfl) {
                                xguVar = ((xfl) xgxVar).d;
                                break;
                            }
                        } else {
                            xguVar = new xgu(0L, 0L);
                            break;
                        }
                    }
                }
                xghVarArr[0] = wytVar.a(aqxoVar, str2, aixhVar2, playerResponseModel2, instreamAdBreak2, xguVar, forecastingAd2);
                return Arrays.asList(xghVarArr);
            }
        });
    }

    public yfl(azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public yfl(azrw azrwVar, azrw azrwVar2, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public yfl(azrw azrwVar, azrw azrwVar2, byte[] bArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public yfl(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }
}
