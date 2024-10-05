package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cfc implements Runnable {
    final /* synthetic */ anhy a;
    final /* synthetic */ ConstraintTrackingWorker b;

    public cfc(ConstraintTrackingWorker constraintTrackingWorker, anhy anhyVar) {
        this.b = constraintTrackingWorker;
        this.a = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.h) {
            if (this.b.i) {
                this.b.j();
            } else {
                this.b.k.g(this.a);
            }
        }
    }
}
