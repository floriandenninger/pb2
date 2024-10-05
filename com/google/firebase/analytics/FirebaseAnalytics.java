package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.anth;
import defpackage.anxd;
import defpackage.qip;
import defpackage.rcq;
import defpackage.rcr;
import defpackage.rdq;
import defpackage.rie;
import defpackage.rqr;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    public final rdq a;

    public FirebaseAnalytics(rdq rdqVar) {
        qip.an(rdqVar);
        this.a = rdqVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(rdq.d(context, null));
                }
            }
        }
        return b;
    }

    public static rie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        rdq d = rdq.d(context, bundle);
        if (d == null) {
            return null;
        }
        return new anth(d);
    }

    public final void a(boolean z) {
        rdq rdqVar = this.a;
        rdqVar.c(new rcr(rdqVar, Boolean.valueOf(z)));
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) rqr.e(anxd.b().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        rdq rdqVar = this.a;
        rdqVar.c(new rcq(rdqVar, activity, str, str2));
    }
}
