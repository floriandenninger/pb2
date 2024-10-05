package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rid extends rdv {
    public ric b;
    public final Set c;
    protected boolean d;
    public final rkl e;
    final rgf f;
    private boolean g;
    private final AtomicReference h;
    private final Object i;
    private ren j;
    private int k;
    private final AtomicLong l;
    private long m;
    private int n;
    private rec o;

    public rid(rgt rgtVar) {
        super(rgtVar);
        this.c = new CopyOnWriteArraySet();
        this.i = new Object();
        this.d = true;
        this.e = new rhw(this);
        this.h = new AtomicReference();
        this.j = new ren(null, null);
        this.k = 100;
        this.m = -1L;
        this.n = 100;
        this.l = new AtomicLong(0L);
        this.f = new rgf(rgtVar);
    }

    final void A(String str, String str2, long j, Object obj) {
        aG().g(new rhr(this, str, str2, obj, j));
    }

    public final void B(String str) {
        this.h.set(str);
    }

    public final void C(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            aF().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        rqr.s(bundle2, "app_id", String.class, null);
        rqr.s(bundle2, "origin", String.class, null);
        rqr.s(bundle2, "name", String.class, null);
        rqr.s(bundle2, "value", Object.class, null);
        rqr.s(bundle2, "trigger_event_name", String.class, null);
        rqr.s(bundle2, "trigger_timeout", Long.class, 0L);
        rqr.s(bundle2, "timed_out_event_name", String.class, null);
        rqr.s(bundle2, "timed_out_event_params", Bundle.class, null);
        rqr.s(bundle2, "triggered_event_name", String.class, null);
        rqr.s(bundle2, "triggered_event_params", Bundle.class, null);
        rqr.s(bundle2, "time_to_live", Long.class, 0L);
        rqr.s(bundle2, "expired_event_name", String.class, null);
        rqr.s(bundle2, "expired_event_params", Bundle.class, null);
        qip.ax(bundle2.getString("name"));
        qip.ax(bundle2.getString("origin"));
        qip.an(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (N().i(string) != 0) {
            aF().c.b("Invalid conditional user property name", L().e(string));
            return;
        }
        if (N().b(string, obj) != 0) {
            aF().c.c("Invalid conditional user property value", L().e(string), obj);
            return;
        }
        Object y = N().y(string, obj);
        if (y == null) {
            aF().c.c("Unable to normalize conditional user property value", L().e(string), obj);
            return;
        }
        rqr.t(bundle2, y);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            J();
            if (j2 > 15552000000L || j2 < 1) {
                aF().c.c("Invalid conditional user property timeout", L().e(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong("time_to_live");
        J();
        if (j3 > 15552000000L || j3 < 1) {
            aF().c.c("Invalid conditional user property time to live", L().e(string), Long.valueOf(j3));
        } else {
            aG().g(new rht(this, bundle2, 0));
        }
    }

    public final void D(Bundle bundle, int i, long j) {
        a();
        String e = ren.e(bundle);
        if (e != null) {
            aF().h.b("Ignoring invalid consent setting", e);
            aF().h.a("Valid consent values are 'granted', 'denied'");
        }
        E(ren.a(bundle), i, j);
    }

    public final void E(ren renVar, int i, long j) {
        boolean z;
        boolean z2;
        ren renVar2;
        boolean z3;
        a();
        if (i == -10) {
            i = -10;
        } else if (renVar.b == null && renVar.c == null) {
            aF().h.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.i) {
            z = true;
            z2 = false;
            if (ren.i(i, this.k)) {
                boolean j2 = renVar.j(this.j);
                if (renVar.h() && !this.j.h()) {
                    z2 = true;
                }
                ren renVar3 = this.j;
                Boolean bool = renVar.b;
                if (bool == null) {
                    bool = renVar3.b;
                }
                Boolean bool2 = renVar.c;
                if (bool2 == null) {
                    bool2 = renVar3.c;
                }
                ren renVar4 = new ren(bool, bool2);
                this.j = renVar4;
                this.k = i;
                z3 = z2;
                z2 = j2;
                renVar2 = renVar4;
            } else {
                renVar2 = renVar;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            aF().i.b("Ignoring lower-priority consent settings, proposed settings", renVar2);
            return;
        }
        long andIncrement = this.l.getAndIncrement();
        if (z2) {
            B(null);
            aG().h(new rhz(this, renVar2, j, i, andIncrement, z3));
        } else if (i == 30 || i == -10) {
            aG().h(new ria(this, renVar2, i, andIncrement, z3, 1));
        } else {
            aG().g(new ria(this, renVar2, i, andIncrement, z3, 0));
        }
    }

    public final void F(Bundle bundle, long j) {
        axup.b();
        if (!J().o(rfd.ar) || TextUtils.isEmpty(h().r())) {
            D(bundle, 0, j);
        } else {
            aF().h.a("Using developer consent only; google app id found");
        }
    }

    public final void G(ren renVar, int i, long j, boolean z, boolean z2) {
        n();
        a();
        if (j > this.m || !ren.i(this.n, i)) {
            rgc M = M();
            M.n();
            if (M.i(i)) {
                SharedPreferences.Editor edit = M.a().edit();
                edit.putString("consent_settings", renVar.f());
                edit.putInt("consent_source", i);
                edit.apply();
                this.m = j;
                this.n = i;
                rjj l = l();
                l.n();
                l.a();
                if (z) {
                    l.D();
                    l.i().o();
                }
                if (l.B()) {
                    l.u(new riu(l, l.e(false), 3));
                }
                if (z2) {
                    l().r(new AtomicReference());
                    return;
                }
                return;
            }
            aF().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        aF().i.b("Dropped out-of-date consent setting, proposed settings", renVar);
    }

    public final void H(Boolean bool) {
        a();
        aG().g(new rhy(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(ren renVar) {
        n();
        boolean z = (renVar.h() && renVar.g()) || l().B();
        if (z != this.w.w()) {
            rgt rgtVar = this.w;
            rgtVar.q();
            rgtVar.u = z;
            rgc M = M();
            M.n();
            Boolean valueOf = M.a().contains("measurement_enabled_from_api") ? Boolean.valueOf(M.a().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                S(Boolean.valueOf(z), false);
            }
        }
    }

    public final void S(Boolean bool, boolean z) {
        n();
        a();
        aF().j.b("Setting app measurement enabled (FE)", bool);
        M().e(bool);
        if (z) {
            rgc M = M();
            M.n();
            SharedPreferences.Editor edit = M.a().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.w.w() || !(bool == null || bool.booleanValue())) {
            V();
        }
    }

    public final void T(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = N().i(str2);
        } else {
            rkm N = N();
            if (N.ag("user property", str2)) {
                if (N.ac("user property", rhk.a, str2)) {
                    N.J();
                    if (N.ab("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            rkm N2 = N();
            J();
            this.w.p().G(this.e, i, "_ev", N2.z(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj != null) {
                int b = N().b(str2, obj);
                if (b != 0) {
                    rkm N3 = N();
                    J();
                    this.w.p().G(this.e, b, "_ev", N3.z(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
                    return;
                } else {
                    Object y = N().y(str2, obj);
                    if (y != null) {
                        A(str3, str2, j, y);
                        return;
                    }
                    return;
                }
            }
            A(str3, str2, j, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            defpackage.qip.ax(r10)
            defpackage.qip.ax(r11)
            r9.n()
            r9.a()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            java.lang.String r1 = "_npa"
            r2 = 1
            if (r0 == 0) goto L61
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L51
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L51
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r2 == r11) goto L37
            r5 = 0
            goto L38
        L37:
            r5 = r3
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            rgc r0 = r9.M()
            rgb r0 = r0.l
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L4c
            java.lang.String r12 = "true"
        L4c:
            r0.b(r12)
            r7 = r11
            goto L5f
        L51:
            if (r12 != 0) goto L61
            rgc r11 = r9.M()
            rgb r11 = r11.l
            java.lang.String r0 = "unset"
            r11.b(r0)
            r7 = r12
        L5f:
            r4 = r1
            goto L63
        L61:
            r4 = r11
            r7 = r12
        L63:
            rgt r11 = r9.w
            boolean r11 = r11.v()
            if (r11 != 0) goto L77
            rfp r10 = r9.aF()
            rfn r10 = r10.k
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L77:
            rgt r11 = r9.w
            boolean r11 = r11.y()
            if (r11 != 0) goto L80
            return
        L80:
            com.google.android.gms.measurement.internal.UserAttributeParcel r11 = new com.google.android.gms.measurement.internal.UserAttributeParcel
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            rjj r10 = r9.l()
            r10.n()
            r10.a()
            r10.D()
            rfj r12 = r10.i()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            defpackage.rbg.b(r11, r13)
            byte[] r14 = r13.marshall()
            r13.recycle()
            int r13 = r14.length
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = 0
            if (r13 <= r0) goto Lb9
            rfp r12 = r12.aF()
            rfn r12 = r12.d
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.a(r13)
            goto Lc0
        Lb9:
            boolean r12 = r12.q(r2, r14)
            if (r12 == 0) goto Lc0
            r1 = 1
        Lc0:
            com.google.android.gms.measurement.internal.AppMetadata r12 = r10.e(r2)
            rir r13 = new rir
            r13.<init>(r10, r12, r1, r11)
            r10.u(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rid.U(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void V() {
        n();
        String a = M().l.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Q();
                U("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0L : 1L);
                Q();
                U("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.w.v() || !this.d) {
            aF().j.a("Updating Scion state (FE)");
            rjj l = l();
            l.n();
            l.a();
            l.u(new riu(l, l.e(true), 2));
            return;
        }
        aF().j.a("Recording app launch after enabling measurement for the first time (FE)");
        q();
        axuv.b();
        if (J().o(rfd.ak)) {
            m().c.a();
        }
        aG().g(new rhp(this, 0));
    }

    public final void W(String str) {
        qip.ax(str);
        J();
    }

    public final void X(String str, Bundle bundle, String str2) {
        rgt.A();
        Q();
        z("auto", str, System.currentTimeMillis(), bundle, false, true, true, str2);
    }

    public final void Y(Object obj) {
        Q();
        T("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    public final void Z(rec recVar) {
        n();
        a();
        rec recVar2 = this.o;
        if (recVar != recVar2) {
            qip.aw(recVar2 == null, "EventInterceptor already set.");
        }
        this.o = recVar;
    }

    @Override // defpackage.rdv
    protected final boolean d() {
        return false;
    }

    public final String e() {
        return (String) this.h.get();
    }

    public final String o() {
        rij rijVar = this.w.m().b;
        if (rijVar != null) {
            return rijVar.b;
        }
        return null;
    }

    public final String p() {
        rij rijVar = this.w.m().b;
        if (rijVar != null) {
            return rijVar.a;
        }
        return null;
    }

    public final void q() {
        n();
        a();
        if (this.w.y()) {
            byte[] bArr = null;
            int i = 1;
            if (J().o(rfd.aa)) {
                rem J2 = J();
                J2.P();
                Boolean j = J2.j("google_analytics_deferred_deep_link_enabled");
                if (j != null && j.booleanValue()) {
                    aF().j.a("Deferred Deep Link feature enabled.");
                    aG().g(new rhp(this, i, bArr));
                }
            }
            rjj l = l();
            l.n();
            l.a();
            AppMetadata e = l.e(true);
            l.i().q(3, new byte[0]);
            l.u(new riu(l, e, 0));
            this.d = false;
            rgc M = M();
            M.n();
            String string = M.a().getString("previous_os_version", null);
            String c = M.K().c();
            if (!TextUtils.isEmpty(c) && !c.equals(string)) {
                SharedPreferences.Editor edit = M.a().edit();
                edit.putString("previous_os_version", c);
                edit.apply();
            }
            if (TextUtils.isEmpty(string) || string.equals(K().c())) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            v("auto", "_ou", bundle);
        }
    }

    public final void r(String str, String str2, Bundle bundle) {
        Q();
        long currentTimeMillis = System.currentTimeMillis();
        qip.ax(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        aG().g(new rht(this, bundle2, 2));
    }

    public final void s() {
        if (!(I().getApplicationContext() instanceof Application) || this.b == null) {
            return;
        }
        ((Application) I().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.b);
    }

    public final void t(String str, String str2, Bundle bundle) {
        Q();
        u(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 > 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r6 > 100) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.String r15, java.lang.String r16, android.os.Bundle r17, boolean r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rid.u(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str, String str2, Bundle bundle) {
        n();
        Q();
        w(str, str2, System.currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(String str, String str2, long j, Bundle bundle) {
        n();
        x(str, str2, j, bundle, true, this.o == null || rkm.am(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:169:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r22, java.lang.String r23, long r24, android.os.Bundle r26, boolean r27, boolean r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rid.x(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(long j, boolean z) {
        n();
        a();
        aF().j.a("Resetting analytics data (FE)");
        rjw m = m();
        m.n();
        rjv rjvVar = m.c;
        rju rjuVar = m.d;
        rjuVar.c.a();
        rjuVar.a = 0L;
        rjuVar.b = 0L;
        boolean v = this.w.v();
        rgc M = M();
        M.d.b(j);
        if (!TextUtils.isEmpty(M.M().s.a())) {
            M.s.b(null);
        }
        axuv.b();
        if (M.J().o(rfd.ak)) {
            M.n.b(0L);
        }
        if (!M.J().s()) {
            M.g(!v);
        }
        M.t.b(null);
        M.u.b(0L);
        M.v.b(null);
        if (z) {
            rjj l = l();
            l.n();
            l.a();
            AppMetadata e = l.e(false);
            l.D();
            l.i().o();
            l.u(new riu(l, e, 1));
        }
        axuv.b();
        if (J().o(rfd.ak)) {
            m().c.a();
        }
        this.d = true ^ v;
    }

    protected final void z(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        aG().g(new rhq(this, str, str2, j, rkm.u(bundle), z, z2, z3, str3));
    }
}
