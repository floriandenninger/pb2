package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.agon;
import defpackage.agoo;
import defpackage.agvy;
import defpackage.azrw;
import defpackage.efz;
import defpackage.yjj;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflineKeepAliveService extends Service {
    public azrw a;
    public agoo b;

    private final void a() {
        Notification a;
        if (Build.VERSION.SDK_INT < 26 || getApplicationInfo().targetSdkVersion < 26 || (a = ((agon) this.a.get()).a()) == null) {
            return;
        }
        try {
            startForeground(17, a);
            this.b.d(null, 17, a);
        } catch (RuntimeException unused) {
            zga.b("[Offline] OfflineKeepAliveService: Cannot start foreground notification.");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        zga.g("[Offline] OfflineKeepAliveService: injecting offline transfer service...");
        efz efzVar = ((agvy) yjj.o(getApplication(), agvy.class)).kA().a;
        this.a = efzVar.lf;
        this.b = (agoo) efzVar.kA.get();
        super.onCreate();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zga.g("[Offline] OfflineKeepAliveService: destroying OfflineKeepAliveService...");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zga.g("[Offline] OfflineKeepAliveService: direct offline transfer service starts.");
        a();
        return 1;
    }
}
