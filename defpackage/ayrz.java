package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayrz implements ayqx {
    public static final ayrz a;
    private static final /* synthetic */ ayrz[] b;

    static {
        ayrz ayrzVar = new ayrz();
        a = ayrzVar;
        b = new ayrz[]{ayrzVar};
    }

    private ayrz() {
    }

    public static void a() {
        aynu.j(new ayri("Disposable already set!"));
    }

    public static boolean c(AtomicReference atomicReference) {
        ayqx ayqxVar;
        ayqx ayqxVar2 = (ayqx) atomicReference.get();
        ayrz ayrzVar = a;
        if (ayqxVar2 == ayrzVar || (ayqxVar = (ayqx) atomicReference.getAndSet(ayrzVar)) == ayrzVar) {
            return false;
        }
        if (ayqxVar == null) {
            return true;
        }
        ayqxVar.qc();
        return true;
    }

    public static boolean d(ayqx ayqxVar) {
        return ayqxVar == a;
    }

    public static boolean f(AtomicReference atomicReference, ayqx ayqxVar) {
        ayqx ayqxVar2;
        do {
            ayqxVar2 = (ayqx) atomicReference.get();
            if (ayqxVar2 == a) {
                if (ayqxVar == null) {
                    return false;
                }
                ayqxVar.qc();
                return false;
            }
        } while (!atomicReference.compareAndSet(ayqxVar2, ayqxVar));
        if (ayqxVar2 == null) {
            return true;
        }
        ayqxVar2.qc();
        return true;
    }

    public static boolean g(AtomicReference atomicReference, ayqx ayqxVar) {
        aysw.b(ayqxVar, "d is null");
        if (atomicReference.compareAndSet(null, ayqxVar)) {
            return true;
        }
        ayqxVar.qc();
        if (atomicReference.get() == a) {
            return false;
        }
        a();
        return false;
    }

    public static boolean h(ayqx ayqxVar, ayqx ayqxVar2) {
        if (ayqxVar2 == null) {
            aynu.j(new NullPointerException("next is null"));
            return false;
        }
        if (ayqxVar == null) {
            return true;
        }
        ayqxVar2.qc();
        a();
        return false;
    }

    public static void i(AtomicReference atomicReference, ayqx ayqxVar) {
        ayqx ayqxVar2;
        do {
            ayqxVar2 = (ayqx) atomicReference.get();
            if (ayqxVar2 == a) {
                if (ayqxVar != null) {
                    ayqxVar.qc();
                    return;
                }
                return;
            }
        } while (!atomicReference.compareAndSet(ayqxVar2, ayqxVar));
    }

    public static void j(AtomicReference atomicReference, ayqx ayqxVar) {
        if (atomicReference.compareAndSet(null, ayqxVar) || atomicReference.get() != a) {
            return;
        }
        ayqxVar.qc();
    }

    public static ayrz[] values() {
        return (ayrz[]) b.clone();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
    }
}
