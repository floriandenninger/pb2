package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class stl extends azqq {
    final /* synthetic */ AtomicReference a;

    public stl(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.set(Status.l);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.set(Status.b);
    }
}
