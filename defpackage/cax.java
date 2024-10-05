package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cax implements Runnable {
    final /* synthetic */ cbb a;

    public cax(cbb cbbVar) {
        this.a = cbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cbb cbbVar;
        cba cbaVar;
        synchronized (this.a.g) {
            cbb cbbVar2 = this.a;
            cbbVar2.h = (Intent) cbbVar2.g.get(0);
        }
        Intent intent = this.a.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
            ajbh X = ajbh.X();
            Integer valueOf = Integer.valueOf(intExtra);
            String.format("Processing command %s, %s", this.a.h, valueOf);
            X.T(new Throwable[0]);
            PowerManager.WakeLock a = ced.a(this.a.b, String.format("%s (%s)", action, valueOf));
            try {
                ajbh X2 = ajbh.X();
                String.format("Acquiring operation wake lock (%s) %s", action, a);
                X2.T(new Throwable[0]);
                a.acquire();
                cbb cbbVar3 = this.a;
                cas casVar = cbbVar3.f;
                Intent intent2 = cbbVar3.h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    ajbh X3 = ajbh.X();
                    String.format("Handling constraints changed %s", intent2);
                    X3.T(new Throwable[0]);
                    int i = cav.a;
                    Context context = casVar.b;
                    cbi cbiVar = new cbi(context, cbbVar3.j, null);
                    List<cda> c = cbbVar3.e.d.r().c();
                    cat.a(context, c);
                    cbiVar.a(c);
                    ArrayList arrayList = new ArrayList(c.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (cda cdaVar : c) {
                        String str = cdaVar.c;
                        if (currentTimeMillis >= cdaVar.a() && (!cdaVar.c() || cbiVar.c(str))) {
                            arrayList.add(cdaVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = ((cda) arrayList.get(i2)).c;
                        Intent c2 = cas.c(context, str2);
                        ajbh X4 = ajbh.X();
                        String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                        X4.T(new Throwable[0]);
                        cbbVar3.d(new cay(cbbVar3, c2, intExtra));
                    }
                    cbiVar.b();
                } else if (!"ACTION_RESCHEDULE".equals(action2)) {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty()) {
                        for (int i3 = 0; i3 <= 0; i3++) {
                            if (extras.get(strArr[i3]) != null) {
                            }
                        }
                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                            String string = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            ajbh X5 = ajbh.X();
                            String.format("Handling schedule work for %s", string);
                            X5.T(new Throwable[0]);
                            WorkDatabase workDatabase = cbbVar3.e.d;
                            workDatabase.h();
                            try {
                                cda a2 = workDatabase.r().a(string);
                                if (a2 == null) {
                                    ajbh.X();
                                    ajbh.W(cas.a, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                                } else if (abm.d(a2.r)) {
                                    ajbh.X();
                                    ajbh.W(cas.a, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                                } else {
                                    long a3 = a2.a();
                                    if (a2.c()) {
                                        ajbh X6 = ajbh.X();
                                        String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a3));
                                        X6.T(new Throwable[0]);
                                        car.b(casVar.b, cbbVar3.e, string, a3);
                                        cbbVar3.d(new cay(cbbVar3, cas.b(casVar.b), intExtra));
                                    } else {
                                        ajbh X7 = ajbh.X();
                                        String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a3));
                                        X7.T(new Throwable[0]);
                                        car.b(casVar.b, cbbVar3.e, string, a3);
                                    }
                                    workDatabase.j();
                                }
                            } finally {
                                workDatabase.i();
                            }
                        } else if ("ACTION_DELAY_MET".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            synchronized (casVar.d) {
                                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                                ajbh X8 = ajbh.X();
                                String.format("Handing delay met for %s", string2);
                                X8.T(new Throwable[0]);
                                if (casVar.c.containsKey(string2)) {
                                    ajbh X9 = ajbh.X();
                                    String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                                    X9.T(new Throwable[0]);
                                } else {
                                    caw cawVar = new caw(casVar.b, intExtra, string2, cbbVar3);
                                    casVar.c.put(string2, cawVar);
                                    cawVar.f = ced.a(cawVar.a, String.format("%s (%s)", cawVar.c, Integer.valueOf(cawVar.b)));
                                    ajbh X10 = ajbh.X();
                                    String.format("Acquiring wakelock %s for WorkSpec %s", cawVar.f, cawVar.c);
                                    X10.T(new Throwable[0]);
                                    cawVar.f.acquire();
                                    cda a4 = cawVar.d.e.d.r().a(cawVar.c);
                                    if (a4 == null) {
                                        cawVar.c();
                                    } else {
                                        boolean c3 = a4.c();
                                        cawVar.g = c3;
                                        if (c3) {
                                            cawVar.e.a(Collections.singletonList(a4));
                                        } else {
                                            ajbh X11 = ajbh.X();
                                            String.format("No constraints for %s", cawVar.c);
                                            X11.T(new Throwable[0]);
                                            cawVar.e(Collections.singletonList(cawVar.c));
                                        }
                                    }
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            String string3 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            ajbh X12 = ajbh.X();
                            String.format("Handing stopWork work for %s", string3);
                            X12.T(new Throwable[0]);
                            cbbVar3.e.l(string3);
                            car.a(casVar.b, cbbVar3.e, string3);
                            cbbVar3.a(string3, false);
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            Bundle extras3 = intent2.getExtras();
                            String string4 = extras3.getString("KEY_WORKSPEC_ID");
                            boolean z = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                            ajbh X13 = ajbh.X();
                            String.format("Handling onExecutionCompleted %s, %s", intent2, Integer.valueOf(intExtra));
                            X13.T(new Throwable[0]);
                            casVar.a(string4, z);
                        } else {
                            ajbh.X();
                            ajbh.W(cas.a, String.format("Ignoring intent %s", intent2), new Throwable[0]);
                        }
                    }
                    ajbh.X();
                    ajbh.U(cas.a, String.format("Invalid request for %s, requires %s.", action2, "KEY_WORKSPEC_ID"), new Throwable[0]);
                    break;
                } else {
                    ajbh X14 = ajbh.X();
                    String.format("Handling reschedule %s, %s", intent2, valueOf);
                    X14.T(new Throwable[0]);
                    cbbVar3.e.j();
                }
                ajbh X15 = ajbh.X();
                String.format("Releasing operation wake lock (%s) %s", action, a);
                X15.T(new Throwable[0]);
                a.release();
                cbbVar = this.a;
                cbaVar = new cba(cbbVar);
            } catch (Throwable th) {
                try {
                    ajbh.X();
                    ajbh.U(cbb.a, "Unexpected error in onHandleIntent", th);
                    ajbh X16 = ajbh.X();
                    String.format("Releasing operation wake lock (%s) %s", action, a);
                    X16.T(new Throwable[0]);
                    a.release();
                    cbbVar = this.a;
                    cbaVar = new cba(cbbVar);
                } catch (Throwable th2) {
                    ajbh X17 = ajbh.X();
                    String.format("Releasing operation wake lock (%s) %s", action, a);
                    X17.T(new Throwable[0]);
                    a.release();
                    cbb cbbVar4 = this.a;
                    cbbVar4.d(new cba(cbbVar4));
                    throw th2;
                }
            }
            cbbVar.d(cbaVar);
        }
    }
}
