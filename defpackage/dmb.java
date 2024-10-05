package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmb extends dmh {
    final ArrayList a;
    public dmf b;
    public szq c;
    public szq d;
    public clu e;
    anjr f;

    public dmb() {
        this.a = new ArrayList();
        throw null;
    }

    public final ArrayList a() {
        b();
        return this.a;
    }

    public final void b() {
        clu cluVar = this.e;
        if (cluVar == null) {
            return;
        }
        this.a.add(new dmg(new dma(this.f, cluVar, null, null), this.b, this.c, this.d, null));
        this.e = null;
        this.b = dmh.h;
        this.c = null;
        this.d = null;
    }

    public dmb(Object obj) {
        this.a = new ArrayList();
        this.b = dmh.h;
        this.f = new anjr(obj);
    }
}
