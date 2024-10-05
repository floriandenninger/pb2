package com.google.apps.tiktok.concurrent;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.alta;
import defpackage.ambl;
import defpackage.ambm;
import defpackage.ambq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalForegroundService extends Service {
    public ambm a;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ambm ambmVar = this.a;
        synchronized (ambmVar.c) {
            Iterator it = ambmVar.d.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((ambq) alta.t(this, ambq.class)).jd(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ambm ambmVar = this.a;
        synchronized (ambmVar.c) {
            if (intent == null) {
                if (ambmVar.f == ambl.STOPPED) {
                    stopSelf(i2);
                }
                return 2;
            }
            ambmVar.e = this;
            ambmVar.g = i2;
            ambmVar.f = ambl.STARTED;
            if (ambmVar.d.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    startForeground(174344743, (Notification) intent.getParcelableExtra("fallback_notification"));
                }
                ambmVar.b();
            } else {
                ambmVar.h = ambmVar.a(ambmVar.h);
                Notification notification = ambmVar.h.a;
                startForeground(174344743, null);
            }
            return 2;
        }
    }
}
