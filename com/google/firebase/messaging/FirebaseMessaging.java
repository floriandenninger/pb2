package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.cardboard.sdk.R;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.antc;
import defpackage.anwd;
import defpackage.anwx;
import defpackage.anwy;
import defpackage.anxe;
import defpackage.anyi;
import defpackage.anyj;
import defpackage.anyn;
import defpackage.anyo;
import defpackage.anyr;
import defpackage.anys;
import defpackage.anyw;
import defpackage.anza;
import defpackage.anzf;
import defpackage.anzg;
import defpackage.anzi;
import defpackage.anzm;
import defpackage.owx;
import defpackage.qip;
import defpackage.qmq;
import defpackage.qms;
import defpackage.qts;
import defpackage.rpo;
import defpackage.rpt;
import defpackage.rqr;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FirebaseMessaging {
    static owx a;
    static ScheduledExecutorService b;
    public static final /* synthetic */ int h = 0;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static anzg j;
    public final antc c;
    public final Context d;
    public final anys e;
    public final rpt f;
    public final anyw g;
    private final anwx k;
    private final anza l;
    private final anyr m;
    private final Executor n;
    private boolean o;
    private final Application.ActivityLifecycleCallbacks p;

    public FirebaseMessaging(antc antcVar, anwx anwxVar, anwy anwyVar, anwy anwyVar2, anxe anxeVar, owx owxVar, anwd anwdVar) {
        anyw anywVar = new anyw(antcVar.a());
        anys anysVar = new anys(antcVar, anywVar, new qms(antcVar.a()), anwyVar, anwyVar2, anxeVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new qts("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new qts("Firebase-Messaging-Init"));
        final int i3 = 0;
        this.o = false;
        a = owxVar;
        this.c = antcVar;
        this.k = anwxVar;
        this.m = new anyr(this, anwdVar);
        Context a2 = antcVar.a();
        this.d = a2;
        anyj anyjVar = new anyj();
        this.p = anyjVar;
        this.g = anywVar;
        this.e = anysVar;
        this.l = new anza(newSingleThreadExecutor);
        this.n = scheduledThreadPoolExecutor;
        Context a3 = antcVar.a();
        if (a3 instanceof Application) {
            ((Application) a3).registerActivityLifecycleCallbacks(anyjVar);
        } else {
            String valueOf = String.valueOf(a3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMinor);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (anwxVar != null) {
            anwxVar.b(new anyn(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: anyp
            public final /* synthetic */ FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ApplicationInfo applicationInfo;
                if (i2 != 0) {
                    FirebaseMessaging firebaseMessaging = this.a;
                    if (firebaseMessaging.j()) {
                        firebaseMessaging.h();
                        return;
                    }
                    return;
                }
                final Context context = this.a.d;
                if (aocz.T(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                qmq qmqVar = qmq.m;
                final boolean z = true;
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (Build.VERSION.SDK_INT < 29) {
                    rqr.c(null);
                } else {
                    final rpv rpvVar = new rpv();
                    qmqVar.execute(new Runnable() { // from class: anyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            boolean z2 = z;
                            rpv rpvVar2 = rpvVar;
                            try {
                                if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                    SharedPreferences.Editor edit = aocz.T(context2).edit();
                                    edit.putBoolean("proxy_notification_initialized", true);
                                    edit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z2) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                    return;
                                }
                                String valueOf2 = String.valueOf(context2.getPackageName());
                                Log.e("FirebaseMessaging", valueOf2.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf2) : new String("error configuring notification delegate for package "));
                            } finally {
                                rpvVar2.d(null);
                            }
                        }
                    });
                }
            }
        });
        rpt a4 = anzm.a(this, anywVar, anysVar, a2, new ScheduledThreadPoolExecutor(1, new qts("Firebase-Messaging-Topics-Io")));
        this.f = a4;
        a4.p(scheduledThreadPoolExecutor, new rpo() { // from class: anyk
            @Override // defpackage.rpo
            public final void d(Object obj) {
                anzm anzmVar = (anzm) obj;
                if (FirebaseMessaging.this.j()) {
                    anzmVar.f();
                }
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: anyp
            public final /* synthetic */ FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ApplicationInfo applicationInfo;
                if (i3 != 0) {
                    FirebaseMessaging firebaseMessaging = this.a;
                    if (firebaseMessaging.j()) {
                        firebaseMessaging.h();
                        return;
                    }
                    return;
                }
                final Context context = this.a.d;
                if (aocz.T(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                qmq qmqVar = qmq.m;
                final boolean z = true;
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (Build.VERSION.SDK_INT < 29) {
                    rqr.c(null);
                } else {
                    final rpv rpvVar = new rpv();
                    qmqVar.execute(new Runnable() { // from class: anyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            boolean z2 = z;
                            rpv rpvVar2 = rpvVar;
                            try {
                                if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                    SharedPreferences.Editor edit = aocz.T(context2).edit();
                                    edit.putBoolean("proxy_notification_initialized", true);
                                    edit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z2) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                    return;
                                }
                                String valueOf2 = String.valueOf(context2.getPackageName());
                                Log.e("FirebaseMessaging", valueOf2.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf2) : new String("error configuring notification delegate for package "));
                            } finally {
                                rpvVar2.d(null);
                            }
                        }
                    });
                }
            }
        });
    }

    public static synchronized FirebaseMessaging a() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(antc.b());
        }
        return firebaseMessaging;
    }

    public static synchronized anzg c(Context context) {
        anzg anzgVar;
        synchronized (FirebaseMessaging.class) {
            if (j == null) {
                j = new anzg(context);
            }
            anzgVar = j;
        }
        return anzgVar;
    }

    static synchronized FirebaseMessaging getInstance(antc antcVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) antcVar.f(FirebaseMessaging.class);
            qip.az(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static final void l(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new qts("TAG"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final synchronized void m() {
        if (this.o) {
            return;
        }
        i(0L);
    }

    final anzf b() {
        return c(this.d).a(e(), anyw.e(this.c));
    }

    public final String d() {
        anwx anwxVar = this.k;
        if (anwxVar != null) {
            try {
                return (String) rqr.d(anwxVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        anzf b2 = b();
        if (!k(b2)) {
            return b2.b;
        }
        String e2 = anyw.e(this.c);
        try {
            return (String) rqr.d(this.l.a(e2, new anyo(this, e2, b2)));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String e() {
        return "[DEFAULT]".equals(this.c.g()) ? "" : this.c.h();
    }

    public final void f(String str) {
        if ("[DEFAULT]".equals(this.c.g())) {
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            anyi.b(intent, this.d, qmq.j);
        }
    }

    public final synchronized void g(boolean z) {
        this.o = z;
    }

    public final void h() {
        anwx anwxVar = this.k;
        if (anwxVar != null) {
            anwxVar.c();
        } else if (k(b())) {
            m();
        }
    }

    public final synchronized void i(long j2) {
        l(new anzi(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.o = true;
    }

    public final boolean j() {
        return this.m.b();
    }

    final boolean k(anzf anzfVar) {
        if (anzfVar != null) {
            return System.currentTimeMillis() > anzfVar.d + anzf.a || !this.g.c().equals(anzfVar.c);
        }
        return true;
    }
}
