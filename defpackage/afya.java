package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afya {
    public final ammv a;
    private final Context b;
    private final ammv c;
    private final agda d;
    private final agar e;
    private final agas f;
    private final Executor g;
    private final azrw h;
    private final aaea i;
    private final acra j;
    private final afzy k;

    public afya(Context context, ammv ammvVar, agda agdaVar, agar agarVar, agas agasVar, Executor executor, ammv ammvVar2, azrw azrwVar, aaea aaeaVar, acra acraVar, afzy afzyVar) {
        this.b = context;
        this.c = ammvVar;
        this.d = agdaVar;
        this.e = agarVar;
        this.f = agasVar;
        this.g = executor;
        this.a = ammvVar2;
        this.h = azrwVar;
        this.i = aaeaVar;
        this.j = acraVar;
        this.k = afzyVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aooy, java.lang.Object] */
    private static aooy b(aopf aopfVar, byte[] bArr) {
        try {
            return aopfVar.n(bArr, aomw.b());
        } catch (aoob unused) {
            return null;
        }
    }

    private final void c(final List list) {
        if (list != null) {
            this.g.execute(new Runnable() { // from class: afxz
                @Override // java.lang.Runnable
                public final void run() {
                    afya afyaVar = afya.this;
                    ((aahd) ((amna) afyaVar.a).a).e(list, null);
                }
            });
        }
    }

    private static boolean d(Class cls, String str) {
        return cls.getName().equals(str);
    }

    public final void a(byte[] bArr, String str) {
        agaq agaqVar;
        atnb atnbVar;
        int i;
        asjn asjnVar = null;
        if (d(apeo.class, str)) {
            apeo apeoVar = (apeo) b(apeo.a.getParserForType(), bArr);
            this.k.a(atna.NOTAIRE_EVENT_TYPE_PAYLOAD_PROCESSING_STARTED, apeoVar);
            boolean z = (apeoVar == null || apeoVar.m.size() == 0) ? false : true;
            if (z) {
                c(apeoVar.m);
                this.k.a(atna.NOTAIRE_EVENT_TYPE_COMMANDS_EXECUTED, apeoVar);
            }
            if (!aghv.f(apeoVar) && !aghv.g(apeoVar, (ajut) ((amna) this.c).a)) {
                if (z) {
                    return;
                }
                this.k.a(atna.NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_2, apeoVar);
                return;
            }
            this.k.a(atna.NOTAIRE_EVENT_TYPE_NOTIFICATION_BUILDING_STARTED, apeoVar);
            if ((apeoVar.b & 32768) != 0) {
                this.j.d(acsb.b(28631), null, null);
            }
            agar agarVar = this.e;
            agas agasVar = this.f;
            acra acraVar = this.j;
            Iterator it = agarVar.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    agal agalVar = (agal) ((WeakReference) it.next()).get();
                    if (agalVar == null) {
                        it.remove();
                    } else if (agalVar.a(apeoVar)) {
                        break;
                    }
                } else if (aghv.f(apeoVar) || aghv.g(apeoVar, (ajut) ((amna) agasVar.b).a)) {
                    apek apekVar = apeoVar.e;
                    if (apekVar == null) {
                        apekVar = apek.a;
                    }
                    String str2 = apekVar.c;
                    apek apekVar2 = apeoVar.e;
                    if (apekVar2 == null) {
                        apekVar2 = apek.a;
                    }
                    agbs b = agbs.b(str2, apekVar2.d, yjk.q());
                    dy dyVar = new dy(agasVar.a);
                    Iterator it2 = agasVar.c.iterator();
                    while (it2.hasNext()) {
                        ((agbr) it2.next()).a(apeoVar, acraVar, b, dyVar);
                    }
                    aear.K(dyVar, b);
                    agap agapVar = new agap(dyVar.b(), b);
                    asuh asuhVar = apeoVar.u;
                    if (asuhVar == null) {
                        asuhVar = asuh.b;
                    }
                    agaqVar = new agaq(agapVar, asuhVar);
                }
            }
            agaqVar = null;
            if (agaqVar != null) {
                Context context = this.b;
                azrw azrwVar = this.h;
                aaea aaeaVar = this.i;
                acra acraVar2 = this.j;
                afzy afzyVar = this.k;
                if ((apeoVar.b & 16384) != 0) {
                    atnbVar = apeoVar.t;
                    if (atnbVar == null) {
                        atnbVar = atnb.a;
                    }
                } else {
                    atnbVar = null;
                }
                agaqVar.a.a(context, false);
                afzz.f(azrwVar, "POSTED", aaeaVar);
                if (afzyVar != null) {
                    afzyVar.b(atna.NOTAIRE_EVENT_TYPE_NOTIFICATION_POSTED, atnbVar);
                }
                asuh asuhVar2 = agaqVar.b;
                if (asuhVar2 != null && (1 & asuhVar2.c) != 0) {
                    acqx acqxVar = new acqx(asuhVar2.d);
                    ((acqq) acraVar2).D(acqxVar);
                    acraVar2.u(acqxVar, null);
                }
                if ((apeoVar.b & 32) != 0) {
                    aahd aahdVar = (aahd) ((amna) this.a).a;
                    apxf apxfVar = apeoVar.j;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                }
                if (Build.VERSION.SDK_INT >= 23 && (i = apeoVar.r) > 0) {
                    Context context2 = this.b;
                    acra acraVar3 = this.j;
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                    StatusBarNotification[] Y = aear.Y(context2);
                    int length = Y.length - i;
                    if (length > 0) {
                        Arrays.sort(Y, unt.n);
                        for (int i2 = 0; i2 < length; i2++) {
                            StatusBarNotification statusBarNotification = Y[i2];
                            aear.W(acraVar3, statusBarNotification.getNotification());
                            notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                        }
                    }
                }
                c(apeoVar.l);
                return;
            }
            this.k.a(atna.NOTAIRE_EVENT_TYPE_NOTIFICATION_DID_NOT_BUILD, apeoVar);
            zga.l("System notification suppressed or failed to build.");
            return;
        }
        if (d(aphy.class, str)) {
            aphy aphyVar = (aphy) b(aphy.a.getParserForType(), bArr);
            if (aphyVar != null) {
                c(aphyVar.b);
                return;
            }
            return;
        }
        if (d(asjo.class, str)) {
            try {
                asjo asjoVar = (asjo) aonm.parseFrom(asjo.a, bArr, aomw.b());
                if ((asjoVar.b & 1) != 0) {
                    agda agdaVar = this.d;
                    asjm asjmVar = asjoVar.c;
                    if (asjmVar == null) {
                        asjmVar = asjm.a;
                    }
                    asjl asjlVar = asjmVar.c;
                    if (asjlVar == null) {
                        asjlVar = asjl.a;
                    }
                    String str3 = asjlVar.e;
                    asjm asjmVar2 = asjoVar.c;
                    if (asjmVar2 == null) {
                        asjmVar2 = asjm.a;
                    }
                    if ((asjmVar2.b & 2) != 0) {
                        asjm asjmVar3 = asjoVar.c;
                        if (asjmVar3 == null) {
                            asjmVar3 = asjm.a;
                        }
                        asjnVar = asjmVar3.d;
                        if (asjnVar == null) {
                            asjnVar = asjn.a;
                        }
                    }
                    agdaVar.d(str3, asjnVar);
                    return;
                }
                return;
            } catch (aoob unused) {
                return;
            }
        }
        zga.b("Unknown renderer type.");
    }
}
