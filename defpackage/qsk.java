package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qsk implements Handler.Callback {
    final /* synthetic */ qsi a;

    public qsk(qsi qsiVar) {
        this.a = qsiVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.c) {
                qsh qshVar = (qsh) message.obj;
                qsj qsjVar = (qsj) this.a.c.get(qshVar);
                if (qsjVar != null && qsjVar.b()) {
                    if (qsjVar.c) {
                        qsjVar.g.e.removeMessages(1, qsjVar.e);
                        qsi qsiVar = qsjVar.g;
                        qsiVar.f.b(qsiVar.d, qsjVar);
                        qsjVar.c = false;
                        qsjVar.b = 2;
                    }
                    this.a.c.remove(qshVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.c) {
            qsh qshVar2 = (qsh) message.obj;
            qsj qsjVar2 = (qsj) this.a.c.get(qshVar2);
            if (qsjVar2 != null && qsjVar2.b == 3) {
                String valueOf = String.valueOf(qshVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentName = qsjVar2.f;
                if (componentName == null) {
                    componentName = qshVar2.d;
                }
                if (componentName == null) {
                    String str = qshVar2.c;
                    qip.an(str);
                    componentName = new ComponentName(str, "unknown");
                }
                qsjVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
