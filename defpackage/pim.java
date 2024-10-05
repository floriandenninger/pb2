package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pim extends Handler {
    final /* synthetic */ piq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pim(piq piqVar, Looper looper) {
        super(looper);
        this.a = piqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (pij pijVar : this.a.a) {
            if (pijVar.q(bArr)) {
                if (pijVar.l != null) {
                    pijVar.d.i();
                    return;
                }
                return;
            }
        }
    }
}
