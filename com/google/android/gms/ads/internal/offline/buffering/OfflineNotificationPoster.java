package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.abd;
import defpackage.ecr;
import defpackage.pvw;
import defpackage.pvy;
import defpackage.pzs;
import defpackage.qas;
import defpackage.qve;
import defpackage.qvf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final qas g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        pvy.a();
        this.g = pvw.b(context, new pzs());
    }

    @Override // androidx.work.Worker
    public final abd i() {
        String b = a().b("uri");
        String b2 = a().b("gws_query_id");
        try {
            qas qasVar = this.g;
            qvf a = qve.a(this.a);
            Parcel pn = qasVar.pn();
            ecr.i(pn, a);
            pn.writeString(b);
            pn.writeString(b2);
            qasVar.pp(2, pn);
            return abd.h();
        } catch (RemoteException unused) {
            return abd.f();
        }
    }
}
