package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aer implements anhy {
    static final aei b;
    private static final Object d;
    volatile aem listeners;
    volatile Object value;
    volatile aeq waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(aer.class.getName());

    static {
        aei aepVar;
        try {
            aepVar = new aen(AtomicReferenceFieldUpdater.newUpdater(aeq.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(aeq.class, aeq.class, "next"), AtomicReferenceFieldUpdater.newUpdater(aer.class, aeq.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(aer.class, aem.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(aer.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            aepVar = new aep();
        }
        b = aepVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object a(anhy anhyVar) {
        if (anhyVar instanceof aer) {
            Object obj = ((aer) anhyVar).value;
            if (!(obj instanceof aej)) {
                return obj;
            }
            aej aejVar = (aej) obj;
            if (!aejVar.c) {
                return obj;
            }
            Throwable th = aejVar.d;
            return th != null ? new aej(false, th) : aej.b;
        }
        boolean isCancelled = anhyVar.isCancelled();
        if ((!a) & isCancelled) {
            return aej.b;
        }
        try {
            Object b2 = b(anhyVar);
            return b2 == null ? d : b2;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new ael(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + anhyVar, e));
            }
            return new aej(false, e);
        } catch (ExecutionException e2) {
            return new ael(e2.getCause());
        } catch (Throwable th2) {
            return new ael(th2);
        }
    }

    static Object b(Future future) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(aer aerVar) {
        aem aemVar;
        aem aemVar2;
        aem aemVar3 = null;
        while (true) {
            aeq aeqVar = aerVar.waiters;
            if (b.e(aerVar, aeqVar, aeq.a)) {
                while (aeqVar != null) {
                    Thread thread = aeqVar.thread;
                    if (thread != null) {
                        aeqVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    aeqVar = aeqVar.next;
                }
                do {
                    aemVar = aerVar.listeners;
                } while (!b.c(aerVar, aemVar, aem.a));
                while (true) {
                    aemVar2 = aemVar3;
                    aemVar3 = aemVar;
                    if (aemVar3 == null) {
                        break;
                    }
                    aemVar = aemVar3.next;
                    aemVar3.next = aemVar2;
                }
                while (aemVar2 != null) {
                    aemVar3 = aemVar2.next;
                    Runnable runnable = aemVar2.b;
                    if (runnable instanceof aeo) {
                        aeo aeoVar = (aeo) runnable;
                        aerVar = aeoVar.a;
                        if (aerVar.value == aeoVar) {
                            if (b.d(aerVar, aeoVar, a(aeoVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, aemVar2.c);
                    }
                    aemVar2 = aemVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj) {
        obj.getClass();
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object b2 = b(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(b2));
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

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void k(aeq aeqVar) {
        aeqVar.thread = null;
        while (true) {
            aeq aeqVar2 = this.waiters;
            if (aeqVar2 != aeq.a) {
                aeq aeqVar3 = null;
                while (aeqVar2 != null) {
                    aeq aeqVar4 = aeqVar2.next;
                    if (aeqVar2.thread != null) {
                        aeqVar3 = aeqVar2;
                    } else if (aeqVar3 != null) {
                        aeqVar3.next = aeqVar4;
                        if (aeqVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, aeqVar2, aeqVar4)) {
                        break;
                    }
                    aeqVar2 = aeqVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) {
        if (obj instanceof aej) {
            Throwable th = ((aej) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof ael) {
            throw new ExecutionException(((ael) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String c() {
        Object obj = this.value;
        if (obj instanceof aeo) {
            return "setFuture=[" + h(((aeo) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aej aejVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof aeo)) {
            return false;
        }
        if (a) {
            aejVar = new aej(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            aejVar = aej.a;
        } else {
            aejVar = aej.b;
        }
        boolean z2 = false;
        aer aerVar = this;
        while (true) {
            if (b.d(aerVar, obj, aejVar)) {
                e(aerVar);
                if (!(obj instanceof aeo)) {
                    break;
                }
                anhy anhyVar = ((aeo) obj).b;
                if (anhyVar instanceof aer) {
                    aerVar = (aer) anhyVar;
                    obj = aerVar.value;
                    if (!(obj == null) && !(obj instanceof aeo)) {
                        break;
                    }
                    z2 = true;
                } else {
                    anhyVar.cancel(z);
                    break;
                }
            } else {
                obj = aerVar.value;
                if (!(obj instanceof aeo)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        aem aemVar = this.listeners;
        if (aemVar != aem.a) {
            aem aemVar2 = new aem(runnable, executor);
            do {
                aemVar2.next = aemVar;
                if (b.c(this, aemVar, aemVar2)) {
                    return;
                } else {
                    aemVar = this.listeners;
                }
            } while (aemVar != aem.a);
        }
        j(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof aeo))) {
                return l(obj2);
            }
            aeq aeqVar = this.waiters;
            if (aeqVar != aeq.a) {
                aeq aeqVar2 = new aeq();
                do {
                    aeqVar2.a(aeqVar);
                    if (b.e(this, aeqVar, aeqVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                k(aeqVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof aeo))));
                        return l(obj);
                    }
                    aeqVar = this.waiters;
                } while (aeqVar != aeq.a);
            }
            return l(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof aej;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof aeo)) & (this.value != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                str = c();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str == null || str.isEmpty()) {
                if (isDone()) {
                    i(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof aeo))) {
                return l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                aeq aeqVar = this.waiters;
                if (aeqVar != aeq.a) {
                    aeq aeqVar2 = new aeq();
                    do {
                        aeqVar2.a(aeqVar);
                        if (b.e(this, aeqVar, aeqVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    k(aeqVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof aeo)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return l(obj2);
                                }
                            } while (nanos >= 1000);
                            k(aeqVar2);
                        } else {
                            aeqVar = this.waiters;
                        }
                    } while (aeqVar != aeq.a);
                }
                return l(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof aeo)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return l(obj3);
                }
            }
            String aerVar = toString();
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
            throw new TimeoutException(str + " for " + aerVar);
        }
        throw new InterruptedException();
    }
}
