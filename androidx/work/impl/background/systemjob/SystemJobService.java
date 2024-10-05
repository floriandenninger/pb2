package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.abm;
import defpackage.ajbh;
import defpackage.bzo;
import defpackage.bzr;
import defpackage.caj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements bzo {
    private static final String a = ajbh.S("SystemJobService");
    private caj b;
    private final Map c = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        ajbh X = ajbh.X();
        String.format("%s executed on JobScheduler", str);
        X.T(new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            caj h = caj.h(getApplicationContext());
            this.b = h;
            h.f.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            ajbh.X();
            ajbh.W(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        caj cajVar = this.b;
        if (cajVar != null) {
            cajVar.f.c(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        abm abmVar;
        if (this.b == null) {
            ajbh.X().T(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            ajbh.X();
            ajbh.U(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.c) {
            if (!this.c.containsKey(b)) {
                ajbh X = ajbh.X();
                String.format("onStartJob for %s", b);
                X.T(new Throwable[0]);
                this.c.put(b, jobParameters);
                if (Build.VERSION.SDK_INT >= 24) {
                    abmVar = new abm();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        jobParameters.getNetwork();
                    }
                } else {
                    abmVar = null;
                }
                this.b.m(b, abmVar);
                return true;
            }
            ajbh X2 = ajbh.X();
            String.format("Job is already being executed by SystemJobService: %s", b);
            X2.T(new Throwable[0]);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.b == null) {
            ajbh.X().T(new Throwable[0]);
            return true;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            ajbh.X();
            ajbh.U(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        ajbh X = ajbh.X();
        String.format("onStopJob for %s", b);
        X.T(new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(b);
        }
        this.b.l(b);
        bzr bzrVar = this.b.f;
        synchronized (bzrVar.g) {
            contains = bzrVar.f.contains(b);
        }
        return !contains;
    }
}
