package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpp implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ rpq b;

    public rpp(rpq rpqVar, rpt rptVar) {
        this.b = rpqVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            rpt a = this.b.a.a(this.a.g());
            a.p(rpw.b, this.b);
            a.o(rpw.b, this.b);
            a.l(rpw.b, this.b);
        } catch (CancellationException unused) {
            this.b.b();
        } catch (rpr e) {
            if (e.getCause() instanceof Exception) {
                this.b.c((Exception) e.getCause());
            } else {
                this.b.c(e);
            }
        } catch (Exception e2) {
            this.b.c(e2);
        }
    }
}
