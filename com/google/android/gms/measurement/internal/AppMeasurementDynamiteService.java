package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import defpackage.adz;
import defpackage.axup;
import defpackage.qip;
import defpackage.qve;
import defpackage.qvf;
import defpackage.rce;
import defpackage.rci;
import defpackage.rck;
import defpackage.rcm;
import defpackage.rdx;
import defpackage.rdy;
import defpackage.rdz;
import defpackage.rea;
import defpackage.reb;
import defpackage.rec;
import defpackage.rfd;
import defpackage.rgt;
import defpackage.rho;
import defpackage.rhs;
import defpackage.rht;
import defpackage.rhx;
import defpackage.ric;
import defpackage.rid;
import defpackage.rkm;
import defpackage.rqr;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends rce {
    public rgt a = null;
    private final Map b = new adz();

    private final void a() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void b(rci rciVar, String str) {
        a();
        this.a.p().Y(rciVar, str);
    }

    @Override // defpackage.rcf
    public void beginAdUnitExposure(String str, long j) {
        a();
        this.a.b().a(str, j);
    }

    @Override // defpackage.rcf
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        this.a.k().r(str, str2, bundle);
    }

    @Override // defpackage.rcf
    public void clearMeasurementEnabled(long j) {
        a();
        this.a.k().H(null);
    }

    @Override // defpackage.rcf
    public void endAdUnitExposure(String str, long j) {
        a();
        this.a.b().b(str, j);
    }

    @Override // defpackage.rcf
    public void generateEventId(rci rciVar) {
        a();
        long q = this.a.p().q();
        a();
        this.a.p().X(rciVar, q);
    }

    @Override // defpackage.rcf
    public void getAppInstanceId(rci rciVar) {
        a();
        this.a.aG().g(new reb(this, rciVar, 1));
    }

    @Override // defpackage.rcf
    public void getCachedAppInstanceId(rci rciVar) {
        a();
        b(rciVar, this.a.k().e());
    }

    @Override // defpackage.rcf
    public void getConditionalUserProperties(String str, String str2, rci rciVar) {
        a();
        this.a.aG().g(new rea(this, rciVar, str, str2));
    }

    @Override // defpackage.rcf
    public void getCurrentScreenClass(rci rciVar) {
        a();
        b(rciVar, this.a.k().o());
    }

    @Override // defpackage.rcf
    public void getCurrentScreenName(rci rciVar) {
        a();
        b(rciVar, this.a.k().p());
    }

    @Override // defpackage.rcf
    public void getGmpAppId(rci rciVar) {
        a();
        rid k = this.a.k();
        String str = k.w.b;
        if (str == null) {
            try {
                str = rqr.q(k.I(), k.w.m);
            } catch (IllegalStateException e) {
                k.w.aF().c.b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        b(rciVar, str);
    }

    @Override // defpackage.rcf
    public void getMaxUserProperties(String str, rci rciVar) {
        a();
        this.a.k().W(str);
        a();
        this.a.p().W(rciVar, 25);
    }

    @Override // defpackage.rcf
    public void getTestFlag(rci rciVar, int i) {
        a();
        if (i == 0) {
            rkm p = this.a.p();
            rid k = this.a.k();
            AtomicReference atomicReference = new AtomicReference();
            p.Y(rciVar, (String) k.aG().a(atomicReference, 15000L, "String test flag value", new rhx(k, atomicReference, 0)));
            return;
        }
        if (i == 1) {
            rkm p2 = this.a.p();
            rid k2 = this.a.k();
            AtomicReference atomicReference2 = new AtomicReference();
            p2.X(rciVar, ((Long) k2.aG().a(atomicReference2, 15000L, "long test flag value", new rhx(k2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            rkm p3 = this.a.p();
            rid k3 = this.a.k();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) k3.aG().a(atomicReference3, 15000L, "double test flag value", new rhx(k3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                rciVar.a(bundle);
                return;
            } catch (RemoteException e) {
                p3.w.aF().f.b("Error returning double value to wrapper", e);
                return;
            }
        }
        if (i == 3) {
            rkm p4 = this.a.p();
            rid k4 = this.a.k();
            AtomicReference atomicReference4 = new AtomicReference();
            p4.W(rciVar, ((Integer) k4.aG().a(atomicReference4, 15000L, "int test flag value", new rhx(k4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        rkm p5 = this.a.p();
        rid k5 = this.a.k();
        AtomicReference atomicReference5 = new AtomicReference();
        p5.S(rciVar, ((Boolean) k5.aG().a(atomicReference5, 15000L, "boolean test flag value", new rhx(k5, atomicReference5, 1))).booleanValue());
    }

    @Override // defpackage.rcf
    public void getUserProperties(String str, String str2, boolean z, rci rciVar) {
        a();
        this.a.aG().g(new rdy(this, rciVar, str, str2, z));
    }

    @Override // defpackage.rcf
    public void initForTests(Map map) {
        a();
    }

    @Override // defpackage.rcf
    public void initialize(qvf qvfVar, InitializationParams initializationParams, long j) {
        rgt rgtVar = this.a;
        if (rgtVar == null) {
            Context context = (Context) qve.b(qvfVar);
            qip.an(context);
            this.a = rgt.j(context, initializationParams, Long.valueOf(j));
            return;
        }
        rgtVar.aF().f.a("Attempting to initialize multiple times");
    }

    @Override // defpackage.rcf
    public void isDataCollectionEnabled(rci rciVar) {
        a();
        this.a.aG().g(new reb(this, rciVar, 0));
    }

    @Override // defpackage.rcf
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        this.a.k().u(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.rcf
    public void logEventAndBundle(String str, String str2, Bundle bundle, rci rciVar, long j) {
        a();
        qip.ax(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.aG().g(new rdx(this, rciVar, new EventParcel(str2, new EventParams(bundle), "app", j), str));
    }

    @Override // defpackage.rcf
    public void logHealthData(int i, String str, qvf qvfVar, qvf qvfVar2, qvf qvfVar3) {
        a();
        this.a.aF().e(i, true, false, str, qvfVar == null ? null : qve.b(qvfVar), qvfVar2 == null ? null : qve.b(qvfVar2), qvfVar3 != null ? qve.b(qvfVar3) : null);
    }

    @Override // defpackage.rcf
    public void onActivityCreated(qvf qvfVar, Bundle bundle, long j) {
        a();
        ric ricVar = this.a.k().b;
        if (ricVar != null) {
            this.a.k().s();
            ricVar.onActivityCreated((Activity) qve.b(qvfVar), bundle);
        }
    }

    @Override // defpackage.rcf
    public void onActivityDestroyed(qvf qvfVar, long j) {
        a();
        ric ricVar = this.a.k().b;
        if (ricVar != null) {
            this.a.k().s();
            ricVar.onActivityDestroyed((Activity) qve.b(qvfVar));
        }
    }

    @Override // defpackage.rcf
    public void onActivityPaused(qvf qvfVar, long j) {
        a();
        ric ricVar = this.a.k().b;
        if (ricVar != null) {
            this.a.k().s();
            ricVar.onActivityPaused((Activity) qve.b(qvfVar));
        }
    }

    @Override // defpackage.rcf
    public void onActivityResumed(qvf qvfVar, long j) {
        a();
        ric ricVar = this.a.k().b;
        if (ricVar != null) {
            this.a.k().s();
            ricVar.onActivityResumed((Activity) qve.b(qvfVar));
        }
    }

    @Override // defpackage.rcf
    public void onActivitySaveInstanceState(qvf qvfVar, rci rciVar, long j) {
        a();
        ric ricVar = this.a.k().b;
        Bundle bundle = new Bundle();
        if (ricVar != null) {
            this.a.k().s();
            ricVar.onActivitySaveInstanceState((Activity) qve.b(qvfVar), bundle);
        }
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.a.aF().f.b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.rcf
    public void onActivityStarted(qvf qvfVar, long j) {
        a();
        if (this.a.k().b != null) {
            this.a.k().s();
        }
    }

    @Override // defpackage.rcf
    public void onActivityStopped(qvf qvfVar, long j) {
        a();
        if (this.a.k().b != null) {
            this.a.k().s();
        }
    }

    @Override // defpackage.rcf
    public void performAction(Bundle bundle, rci rciVar, long j) {
        a();
        rciVar.a(null);
    }

    @Override // defpackage.rcf
    public void registerOnMeasurementEventListener(rck rckVar) {
        rec recVar;
        a();
        synchronized (this.b) {
            recVar = (rec) this.b.get(Integer.valueOf(rckVar.a()));
            if (recVar == null) {
                recVar = new rec(this, rckVar);
                this.b.put(Integer.valueOf(rckVar.a()), recVar);
            }
        }
        rid k = this.a.k();
        k.a();
        if (k.c.add(recVar)) {
            return;
        }
        k.aF().f.a("OnEventListener already registered");
    }

    @Override // defpackage.rcf
    public void resetAnalyticsData(long j) {
        a();
        rid k = this.a.k();
        k.B(null);
        k.aG().g(new rhs(k, j, 0));
    }

    @Override // defpackage.rcf
    public void setConditionalUserProperty(Bundle bundle, long j) {
        a();
        if (bundle == null) {
            this.a.aF().c.a("Conditional user property must not be null");
        } else {
            this.a.k().C(bundle, j);
        }
    }

    @Override // defpackage.rcf
    public void setConsent(final Bundle bundle, final long j) {
        a();
        final rid k = this.a.k();
        axup.b();
        if (k.J().o(rfd.as)) {
            k.aG().h(new Runnable() { // from class: rhn
                @Override // java.lang.Runnable
                public final void run() {
                    rid.this.F(bundle, j);
                }
            });
        } else {
            k.F(bundle, j);
        }
    }

    @Override // defpackage.rcf
    public void setConsentThirdParty(Bundle bundle, long j) {
        a();
        this.a.k().D(bundle, -20, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r0 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r0 <= 100) goto L39;
     */
    @Override // defpackage.rcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreen(defpackage.qvf r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.a()
            rgt r6 = r2.a
            rip r6 = r6.m()
            java.lang.Object r3 = defpackage.qve.b(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            rem r7 = r6.J()
            boolean r7 = r7.r()
            if (r7 != 0) goto L25
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.a(r4)
            return
        L25:
            rij r7 = r6.b
            if (r7 != 0) goto L35
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.a(r4)
            return
        L35:
            java.util.Map r0 = r6.e
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L49
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.a(r4)
            return
        L49:
            if (r5 != 0) goto L53
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.v(r5)
        L53:
            java.lang.String r0 = r7.b
            boolean r0 = defpackage.rkm.ap(r0, r5)
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.rkm.ap(r7, r4)
            if (r0 == 0) goto L70
            if (r7 != 0) goto L64
            goto L70
        L64:
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.a(r4)
            return
        L70:
            r7 = 100
            if (r4 == 0) goto L98
            int r0 = r4.length()
            if (r0 <= 0) goto L84
            int r0 = r4.length()
            r6.J()
            if (r0 > r7) goto L84
            goto L98
        L84:
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        L98:
            if (r5 == 0) goto Lbe
            int r0 = r5.length()
            if (r0 <= 0) goto Laa
            int r0 = r5.length()
            r6.J()
            if (r0 > r7) goto Laa
            goto Lbe
        Laa:
            rfp r3 = r6.aF()
            rfn r3 = r3.h
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        Lbe:
            rfp r7 = r6.aF()
            rfn r7 = r7.k
            if (r4 != 0) goto Lc9
            java.lang.String r0 = "null"
            goto Lca
        Lc9:
            r0 = r4
        Lca:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            rij r7 = new rij
            rkm r0 = r6.N()
            long r0 = r0.q()
            r7.<init>(r4, r5, r0)
            java.util.Map r4 = r6.e
            r4.put(r3, r7)
            r4 = 1
            r6.q(r3, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(qvf, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.rcf
    public void setDataCollectionEnabled(boolean z) {
        a();
        rid k = this.a.k();
        k.a();
        k.aG().g(new rho(k, z));
    }

    @Override // defpackage.rcf
    public void setDefaultEventParameters(Bundle bundle) {
        a();
        rid k = this.a.k();
        k.aG().g(new rht(k, bundle == null ? null : new Bundle(bundle), 1, null));
    }

    @Override // defpackage.rcf
    public void setEventInterceptor(rck rckVar) {
        a();
        rec recVar = new rec(this, rckVar);
        if (this.a.aG().i()) {
            this.a.k().Z(recVar);
        } else {
            this.a.aG().g(new rdz(this, recVar, null));
        }
    }

    @Override // defpackage.rcf
    public void setInstanceIdProvider(rcm rcmVar) {
        a();
    }

    @Override // defpackage.rcf
    public void setMeasurementEnabled(boolean z, long j) {
        a();
        this.a.k().H(Boolean.valueOf(z));
    }

    @Override // defpackage.rcf
    public void setMinimumSessionDuration(long j) {
        a();
    }

    @Override // defpackage.rcf
    public void setSessionTimeoutDuration(long j) {
        a();
        rid k = this.a.k();
        k.aG().g(new rhs(k, j, 1));
    }

    @Override // defpackage.rcf
    public void setUserId(String str, long j) {
        a();
        if (str == null || str.length() != 0) {
            this.a.k().T(null, "_id", str, true, j);
        } else {
            this.a.aF().f.a("User ID must be non-empty");
        }
    }

    @Override // defpackage.rcf
    public void setUserProperty(String str, String str2, qvf qvfVar, boolean z, long j) {
        a();
        this.a.k().T(str, str2, qve.b(qvfVar), z, j);
    }

    @Override // defpackage.rcf
    public void unregisterOnMeasurementEventListener(rck rckVar) {
        rec recVar;
        a();
        synchronized (this.b) {
            recVar = (rec) this.b.remove(Integer.valueOf(rckVar.a()));
        }
        if (recVar == null) {
            recVar = new rec(this, rckVar);
        }
        rid k = this.a.k();
        k.a();
        if (k.c.remove(recVar)) {
            return;
        }
        k.aF().f.a("OnEventListener had not been registered");
    }
}
