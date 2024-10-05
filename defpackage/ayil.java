package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ayil implements aygf {
    @Override // defpackage.aygf
    public void a(Status status, ayge aygeVar, aycd aycdVar) {
        throw null;
    }

    protected abstract aygf b();

    @Override // defpackage.aygf
    public final void c(aycd aycdVar) {
        b().c(aycdVar);
    }

    @Override // defpackage.ayod
    public final void d(ayoc ayocVar) {
        b().d(ayocVar);
    }

    @Override // defpackage.ayod
    public final void e() {
        b().e();
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", b());
        return Y.toString();
    }
}
