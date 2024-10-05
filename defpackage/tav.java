package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tav implements sxa {
    public final int b;
    public final tbt c;
    public final tbr d;
    public final String e;
    private final Executor f;

    public tav(String str, int i, tbt tbtVar, Executor executor) {
        tbl tblVar = tbl.b;
        this.b = i;
        this.c = tbtVar;
        this.f = executor;
        this.d = new tbr();
        this.e = str;
    }

    @Override // defpackage.sxa
    public final void a(boolean z) {
        if (z) {
            this.d.b();
        } else {
            this.d.c();
            this.f.execute(new Runnable() { // from class: tau
                @Override // java.lang.Runnable
                public final void run() {
                    tav tavVar = tav.this;
                    tbr tbrVar = tavVar.d;
                    String str = tbp.COMMAND_EXECUTION.m;
                    tbn a = tbo.a();
                    a.b = Integer.valueOf(tavVar.b);
                    a.c(amvs.a);
                    Iterator it = tbrVar.a(str, a).iterator();
                    while (it.hasNext()) {
                        tavVar.c.f(tavVar.e, ((tbm) it.next()).a());
                    }
                }
            });
        }
    }

    @Override // defpackage.sxa
    public final void b() {
        this.d.d();
    }
}
