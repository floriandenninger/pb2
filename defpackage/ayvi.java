package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvi implements Runnable {
    final ayqw a;
    final aypi b;
    final /* synthetic */ ayvk c;
    private final AtomicBoolean d;

    public ayvi(ayvk ayvkVar, AtomicBoolean atomicBoolean, ayqw ayqwVar, aypi aypiVar) {
        this.c = ayvkVar;
        this.d = atomicBoolean;
        this.a = ayqwVar;
        this.b = aypiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            this.a.c();
            aypi aypiVar = this.b;
            ayvk ayvkVar = this.c;
            aypiVar.b(new TimeoutException(azqi.c(ayvkVar.b, ayvkVar.c)));
        }
    }
}
