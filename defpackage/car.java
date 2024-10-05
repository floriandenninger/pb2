package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class car {
    static {
        ajbh.S("Alarms");
    }

    public static void a(Context context, caj cajVar, String str) {
        ccq t = cajVar.d.t();
        ccn a = t.a(str);
        if (a != null) {
            c(context, str, a.b);
            ajbh X = ajbh.X();
            String.format("Removing SystemIdInfo for workSpecId (%s)", str);
            X.T(new Throwable[0]);
            t.c(str);
        }
    }

    public static void b(Context context, caj cajVar, String str, long j) {
        int a;
        WorkDatabase workDatabase = cajVar.d;
        ccq t = workDatabase.t();
        ccn a2 = t.a(str);
        if (a2 != null) {
            c(context, str, a2.b);
            d(context, str, a2.b, j);
            return;
        }
        cdv cdvVar = new cdv(workDatabase);
        synchronized (cdv.class) {
            a = cdvVar.a("next_alarm_manager_id");
        }
        t.b(new ccn(str, a));
        d(context, str, a, j);
    }

    private static void c(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, cas.c(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        ajbh X = ajbh.X();
        String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i));
        X.T(new Throwable[0]);
        alarmManager.cancel(service);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, cas.c(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
