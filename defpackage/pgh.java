package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgh implements pgc {
    public volatile Object a;
    private final pfs b;
    private final pgf c;
    private final pgg d;
    private volatile boolean e;

    public pgh(String str, pgf pgfVar, pgg pggVar) {
        this.c = pgfVar;
        this.d = pggVar;
        this.b = new pfs(Uri.parse(str), 1);
    }

    @Override // defpackage.pgc
    public final void i() {
        this.e = true;
    }

    @Override // defpackage.pgc
    public final void k() {
        pfr pfrVar = new pfr(this.c, this.b);
        try {
            pfrVar.a();
            this.a = ((paq) this.d).j(((afjg) this.c).a.i().toString(), pfrVar);
        } finally {
            pgz.o(pfrVar);
        }
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.e;
    }
}
