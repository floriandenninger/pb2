package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzt {
    static {
        ajbh.S("Schedulers");
    }

    public static void b(WorkDatabase workDatabase, List list) {
        btn btnVar;
        if (list == null || list.size() == 0) {
            return;
        }
        cdb r = workDatabase.r();
        workDatabase.h();
        try {
            int a = bym.a();
            btn a2 = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            a2.d(1, a);
            ((cdl) r).a.g();
            Cursor e = jr.e(((cdl) r).a, a2, false);
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
                cdb cdbVar = r;
                int h14 = jr.h(e, "output");
                btnVar = a2;
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
                    int i = h14;
                    ArrayList arrayList = new ArrayList(e.getCount());
                    while (e.moveToNext()) {
                        String string = e.getString(h9);
                        int i2 = h9;
                        String string2 = e.getString(h11);
                        int i3 = h11;
                        byo byoVar = new byo();
                        int i4 = h;
                        byoVar.i = abn.m(e.getInt(h));
                        byoVar.b = e.getInt(h2) != 0;
                        byoVar.c = e.getInt(h3) != 0;
                        byoVar.d = e.getInt(h4) != 0;
                        byoVar.e = e.getInt(h5) != 0;
                        int i5 = h2;
                        byoVar.f = e.getLong(h6);
                        byoVar.g = e.getLong(h7);
                        byoVar.h = abn.j(e.getBlob(h8));
                        cda cdaVar = new cda(string, string2);
                        cdaVar.r = abn.n(e.getInt(h10));
                        cdaVar.e = e.getString(h12);
                        cdaVar.f = byr.a(e.getBlob(h13));
                        int i6 = i;
                        cdaVar.g = byr.a(e.getBlob(i6));
                        int i7 = h12;
                        int i8 = h15;
                        int i9 = h13;
                        cdaVar.h = e.getLong(i8);
                        int i10 = h3;
                        int i11 = h16;
                        cdaVar.i = e.getLong(i11);
                        int i12 = h17;
                        cdaVar.j = e.getLong(i12);
                        int i13 = h18;
                        cdaVar.l = e.getInt(i13);
                        int i14 = h19;
                        i = i6;
                        cdaVar.s = abn.l(e.getInt(i14));
                        h18 = i13;
                        h19 = i14;
                        int i15 = h20;
                        cdaVar.m = e.getLong(i15);
                        int i16 = h21;
                        cdaVar.n = e.getLong(i16);
                        h21 = i16;
                        int i17 = h22;
                        cdaVar.o = e.getLong(i17);
                        h22 = i17;
                        int i18 = h23;
                        cdaVar.p = e.getLong(i18);
                        int i19 = h24;
                        cdaVar.q = e.getInt(i19) != 0;
                        int i20 = h25;
                        cdaVar.t = abn.o(e.getInt(i20));
                        cdaVar.k = byoVar;
                        arrayList.add(cdaVar);
                        h23 = i18;
                        h25 = i20;
                        h12 = i7;
                        h3 = i10;
                        h9 = i2;
                        h11 = i3;
                        h = i4;
                        h17 = i12;
                        h13 = i9;
                        h15 = i8;
                        h16 = i11;
                        h20 = i15;
                        h24 = i19;
                        h2 = i5;
                    }
                    e.close();
                    btnVar.i();
                    List i21 = cdbVar.i();
                    if (arrayList.size() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            cdb cdbVar2 = cdbVar;
                            cdbVar2.j(((cda) it.next()).c, currentTimeMillis);
                            cdbVar = cdbVar2;
                        }
                    }
                    workDatabase.j();
                    workDatabase.i();
                    if (arrayList.size() > 0) {
                        cda[] cdaVarArr = (cda[]) arrayList.toArray(new cda[arrayList.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            bzs bzsVar = (bzs) it2.next();
                            if (bzsVar.d()) {
                                bzsVar.c(cdaVarArr);
                            }
                        }
                    }
                    if (i21.size() > 0) {
                        cda[] cdaVarArr2 = (cda[]) i21.toArray(new cda[i21.size()]);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            bzs bzsVar2 = (bzs) it3.next();
                            if (!bzsVar2.d()) {
                                bzsVar2.c(cdaVarArr2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    e.close();
                    btnVar.i();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                btnVar = a2;
            }
        } catch (Throwable th3) {
            workDatabase.i();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bzs a(Context context, caj cajVar) {
        bzs bzsVar;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                bzsVar = (bzs) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
                ajbh X = ajbh.X();
                String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler");
                X.T(new Throwable[0]);
            } catch (Throwable th) {
                ajbh.X().T(th);
                bzsVar = null;
            }
            bzs bzsVar2 = bzsVar;
            if (bzsVar2 != null) {
                return bzsVar2;
            }
            cbc cbcVar = new cbc(context);
            cdw.a(context, SystemAlarmService.class, true);
            ajbh.X().T(new Throwable[0]);
            return cbcVar;
        }
        cbe cbeVar = new cbe(context, cajVar);
        cdw.a(context, SystemJobService.class, true);
        ajbh.X().T(new Throwable[0]);
        return cbeVar;
    }
}
