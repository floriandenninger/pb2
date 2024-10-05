package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czr implements Handler.Callback {
    final /* synthetic */ czs a;

    public czr(czs czsVar) {
        this.a = czsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c((czp) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.a.c.j((czp) message.obj);
        return false;
    }
}
