package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aib implements aia {
    final JobWorkItem a;
    final /* synthetic */ aic b;

    public aib(aic aicVar, JobWorkItem jobWorkItem) {
        this.b = aicVar;
        this.a = jobWorkItem;
    }

    @Override // defpackage.aia
    public final void a() {
        synchronized (this.b.b) {
            JobParameters jobParameters = this.b.c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.a);
            }
        }
    }

    @Override // defpackage.aia
    public final void b() {
        this.a.getIntent();
    }
}
