package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azof implements ayte {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    public azof() {
        azoe azoeVar = new azoe();
        e(azoeVar);
        b(azoeVar);
    }

    final azoe a() {
        return (azoe) this.a.get();
    }

    final azoe b(azoe azoeVar) {
        return (azoe) this.a.getAndSet(azoeVar);
    }

    @Override // defpackage.aytf
    public final void d() {
        while (sg() != null && !j()) {
        }
    }

    final void e(azoe azoeVar) {
        this.b.lazySet(azoeVar);
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return ((azoe) this.b.get()) == a();
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        azoe azoeVar = new azoe(obj);
        b(azoeVar).lazySet(azoeVar);
        return true;
    }

    @Override // defpackage.ayte, defpackage.aytf
    public final Object sg() {
        azoe a;
        azoe azoeVar = (azoe) this.b.get();
        azoe a2 = azoeVar.a();
        if (a2 != null) {
            Object b = a2.b();
            e(a2);
            return b;
        }
        if (azoeVar == a()) {
            return null;
        }
        do {
            a = azoeVar.a();
        } while (a == null);
        Object b2 = a.b();
        e(a);
        return b2;
    }
}
