package defpackage;

import android.content.Context;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class anvh implements anul {
    private final /* synthetic */ int i;
    public static final /* synthetic */ anvh h = new anvh(7);
    public static final /* synthetic */ anvh g = new anvh(6);
    public static final /* synthetic */ anvh f = new anvh(5);
    public static final /* synthetic */ anvh e = new anvh(4);
    public static final /* synthetic */ anvh d = new anvh(3);
    public static final /* synthetic */ anvh c = new anvh(2);
    public static final /* synthetic */ anvh b = new anvh(1);
    public static final /* synthetic */ anvh a = new anvh(0);

    private /* synthetic */ anvh(int i) {
        this.i = i;
    }

    @Override // defpackage.anul
    public final Object a(anuk anukVar) {
        switch (this.i) {
            case 0:
                oxa.b((Context) anukVar.a(Context.class));
                return oxa.a().c();
            case 1:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(anukVar);
            case 2:
                return new anwf((Context) anukVar.a(Context.class));
            case 3:
                antc antcVar = (antc) anukVar.a(antc.class);
                return new FirebaseInstanceId(antcVar, new anwp(antcVar.a()), anwi.a(), anwi.a(), anukVar.b(aoag.class), anukVar.b(anwg.class), (anxe) anukVar.a(anxe.class));
            case 4:
                return new anwq((FirebaseInstanceId) anukVar.a(FirebaseInstanceId.class));
            case 5:
                return new anxd((antc) anukVar.a(antc.class), anukVar.b(aoag.class), anukVar.b(anwg.class));
            case 6:
                return new FirebaseMessaging((antc) anukVar.a(antc.class), (anwx) anukVar.a(anwx.class), anukVar.b(aoag.class), anukVar.b(anwg.class), (anxe) anukVar.a(anxe.class), (owx) anukVar.a(owx.class), (anwd) anukVar.a(anwd.class));
            default:
                anvg anvgVar = (anvg) anukVar;
                if (!anvgVar.a.contains(aoaf.class)) {
                    throw new anuw(String.format("Attempting to request an undeclared dependency Set<%s>.", aoaf.class));
                }
                Set set = (Set) ((anug) anvgVar.b).c(aoaf.class).a();
                aoae aoaeVar = aoae.a;
                if (aoaeVar == null) {
                    synchronized (aoae.class) {
                        aoaeVar = aoae.a;
                        if (aoaeVar == null) {
                            aoaeVar = new aoae();
                            aoae.a = aoaeVar;
                        }
                    }
                }
                return new aoad(set, aoaeVar);
        }
    }
}
