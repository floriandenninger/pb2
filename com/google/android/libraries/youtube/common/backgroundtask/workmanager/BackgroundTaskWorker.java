package com.google.android.libraries.youtube.common.backgroundtask.workmanager;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.abd;
import defpackage.ajoy;
import defpackage.amkq;
import defpackage.azrw;
import defpackage.yjk;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackgroundTaskWorker extends Worker {
    public static final String g = "com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker";
    private final azrw h;

    public BackgroundTaskWorker(Context context, WorkerParameters workerParameters, azrw azrwVar) {
        super(context, workerParameters);
        azrwVar.getClass();
        this.h = azrwVar;
    }

    @Override // androidx.work.Worker
    public final abd i() {
        Set<String> c = c();
        Bundle l = yjk.l(a());
        int i = 1;
        for (String str : c) {
            if (!amkq.e(g, str) && (i = ((ajoy) this.h.get()).v(str, l)) != 0) {
                break;
            }
        }
        return yjk.m(i);
    }
}
