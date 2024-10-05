package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qph extends amcc {
    public qph() {
        super(Looper.getMainLooper(), (byte[]) null);
    }

    public final void a(qon qonVar, qom qomVar) {
        ThreadLocal threadLocal = BasePendingResult.e;
        sendMessage(obtainMessage(1, new Pair(qonVar, qomVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            qon qonVar = (qon) pair.first;
            qom qomVar = (qom) pair.second;
            try {
                qonVar.a(qomVar);
                return;
            } catch (RuntimeException e) {
                BasePendingResult.m(qomVar);
                throw e;
            }
        }
        if (i == 2) {
            ((BasePendingResult) message.obj).l(Status.d);
            return;
        }
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("BasePendingResult", sb.toString(), new Exception());
    }

    public qph(Looper looper) {
        super(looper, (byte[]) null);
    }
}
