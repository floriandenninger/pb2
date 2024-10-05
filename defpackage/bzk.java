package defpackage;

import androidx.work.Worker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzk implements Runnable {
    final /* synthetic */ Worker a;

    public bzk(Worker worker) {
        this.a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.f.e(this.a.i());
        } catch (Throwable th) {
            this.a.f.f(th);
        }
    }
}
