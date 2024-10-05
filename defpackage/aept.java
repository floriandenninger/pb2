package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aept extends Handler {
    final /* synthetic */ aepv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aept(aepv aepvVar, Looper looper) {
        super(looper);
        this.a = aepvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                aeqj aeqjVar = this.a.d;
                UUID uuid = aeow.a;
                e = aeqjVar.b((pbm) message.obj);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                aeqj aeqjVar2 = this.a.d;
                UUID uuid2 = aeow.a;
                e = aeqjVar2.a((pbl) message.obj);
            }
        } catch (Exception e) {
            e = e;
        }
        this.a.e.obtainMessage(message.what, e).sendToTarget();
    }
}
