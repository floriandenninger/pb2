package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vxd extends Handler {
    final /* synthetic */ vxe a;

    public vxd(vxe vxeVar) {
        this.a = vxeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b.n();
            this.a.c.n();
            this.a.b.h();
            this.a.c.h();
            this.a.d.quit();
            return;
        }
        String valueOf = String.valueOf(message.toString());
        vtv.e(valueOf.length() != 0 ? "Unhandled message: ".concat(valueOf) : new String("Unhandled message: "));
    }
}
