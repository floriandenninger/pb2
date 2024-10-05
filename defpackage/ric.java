package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ric implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ rid a;

    public ric(rid ridVar) {
        this.a = ridVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rid ridVar;
        try {
            try {
                this.a.aF().k.a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    ridVar = this.a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.a.N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.a.aG().g(new rib(this, z, data, str, queryParameter));
                        ridVar = this.a;
                    }
                    ridVar = this.a;
                }
            } catch (RuntimeException e) {
                this.a.aF().c.b("Throwable caught in onActivityCreated", e);
                ridVar = this.a;
            }
            ridVar.k().s(activity, bundle);
        } catch (Throwable th) {
            this.a.k().s(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        rip k = this.a.k();
        synchronized (k.k) {
            if (activity == k.f) {
                k.f = null;
            }
        }
        if (k.J().r()) {
            k.e.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        rip k = this.a.k();
        synchronized (k.k) {
            k.j = false;
            k.g = true;
        }
        k.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k.J().r()) {
            rij e = k.e(activity);
            k.c = k.b;
            k.b = null;
            k.aG().g(new rin(k, e, elapsedRealtime));
        } else {
            k.b = null;
            k.aG().g(new rim(k, elapsedRealtime));
        }
        rjw m = this.a.m();
        m.Q();
        m.aG().g(new rjp(m, SystemClock.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rjw m = this.a.m();
        m.Q();
        m.aG().g(new rjp(m, SystemClock.elapsedRealtime(), 1));
        rip k = this.a.k();
        synchronized (k.k) {
            k.j = true;
            if (activity != k.f) {
                synchronized (k.k) {
                    k.f = activity;
                    k.g = false;
                }
                if (k.J().r()) {
                    k.h = null;
                    k.aG().g(new rio(k, 0));
                }
            }
        }
        if (!k.J().r()) {
            k.b = k.h;
            k.aG().g(new rio(k, 1));
            return;
        }
        k.q(activity, k.e(activity), false);
        rdt g = k.g();
        g.Q();
        g.aG().g(new rds(g, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        rij rijVar;
        rip k = this.a.k();
        if (!k.J().r() || bundle == null || (rijVar = (rij) k.e.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", rijVar.c);
        bundle2.putString("name", rijVar.a);
        bundle2.putString("referrer_name", rijVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
