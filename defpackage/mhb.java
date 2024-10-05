package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mhb extends Handler {
    final /* synthetic */ mhc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhb(mhc mhcVar, Looper looper) {
        super(looper);
        this.a = mhcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 23998) {
            this.a.h();
        }
    }
}
