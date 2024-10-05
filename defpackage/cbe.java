package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbe implements bzs {
    private static final String a = ajbh.S("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final caj d;
    private final cbd e;

    public cbe(Context context, caj cajVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        cbd cbdVar = new cbd(context);
        this.b = context;
        this.d = cajVar;
        this.c = jobScheduler;
        this.e = cbdVar;
    }

    public static void a(Context context) {
        List i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (i = i(context, jobScheduler)) == null || i.isEmpty()) {
            return;
        }
        Iterator it = i.iterator();
        while (it.hasNext()) {
            j(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static boolean f(Context context, caj cajVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> i = i(context, jobScheduler);
        ccq t = cajVar.d.t();
        boolean z = false;
        btn a2 = btn.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        t.a.g();
        Cursor e = jr.e(t.a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                arrayList.add(e.getString(0));
            }
            HashSet hashSet = new HashSet(i != null ? i.size() : 0);
            if (i != null && !i.isEmpty()) {
                for (JobInfo jobInfo : i) {
                    String g = g(jobInfo);
                    if (!TextUtils.isEmpty(g)) {
                        hashSet.add(g);
                    } else {
                        j(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!hashSet.contains((String) it.next())) {
                    ajbh.X().T(new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = cajVar.d;
                workDatabase.h();
                try {
                    cdb r = workDatabase.r();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        r.j((String) it2.next(), -1L);
                    }
                    workDatabase.j();
                } finally {
                    workDatabase.i();
                }
            }
            return z;
        } finally {
            e.close();
            a2.i();
        }
    }

    private static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static List h(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> i = i(context, jobScheduler);
        if (i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : i) {
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List i(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ajbh.X();
            ajbh.U(a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static void j(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ajbh.X();
            ajbh.U(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.bzs
    public final void b(String str) {
        List h = h(this.b, this.c, str);
        if (h == null || h.isEmpty()) {
            return;
        }
        Iterator it = h.iterator();
        while (it.hasNext()) {
            j(this.c, ((Integer) it.next()).intValue());
        }
        this.d.d.t().c(str);
    }

    @Override // defpackage.bzs
    public final void c(cda... cdaVarArr) {
        int b;
        List h;
        int b2;
        WorkDatabase workDatabase = this.d.d;
        cdv cdvVar = new cdv(workDatabase);
        for (cda cdaVar : cdaVarArr) {
            workDatabase.h();
            try {
                cda a2 = workDatabase.r().a(cdaVar.c);
                if (a2 == null) {
                    ajbh.X();
                    ajbh.W(a, "Skipping scheduling " + cdaVar.c + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.j();
                } else if (a2.r != 1) {
                    ajbh.X();
                    ajbh.W(a, "Skipping scheduling " + cdaVar.c + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.j();
                } else {
                    ccn a3 = workDatabase.t().a(cdaVar.c);
                    if (a3 != null) {
                        b = a3.b;
                    } else {
                        int i = this.d.c.g;
                        b = cdvVar.b();
                    }
                    if (a3 == null) {
                        this.d.d.t().b(new ccn(cdaVar.c, b));
                    }
                    e(cdaVar, b);
                    if (Build.VERSION.SDK_INT == 23 && (h = h(this.b, this.c, cdaVar.c)) != null) {
                        int indexOf = h.indexOf(Integer.valueOf(b));
                        if (indexOf >= 0) {
                            h.remove(indexOf);
                        }
                        if (h.isEmpty()) {
                            int i2 = this.d.c.g;
                            b2 = cdvVar.b();
                        } else {
                            b2 = ((Integer) h.get(0)).intValue();
                        }
                        e(cdaVar, b2);
                    }
                    workDatabase.j();
                }
                workDatabase.i();
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }

    @Override // defpackage.bzs
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x006e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.cda r17, int r18) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbe.e(cda, int):void");
    }
}
