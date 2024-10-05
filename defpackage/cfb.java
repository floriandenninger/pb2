package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfb implements Runnable {
    final /* synthetic */ ConstraintTrackingWorker a;

    public cfb(ConstraintTrackingWorker constraintTrackingWorker) {
        this.a = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.a;
        String b = constraintTrackingWorker.a().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (!TextUtils.isEmpty(b)) {
            constraintTrackingWorker.j = constraintTrackingWorker.b.f.b(constraintTrackingWorker.a, b, constraintTrackingWorker.g);
            if (constraintTrackingWorker.j != null) {
                cda a = caj.h(constraintTrackingWorker.a).d.r().a(constraintTrackingWorker.d().toString());
                if (a == null) {
                    constraintTrackingWorker.i();
                    return;
                }
                Context context = constraintTrackingWorker.a;
                cbi cbiVar = new cbi(context, caj.h(context).i, constraintTrackingWorker);
                cbiVar.a(Collections.singletonList(a));
                if (cbiVar.c(constraintTrackingWorker.d().toString())) {
                    ajbh X = ajbh.X();
                    String.format("Constraints met for delegate %s", b);
                    X.T(new Throwable[0]);
                    try {
                        anhy b2 = constraintTrackingWorker.j.b();
                        b2.d(new cfc(constraintTrackingWorker, b2), constraintTrackingWorker.jY());
                        return;
                    } catch (Throwable th) {
                        ajbh X2 = ajbh.X();
                        String.format("Delegated worker %s threw exception in startWork.", b);
                        X2.T(th);
                        synchronized (constraintTrackingWorker.h) {
                            if (constraintTrackingWorker.i) {
                                ajbh.X().T(new Throwable[0]);
                                constraintTrackingWorker.j();
                            } else {
                                constraintTrackingWorker.i();
                            }
                            return;
                        }
                    }
                }
                ajbh X3 = ajbh.X();
                String.format("Constraints not met for delegate %s. Requesting retry.", b);
                X3.T(new Throwable[0]);
                constraintTrackingWorker.j();
                return;
            }
            ajbh.X().T(new Throwable[0]);
            constraintTrackingWorker.i();
            return;
        }
        ajbh.X();
        ajbh.U(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
        constraintTrackingWorker.i();
    }
}
