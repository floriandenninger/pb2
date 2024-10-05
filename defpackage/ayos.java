package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayos extends anfm {
    public final axzr a;

    public ayos(axzr axzrVar) {
        this.a = axzrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        ammu Y = amkq.Y(this);
        Y.b("clientCall", this.a);
        return Y.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.anfm
    protected final void m() {
        this.a.b("GrpcFuture was cancelled", null);
    }
}
