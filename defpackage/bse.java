package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bse extends Handler {
    final /* synthetic */ bsk a;

    public bse(bsk bskVar) {
        this.a = bskVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.q();
    }
}
