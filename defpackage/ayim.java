package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayim extends ayep {
    final /* synthetic */ axzx a;
    final /* synthetic */ axzz b;
    final ayep c;
    volatile ayep d;

    public ayim() {
    }

    public ayim(axzx axzxVar, axzz axzzVar) {
        this.a = axzxVar;
        this.b = axzzVar;
        ayep ayepVar = new ayep();
        this.c = ayepVar;
        this.d = ayepVar;
    }

    public final void C() {
        if (this.d != this.c) {
            return;
        }
        synchronized (this) {
            if (this.d == this.c) {
                this.d = this.a.a();
            }
        }
    }

    @Override // defpackage.ayep
    public final void g(int i) {
        this.d.g(i);
    }

    @Override // defpackage.ayep
    public final void h(int i, long j, long j2) {
        this.d.h(i, j, j2);
    }

    @Override // defpackage.ayep
    public final void i(long j) {
        this.d.i(j);
    }

    @Override // defpackage.ayep
    public final void j(long j) {
        this.d.j(j);
    }

    @Override // defpackage.ayep
    public final void k(int i) {
        this.d.k(i);
    }

    @Override // defpackage.ayep
    public final void l(int i, long j, long j2) {
        this.d.l(i, j, j2);
    }

    @Override // defpackage.ayep
    public final void m(long j) {
        this.d.m(j);
    }

    @Override // defpackage.ayep
    public final void n(long j) {
        this.d.n(j);
    }

    @Override // defpackage.ayep
    public final void o(Status status) {
        C();
        this.d.o(status);
    }

    @Override // defpackage.ayep
    public final void p() {
        this.d.p();
    }

    @Override // defpackage.ayep
    public final void q(aycd aycdVar) {
        this.d.q(aycdVar);
    }

    @Override // defpackage.ayep
    public final void r() {
        this.d.r();
    }

    @Override // defpackage.ayep
    public final void s(axzj axzjVar, aycd aycdVar) {
        axzz axzzVar = this.b;
        axzy axzyVar = new axzy();
        axzyVar.b(axzzVar.b);
        axzyVar.c(axzzVar.a);
        axzyVar.a = axzzVar.c;
        axzyVar.b = axzzVar.d;
        axzyVar.c(axzjVar);
        axzyVar.a();
        C();
        this.d.s(axzjVar, aycdVar);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", this.d);
        return Y.toString();
    }
}
