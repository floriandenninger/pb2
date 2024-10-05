package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qml {
    private static qml c;
    public final Context a;
    public final ScheduledExecutorService b;
    private qmf d = new qmf(this);
    private int e = 1;

    public qml(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized qml b(Context context) {
        qml qmlVar;
        synchronized (qml.class) {
            if (c == null) {
                rbd rbdVar = ral.a;
                c = new qml(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new qts("MessengerIpcClient"))));
            }
            qmlVar = c;
        }
        return qmlVar;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    public final synchronized rpt c(qmi qmiVar) {
        if (!this.d.e(qmiVar)) {
            qmf qmfVar = new qmf(this);
            this.d = qmfVar;
            qmfVar.e(qmiVar);
        }
        return qmiVar.b.a;
    }
}
