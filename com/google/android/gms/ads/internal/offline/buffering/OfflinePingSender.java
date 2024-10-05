package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.abd;
import defpackage.pvw;
import defpackage.pvy;
import defpackage.pzs;
import defpackage.qas;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final qas g;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        pvy.a();
        this.g = pvw.b(context, new pzs());
    }

    @Override // androidx.work.Worker
    public final abd i() {
        try {
            qas qasVar = this.g;
            qasVar.pp(3, qasVar.pn());
            return abd.h();
        } catch (RemoteException unused) {
            return abd.f();
        }
    }
}
