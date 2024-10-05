package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbz extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -5791853038359966195L;
    final aypt a;

    public azbz(aypt ayptVar, azca azcaVar) {
        super(azcaVar);
        this.a = ayptVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azca azcaVar = (azca) getAndSet(null);
        if (azcaVar != null) {
            azcaVar.aa(this);
        }
    }
}
