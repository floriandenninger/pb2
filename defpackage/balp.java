package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class balp extends ball {
    private static final long serialVersionUID = -203813474600094134L;
    final /* synthetic */ balq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public balp(balq balqVar, bajr bajrVar) {
        super(bajrVar);
        this.a = balqVar;
    }

    @Override // defpackage.ball, defpackage.bajp
    public final int a(long j, long j2) {
        return this.a.x(j, j2);
    }

    @Override // defpackage.bajp
    public final long b(long j, int i) {
        return this.a.e(j, i);
    }

    @Override // defpackage.bajp
    public final long c(long j, long j2) {
        return this.a.v(j, j2);
    }

    @Override // defpackage.bajp
    public final long d(long j, long j2) {
        return this.a.w(j, j2);
    }

    @Override // defpackage.bajp
    public final long e() {
        return this.a.b;
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return false;
    }
}
