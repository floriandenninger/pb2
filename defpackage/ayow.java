package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayow extends ayot {
    private final ayos a;
    private Object b;

    public ayow(ayos ayosVar) {
        this.a = ayosVar;
    }

    @Override // defpackage.ayaw
    public final void c(Status status, aycd aycdVar) {
        if (status.f()) {
            if (this.b == null) {
                this.a.e(Status.n.withDescription("No value received for unary call").g());
            }
            this.a.o(this.b);
            return;
        }
        this.a.e(status.g());
    }

    @Override // defpackage.ayaw
    public final void d(aycd aycdVar) {
    }

    @Override // defpackage.ayaw
    public final void e(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        throw Status.n.withDescription("More than one value received for unary call").d();
    }

    @Override // defpackage.ayot
    public final void w() {
        this.a.a.d(2);
    }
}
