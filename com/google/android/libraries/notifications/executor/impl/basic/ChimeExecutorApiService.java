package com.google.android.libraries.notifications.executor.impl.basic;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.tyy;
import defpackage.tza;
import defpackage.tzb;
import defpackage.tzk;
import defpackage.uqq;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeExecutorApiService extends Service {
    public static final Queue a = new ArrayDeque();
    public int b;
    private ExecutorService c;

    public static void b(Context context, Runnable runnable) {
        uqq.l(new tyy(runnable, context));
    }

    public final void a() {
        if (a.isEmpty() && this.b == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            this.c = tzb.a(this).iO();
        } catch (IllegalStateException e) {
            tzk.f("ChimeExecutorApiService", e, "No Chime component; ChimeExecutorApiService will ignore tasks", new Object[0]);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.c == null || intent == null || !"ACTION_NEW_TASK".equals(intent.getAction())) {
            a();
            return 2;
        }
        Queue queue = a;
        if (queue.isEmpty()) {
            return 2;
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        this.b++;
        Runnable runnable = (Runnable) queue.remove();
        this.c.execute(new tza(this, powerManager.newWakeLock(1, runnable.getClass().getSimpleName()), runnable));
        return 2;
    }
}
