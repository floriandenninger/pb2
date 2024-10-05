package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.ammr;
import defpackage.antc;
import defpackage.anwo;
import defpackage.anwp;
import defpackage.anwt;
import defpackage.anwu;
import defpackage.anww;
import defpackage.anwy;
import defpackage.anxe;
import defpackage.anza;
import defpackage.qip;
import defpackage.qms;
import defpackage.qts;
import defpackage.rox;
import defpackage.rpt;
import defpackage.rqr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class FirebaseInstanceId {
    public static anwu a;
    static ScheduledExecutorService b;
    private static final long j = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final antc d;
    public final anwp e;
    public final anwo f;
    public final anxe g;
    public final anza i;
    private boolean l = false;
    public final List h = new ArrayList();

    public FirebaseInstanceId(antc antcVar, anwp anwpVar, Executor executor, Executor executor2, anwy anwyVar, anwy anwyVar2, anxe anxeVar) {
        if (anwp.e(antcVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (a == null) {
                    a = new anwu(antcVar.a());
                }
            }
            this.d = antcVar;
            this.e = anwpVar;
            this.f = new anwo(antcVar, anwpVar, new qms(antcVar.a()), anwyVar, anwyVar2, anxeVar);
            this.c = executor2;
            this.i = new anza(executor, null);
            this.g = anxeVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static void g(antc antcVar) {
        qip.ay(antcVar.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        qip.ay(antcVar.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        qip.ay(antcVar.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        qip.ap(antcVar.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qip.ap(k.matcher(antcVar.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance(antc antcVar) {
        g(antcVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) antcVar.f(FirebaseInstanceId.class);
        qip.az(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static final void m(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new qts("FirebaseInstanceId"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final Object n(rpt rptVar) {
        try {
            return rqr.e(rptVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final rpt a(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return rqr.c(null).c(this.c, new rox() { // from class: anwj
            @Override // defpackage.rox
            public final Object a(rpt rptVar) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                String str3 = str;
                String str4 = str2;
                try {
                    FirebaseInstanceId.a.f(firebaseInstanceId.d.h());
                    rpt a2 = firebaseInstanceId.g.a();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    a2.m(qmq.h, new rpi() { // from class: anwk
                        @Override // defpackage.rpi
                        public final void a(rpt rptVar2) {
                            CountDownLatch countDownLatch2 = countDownLatch;
                            anwu anwuVar = FirebaseInstanceId.a;
                            countDownLatch2.countDown();
                        }
                    });
                    countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
                    if (a2.k()) {
                        String str5 = (String) a2.g();
                        anwt c = firebaseInstanceId.c(str3, str4);
                        if (!firebaseInstanceId.l(c)) {
                            return rqr.c(new ammr(c.b, (char[]) null, (byte[]) null));
                        }
                        return firebaseInstanceId.i.b(str3, str4, new anwn(firebaseInstanceId, str5, str3, str4, c));
                    }
                    if (((rpx) a2).c) {
                        throw new CancellationException("Task is already canceled");
                    }
                    if (a2.j()) {
                        throw new IllegalStateException(a2.f());
                    }
                    throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public final anwt b() {
        return c(anwp.e(this.d), "*");
    }

    public final anwt c(String str, String str2) {
        return a.a(d(), str, str2);
    }

    public final String d() {
        return "[DEFAULT]".equals(this.d.g()) ? "" : this.d.h();
    }

    @Deprecated
    public final String e() {
        g(this.d);
        anwt b2 = b();
        if (l(b2)) {
            j();
        }
        return anwt.c(b2);
    }

    @Deprecated
    public final String f(String str, String str2) {
        g(this.d);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((ammr) n(a(str, str2))).b;
    }

    final synchronized void h() {
        a.b();
    }

    public final synchronized void i(boolean z) {
        this.l = z;
    }

    final synchronized void j() {
        if (this.l) {
            return;
        }
        k(0L);
    }

    public final synchronized void k(long j2) {
        m(new anww(this, Math.min(Math.max(30L, j2 + j2), j)), j2);
        this.l = true;
    }

    public final boolean l(anwt anwtVar) {
        if (anwtVar != null) {
            return System.currentTimeMillis() > anwtVar.d + anwt.a || !this.e.c().equals(anwtVar.c);
        }
        return true;
    }
}
