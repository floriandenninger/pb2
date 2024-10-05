package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alrv implements Runnable {
    final /* synthetic */ alsc a;
    final /* synthetic */ alrw b;

    public alrv(alrw alrwVar, alsc alscVar) {
        this.b = alrwVar;
        this.a = alscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.b.a) {
            alrx alrxVar = this.b.b;
            if (alrxVar != null) {
                alsc alscVar = this.a;
                synchronized (alscVar.a) {
                    exc = alscVar.e;
                }
                alrxVar.a(exc);
            }
        }
    }
}
