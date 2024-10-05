package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abxa extends Handler {
    final /* synthetic */ abxc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abxa(abxc abxcVar, Looper looper) {
        super(looper);
        this.a = abxcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        yjk.f();
        switch (message.what) {
            case 1000:
                abxc abxcVar = this.a;
                abxcVar.j(abxcVar.a, false, false, false);
                return;
            case 1001:
                this.a.j(message.arg1, true, false, true);
                return;
            case 1002:
                this.a.j(message.arg1, true, false, false);
                return;
            case 1003:
                this.a.j(message.arg1, false, true, false);
                return;
            default:
                return;
        }
    }
}
