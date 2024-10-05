package defpackage;

import android.os.Binder;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sim implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    six d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ sin h;
    volatile int i = 2;

    public sim(sin sinVar, int i) {
        this.h = sinVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.h) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.d.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.i.countDown();
    }

    public final void b() {
        this.h.g.newThread(this).start();
    }

    public final void c(six sixVar) {
        int i = this.e;
        if (i < 5) {
            sixVar.a = this.d;
            sixVar.b = this.a;
            this.d = sixVar;
            this.e = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        Thread currentThread = Thread.currentThread();
        this.b = currentThread;
        this.c = currentThread;
        if (this.h.f.get()) {
            a();
            return;
        }
        loop0: while (true) {
            six sixVar = (six) this.h.a.poll();
            if (sixVar != null) {
                this.h.a();
                Runnable runnable = (Runnable) sixVar.a;
                c(sixVar);
                try {
                    runnable.run();
                    try {
                        try {
                            Binder.flushPendingCommands();
                            Thread.interrupted();
                            if (this.h.e) {
                                break;
                            }
                        } finally {
                        }
                    } catch (Error | RuntimeException e) {
                        if (this.h.f.get()) {
                            a();
                        } else {
                            b();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        Binder.flushPendingCommands();
                        throw th;
                    } finally {
                    }
                }
            } else {
                this.i = 2;
                siy siyVar = this.h.j;
                six sixVar2 = null;
                while (true) {
                    six sixVar3 = (six) siyVar.c.get();
                    if (sixVar3.a == siy.a) {
                        int i3 = sixVar3.b;
                        if (i3 == 0) {
                            i = 3;
                            break;
                        } else if (siyVar.c.compareAndSet(sixVar3, siyVar.e[i3 - 1])) {
                            if (sixVar2 != null) {
                                c(sixVar2);
                            }
                        }
                    } else if (sixVar3.a != siy.b || (i2 = sixVar3.b) <= 0) {
                        if (sixVar2 == null) {
                            sixVar2 = this.d;
                            if (sixVar2 == null) {
                                sixVar2 = new six(null, this.a);
                            } else {
                                this.d = (six) sixVar2.a;
                                this.e--;
                            }
                        }
                        sixVar2.a = sixVar3;
                        if (siyVar.c.compareAndSet(sixVar3, sixVar2)) {
                            i = 2;
                            break;
                        }
                    } else if (siyVar.c.compareAndSet(sixVar3, siyVar.d[i2 - 1])) {
                        if (sixVar2 != null) {
                            c(sixVar2);
                        }
                    }
                }
                i = 1;
                int i4 = i - 1;
                if (i4 == 0) {
                    this.i = 1;
                } else {
                    if (i4 == 2) {
                        this.i = 3;
                        break;
                    }
                    boolean z = false;
                    while (true) {
                        LockSupport.park(this.h);
                        int i5 = this.i;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 != 0) {
                            if (i6 == 1) {
                                z |= Thread.interrupted();
                            } else if (i6 == 2) {
                                break loop0;
                            }
                        } else if (z) {
                            this.b.interrupt();
                        }
                    }
                }
            }
        }
        a();
    }
}
