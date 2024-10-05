package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aic extends JobServiceEngine {
    final aif a;
    final Object b;
    JobParameters c;

    public aic(aif aifVar) {
        super(aifVar);
        this.b = new Object();
        this.a = aifVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.b(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        ahx ahxVar = this.a.d;
        if (ahxVar != null) {
            ahxVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
