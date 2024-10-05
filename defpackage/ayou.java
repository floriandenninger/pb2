package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayou extends ayot {
    private final aypb a;
    private final ayor b;

    public ayou(aypb aypbVar, ayor ayorVar) {
        this.a = aypbVar;
        this.b = ayorVar;
        if (aypbVar instanceof ayoy) {
            ((ayoy) aypbVar).d();
        }
    }

    @Override // defpackage.ayaw
    public final void c(Status status, aycd aycdVar) {
        if (status.f()) {
            this.a.a();
        } else {
            this.a.b(status.g());
        }
    }

    @Override // defpackage.ayaw
    public final void d(aycd aycdVar) {
    }

    @Override // defpackage.ayaw
    public final void e(Object obj) {
        this.a.c(obj);
        ayor ayorVar = this.b;
        if (ayorVar.b) {
            ayorVar.e();
        }
    }

    @Override // defpackage.ayaw
    public final void f() {
    }

    @Override // defpackage.ayot
    public final void w() {
        ayor ayorVar = this.b;
        if (ayorVar.a > 0) {
            ayorVar.e();
        }
    }
}
