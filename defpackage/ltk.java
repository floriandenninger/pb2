package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ltk implements aalw {
    public final Context a;
    public final jmq b;
    private final fif c;
    private final lyw d;

    public ltk(Context context, fif fifVar, lyw lywVar, jmq jmqVar) {
        this.a = context;
        this.c = fifVar;
        this.d = lywVar;
        this.b = jmqVar;
    }

    @Override // defpackage.aalw
    public final amru a(final atda atdaVar, Object obj) {
        atdaVar.getClass();
        apxf dl = adyu.dl(atdaVar);
        if (dl == null || !dl.pY(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return amru.q();
        }
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) dl.pX(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "").isEmpty()) {
            return amru.q();
        }
        return (amru) this.c.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "").s(new ayrv() { // from class: lti
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                jmt bP;
                ltk ltkVar = ltk.this;
                aakt aaktVar = (aakt) obj2;
                ayps w = ayps.w(aaktVar.d());
                jmq jmqVar = ltkVar.b;
                if (aaktVar instanceof awil) {
                    bP = evr.bQ((awil) aaktVar);
                } else {
                    bP = evr.bP((asxs) aaktVar);
                }
                return w.M(wbs.L(jmqVar.a(bP)), knl.c);
            }
        }).x(new ayrv() { // from class: ltj
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                ltk ltkVar = ltk.this;
                atda atdaVar2 = atdaVar;
                ammw ammwVar = (ammw) obj2;
                String str = (String) ammwVar.a;
                jps jpsVar = (jps) ammwVar.b;
                amrp f = amru.f();
                jps jpsVar2 = jps.PLAYABLE;
                switch (jpsVar.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        f.h(etx.d(ltkVar.a, atdaVar2, 4, R.string.pause_offline, ammv.j(arfr.OFFLINE_PAUSE), ammv.j(str)));
                        break;
                    case 4:
                        f.h(etx.d(ltkVar.a, atdaVar2, 6, R.string.resume_offline, ammv.j(arfr.OFFLINE_RESUME), ammv.j(str)));
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 13:
                        f.h(etx.d(ltkVar.a, atdaVar2, 5, R.string.offline_retry_failed_videos_menu_item, ammv.j(arfr.OFFLINE_RESUME), ammv.j(str)));
                        break;
                    case 8:
                        f.h(etx.d(ltkVar.a, atdaVar2, 9, R.string.renew_offline, ammv.j(arfr.OFFLINE_RESUME), ammv.j(str)));
                        break;
                    case 10:
                        f.h(etx.d(ltkVar.a, atdaVar2, 8, R.string.retry_offline, ammv.j(arfr.OFFLINE_RESUME), ammv.j(str)));
                        break;
                }
                f.h(etx.d(ltkVar.a, atdaVar2, 3, R.string.remove_offline, ammv.j(arfr.OFFLINE_REMOVE), ammv.j(str)));
                return f.g();
            }
        }).S(this.d.a(atdaVar, obj)).N(4L, TimeUnit.SECONDS).X();
    }

    @Override // defpackage.aalw
    public final atda b(atda atdaVar, Object obj) {
        return this.d.b(atdaVar, obj);
    }
}
