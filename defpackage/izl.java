package defpackage;

import com.google.protos.youtube.api.innertube.ShowInterstitialActionOuterClass$ShowInterstitialAction;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izl implements aaha {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private final acqz b;
    private final gov c;
    private final gnx d;

    public izl(acqz acqzVar, jgp jgpVar, gnx gnxVar, byte[] bArr, byte[] bArr2) {
        this.b = acqzVar;
        this.c = jgpVar.b(fav.RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED, a, TimeUnit.SECONDS);
        this.d = gnxVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        asjh asjhVar;
        if (apxfVar.pY(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction)) {
            if (((ShowInterstitialActionOuterClass$ShowInterstitialAction) apxfVar.pX(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction)).c || this.c.b()) {
                ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = (ShowInterstitialActionOuterClass$ShowInterstitialAction) apxfVar.pX(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
                autz autzVar = showInterstitialActionOuterClass$ShowInterstitialAction.b;
                if (autzVar == null) {
                    autzVar = autz.a;
                }
                if (autzVar.b == 86135402) {
                    autz autzVar2 = showInterstitialActionOuterClass$ShowInterstitialAction.b;
                    if (autzVar2 == null) {
                        autzVar2 = autz.a;
                    }
                    if (autzVar2.b == 86135402) {
                        asjhVar = (asjh) autzVar2.c;
                    } else {
                        asjhVar = asjh.a;
                    }
                    this.b.mM().D(new acqx(asjhVar.n));
                    this.d.e(asjhVar);
                    this.c.a();
                }
            }
        }
    }
}
