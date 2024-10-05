package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjn implements aylh {
    final aygo a;
    boolean b = false;
    final /* synthetic */ ayjp c;

    public ayjn(ayjp ayjpVar, aygo aygoVar) {
        this.c = ayjpVar;
        this.a = aygoVar;
    }

    @Override // defpackage.aylh
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.aylh
    public final void b() {
        this.c.d.a(2, "READY");
        this.c.e.execute(new ayjm(this, 1));
    }

    @Override // defpackage.aylh
    public final void c(Status status) {
        this.c.d.b(2, "{0} SHUTDOWN with {1}", this.a.c(), ayjp.k(status));
        this.b = true;
        this.c.e.execute(new ayjl(this, status));
    }

    @Override // defpackage.aylh
    public final void d() {
        amkq.O(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.d.b(2, "{0} Terminated", this.a.c());
        ayay.b(this.c.c.d, this.a);
        this.c.f(this.a, false);
        this.c.e.execute(new ayjm(this, 0));
    }
}
