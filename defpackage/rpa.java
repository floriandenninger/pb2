package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpa implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ rpb b;

    public rpa(rpb rpbVar, rpt rptVar) {
        this.b = rpbVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            rpt rptVar = (rpt) this.b.a.a(this.a);
            if (rptVar == null) {
                this.b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            rptVar.p(rpw.b, this.b);
            rptVar.o(rpw.b, this.b);
            rptVar.l(rpw.b, this.b);
        } catch (rpr e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.s((Exception) e.getCause());
            } else {
                this.b.b.s(e);
            }
        } catch (Exception e2) {
            this.b.b.s(e2);
        }
    }
}
