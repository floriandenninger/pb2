package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azda extends ayps {
    final Future a;

    public azda(Future future) {
        this.a = future;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        ayqx d = aynu.d();
        ayptVar.se(d);
        if (d.e()) {
            return;
        }
        try {
            Object obj = ((anhv) this.a).b;
            if (d.e()) {
                return;
            }
            if (obj == null) {
                ayptVar.sh();
            } else {
                ayptVar.sc(obj);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            aynu.c(th);
            if (d.e()) {
                return;
            }
            ayptVar.b(th);
        }
    }
}
