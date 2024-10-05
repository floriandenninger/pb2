package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qms {
    public static final Executor a = qmq.a;
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int f;
    private static PendingIntent g;
    public Messenger d;
    public CloudMessagingMessengerCompat e;
    private final Context h;
    private final qmm i;
    private final ScheduledExecutorService j;
    public final aeg c = new aeg();
    private final Messenger k = new Messenger(new qmr(this, Looper.getMainLooper()));

    public qms(Context context) {
        this.h = context;
        this.i = new qmm(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        String num;
        synchronized (qms.class) {
            int i = f;
            f = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (qms.class) {
            if (g == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                g = rai.b(context, 0, intent2, rai.a);
            }
            intent.putExtra("app", g);
        }
    }

    public final rpt a(Bundle bundle) {
        final String e = e();
        final rpv rpvVar = new rpv();
        synchronized (this.c) {
            this.c.put(e, rpvVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.i.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.h, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
        sb.append("|ID|");
        sb.append(e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        intent.putExtra("google.messenger", this.k);
        if (this.d != null || this.e != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.d;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.e.b(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.j.schedule(new Runnable() { // from class: qmp
                @Override // java.lang.Runnable
                public final void run() {
                    if (rpv.this.c(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            rpvVar.a.m(a, new rpi() { // from class: qmo
                @Override // defpackage.rpi
                public final void a(rpt rptVar) {
                    qms qmsVar = qms.this;
                    String str = e;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (qmsVar.c) {
                        qmsVar.c.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return rpvVar.a;
        }
        if (this.i.b() == 2) {
            this.h.sendBroadcast(intent);
        } else {
            this.h.startService(intent);
        }
        final ScheduledFuture schedule2 = this.j.schedule(new Runnable() { // from class: qmp
            @Override // java.lang.Runnable
            public final void run() {
                if (rpv.this.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        rpvVar.a.m(a, new rpi() { // from class: qmo
            @Override // defpackage.rpi
            public final void a(rpt rptVar) {
                qms qmsVar = qms.this;
                String str = e;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (qmsVar.c) {
                    qmsVar.c.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return rpvVar.a;
    }

    public final rpt b(final Bundle bundle) {
        if (this.i.a() < 12000000) {
            if (this.i.b() == 0) {
                return rqr.b(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return a(bundle).c(a, new rox() { // from class: qmn
                @Override // defpackage.rox
                public final Object a(rpt rptVar) {
                    return (rptVar.k() && qms.d((Bundle) rptVar.g())) ? qms.this.a(bundle).e(qms.a, qmw.b) : rptVar;
                }
            });
        }
        qml b2 = qml.b(this.h);
        return b2.c(new qmk(b2.a(), bundle)).b(a, qxc.b);
    }

    public final void c(String str, Bundle bundle) {
        synchronized (this.c) {
            rpv rpvVar = (rpv) this.c.remove(str);
            if (rpvVar == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            } else {
                rpvVar.b(bundle);
            }
        }
    }
}
