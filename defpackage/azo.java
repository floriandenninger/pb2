package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azo extends Handler {
    final /* synthetic */ azq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azo(azq azqVar, Looper looper) {
        super(looper);
        this.a = azqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        azq azqVar = this.a;
        int i = message.what;
        azp azpVar = null;
        if (i == 0) {
            azpVar = (azp) message.obj;
            int i2 = azpVar.a;
            int i3 = azpVar.b;
            try {
                azqVar.c.queueInputBuffer(i2, 0, azpVar.c, azpVar.e, azpVar.f);
            } catch (RuntimeException e) {
                azqVar.e(e);
            }
        } else if (i == 1) {
            azpVar = (azp) message.obj;
            int i4 = azpVar.a;
            int i5 = azpVar.b;
            MediaCodec.CryptoInfo cryptoInfo = azpVar.d;
            long j = azpVar.e;
            int i6 = azpVar.f;
            try {
                if (azqVar.f) {
                    synchronized (azq.b) {
                        azqVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                    }
                } else {
                    azqVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e2) {
                azqVar.e(e2);
            }
        } else if (i == 2) {
            azqVar.h.e();
        } else {
            azqVar.e(new IllegalStateException(String.valueOf(message.what)));
        }
        if (azpVar != null) {
            synchronized (azq.a) {
                azq.a.add(azpVar);
            }
        }
    }
}
