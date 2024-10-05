package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpa extends Handler {
    final /* synthetic */ bpd a;

    public bpa(bpd bpdVar) {
        this.a = bpdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            bpd bpdVar = this.a;
            bpdVar.i = false;
            bpdVar.d(bpdVar.h);
            return;
        }
        bpd bpdVar2 = this.a;
        bpdVar2.k = false;
        bpk bpkVar = bpdVar2.l;
        if (bpkVar != null) {
            bpf bpfVar = bpdVar2.j;
            bpp bppVar = bpkVar.a;
            bpu b = bppVar.b(bpdVar2);
            if (b != null) {
                bppVar.n(b, bpfVar);
            }
        }
    }
}
