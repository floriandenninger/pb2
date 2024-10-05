package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqb implements banx {
    public static final azqb a;
    private static final /* synthetic */ azqb[] b;

    static {
        azqb azqbVar = new azqb();
        a = azqbVar;
        b = new azqb[]{azqbVar};
    }

    private azqb() {
    }

    public static void a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        banx banxVar = (banx) atomicReference.get();
        if (banxVar != null) {
            banxVar.sj(j);
            return;
        }
        if (h(j)) {
            ayeq.j(atomicLong, j);
            banx banxVar2 = (banx) atomicReference.get();
            if (banxVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    banxVar2.sj(andSet);
                }
            }
        }
    }

    public static void b(long j) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("More produced than requested: ");
        sb.append(j);
        aynu.j(new ayri(sb.toString()));
    }

    public static void d() {
        aynu.j(new ayri("Subscription already set!"));
    }

    public static boolean f(AtomicReference atomicReference) {
        banx banxVar;
        banx banxVar2 = (banx) atomicReference.get();
        azqb azqbVar = a;
        if (banxVar2 == azqbVar || (banxVar = (banx) atomicReference.getAndSet(azqbVar)) == azqbVar) {
            return false;
        }
        if (banxVar == null) {
            return true;
        }
        banxVar.sd();
        return true;
    }

    public static boolean g(AtomicReference atomicReference, banx banxVar) {
        aysw.b(banxVar, "s is null");
        if (atomicReference.compareAndSet(null, banxVar)) {
            return true;
        }
        banxVar.sd();
        if (atomicReference.get() == a) {
            return false;
        }
        d();
        return false;
    }

    public static boolean h(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("n > 0 required but it was ");
        sb.append(j);
        aynu.j(new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static boolean i(banx banxVar, banx banxVar2) {
        if (banxVar2 == null) {
            aynu.j(new NullPointerException("next is null"));
            return false;
        }
        if (banxVar == null) {
            return true;
        }
        banxVar2.sd();
        d();
        return false;
    }

    public static void j(AtomicReference atomicReference, AtomicLong atomicLong, banx banxVar) {
        if (g(atomicReference, banxVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                banxVar.sj(andSet);
            }
        }
    }

    public static void k(AtomicReference atomicReference, banx banxVar, long j) {
        if (g(atomicReference, banxVar)) {
            banxVar.sj(j);
        }
    }

    public static azqb[] values() {
        return (azqb[]) b.clone();
    }

    @Override // defpackage.banx
    public final void sd() {
    }

    @Override // defpackage.banx
    public final void sj(long j) {
    }
}
