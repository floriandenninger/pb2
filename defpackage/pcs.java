package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class pcs {
    protected final pcn a;
    public long b = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public pcs(pcn pcnVar) {
        this.a = pcnVar;
    }

    protected abstract void a(pgx pgxVar, long j);

    protected abstract boolean b(pgx pgxVar);

    public final void c(pgx pgxVar, long j) {
        if (b(pgxVar)) {
            a(pgxVar, j);
        }
    }
}
