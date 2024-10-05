package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqt extends uqq implements upq, uog {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");
    private final upo b;
    private final Context c;
    private final uok d;
    private final Executor e;
    private final uqo f;
    private final azrw g;
    private final axpg h;
    private final azrw i;
    private final azrw j;

    public uqt(upp uppVar, Context context, uok uokVar, Executor executor, uqo uqoVar, azrw azrwVar, axpg axpgVar, azrw azrwVar2, azrw azrwVar3) {
        this.b = uppVar.a(executor, axpgVar, null);
        this.c = context;
        this.d = uokVar;
        this.e = executor;
        this.f = uqoVar;
        this.g = azrwVar;
        this.h = axpgVar;
        this.i = azrwVar2;
        this.j = azrwVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ anhy t(final uqt uqtVar) {
        if (!((uqn) uqtVar.h.get()).b()) {
            return anhv.a;
        }
        if (!Application.getProcessName().equals(uqtVar.c.getPackageName())) {
            return anhv.a;
        }
        if (!((Boolean) uqtVar.i.get()).booleanValue()) {
            return anhv.a;
        }
        final List a2 = uqtVar.f.a(0, 0, ((SharedPreferences) uqtVar.g.get()).getString("lastExitProcessName", null), ((SharedPreferences) uqtVar.g.get()).getLong("lastExitTimestamp", -1L));
        if (a2.isEmpty()) {
            return anhv.a;
        }
        baau baauVar = (baau) uqtVar.j.get();
        aone createBuilder = baat.a.createBuilder();
        int i = ((amvj) a2).c;
        createBuilder.copyOnWrite();
        baat baatVar = (baat) createBuilder.instance;
        baatVar.b |= 2;
        baatVar.e = i;
        createBuilder.copyOnWrite();
        baat baatVar2 = (baat) createBuilder.instance;
        baauVar.getClass();
        baatVar2.d = baauVar;
        baatVar2.b |= 1;
        HashSet an = amkq.an();
        for (int i2 = 0; i2 < baauVar.b.size(); i2++) {
            int h = badf.h(baauVar.b.d(i2));
            if (h == 0) {
                h = 1;
            }
            an.add(Integer.valueOf(h - 1));
        }
        amxe it = ((amru) a2).iterator();
        while (it.hasNext()) {
            baas baasVar = (baas) it.next();
            int h2 = badf.h(baasVar.d);
            if (h2 == 0) {
                h2 = 1;
            }
            if (an.contains(Integer.valueOf(h2 - 1))) {
                createBuilder.copyOnWrite();
                baat baatVar3 = (baat) createBuilder.instance;
                baasVar.getClass();
                aony aonyVar = baatVar3.c;
                if (!aonyVar.c()) {
                    baatVar3.c = aonm.mutableCopy(aonyVar);
                }
                baatVar3.c.add(baasVar);
            }
        }
        baat baatVar4 = (baat) createBuilder.build();
        upo upoVar = uqtVar.b;
        upj a3 = upk.a();
        aone createBuilder2 = bact.a.createBuilder();
        createBuilder2.copyOnWrite();
        bact bactVar = (bact) createBuilder2.instance;
        baatVar4.getClass();
        bactVar.t = baatVar4;
        bactVar.b |= 134217728;
        a3.d((bact) createBuilder2.build());
        return anfq.h(upoVar.b(a3.a()), new amml() { // from class: uqr
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                uqt.this.u(a2, (Void) obj);
                return null;
            }
        }, uqtVar.e);
    }

    @Override // defpackage.upq, defpackage.uyo
    public void a() {
        this.d.a(this);
    }

    @Override // defpackage.uog
    public void d(Activity activity) {
        this.d.b(this);
        v();
    }

    public /* synthetic */ Void u(List list, Void r7) {
        int i = 0;
        baas baasVar = (baas) list.get(0);
        do {
            String str = baasVar.c;
            i++;
            if (((SharedPreferences) this.g.get()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", baasVar.g).commit()) {
                return null;
            }
        } while (i < 3);
        ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 172, "ApplicationExitMetricServiceImpl.java")).q("Failed to persist most recent App Exit");
        return null;
    }

    public void v() {
        anaf.T(new anfy() { // from class: uqs
            @Override // defpackage.anfy
            public final anhy a() {
                return uqt.t(uqt.this);
            }
        }, this.e);
    }
}
