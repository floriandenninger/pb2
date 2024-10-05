package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znu extends Handler {
    private final WeakReference a;

    public znu(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        znv znvVar;
        if (message.what == 1 && (znvVar = (znv) this.a.get()) != null && znvVar.ar()) {
            znvVar.ao.setText(znvVar.q(System.currentTimeMillis() - znvVar.ak));
        }
    }
}
