package com.google.android.youtube.api.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.alta;
import defpackage.alus;
import defpackage.aluz;
import defpackage.aoae;
import defpackage.opn;
import defpackage.ouu;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class YouTubeService extends Service {
    public aoae a;

    public static void a(aluz aluzVar, int i) {
        try {
            aluzVar.a(alta.E(i), null);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.youtube.api.service.START".equals(intent.getAction())) {
            return new alus(this, new opn(), null, null);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new aoae((byte[]) null, (short[]) null);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Iterator it = new HashSet(this.a.b).iterator();
        while (it.hasNext()) {
            ((ouu) it.next()).c();
        }
        super.onDestroy();
    }
}
