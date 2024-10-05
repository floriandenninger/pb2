package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aloh;
import defpackage.ansv;
import defpackage.rff;
import defpackage.rfp;
import defpackage.rgt;
import defpackage.rjo;
import defpackage.rki;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements rjo {
    private aloh a;

    private final aloh d() {
        if (this.a == null) {
            this.a = new aloh(this, (char[]) null, (byte[]) null);
        }
        return this.a;
    }

    @Override // defpackage.rjo
    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }

    @Override // defpackage.rjo
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.rjo
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        aloh d = d();
        if (intent == null) {
            d.k().c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new rff(rki.q(d.a));
        }
        d.k().f.b("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().l();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().m();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().n(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final aloh d = d();
        rgt i3 = rgt.i(d.a);
        final rfp aF = i3.aF();
        if (intent == null) {
            aF.f.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        ansv ansvVar = i3.z;
        aF.k.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        d.o(new Runnable(i2, aF, intent, bArr, bArr2, bArr3) { // from class: rjl
            public final /* synthetic */ int a;
            public final /* synthetic */ rfp b;
            public final /* synthetic */ Intent c;

            @Override // java.lang.Runnable
            public final void run() {
                aloh alohVar = aloh.this;
                int i4 = this.a;
                rfp rfpVar = this.b;
                Intent intent2 = this.c;
                if (((rjo) alohVar.a).b(i4)) {
                    rfpVar.k.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i4));
                    alohVar.k().k.a("Completed wakeful intent.");
                    ((rjo) alohVar.a).a(intent2);
                }
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().p(intent);
        return true;
    }
}
