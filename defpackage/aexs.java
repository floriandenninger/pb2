package defpackage;

import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexs extends bar {
    private final ayr d;
    private final afhf e;
    private final afaf f;
    private final aezf g;
    private final pnd h;
    private final aezm i;
    private final aeww j;
    private att k;

    public aexs(aezf aezfVar, afhf afhfVar, afaf afafVar, ayr ayrVar, Handler handler, Handler handler2, aewj aewjVar, aezm aezmVar) {
        this.g = aezfVar;
        this.e = afhfVar;
        this.f = afafVar;
        this.d = ayrVar;
        this.j = new aeww(handler, aewjVar, handler2);
        this.i = aezmVar;
        pmx pmxVar = new pmx();
        pmxVar.b("OtfOrVodMediaSource");
        pmxVar.a = Uri.EMPTY;
        pmxVar.c = aezfVar;
        this.h = pmxVar.a();
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
        this.k = attVar;
        rw(new afao(this.h));
    }

    @Override // defpackage.bbr
    public final void s() {
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        ((aexr) bbpVar).n();
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        aexr aexrVar;
        synchronized (this.g) {
            aexrVar = new aexr(this.e, this.f, this.d, q(ashVar), this.k, n(ashVar), bfgVar, this.g.a(), this.g.b(), this.j, this.g.a, this.h, this.i, null);
        }
        return aexrVar;
    }
}
