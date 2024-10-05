package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpj implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ rpk b;

    public rpj(rpk rpkVar, rpt rptVar) {
        this.b = rpkVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            rpl rplVar = this.b.b;
            if (rplVar != null) {
                Exception f = this.a.f();
                qip.an(f);
                rplVar.c(f);
            }
        }
    }
}
