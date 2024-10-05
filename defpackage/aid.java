package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aid extends aie {
    private final JobInfo a;
    private final JobScheduler b;

    public aid(Context context, ComponentName componentName, int i) {
        super(componentName);
        e(i);
        this.a = new JobInfo.Builder(i, this.c).setOverrideDeadline(0L).build();
        this.b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // defpackage.aie
    public final void a(Intent intent) {
        this.b.enqueue(this.a, new JobWorkItem(intent));
    }
}
