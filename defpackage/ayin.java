package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayin implements aygo {
    protected abstract aygo a();

    @Override // defpackage.aybg
    public final aybc c() {
        return a().c();
    }

    @Override // defpackage.ayli
    public final Runnable d(aylh aylhVar) {
        return a().d(aylhVar);
    }

    @Override // defpackage.ayli
    public void j(Status status) {
        a().j(status);
    }

    @Override // defpackage.ayli
    public void k(Status status) {
        a().k(status);
    }

    @Override // defpackage.aygg
    public aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        throw null;
    }

    @Override // defpackage.aygo
    public final axzj m() {
        return a().m();
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", a());
        return Y.toString();
    }
}
