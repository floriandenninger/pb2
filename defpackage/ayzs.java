package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzs extends ayrk {
    public final aypn b;
    final AtomicReference c;
    public final int d;
    final banv e;

    public ayzs(banv banvVar, aypn aypnVar, AtomicReference atomicReference, int i) {
        this.e = banvVar;
        this.b = aypnVar;
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.e.ab(banwVar);
    }

    @Override // defpackage.ayrk
    public final void ap(ayrs ayrsVar) {
        ayzr ayzrVar;
        while (true) {
            ayzrVar = (ayzr) this.c.get();
            if (ayzrVar != null && !ayzrVar.e()) {
                break;
            }
            ayzr ayzrVar2 = new ayzr(this.c, this.d);
            if (this.c.compareAndSet(ayzrVar, ayzrVar2)) {
                ayzrVar = ayzrVar2;
                break;
            }
        }
        boolean z = !ayzrVar.f.get() && ayzrVar.f.compareAndSet(false, true);
        try {
            ayrsVar.a(ayzrVar);
            if (z) {
                this.b.aa(ayzrVar);
            }
        } catch (Throwable th) {
            aynu.c(th);
            throw azqi.b(th);
        }
    }
}
