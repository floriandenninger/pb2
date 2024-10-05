package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.anyi;
import defpackage.aocz;
import defpackage.qma;
import defpackage.qmq;
import defpackage.rqr;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends qma {
    @Override // defpackage.qma
    protected final int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) rqr.d(anyi.b(cloudMessage.a, context, qmq.j))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.qma
    protected final void c(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (aocz.Z(putExtras)) {
            aocz.X("_nd", putExtras.getExtras());
        }
    }
}
