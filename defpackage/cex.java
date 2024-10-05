package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cex implements anhy {
    static final ceo b;
    public static final Object c;
    volatile Object d;
    volatile ces e;
    volatile cew f;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(cex.class.getName());

    static {
        ceo cevVar;
        try {
            cevVar = new cet(AtomicReferenceFieldUpdater.newUpdater(cew.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(cew.class, cew.class, "c"), AtomicReferenceFieldUpdater.newUpdater(cex.class, cew.class, "f"), AtomicReferenceFieldUpdater.newUpdater(cex.class, ces.class, "e"), AtomicReferenceFieldUpdater.newUpdater(cex.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            cevVar = new cev();
        }
        b = cevVar;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c = new Object();
    }

    protected cex() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(anhy anhyVar) {
        if (anhyVar instanceof cex) {
            Object obj = ((cex) anhyVar).d;
            if (!(obj instanceof cep)) {
                return obj;
            }
            cep cepVar = (cep) obj;
            if (!cepVar.c) {
                return obj;
            }
            Throwable th = cepVar.d;
            return th != null ? new cep(false, th) : cep.b;
        }
        boolean isCancelled = anhyVar.isCancelled();
        if ((!a) & isCancelled) {
            return cep.b;
        }
        try {
            Object i = i(anhyVar);
            return i == null ? c : i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new cer(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + anhyVar, e));
            }
            return new cep(false, e);
        } catch (ExecutionException e2) {
            return new cer(e2.getCause());
        } catch (Throwable th2) {
            return new cer(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(cex cexVar) {
        ces cesVar;
        ces cesVar2;
        ces cesVar3 = null;
        while (true) {
            cew cewVar = cexVar.f;
            if (b.e(cexVar, cewVar, cew.a)) {
                while (cewVar != null) {
                    Thread thread = cewVar.b;
                    if (thread != null) {
                        cewVar.b = null;
                        LockSupport.unpark(thread);
                    }
                    cewVar = cewVar.c;
                }
                do {
                    cesVar = cexVar.e;
                } while (!b.c(cexVar, cesVar, ces.a));
                while (true) {
                    cesVar2 = cesVar3;
                    cesVar3 = cesVar;
                    if (cesVar3 == null) {
                        break;
                    }
                    cesVar = cesVar3.d;
                    cesVar3.d = cesVar2;
                }
                while (cesVar2 != null) {
                    cesVar3 = cesVar2.d;
                    Runnable runnable = cesVar2.b;
                    if (runnable instanceof ceu) {
                        ceu ceuVar = (ceu) runnable;
                        cexVar = ceuVar.a;
                        if (cexVar.d == ceuVar) {
                            if (b.d(cexVar, ceuVar, a(ceuVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, cesVar2.c);
                    }
                    cesVar2 = cesVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Object obj) {
        obj.getClass();
    }

    public static cex h() {
        return new cex();
    }

    private static Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(i));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void m(cew cewVar) {
        cewVar.b = null;
        while (true) {
            cew cewVar2 = this.f;
            if (cewVar2 != cew.a) {
                cew cewVar3 = null;
                while (cewVar2 != null) {
                    cew cewVar4 = cewVar2.c;
                    if (cewVar2.b != null) {
                        cewVar3 = cewVar2;
                    } else if (cewVar3 != null) {
                        cewVar3.c = cewVar4;
                        if (cewVar3.b == null) {
                            break;
                        }
                    } else if (!b.e(this, cewVar2, cewVar4)) {
                        break;
                    }
                    cewVar2 = cewVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object n(Object obj) {
        if (obj instanceof cep) {
            Throwable th = ((cep) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cer) {
            throw new ExecutionException(((cer) obj).b);
        }
        if (obj == c) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        cep cepVar;
        Object obj = this.d;
        if (!(obj == null) && !(obj instanceof ceu)) {
            return false;
        }
        if (a) {
            cepVar = new cep(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cepVar = cep.a;
        } else {
            cepVar = cep.b;
        }
        boolean z2 = false;
        cex cexVar = this;
        while (true) {
            if (b.d(cexVar, obj, cepVar)) {
                b(cexVar);
                if (!(obj instanceof ceu)) {
                    break;
                }
                anhy anhyVar = ((ceu) obj).b;
                if (anhyVar instanceof cex) {
                    cexVar = (cex) anhyVar;
                    obj = cexVar.d;
                    if (!(obj == null) && !(obj instanceof ceu)) {
                        break;
                    }
                    z2 = true;
                } else {
                    anhyVar.cancel(z);
                    break;
                }
            } else {
                obj = cexVar.d;
                if (!(obj instanceof ceu)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        c(runnable);
        c(executor);
        ces cesVar = this.e;
        if (cesVar != ces.a) {
            ces cesVar2 = new ces(runnable, executor);
            do {
                cesVar2.d = cesVar;
                if (b.c(this, cesVar, cesVar2)) {
                    return;
                } else {
                    cesVar = this.e;
                }
            } while (cesVar != ces.a);
        }
        l(runnable, executor);
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = c;
        }
        if (b.d(this, null, obj)) {
            b(this);
        }
    }

    public final void f(Throwable th) {
        if (b.d(this, null, new cer(th))) {
            b(this);
        }
    }

    public final void g(anhy anhyVar) {
        cer cerVar;
        c(anhyVar);
        Object obj = this.d;
        if (obj == null) {
            if (anhyVar.isDone()) {
                if (b.d(this, null, a(anhyVar))) {
                    b(this);
                    return;
                }
                return;
            }
            ceu ceuVar = new ceu(this, anhyVar);
            if (b.d(this, null, ceuVar)) {
                try {
                    anhyVar.d(ceuVar, cey.a);
                    return;
                } catch (Throwable th) {
                    try {
                        cerVar = new cer(th);
                    } catch (Throwable unused) {
                        cerVar = cer.a;
                    }
                    b.d(this, ceuVar, cerVar);
                    return;
                }
            }
            obj = this.d;
        }
        if (obj instanceof cep) {
            anhyVar.cancel(((cep) obj).c);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof ceu))) {
                return n(obj2);
            }
            cew cewVar = this.f;
            if (cewVar != cew.a) {
                cew cewVar2 = new cew();
                do {
                    cewVar2.a(cewVar);
                    if (b.e(this, cewVar, cewVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                m(cewVar2);
                                throw new InterruptedException();
                            }
                            obj = this.d;
                        } while (!((obj != null) & (!(obj instanceof ceu))));
                        return n(obj);
                    }
                    cewVar = this.f;
                } while (cewVar != cew.a);
            }
            return n(this.d);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof cep;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof ceu)) & (this.d != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (!isDone()) {
            try {
                Object obj = this.d;
                if (obj instanceof ceu) {
                    str = "setFuture=[" + j(((ceu) obj).b) + "]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str == null || str.isEmpty()) {
                if (isDone()) {
                    k(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            }
        } else {
            k(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.d;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof ceu))) {
                return n(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                cew cewVar = this.f;
                if (cewVar != cew.a) {
                    cew cewVar2 = new cew();
                    do {
                        cewVar2.a(cewVar);
                        if (b.e(this, cewVar, cewVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    m(cewVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.d;
                                if (!((obj2 != null) & (!(obj2 instanceof ceu)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return n(obj2);
                                }
                            } while (nanos >= 1000);
                            m(cewVar2);
                        } else {
                            cewVar = this.f;
                        }
                    } while (cewVar != cew.a);
                }
                return n(this.d);
            }
            while (nanos > 0) {
                Object obj3 = this.d;
                if (!((obj3 != null) & (!(obj3 instanceof ceu)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return n(obj3);
                }
            }
            String cexVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + cexVar);
        }
        throw new InterruptedException();
    }
}
