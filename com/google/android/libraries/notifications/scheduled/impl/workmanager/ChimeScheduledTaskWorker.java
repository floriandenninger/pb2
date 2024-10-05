package com.google.android.libraries.notifications.scheduled.impl.workmanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.abd;
import defpackage.aoae;
import defpackage.aoav;
import defpackage.byr;
import defpackage.twc;
import defpackage.tyo;
import defpackage.tzb;
import defpackage.tzc;
import defpackage.tzk;
import defpackage.udr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeScheduledTaskWorker extends Worker {
    private final Context g;

    public ChimeScheduledTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // androidx.work.Worker
    public final abd i() {
        tzc tzcVar;
        Bundle bundle;
        int length;
        twc e;
        try {
            tzcVar = tzb.a(this.g);
        } catch (IllegalStateException e2) {
            tzk.f("ChimeWorker", e2, "Failed to get ChimeComponent for ChimeScheduledTaskWorker", new Object[0]);
            tzcVar = null;
        }
        if (tzcVar == null) {
            return abd.f();
        }
        tyo.j(this.g);
        tzcVar.ke();
        byr a = a();
        String b = a.b("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (a == null) {
            bundle = Bundle.EMPTY;
        } else {
            byte[] d = a.d("notifications.scheduled.impl.workmanager.extraskey");
            if (d != null && (length = d.length) != 0) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(d, 0, length);
                obtain.setDataPosition(0);
                bundle = new Bundle();
                bundle.readFromParcel(obtain);
                obtain.recycle();
            }
            bundle = Bundle.EMPTY;
        }
        bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
        aoae ln = tzcVar.ln();
        if (!TextUtils.isEmpty(b)) {
            for (udr udrVar : ln.b) {
                if (b.equals(udrVar.f())) {
                    break;
                }
            }
        }
        udrVar = null;
        if (udrVar == null) {
            tzk.b("ScheduledTaskWorkerHandler", "ChimeTask NOT found. key: '%s'", b);
            e = twc.a(new Exception("ChimeTask NOT found."));
        } else {
            tzk.e("ScheduledTaskWorkerHandler", "Starting task execution. Job key: '%s'", b);
            e = udrVar.e(bundle);
        }
        int i = e.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            tzk.e("ChimeWorker", "Work finished with SUCCESS code. Job key: '%s'", b);
            return abd.h();
        }
        if (i2 == 1) {
            tzk.c("ChimeWorker", e.b, "Work finished with TRANSIENT_FAILURE. Job key: '%s'", aoav.a(b));
            return abd.g();
        }
        if (i2 == 2) {
            tzk.c("ChimeWorker", e.b, "Work finished with PERMANENT_FAILURE. Job key: '%s'", aoav.a(b));
            return abd.f();
        }
        return abd.h();
    }
}
