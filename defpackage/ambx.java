package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambx {
    public final ambu a;
    public final SettableFuture d;
    public final AtomicLong b = new AtomicLong(b(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = anaf.E(angq.a);

    public ambx(anfy anfyVar, Executor executor) {
        SettableFuture f = SettableFuture.f();
        this.d = f;
        ambu ambuVar = new ambu(anfyVar, executor);
        this.a = ambuVar;
        f.d(ambuVar, angq.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final anhy c() {
        long j;
        final int a;
        anhy i;
        if (this.d.isDone()) {
            return this.d;
        }
        do {
            j = this.b.get();
            a = a(j);
        } while (!this.b.compareAndSet(j, b(a, ((int) j) + 1)));
        final SettableFuture f = SettableFuture.f();
        anhy anhyVar = (anhy) this.e.getAndSet(f);
        if (anhyVar == null) {
            i = anaf.T(amjk.b(new anfy() { // from class: ambr
                @Override // defpackage.anfy
                public final anhy a() {
                    return ambx.this.d(a);
                }
            }), angq.a);
        } else {
            i = aney.i(anhyVar, Throwable.class, amjk.c(new anfz() { // from class: ambs
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    return ambx.this.d(a);
                }
            }), this.f);
        }
        f.qK(i);
        final ambv ambvVar = new ambv(this, a);
        f.d(new Runnable() { // from class: ambt
            @Override // java.lang.Runnable
            public final void run() {
                ambx ambxVar = ambx.this;
                SettableFuture settableFuture = f;
                ambv ambvVar2 = ambvVar;
                try {
                    ambxVar.d.o(anaf.W(settableFuture));
                    ambvVar2.qK(ambxVar.d);
                } catch (Throwable unused) {
                    ambvVar2.qK(settableFuture);
                }
            }
        }, angq.a);
        return ambvVar;
    }

    public final anhy d(int i) {
        ambw ambwVar;
        if (a(this.b.get()) > i) {
            return anaf.M();
        }
        ambw ambwVar2 = new ambw(i);
        do {
            ambwVar = (ambw) this.c.get();
            if (ambwVar != null && ambwVar.a > i) {
                return anaf.M();
            }
        } while (!this.c.compareAndSet(ambwVar, ambwVar2));
        if (a(this.b.get()) > i) {
            ambwVar2.cancel(true);
            this.c.compareAndSet(ambwVar2, null);
            return ambwVar2;
        }
        ambu ambuVar = this.a;
        anfy anfyVar = ambuVar.a;
        Executor executor = ambuVar.b;
        if (anfyVar == null || executor == null) {
            ambwVar2.qK(this.d);
        } else {
            ambwVar2.qK(anaf.T(amjk.b(anfyVar), executor));
        }
        return ambwVar2;
    }

    public final boolean e() {
        return this.d.isDone();
    }
}
