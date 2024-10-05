package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.ajbh;
import defpackage.aoo;
import defpackage.caj;
import defpackage.cce;
import defpackage.ccf;
import defpackage.ccg;
import defpackage.cch;
import defpackage.cci;
import defpackage.ccj;
import defpackage.cdp;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends aoo implements ccf {
    ccg a;
    public NotificationManager b;
    private Handler c;
    private boolean d;

    static {
        ajbh.S("SystemFgService");
    }

    private final void e() {
        this.c = new Handler(Looper.getMainLooper());
        this.b = (NotificationManager) getApplicationContext().getSystemService("notification");
        ccg ccgVar = new ccg(getApplicationContext());
        this.a = ccgVar;
        if (ccgVar.i == null) {
            ccgVar.i = this;
        } else {
            ajbh.X();
            ajbh.U(ccg.a, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.ccf
    public final void a(int i) {
        this.c.post(new ccj(this, i));
    }

    @Override // defpackage.ccf
    public final void b(int i, Notification notification) {
        this.c.post(new cci(this, i, notification));
    }

    @Override // defpackage.ccf
    public final void c(int i, int i2, Notification notification) {
        this.c.post(new cch(this, i, notification, i2));
    }

    @Override // defpackage.ccf
    public final void d() {
        this.d = true;
        ajbh.X().T(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // defpackage.aoo, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.aoo, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.h();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            ajbh.X();
            ajbh.V(new Throwable[0]);
            this.a.h();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        ccg ccgVar = this.a;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            ajbh.X();
            String.format("Started foreground service %s", intent);
            ajbh.V(new Throwable[0]);
            ccgVar.j.a(new cce(ccgVar, ccgVar.b.d, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                ajbh.X();
                String.format("Stopping foreground work for %s", intent);
                ajbh.V(new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    return 3;
                }
                caj cajVar = ccgVar.b;
                cajVar.i.a(new cdp(cajVar, UUID.fromString(stringExtra)));
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            ajbh.X();
            ajbh.V(new Throwable[0]);
            ccf ccfVar = ccgVar.i;
            if (ccfVar == null) {
                return 3;
            }
            ccfVar.d();
            return 3;
        }
        ccgVar.g(intent);
        return 3;
    }
}
