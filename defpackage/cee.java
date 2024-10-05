package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cee implements Runnable {
    final /* synthetic */ cex a;

    public cee(cex cexVar) {
        this.a = cexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cex cexVar = this.a;
        cex h = cex.h();
        h.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        cexVar.g(h);
    }
}
