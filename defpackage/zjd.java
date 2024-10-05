package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjd extends anfm {
    public final AtomicReference a = new AtomicReference();

    public final void c() {
        ayqx ayqxVar = (ayqx) this.a.getAndSet(null);
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.anfm
    protected final void qf() {
        if (isCancelled()) {
            c();
        }
    }
}
