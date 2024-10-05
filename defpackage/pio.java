package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pio extends Handler {
    final /* synthetic */ piq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pio(piq piqVar, Looper looper) {
        super(looper);
        this.a = piqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (pij pijVar : this.a.a) {
            if (pijVar.q(bArr)) {
                int i = message.what;
                if (pijVar.r()) {
                    if (i == 1) {
                        pijVar.j = 3;
                        pijVar.l();
                        return;
                    } else if (i == 2) {
                        pijVar.h(false);
                        return;
                    } else {
                        if (i == 3 && pijVar.j == 4) {
                            pijVar.j = 3;
                            pijVar.i(new azg(), 2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
