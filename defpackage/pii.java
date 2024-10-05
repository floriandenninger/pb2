package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pii extends Handler {
    final /* synthetic */ pij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pii(pij pijVar, Looper looper) {
        super(looper);
        this.a = pijVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            pij pijVar = this.a;
            Object obj = message.obj;
            if (pijVar.j == 2 || pijVar.r()) {
                if (obj instanceof Exception) {
                    pijVar.k((Exception) obj, false);
                    return;
                }
                try {
                    pijVar.a.e((byte[]) obj);
                    if (pijVar.s(false)) {
                        pijVar.h(true);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    pijVar.k(e, true);
                    return;
                }
            }
            return;
        }
        if (i != 1) {
            return;
        }
        pij pijVar2 = this.a;
        Object obj2 = message.obj;
        if (pijVar2.r()) {
            if (obj2 instanceof Exception) {
                pijVar2.j((Exception) obj2, false);
                return;
            }
            pijVar2.d.c();
            pijVar2.d.h();
            try {
                byte[] bArr = (byte[]) obj2;
                if (pijVar2.c == 3) {
                    pijVar2.a.l(pijVar2.l, bArr);
                    pijVar2.g(axo.f);
                } else {
                    byte[] l = pijVar2.a.l(pijVar2.k, bArr);
                    int i2 = pijVar2.c;
                    if ((i2 == 2 || (i2 == 0 && pijVar2.l != null)) && l != null && l.length != 0) {
                        pijVar2.l = l;
                    }
                    pijVar2.j = 4;
                    pijVar2.g(axo.e);
                }
            } catch (Exception e2) {
                pijVar2.j(e2, true);
            }
            pijVar2.d.g();
        }
    }
}
