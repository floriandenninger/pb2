package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.abd;
import defpackage.abm;
import defpackage.abn;
import defpackage.ajbh;
import defpackage.btn;
import defpackage.byo;
import defpackage.byr;
import defpackage.caj;
import defpackage.ccn;
import defpackage.ccq;
import defpackage.cda;
import defpackage.cdb;
import defpackage.cdl;
import defpackage.cdo;
import defpackage.jr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        ajbh.S("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void j(cdo cdoVar, cdo cdoVar2, ccq ccqVar, List list) {
        String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cda cdaVar = (cda) it.next();
            ccn a = ccqVar.a(cdaVar.c);
            Integer valueOf = a != null ? Integer.valueOf(a.b) : null;
            String str = cdaVar.c;
            btn a2 = btn.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                a2.e(1);
            } else {
                a2.f(1, str);
            }
            cdoVar.a.g();
            Cursor e = jr.e(cdoVar.a, a2, false);
            try {
                ArrayList arrayList = new ArrayList(e.getCount());
                while (e.moveToNext()) {
                    arrayList.add(e.getString(0));
                }
                e.close();
                a2.i();
                List a3 = cdoVar2.a(cdaVar.c);
                String join = TextUtils.join(",", arrayList);
                String join2 = TextUtils.join(",", a3);
                Object[] objArr = new Object[6];
                objArr[0] = cdaVar.c;
                objArr[1] = cdaVar.d;
                objArr[2] = valueOf;
                int i = cdaVar.r;
                String c = abm.c(i);
                if (i == 0) {
                    throw null;
                }
                objArr[3] = c;
                objArr[4] = join;
                objArr[5] = join2;
                String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", objArr);
            } catch (Throwable th) {
                e.close();
                a2.i();
                throw th;
            }
        }
    }

    @Override // androidx.work.Worker
    public final abd i() {
        btn btnVar;
        ccq ccqVar;
        cdo cdoVar;
        cdo cdoVar2;
        int i;
        WorkDatabase workDatabase = caj.h(this.a).d;
        cdb r = workDatabase.r();
        cdo w = workDatabase.w();
        cdo v = workDatabase.v();
        ccq t = workDatabase.t();
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(1L);
        btn a = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        a.d(1, currentTimeMillis - millis);
        cdl cdlVar = (cdl) r;
        cdlVar.a.g();
        Cursor e = jr.e(cdlVar.a, a, false);
        try {
            int h = jr.h(e, "required_network_type");
            int h2 = jr.h(e, "requires_charging");
            int h3 = jr.h(e, "requires_device_idle");
            int h4 = jr.h(e, "requires_battery_not_low");
            int h5 = jr.h(e, "requires_storage_not_low");
            int h6 = jr.h(e, "trigger_content_update_delay");
            int h7 = jr.h(e, "trigger_max_content_delay");
            int h8 = jr.h(e, "content_uri_triggers");
            int h9 = jr.h(e, "id");
            int h10 = jr.h(e, "state");
            int h11 = jr.h(e, "worker_class_name");
            int h12 = jr.h(e, "input_merger_class_name");
            int h13 = jr.h(e, "input");
            int h14 = jr.h(e, "output");
            btnVar = a;
            try {
                int h15 = jr.h(e, "initial_delay");
                int h16 = jr.h(e, "interval_duration");
                int h17 = jr.h(e, "flex_duration");
                int h18 = jr.h(e, "run_attempt_count");
                int h19 = jr.h(e, "backoff_policy");
                int h20 = jr.h(e, "backoff_delay_duration");
                int h21 = jr.h(e, "period_start_time");
                int h22 = jr.h(e, "minimum_retention_duration");
                int h23 = jr.h(e, "schedule_requested_at");
                int h24 = jr.h(e, "run_in_foreground");
                int h25 = jr.h(e, "out_of_quota_policy");
                int i2 = h14;
                ArrayList arrayList = new ArrayList(e.getCount());
                while (e.moveToNext()) {
                    String string = e.getString(h9);
                    int i3 = h9;
                    String string2 = e.getString(h11);
                    int i4 = h11;
                    byo byoVar = new byo();
                    int i5 = h;
                    byoVar.i = abn.m(e.getInt(h));
                    byoVar.b = e.getInt(h2) != 0;
                    byoVar.c = e.getInt(h3) != 0;
                    byoVar.d = e.getInt(h4) != 0;
                    byoVar.e = e.getInt(h5) != 0;
                    int i6 = h2;
                    byoVar.f = e.getLong(h6);
                    byoVar.g = e.getLong(h7);
                    byoVar.h = abn.j(e.getBlob(h8));
                    cda cdaVar = new cda(string, string2);
                    cdaVar.r = abn.n(e.getInt(h10));
                    cdaVar.e = e.getString(h12);
                    cdaVar.f = byr.a(e.getBlob(h13));
                    int i7 = i2;
                    cdaVar.g = byr.a(e.getBlob(i7));
                    int i8 = h10;
                    i2 = i7;
                    int i9 = h15;
                    cdaVar.h = e.getLong(i9);
                    int i10 = h12;
                    int i11 = h16;
                    cdaVar.i = e.getLong(i11);
                    int i12 = h13;
                    int i13 = h17;
                    cdaVar.j = e.getLong(i13);
                    int i14 = h18;
                    cdaVar.l = e.getInt(i14);
                    int i15 = h19;
                    cdaVar.s = abn.l(e.getInt(i15));
                    h17 = i13;
                    int i16 = h20;
                    cdaVar.m = e.getLong(i16);
                    int i17 = h21;
                    cdaVar.n = e.getLong(i17);
                    h21 = i17;
                    int i18 = h22;
                    cdaVar.o = e.getLong(i18);
                    h22 = i18;
                    int i19 = h23;
                    cdaVar.p = e.getLong(i19);
                    int i20 = h24;
                    cdaVar.q = e.getInt(i20) != 0;
                    int i21 = h25;
                    cdaVar.t = abn.o(e.getInt(i21));
                    cdaVar.k = byoVar;
                    arrayList.add(cdaVar);
                    h25 = i21;
                    h10 = i8;
                    h12 = i10;
                    h23 = i19;
                    h11 = i4;
                    h2 = i6;
                    h = i5;
                    h24 = i20;
                    h15 = i9;
                    h9 = i3;
                    h20 = i16;
                    h13 = i12;
                    h16 = i11;
                    h18 = i14;
                    h19 = i15;
                }
                e.close();
                btnVar.i();
                List b = r.b();
                List i22 = r.i();
                if (arrayList.isEmpty()) {
                    ccqVar = t;
                    cdoVar = w;
                    cdoVar2 = v;
                    i = 0;
                } else {
                    ajbh.X();
                    i = 0;
                    ajbh.V(new Throwable[0]);
                    ajbh.X();
                    ccqVar = t;
                    cdoVar = w;
                    cdoVar2 = v;
                    j(cdoVar, cdoVar2, ccqVar, arrayList);
                    ajbh.V(new Throwable[0]);
                }
                if (!b.isEmpty()) {
                    ajbh.X();
                    ajbh.V(new Throwable[i]);
                    ajbh.X();
                    j(cdoVar, cdoVar2, ccqVar, b);
                    ajbh.V(new Throwable[i]);
                }
                if (!i22.isEmpty()) {
                    ajbh.X();
                    ajbh.V(new Throwable[i]);
                    ajbh.X();
                    j(cdoVar, cdoVar2, ccqVar, i22);
                    ajbh.V(new Throwable[i]);
                }
                return abd.h();
            } catch (Throwable th) {
                th = th;
                e.close();
                btnVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            btnVar = a;
        }
    }
}
