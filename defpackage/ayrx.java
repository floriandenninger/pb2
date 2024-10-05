package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayrx extends AtomicReference implements ayqx {
    private static final long serialVersionUID = 5718521705281392066L;

    public ayrx(ayrr ayrrVar) {
        super(ayrrVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrr ayrrVar;
        if (get() == null || (ayrrVar = (ayrr) getAndSet(null)) == null) {
            return;
        }
        try {
            ayrrVar.a();
        } catch (Exception e) {
            aynu.c(e);
            aynu.j(e);
        }
    }
}
