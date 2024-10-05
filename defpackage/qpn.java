package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpn extends qpf {
    public final aeb d;
    private final qpy f;

    public qpn(qqf qqfVar, qpy qpyVar) {
        super(qqfVar, qmy.a);
        this.d = new aeb();
        this.f = qpyVar;
        this.e.c("ConnectionlessLifecycleHelper", this);
    }

    private final void o() {
        if (this.d.isEmpty()) {
            return;
        }
        this.f.g(this);
    }

    @Override // defpackage.qpf
    protected final void f(ConnectionResult connectionResult, int i) {
        this.f.e(connectionResult, i);
    }

    @Override // defpackage.qpf
    protected final void g() {
        this.f.f();
    }

    @Override // defpackage.qpf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        super.i();
        o();
    }

    @Override // defpackage.qpf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        qpy qpyVar = this.f;
        synchronized (qpy.c) {
            if (qpyVar.m == this) {
                qpyVar.m = null;
                qpyVar.n.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        o();
    }
}
