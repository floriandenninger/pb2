package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afan extends bar {
    private final ayr d;
    private final afaf e;
    public final Handler f;
    public final afjf g;
    public final pnd h;
    public volatile afak i;
    private final aezf j;
    private final aezm k;
    private att l;

    public afan(Executor executor, ayr ayrVar, afaf afafVar, Handler handler, final aezf aezfVar, afjf afjfVar, aezm aezmVar) {
        this.d = ayrVar;
        this.e = afafVar;
        this.f = handler;
        this.j = aezfVar;
        pmx pmxVar = new pmx();
        pmxVar.b("VodMediaSource");
        pmxVar.a = Uri.EMPTY;
        pmxVar.c = aezfVar;
        this.h = pmxVar.a();
        this.g = afjfVar;
        this.k = aezmVar;
        executor.execute(new Runnable() { // from class: afal
            @Override // java.lang.Runnable
            public final void run() {
                aezf aezfVar2 = aezf.this;
                aezfVar2.b().f(aezfVar2.a);
            }
        });
    }

    @Override // defpackage.bar
    protected final void k() {
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.h;
    }

    @Override // defpackage.bar
    protected final void rq(att attVar) {
        this.l = attVar;
        rw(new afao(this.h));
    }

    @Override // defpackage.bbr
    public final void s() {
    }

    public final void t() {
        if (this.i != null) {
            this.f.post(new afam(this, 1));
        }
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        this.g.aO();
        Iterator it = ((afak) bbpVar).b.iterator();
        while (it.hasNext()) {
            ((bdq) it.next()).h();
        }
        this.g.aN();
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        this.g.aM();
        synchronized (this.j) {
            this.i = new afak(bfgVar, this.j, this.d, q(ashVar), this.e, n(ashVar), this.g, this.l, this.k, null);
        }
        this.g.aL();
        return this.i;
    }
}
