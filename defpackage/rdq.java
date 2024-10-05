package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdq {
    private static volatile rdq g;
    public final String a = "FA";
    protected final ExecutorService b;
    public final rcc c;
    public int d;
    public boolean e;
    public volatile rcf f;

    protected rdq(Context context, Bundle bundle) {
        rbd rbdVar = ral.a;
        this.b = rbd.v(new rdc());
        this.c = new rcc(this);
        new ArrayList();
        try {
            if (rqr.q(context, rqr.u(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new rcs(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new rdp(this));
        }
    }

    public static rdq d(Context context, Bundle bundle) {
        qip.an(context);
        if (g == null) {
            synchronized (rdq.class) {
                if (g == null) {
                    g = new rdq(context, bundle);
                }
            }
        }
        return g;
    }

    public final void a(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new rdb(this, exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void b(String str, String str2, Bundle bundle) {
        e(str, str2, bundle, true);
    }

    public final void c(rdh rdhVar) {
        this.b.execute(rdhVar);
    }

    public final void e(String str, String str2, Bundle bundle, boolean z) {
        c(new rdf(this, str, str2, bundle, z));
    }
}
