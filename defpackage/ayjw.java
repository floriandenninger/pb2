package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjw extends aybr {
    final /* synthetic */ Throwable a;
    private final aybm b;

    public ayjw(Throwable th) {
        this.a = th;
        this.b = aybm.a(Status.n.withDescription("Panic! This is a bug!").c(th));
    }

    @Override // defpackage.aybr
    public final aybm a() {
        return this.b;
    }

    public final String toString() {
        ammu X = amkq.X(ayjw.class);
        X.b("panicPickResult", this.b);
        return X.toString();
    }
}
