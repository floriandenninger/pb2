package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgc extends rhg {
    static final Pair a = new Pair("", 0L);
    public SharedPreferences b;
    public rga c;
    public final rfz d;
    public final rfz e;
    public final rgb f;
    public String g;
    public boolean h;
    public long i;
    public final rfz j;
    public final rfx k;
    public final rgb l;
    public final rfx m;
    public final rfz n;
    public boolean o;
    public final rfx p;
    public final rfx q;
    public final rfz r;
    public final rgb s;
    public final rgb t;
    public final rfz u;
    public final rfy v;

    public rgc(rgt rgtVar) {
        super(rgtVar);
        this.j = new rfz(this, "session_timeout", 1800000L);
        this.k = new rfx(this, "start_new_session", true);
        this.n = new rfz(this, "last_pause_time", 0L);
        this.l = new rgb(this, "non_personalized_ads");
        this.m = new rfx(this, "allow_remote_dynamite", false);
        this.d = new rfz(this, "first_open_time", 0L);
        this.e = new rfz(this, "app_install_time", 0L);
        this.f = new rgb(this, "app_instance_id");
        this.p = new rfx(this, "app_backgrounded", false);
        this.q = new rfx(this, "deep_link_retrieval_complete", false);
        this.r = new rfz(this, "deep_link_retrieval_attempts", 0L);
        this.s = new rgb(this, "firebase_feature_rollouts");
        this.t = new rgb(this, "deferred_attribution_cache");
        this.u = new rfz(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new rfy(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences a() {
        n();
        j();
        qip.an(this.b);
        return this.b;
    }

    @Override // defpackage.rhg
    protected final void aH() {
        SharedPreferences sharedPreferences = I().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.o = z;
        if (!z) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        J();
        this.c = new rga(this, Math.max(0L, ((Long) rfd.c.a()).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ren b() {
        n();
        return ren.b(a().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean c() {
        n();
        if (a().contains("measurement_enabled")) {
            return Boolean.valueOf(a().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Boolean bool) {
        n();
        SharedPreferences.Editor edit = a().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @Override // defpackage.rhg
    protected final boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        n();
        aF().k.b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(long j) {
        return j - this.j.a() > this.n.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(int i) {
        return ren.i(i, a().getInt("consent_source", 100));
    }
}
