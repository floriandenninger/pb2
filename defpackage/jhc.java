package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhc implements fjq {
    static final long a = TimeUnit.DAYS.toMillis(1);
    private final shf b;
    private final afsy c;
    private final fka d;
    private final azrw e;

    public jhc(shf shfVar, fka fkaVar, afsy afsyVar, azrw azrwVar) {
        this.b = shfVar;
        this.d = fkaVar;
        this.c = afsyVar;
        this.e = azrwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean f() {
        if (!this.c.t()) {
            return false;
        }
        boolean k = ((fjt) this.e.get()).k();
        String d = this.c.c().d();
        fkg fkgVar = (fkg) this.d.a.c();
        fkb fkbVar = fkb.a;
        aoot aootVar = fkgVar.j;
        if (aootVar.containsKey(d)) {
            fkbVar = (fkb) aootVar.get(d);
        }
        boolean z = fkbVar.c;
        fkg fkgVar2 = (fkg) this.d.a.c();
        fkb fkbVar2 = fkb.a;
        aoot aootVar2 = fkgVar2.j;
        if (aootVar2.containsKey(d)) {
            fkbVar2 = (fkb) aootVar2.get(d);
        }
        long j = fkbVar2.d;
        long c = this.b.c() - a;
        if (!k) {
            if (z) {
                if (j >= c) {
                    return true;
                }
                ynm.m(this.d.a.b(new fjz(d, 0)), gwr.n);
            }
            return false;
        }
        if (!z || j < c) {
            ynm.m(this.d.a.b(new wgt(d, this.b.c(), 1)), gwr.m);
        }
        return true;
    }

    @Override // defpackage.fjq
    public final boolean a() {
        return b();
    }

    @Override // defpackage.fjq
    public final boolean b() {
        return this.c.t() && f() && this.d.g();
    }

    @Override // defpackage.fjq
    public final boolean c() {
        return f();
    }
}
