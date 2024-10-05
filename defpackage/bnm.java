package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnm extends Handler {
    final /* synthetic */ bnp a;

    public bnm(bnp bnpVar) {
        this.a = bnpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.h((List) message.obj);
    }
}
