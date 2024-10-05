package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axzu extends ayaq {
    public axzr b;

    /* JADX INFO: Access modifiers changed from: protected */
    public axzu(axzr axzrVar) {
        this.b = axzrVar;
    }

    protected abstract void a(ayaw ayawVar, aycd aycdVar);

    @Override // defpackage.ayaq, defpackage.aycv
    protected final axzr f() {
        return this.b;
    }

    @Override // defpackage.ayaq, defpackage.axzr
    public final void k(ayaw ayawVar, aycd aycdVar) {
        try {
            a(ayawVar, aycdVar);
        } catch (Exception e) {
            this.b = axzw.a;
            ayawVar.c(Status.b(e), new aycd());
        }
    }
}
