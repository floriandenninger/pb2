package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cak implements Runnable {
    final /* synthetic */ anhy a;
    final /* synthetic */ can b;
    final /* synthetic */ cex c;

    public cak(can canVar, anhy anhyVar, cex cexVar) {
        this.b = canVar;
        this.a = anhyVar;
        this.c = cexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.get();
            ajbh X = ajbh.X();
            int i = can.j;
            String.format("Starting work for %s", this.b.c.d);
            X.T(new Throwable[0]);
            can canVar = this.b;
            canVar.e = canVar.d.b();
            this.c.g(this.b.e);
        } catch (Throwable th) {
            this.c.f(th);
        }
    }
}
