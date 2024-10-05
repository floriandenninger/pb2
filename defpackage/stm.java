package defpackage;

import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class stm extends azqq {
    final /* synthetic */ JSPromiseResolver a;

    public stm(JSPromiseResolver jSPromiseResolver) {
        this.a = jSPromiseResolver;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.reject(Status.d.withDescription(th.getMessage() == null ? "error" : th.getMessage()));
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.resolve();
    }
}
