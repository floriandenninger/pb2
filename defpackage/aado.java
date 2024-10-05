package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aado {
    public axpg a;
    public boolean b = false;
    public boolean c = false;
    private final azrw d;
    private final aadw e;

    public aado(aadw aadwVar, azrw azrwVar) {
        this.e = aadwVar;
        this.d = azrwVar;
    }

    public final void a() {
        apwy b;
        if (this.b) {
            return;
        }
        if (((Integer) this.d.get()).intValue() >= 16200000 && (b = this.e.b()) != null) {
            aqwr aqwrVar = b.A;
            if (aqwrVar == null) {
                aqwrVar = aqwr.a;
            }
            if (aqwrVar.b) {
                ((FirebaseAnalytics) this.a.get()).a(true);
                this.c = true;
                zga.g("FirebaseAnalytics initialization successful");
                this.b = true;
            }
        }
        ((FirebaseAnalytics) this.a.get()).a(false);
        this.b = true;
    }
}
