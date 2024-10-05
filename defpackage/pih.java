package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pih extends Handler {
    final /* synthetic */ pij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(pij pijVar, Looper looper) {
        super(looper);
        this.a = pijVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Message a(int i, Object obj, boolean z) {
        return obtainMessage(i, z ? 1 : 0, 0, obj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        try {
            int i = message.what;
            if (i == 0) {
                obj = this.a.g.b((ztp) message.obj);
            } else if (i == 1) {
                obj = this.a.g.c((ztp) message.obj);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            if (message.arg1 == 1) {
                int i2 = message.arg2 + 1;
                if ((this.a.m < 0 || message.what != 1 || i2 <= this.a.m) && i2 <= this.a.e) {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i2;
                    sendMessageDelayed(obtain, Math.min((i2 - 1) * 1000, 5000));
                    return;
                }
            }
            obj = e;
        }
        this.a.i.obtainMessage(message.what, obj).sendToTarget();
    }
}
