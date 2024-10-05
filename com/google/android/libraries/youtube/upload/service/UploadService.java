package com.google.android.libraries.youtube.upload.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.akzj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UploadService extends Service {
    private final akzj b = new akzj(this);
    public boolean a = false;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
