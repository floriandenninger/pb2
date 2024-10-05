package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azag extends ayrk implements aysc {
    final aypn b;
    final AtomicReference c;
    final Callable d;
    final banv e;

    public azag(banv banvVar, aypn aypnVar, AtomicReference atomicReference, Callable callable) {
        this.e = banvVar;
        this.b = aypnVar;
        this.c = atomicReference;
        this.d = callable;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.e.ab(banwVar);
    }

    @Override // defpackage.ayrk
    public final void ap(ayrs ayrsVar) {
        azae azaeVar;
        while (true) {
            azaeVar = (azae) this.c.get();
            if (azaeVar != null && !azaeVar.e()) {
                break;
            }
            try {
                azae azaeVar2 = new azae((ayzz) this.d.call());
                if (this.c.compareAndSet(azaeVar, azaeVar2)) {
                    azaeVar = azaeVar2;
                    break;
                }
            } finally {
                aynu.c(th);
                RuntimeException b = azqi.b(th);
            }
        }
        boolean z = !azaeVar.e.get() && azaeVar.e.compareAndSet(false, true);
        try {
            ayrsVar.a(azaeVar);
            if (z) {
                this.b.aa(azaeVar);
            }
        } catch (Throwable th) {
            if (z) {
                azaeVar.e.compareAndSet(true, false);
            }
            throw azqi.b(th);
        }
    }

    @Override // defpackage.aysc
    public final void sl(ayqx ayqxVar) {
        this.c.compareAndSet((azae) ayqxVar, null);
    }
}
