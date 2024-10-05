package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ayhg extends axzr {
    private static final axzr c;
    public final ayai a;
    public axzr b;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private Status g;
    private List h = new ArrayList();
    private ayhf i;
    private ayaw j;

    static {
        Logger.getLogger(ayhg.class.getName());
        c = new aygz();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ayhg(Executor executor, ScheduledExecutorService scheduledExecutorService, ayaj ayajVar) {
        ScheduledFuture<?> schedule;
        executor.getClass();
        this.e = executor;
        scheduledExecutorService.getClass();
        this.a = ayai.b();
        if (ayajVar == null) {
            schedule = null;
        } else {
            long min = Math.min(Long.MAX_VALUE, ayajVar.b(TimeUnit.NANOSECONDS));
            long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (min < 0) {
                sb.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            } else {
                sb.append("Deadline exceeded after ");
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = scheduledExecutorService.schedule(new aygt(this, sb), min, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (this.f) {
                runnable.run();
            } else {
                this.h.add(runnable);
            }
        }
    }

    @Override // defpackage.axzr
    public final void b(String str, Throwable th) {
        Status withDescription;
        Status status = Status.c;
        if (str != null) {
            withDescription = status.withDescription(str);
        } else {
            withDescription = status.withDescription("Call cancelled without message");
        }
        if (th != null) {
            withDescription = withDescription.c(th);
        }
        g(withDescription, false);
    }

    @Override // defpackage.axzr
    public final void c() {
        j(new aygy(this));
    }

    @Override // defpackage.axzr
    public final void d(int i) {
        if (this.f) {
            this.b.d(i);
        } else {
            j(new aygx(this, i));
        }
    }

    @Override // defpackage.axzr
    public final void e(Object obj) {
        if (this.f) {
            this.b.e(obj);
        } else {
            j(new aygw(this, obj));
        }
    }

    protected void f() {
    }

    public final void g(Status status, boolean z) {
        boolean z2;
        ayaw ayawVar;
        synchronized (this) {
            if (this.b == null) {
                i(c);
                ayawVar = this.j;
                this.g = status;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                z2 = true;
                ayawVar = null;
            }
            ayaw ayawVar2 = ayawVar;
            if (z2) {
                j(new aygv(this, status));
            } else {
                if (ayawVar2 != null) {
                    this.e.execute(new ayha(this, ayawVar2, status, null, null));
                }
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f = r0     // Catch: java.lang.Throwable -> L42
            ayhf r0 = r3.i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            aygu r2 = new aygu
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r0
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayhg.h():void");
    }

    public final void i(axzr axzrVar) {
        axzr axzrVar2 = this.b;
        amkq.Q(axzrVar2 == null, "realCall already set to %s", axzrVar2);
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = axzrVar;
    }

    @Override // defpackage.axzr
    public final void k(ayaw ayawVar, aycd aycdVar) {
        Status status;
        boolean z;
        amkq.O(this.j == null, "already started");
        synchronized (this) {
            this.j = ayawVar;
            status = this.g;
            z = this.f;
            if (!z) {
                ayhf ayhfVar = new ayhf(ayawVar, null, null);
                this.i = ayhfVar;
                ayawVar = ayhfVar;
            }
        }
        if (status != null) {
            this.e.execute(new ayha(this, ayawVar, status, null, null));
        } else if (z) {
            this.b.k(ayawVar, aycdVar);
        } else {
            j(new aygs(this, ayawVar, aycdVar, null, null));
        }
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("realCall", this.b);
        return Y.toString();
    }
}
