package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.aohx;
import defpackage.axrx;
import defpackage.tyj;
import defpackage.tyo;
import defpackage.tzb;
import defpackage.tzc;
import defpackage.tzk;
import defpackage.udr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScheduledTaskService extends JobService {
    private final tzc a() {
        try {
            return tzb.a(getApplicationContext());
        } catch (IllegalStateException e) {
            tzk.f("ScheduledTaskService", e, "Failed to get ChimeComponent for ScheduledTaskService", new Object[0]);
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final udr udrVar;
        tzc a = a();
        if (a == null) {
            return false;
        }
        tyo.j(getApplicationContext());
        a.ke();
        tyj aF = a.aF();
        final int jobId = jobParameters.getJobId();
        if (axrx.a.get().e()) {
            aF.c.b(aohx.SCHEDULED_JOB).i();
        }
        final PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            tzk.b("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
        try {
            final String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            if (!TextUtils.isEmpty(string)) {
                for (udr udrVar2 : aF.a) {
                    if (string.equals(udrVar2.f())) {
                        udrVar = udrVar2;
                        break;
                    }
                }
            }
            udrVar = null;
            if (udrVar == null) {
                tzk.b("ScheduledTaskServiceHandler", "ChimeTask NOT found. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            tzk.e("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
            aF.b.b(new Runnable() { // from class: tyi
                @Override // java.lang.Runnable
                public final void run() {
                    udr udrVar3 = udr.this;
                    PersistableBundle persistableBundle = extras;
                    int i = jobId;
                    String str = string;
                    JobService jobService = this;
                    JobParameters jobParameters2 = jobParameters;
                    boolean z = false;
                    try {
                        twc e = udrVar3.e(new Bundle(persistableBundle));
                        int i2 = e.c;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 1) {
                            tzk.c("ScheduledTaskServiceHandler", e.b, "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), aoav.a(str));
                            z = true;
                        } else if (i3 == 2) {
                            tzk.c("ScheduledTaskServiceHandler", e.b, "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), aoav.a(str));
                        } else {
                            tzk.e("ScheduledTaskServiceHandler", "Job finished with SUCCESS code. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                        }
                    } finally {
                        jobService.jobFinished(jobParameters2, false);
                    }
                }
            });
            return true;
        } catch (IllegalArgumentException e) {
            e = e;
            tzk.c("ScheduledTaskServiceHandler", e, "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        } catch (NullPointerException e2) {
            e = e2;
            tzk.c("ScheduledTaskServiceHandler", e, "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        tzc a = a();
        if (a == null) {
            return false;
        }
        a.aF();
        return true;
    }
}
