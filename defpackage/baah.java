package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baah implements Executor, Closeable {
    public static final baac a = new baac("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e = "DefaultDispatcher";
    public final azvl f;
    public final AtomicReferenceArray g;
    public final azvl h;
    public final azzu i;
    public final azzu j;
    private final azvj k;

    public static /* synthetic */ void e(baah baahVar, Runnable runnable) {
        baahVar.a(runnable, baal.a, false);
    }

    public static final void f(baam baamVar) {
        baamVar.getClass();
        try {
            baamVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public static final baam g(Runnable runnable, baan baanVar) {
        long j = baap.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof baam) {
            baam baamVar = (baam) runnable;
            baamVar.g = nanoTime;
            baamVar.h = baanVar;
            return baamVar;
        }
        return new baao(runnable, nanoTime, baanVar);
    }

    private final int h() {
        synchronized (this.g) {
            if (d()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) (j & 2097151);
            int c = azuj.c(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (c >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.get(i2) == null) {
                baag baagVar = new baag(this, i2);
                this.g.set(i2, baagVar);
                azvl azvlVar = this.h;
                int i3 = azvn.a;
                if (i2 != ((int) (2097151 & azvl.a.incrementAndGet(azvlVar)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                baagVar.start();
                return c + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final baag i() {
        Thread currentThread = Thread.currentThread();
        baag baagVar = currentThread instanceof baag ? (baag) currentThread : null;
        if (baagVar != null && azul.c(baagVar.d, this)) {
            return baagVar;
        }
        return null;
    }

    private final boolean j(long j) {
        if (azuj.c(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.b) {
            int h = h();
            if (h == 1) {
                if (this.b > 1) {
                    h();
                }
            } else if (h <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean k() {
        baag baagVar;
        do {
            azvl azvlVar = this.f;
            while (true) {
                long j = azvlVar.b;
                baagVar = (baag) this.g.get((int) (2097151 & j));
                if (baagVar != null) {
                    long j2 = (2097152 + j) & (-2097152);
                    int l = l(baagVar);
                    if (l >= 0 && this.f.b(j, j2 | l)) {
                        baagVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    baagVar = null;
                    break;
                }
            }
            if (baagVar == null) {
                return false;
            }
        } while (!baagVar.b.c(-1, 0));
        LockSupport.unpark(baagVar);
        return true;
    }

    private static final int l(baag baagVar) {
        int i;
        do {
            Object obj = baagVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            baagVar = (baag) obj;
            i = baagVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, baan baanVar, boolean z) {
        baam baamVar;
        boolean d;
        baanVar.getClass();
        baam g = g(runnable, baanVar);
        baag i = i();
        if (i == null || i.e == 5 || (g.h.e() == 0 && i.e == 2)) {
            baamVar = g;
        } else {
            i.c = true;
            baamVar = i.a.c(g, z);
        }
        if (baamVar != null) {
            if (baamVar.h.e() == 1) {
                d = this.j.d(baamVar);
            } else {
                d = this.i.d(baamVar);
            }
            if (!d) {
                throw new RejectedExecutionException(azul.a(this.e, " was terminated"));
            }
        }
        boolean z2 = z && i != null;
        if (g.h.e() == 0) {
            if (z2) {
                return;
            }
            c();
        } else {
            long a2 = this.h.a(2097152L);
            if (z2 || k() || j(a2)) {
                return;
            }
            k();
        }
    }

    public final void b(baag baagVar, int i, int i2) {
        azvl azvlVar = this.f;
        while (true) {
            long j = azvlVar.b;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? l(baagVar) : i2;
            }
            if (i3 >= 0 && this.f.b(j, j2 | i3)) {
                return;
            }
        }
    }

    public final void c() {
        if (k() || j(this.h.b)) {
            return;
        }
        k();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        if (this.k.b()) {
            baag i2 = i();
            synchronized (this.g) {
                i = (int) (this.h.b & 2097151);
            }
            if (i > 0) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    Object obj = this.g.get(i3);
                    obj.getClass();
                    baag baagVar = (baag) obj;
                    if (baagVar != i2) {
                        while (baagVar.isAlive()) {
                            LockSupport.unpark(baagVar);
                            baagVar.join(10000L);
                        }
                        boolean z = azwq.a;
                        baaq baaqVar = baagVar.a;
                        azzu azzuVar = this.j;
                        azzuVar.getClass();
                        baam baamVar = (baam) baaqVar.b.a(null);
                        if (baamVar != null) {
                            azzuVar.d(baamVar);
                        }
                        while (true) {
                            baam e = baaqVar.e();
                            if (e == null) {
                                break;
                            } else {
                                azzuVar.d(e);
                            }
                        }
                    }
                    if (i3 == i) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.j.c();
            this.i.c();
            while (true) {
                baam b = i2 == null ? null : i2.b(true);
                if (b == null && (b = (baam) this.i.b()) == null && (b = (baam) this.j.b()) == null) {
                    break;
                } else {
                    f(b);
                }
            }
            if (i2 != null) {
                i2.d(5);
            }
            boolean z2 = azwq.a;
            azvl azvlVar = this.f;
            int i5 = azvn.a;
            azvlVar.b = 0L;
            this.h.b = 0L;
        }
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        e(this, runnable);
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.g.length();
        int i5 = 0;
        if (length > 1) {
            int i6 = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                baag baagVar = (baag) this.g.get(i7);
                if (baagVar != null) {
                    baaq baaqVar = baagVar.a;
                    int a2 = baaqVar.b.a != null ? baaqVar.a() + 1 : baaqVar.a();
                    int i9 = baagVar.e;
                    int i10 = i9 - 1;
                    if (i9 == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        i6++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        sb.append('c');
                        arrayList.add(sb.toString());
                    } else if (i10 == 1) {
                        i5++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a2);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    } else if (i10 == 2) {
                        i4++;
                    } else if (i10 == 3) {
                        i2++;
                        if (a2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a2);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i10 == 4) {
                        i3++;
                    }
                }
                if (i8 >= length) {
                    i = i5;
                    i5 = i6;
                    break;
                }
                i7 = i8;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        long j = this.h.b;
        return this.e + '@' + azth.h(this) + "[Pool Size {core = " + this.b + ", max = " + this.c + "}, Worker States {CPU = " + i5 + ", blocking = " + i + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i3 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.i.a() + ", global blocking queue size = " + this.j.a() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public baah(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.d = j;
        if (i <= 0) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j > 0) {
            this.i = new azzu();
            this.j = new azzu();
            this.f = azth.n(0L);
            this.g = new AtomicReferenceArray(i2 + 1);
            this.h = azth.n(i << 42);
            this.k = azth.m(false);
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
    }
}
