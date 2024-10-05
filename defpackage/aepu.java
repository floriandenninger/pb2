package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aepu extends Handler {
    final /* synthetic */ aepv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepu(aepv aepvVar, Looper looper) {
        super(looper);
        this.a = aepvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.o(message.obj);
            return;
        }
        if (i != 1) {
            return;
        }
        aepv aepvVar = this.a;
        Object obj = message.obj;
        int i2 = aepvVar.h;
        if (i2 == 3 || i2 == 4) {
            if (obj instanceof Exception) {
                aepvVar.n((Exception) obj);
                return;
            }
            aepvVar.b.n();
            aepvVar.b.s();
            try {
                aepvVar.a.a.provideKeyResponse(aepvVar.i, (byte[]) obj);
                aepvVar.h = 4;
            } catch (Exception e) {
                aepvVar.n(e);
            }
            aepvVar.b.r();
        }
    }
}
