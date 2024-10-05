package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpm implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ rpn b;

    public rpm(rpn rpnVar, rpt rptVar) {
        this.b = rpnVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            rpo rpoVar = this.b.b;
            if (rpoVar != null) {
                rpoVar.d(this.a.g());
            }
        }
    }
}
