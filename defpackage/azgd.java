package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgd extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final azge c;
    final AtomicBoolean d = new AtomicBoolean();

    public azgd(Object obj, long j, azge azgeVar) {
        this.a = obj;
        this.b = j;
        this.c = azgeVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            azge azgeVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == azgeVar.g) {
                azgeVar.a.c(obj);
                ayrz.c(this);
            }
        }
    }
}
