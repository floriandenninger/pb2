package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjx extends azqo implements aysc {
    static final azjo a = new azjv(0);
    final ayqb b;
    final AtomicReference c;
    final azjo d;
    final ayqb e;

    private azjx(ayqb ayqbVar, ayqb ayqbVar2, AtomicReference atomicReference, azjo azjoVar) {
        this.e = ayqbVar;
        this.b = ayqbVar2;
        this.c = atomicReference;
        this.d = azjoVar;
    }

    public static azqo b(ayqb ayqbVar, azjo azjoVar) {
        AtomicReference atomicReference = new AtomicReference();
        azjx azjxVar = new azjx(new azjt(atomicReference, azjoVar), ayqbVar, atomicReference, azjoVar);
        ayrv ayrvVar = aynu.m;
        return azjxVar;
    }

    public static azqo c(ayqb ayqbVar) {
        return b(ayqbVar, a);
    }

    @Override // defpackage.azqo
    public final void a(ayrs ayrsVar) {
        azjs azjsVar;
        while (true) {
            azjsVar = (azjs) this.c.get();
            if (azjsVar != null && !azjsVar.e()) {
                break;
            }
            azjs azjsVar2 = new azjs(this.d.a());
            if (this.c.compareAndSet(azjsVar, azjsVar2)) {
                azjsVar = azjsVar2;
                break;
            }
        }
        boolean z = !azjsVar.f.get() && azjsVar.f.compareAndSet(false, true);
        try {
            ayrsVar.a(azjsVar);
            if (z) {
                this.b.aE(azjsVar);
            }
        } catch (Throwable th) {
            if (z) {
                azjsVar.f.compareAndSet(true, false);
            }
            aynu.c(th);
            throw azqi.b(th);
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.e.aE(ayqdVar);
    }

    @Override // defpackage.aysc
    public final void sl(ayqx ayqxVar) {
        this.c.compareAndSet((azjs) ayqxVar, null);
    }
}
