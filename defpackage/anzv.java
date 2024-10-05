package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzv implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private anzr e;
    private boolean f;

    public anzv(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new qts("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((anzu) this.d.poll()).b();
        }
    }

    private final synchronized void c() {
        while (!this.d.isEmpty()) {
            anzr anzrVar = this.e;
            if (anzrVar != null && anzrVar.isBinderAlive()) {
                final anzu anzuVar = (anzu) this.d.poll();
                anzr anzrVar2 = this.e;
                if (Binder.getCallingUid() == Process.myUid()) {
                    anye anyeVar = anzrVar2.a;
                    anyeVar.a.f(anzuVar.a).m(qmq.n, new rpi() { // from class: anzq
                        @Override // defpackage.rpi
                        public final void a(rpt rptVar) {
                            anzu.this.b();
                        }
                    });
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            } else {
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!qtj.a().c(this.a, this.b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        b();
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized rpt a(Intent intent) {
        final anzu anzuVar;
        anzuVar = new anzu(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: anzt
            @Override // java.lang.Runnable
            public final void run() {
                anzu anzuVar2 = anzu.this;
                String action = anzuVar2.a.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseMessaging", sb.toString());
                anzuVar2.b();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
        anzuVar.a().m(scheduledExecutorService, new rpi() { // from class: anzs
            @Override // defpackage.rpi
            public final void a(rpt rptVar) {
                schedule.cancel(false);
            }
        });
        this.d.add(anzuVar);
        c();
        return anzuVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (!(iBinder instanceof anzr)) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Invalid service connection: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            b();
            return;
        }
        this.e = (anzr) iBinder;
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c();
    }
}
