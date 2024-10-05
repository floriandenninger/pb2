package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjd extends azqo {
    public final ayqb a;
    final AtomicReference b;
    final ayqb c;

    public azjd(ayqb ayqbVar, ayqb ayqbVar2, AtomicReference atomicReference) {
        this.c = ayqbVar;
        this.a = ayqbVar2;
        this.b = atomicReference;
    }

    @Override // defpackage.azqo
    public final void a(ayrs ayrsVar) {
        azjb azjbVar;
        while (true) {
            azjbVar = (azjb) this.b.get();
            if (azjbVar != null && !azjbVar.e()) {
                break;
            }
            azjb azjbVar2 = new azjb(this.b);
            if (this.b.compareAndSet(azjbVar, azjbVar2)) {
                azjbVar = azjbVar2;
                break;
            }
        }
        boolean z = !azjbVar.e.get() && azjbVar.e.compareAndSet(false, true);
        try {
            ayrsVar.a(azjbVar);
            if (z) {
                this.a.aE(azjbVar);
            }
        } catch (Throwable th) {
            aynu.c(th);
            throw azqi.b(th);
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.c.aE(ayqdVar);
    }
}
