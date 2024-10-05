package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.aloh;
import defpackage.ansv;
import defpackage.rfp;
import defpackage.rgt;
import defpackage.rjo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements rjo {
    private aloh a;

    private final aloh d() {
        if (this.a == null) {
            this.a = new aloh(this, (char[]) null, (byte[]) null);
        }
        return this.a;
    }

    @Override // defpackage.rjo
    public final void a(Intent intent) {
    }

    @Override // defpackage.rjo
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rjo
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final aloh d = d();
        rgt i = rgt.i(d.a);
        final rfp aF = i.aF();
        String string = jobParameters.getExtras().getString("action");
        ansv ansvVar = i.z;
        aF.k.b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        d.o(new Runnable(aF, jobParameters, bArr, bArr2, bArr3) { // from class: rjm
            public final /* synthetic */ rfp a;
            public final /* synthetic */ JobParameters b;

            @Override // java.lang.Runnable
            public final void run() {
                aloh alohVar = aloh.this;
                rfp rfpVar = this.a;
                JobParameters jobParameters2 = this.b;
                rfpVar.k.a("AppMeasurementJobService processed last upload request.");
                ((rjo) alohVar.a).c(jobParameters2);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().p(intent);
        return true;
    }
}
