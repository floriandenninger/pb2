package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxo {
    public final Context a;
    public final qxe b;
    public final qxg c;
    public rpt d;
    public rpt e;
    private final Executor f;

    public qxo(Context context, Executor executor, qxe qxeVar, qxg qxgVar) {
        this.a = context;
        this.f = executor;
        this.b = qxeVar;
        this.c = qxgVar;
    }

    public static dvo a(rpt rptVar, dvo dvoVar) {
        return !rptVar.k() ? dvoVar : (dvo) rptVar.g();
    }

    public final rpt b(Callable callable) {
        rpt a = rqr.a(this.f, callable);
        a.o(this.f, new rpl() { // from class: qxk
            @Override // defpackage.rpl
            public final void c(Exception exc) {
                qxo qxoVar = qxo.this;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                qxoVar.b.c(2025, -1L, exc);
            }
        });
        return a;
    }
}
