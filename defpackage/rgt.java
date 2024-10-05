package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgt implements rhh {
    private static volatile rgt A;
    private final rjw B;
    private final rip C;
    private final rdt D;
    private final rih E;
    private Boolean F;
    private long G;
    private volatile Boolean H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final rem f;
    public final rgc g;
    public final rfp h;
    public final rgr i;
    public final rkm j;
    public final rfk k;
    public final rid l;
    public final String m;
    public rfj n;
    public rjj o;
    public ret p;
    public rfh q;
    protected Boolean s;
    protected Boolean t;
    public volatile boolean u;
    public int v;
    final long x;
    public final qtl y;
    public final ansv z;
    public boolean r = false;
    public final AtomicInteger w = new AtomicInteger(0);

    public rgt(rhm rhmVar) {
        long currentTimeMillis;
        Bundle bundle;
        ansv ansvVar = new ansv((char[]) null);
        this.z = ansvVar;
        rqr.a = ansvVar;
        Context context = rhmVar.a;
        this.a = context;
        this.b = rhmVar.b;
        this.c = rhmVar.c;
        this.d = rhmVar.d;
        this.e = rhmVar.h;
        this.H = rhmVar.e;
        this.m = rhmVar.j;
        this.u = true;
        InitializationParams initializationParams = rhmVar.g;
        if (initializationParams != null && (bundle = initializationParams.g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.s = (Boolean) obj;
            }
            Object obj2 = initializationParams.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.t = (Boolean) obj2;
            }
        }
        uvr.e(context);
        this.y = qtl.a;
        Long l = rhmVar.i;
        if (l == null) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = l.longValue();
        }
        this.x = currentTimeMillis;
        this.f = new rem(this);
        rgc rgcVar = new rgc(this);
        rgcVar.k();
        this.g = rgcVar;
        rfp rfpVar = new rfp(this);
        rfpVar.k();
        this.h = rfpVar;
        rkm rkmVar = new rkm(this);
        rkmVar.k();
        this.j = rkmVar;
        this.k = new rfk(new rhl(this));
        this.D = new rdt(this);
        rip ripVar = new rip(this);
        ripVar.b();
        this.C = ripVar;
        rid ridVar = new rid(this);
        ridVar.b();
        this.l = ridVar;
        rjw rjwVar = new rjw(this);
        rjwVar.b();
        this.B = rjwVar;
        rih rihVar = new rih(this);
        rihVar.k();
        this.E = rihVar;
        rgr rgrVar = new rgr(this);
        rgrVar.k();
        this.i = rgrVar;
        InitializationParams initializationParams2 = rhmVar.g;
        boolean z = initializationParams2 == null || initializationParams2.b == 0;
        if (context.getApplicationContext() instanceof Application) {
            rid k = k();
            if (k.I().getApplicationContext() instanceof Application) {
                Application application = (Application) k.I().getApplicationContext();
                if (k.b == null) {
                    k.b = new ric(k);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(k.b);
                    application.registerActivityLifecycleCallbacks(k.b);
                    k.aF().k.a("Registered activity lifecycle callback");
                }
            }
        } else {
            aF().f.a("Application context is not an Application");
        }
        rgrVar.g(new rgs(this, rhmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void A() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void B(rhf rhfVar) {
        if (rhfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void C(rdv rdvVar) {
        if (rdvVar != null) {
            if (rdvVar.c()) {
                return;
            }
            String valueOf = String.valueOf(rdvVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public static rgt i(Context context) {
        return j(context, null, null);
    }

    public static rgt j(Context context, InitializationParams initializationParams, Long l) {
        Bundle bundle;
        if (initializationParams != null && (initializationParams.e == null || initializationParams.f == null)) {
            initializationParams = new InitializationParams(initializationParams.a, initializationParams.b, initializationParams.c, initializationParams.d, null, null, initializationParams.g, null);
        }
        qip.an(context);
        qip.an(context.getApplicationContext());
        if (A == null) {
            synchronized (rgt.class) {
                if (A == null) {
                    A = new rgt(new rhm(context, initializationParams, l));
                }
            }
        } else if (initializationParams != null && (bundle = initializationParams.g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            qip.an(A);
            A.t(initializationParams.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        qip.an(A);
        return A;
    }

    public static final void z(rhg rhgVar) {
        if (rhgVar != null) {
            if (rhgVar.m()) {
                return;
            }
            String valueOf = String.valueOf(rhgVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public final int a() {
        q();
        if (this.f.s()) {
            return 1;
        }
        Boolean bool = this.t;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!w()) {
            return 8;
        }
        Boolean c = g().c();
        if (c != null) {
            return c.booleanValue() ? 0 : 3;
        }
        rem remVar = this.f;
        remVar.P();
        Boolean j = remVar.j("firebase_analytics_collection_enabled");
        if (j != null) {
            return j.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.s;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f.o(rfd.T) || this.H == null || this.H.booleanValue()) ? 0 : 7;
    }

    @Override // defpackage.rhh
    public final rfp aF() {
        z(this.h);
        return this.h;
    }

    @Override // defpackage.rhh
    public final rgr aG() {
        z(this.i);
        return this.i;
    }

    public final rdt b() {
        rdt rdtVar = this.D;
        if (rdtVar != null) {
            return rdtVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final ret c() {
        z(this.p);
        return this.p;
    }

    public final rfh d() {
        C(this.q);
        return this.q;
    }

    public final rfj e() {
        C(this.n);
        return this.n;
    }

    public final rgc g() {
        B(this.g);
        return this.g;
    }

    public final rid k() {
        C(this.l);
        return this.l;
    }

    public final rih l() {
        z(this.E);
        return this.E;
    }

    public final rip m() {
        C(this.C);
        return this.C;
    }

    public final rjj n() {
        C(this.o);
        return this.o;
    }

    public final rjw o() {
        C(this.B);
        return this.B;
    }

    public final rkm p() {
        B(this.j);
        return this.j;
    }

    public final void q() {
        aG().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.w.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        this.v++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z) {
        this.H = Boolean.valueOf(z);
    }

    public final boolean u() {
        return this.H != null && this.H.booleanValue();
    }

    public final boolean v() {
        return a() == 0;
    }

    public final boolean w() {
        q();
        return this.u;
    }

    public final boolean x() {
        return TextUtils.isEmpty(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean y() {
        if (this.r) {
            q();
            Boolean bool = this.F;
            if (bool == null || this.G == 0 || (!bool.booleanValue() && Math.abs(SystemClock.elapsedRealtime() - this.G) > 1000)) {
                this.G = SystemClock.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(p().ah("android.permission.INTERNET") && p().ah("android.permission.ACCESS_NETWORK_STATE") && (qtu.b(this.a).e() || this.f.t() || (rkm.ao(this.a) && rkm.ay(this.a))));
                this.F = valueOf;
                if (valueOf.booleanValue()) {
                    if (!p().aa(d().r(), d().o(), d().q()) && TextUtils.isEmpty(d().o())) {
                        z = false;
                    }
                    this.F = Boolean.valueOf(z);
                }
            }
            return this.F.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }
}
