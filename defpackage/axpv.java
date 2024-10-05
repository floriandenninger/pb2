package defpackage;

import android.os.Looper;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axpv extends apm {
    public final ehu a;

    public axpv(ehu ehuVar) {
        this.a = ehuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apm
    public final void d() {
        aoae b = ((axpw) axfq.n(this.a, axpw.class)).b();
        if (axfq.a == null) {
            axfq.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == axfq.a) {
            Iterator it = b.b.iterator();
            while (it.hasNext()) {
                ((axpk) it.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
