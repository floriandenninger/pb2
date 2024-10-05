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
public abstract class anfm extends aniw implements anhy {
    private static final Logger a;
    private static final Object b;
    public static final boolean g;
    public static final anez h;
    public volatile anfd listeners;
    public volatile Object value;
    public volatile anfl waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        anez anfgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        g = z;
        a = Logger.getLogger(anfm.class.getName());
        try {
            anfgVar = new anfk();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                anfgVar = new anfe(AtomicReferenceFieldUpdater.newUpdater(anfl.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(anfl.class, anfl.class, "next"), AtomicReferenceFieldUpdater.newUpdater(anfm.class, anfl.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(anfm.class, anfd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(anfm.class, Object.class, "value"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                anfgVar = new anfg();
            }
        }
        h = anfgVar;
        if (th != null) {
            Logger logger = a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        b = new Object();
    }

    private static Object f(Future future) {
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

    private final void g(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            } else if (f == this) {
                sb.append("this future");
            } else {
                sb.append(f.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
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

    private final void h(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof anff) {
            sb.append(", setFuture=[");
            i(sb, ((anff) obj).b);
            sb.append("]");
        } else {
            try {
                sb2 = ammx.b(b());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(valueOf);
                sb2 = sb3.toString();
            }
            if (sb2 != null) {
                sb.append(", info=[");
                sb.append(sb2);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            g(sb);
        }
    }

    private final void i(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(anhy anhyVar) {
        Throwable k;
        if (anhyVar instanceof anfh) {
            Object obj = ((anfm) anhyVar).value;
            if (obj instanceof anfa) {
                anfa anfaVar = (anfa) obj;
                if (anfaVar.c) {
                    Throwable th = anfaVar.d;
                    obj = th != null ? new anfa(false, th) : anfa.b;
                }
            }
            obj.getClass();
            return obj;
        }
        if (!(anhyVar instanceof aniw) || (k = ((aniw) anhyVar).k()) == null) {
            boolean isCancelled = anhyVar.isCancelled();
            if ((!g) & isCancelled) {
                anfa anfaVar2 = anfa.b;
                anfaVar2.getClass();
                return anfaVar2;
            }
            try {
                Object f = f(anhyVar);
                if (!isCancelled) {
                    return f == null ? b : f;
                }
                String valueOf = String.valueOf(anhyVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new anfa(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(anhyVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new anfc(new IllegalArgumentException(sb2.toString(), e));
                }
                return new anfa(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(anhyVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new anfa(false, new IllegalArgumentException(sb3.toString(), e2));
                }
                return new anfc(e2.getCause());
            } catch (Throwable th2) {
                return new anfc(th2);
            }
        }
        return new anfc(k);
    }

    public static void l(anfm anfmVar) {
        anfd anfdVar;
        anfd anfdVar2;
        anfd anfdVar3 = null;
        while (true) {
            anfl anflVar = anfmVar.waiters;
            if (h.e(anfmVar, anflVar, anfl.a)) {
                while (anflVar != null) {
                    Thread thread = anflVar.thread;
                    if (thread != null) {
                        anflVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    anflVar = anflVar.next;
                }
                anfmVar.qf();
                do {
                    anfdVar = anfmVar.listeners;
                } while (!h.c(anfmVar, anfdVar, anfd.a));
                while (true) {
                    anfdVar2 = anfdVar3;
                    anfdVar3 = anfdVar;
                    if (anfdVar3 == null) {
                        break;
                    }
                    anfdVar = anfdVar3.next;
                    anfdVar3.next = anfdVar2;
                }
                while (anfdVar2 != null) {
                    anfdVar3 = anfdVar2.next;
                    Runnable runnable = anfdVar2.b;
                    runnable.getClass();
                    if (runnable instanceof anff) {
                        anff anffVar = (anff) runnable;
                        anfmVar = anffVar.a;
                        if (anfmVar.value == anffVar) {
                            if (h.d(anfmVar, anffVar, j(anffVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = anfdVar2.c;
                        executor.getClass();
                        q(runnable, executor);
                    }
                    anfdVar2 = anfdVar3;
                }
                return;
            }
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    private final void r(anfl anflVar) {
        anflVar.thread = null;
        while (true) {
            anfl anflVar2 = this.waiters;
            if (anflVar2 != anfl.a) {
                anfl anflVar3 = null;
                while (anflVar2 != null) {
                    anfl anflVar4 = anflVar2.next;
                    if (anflVar2.thread != null) {
                        anflVar3 = anflVar2;
                    } else if (anflVar3 != null) {
                        anflVar3.next = anflVar4;
                        if (anflVar3.thread == null) {
                            break;
                        }
                    } else if (!h.e(this, anflVar2, anflVar4)) {
                        break;
                    }
                    anflVar2 = anflVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object s(Object obj) {
        if (obj instanceof anfa) {
            Throwable th = ((anfa) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof anfc) {
            throw new ExecutionException(((anfc) obj).b);
        }
        if (obj == b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public boolean cancel(boolean z) {
        anfa anfaVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof anff)) {
            return false;
        }
        if (g) {
            anfaVar = new anfa(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                anfaVar = anfa.a;
            } else {
                anfaVar = anfa.b;
            }
            anfaVar.getClass();
        }
        boolean z2 = false;
        anfm anfmVar = this;
        while (true) {
            if (h.d(anfmVar, obj, anfaVar)) {
                if (z) {
                    anfmVar.m();
                }
                l(anfmVar);
                if (!(obj instanceof anff)) {
                    break;
                }
                anhy anhyVar = ((anff) obj).b;
                if (anhyVar instanceof anfh) {
                    anfmVar = (anfm) anhyVar;
                    obj = anfmVar.value;
                    if (!(obj == null) && !(obj instanceof anff)) {
                        break;
                    }
                    z2 = true;
                } else {
                    anhyVar.cancel(z);
                    break;
                }
            } else {
                obj = anfmVar.value;
                if (!(obj instanceof anff)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public void d(Runnable runnable, Executor executor) {
        anfd anfdVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (anfdVar = this.listeners) != anfd.a) {
            anfd anfdVar2 = new anfd(runnable, executor);
            do {
                anfdVar2.next = anfdVar;
                if (h.c(this, anfdVar, anfdVar2)) {
                    return;
                } else {
                    anfdVar = this.listeners;
                }
            } while (anfdVar != anfd.a);
        }
        q(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(Throwable th) {
        th.getClass();
        if (!h.d(this, null, new anfc(th))) {
            return false;
        }
        l(this);
        return true;
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof anff))) {
                return s(obj2);
            }
            anfl anflVar = this.waiters;
            if (anflVar != anfl.a) {
                anfl anflVar2 = new anfl();
                do {
                    anflVar2.a(anflVar);
                    if (h.e(this, anflVar, anflVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                r(anflVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof anff))));
                        return s(obj);
                    }
                    anflVar = this.waiters;
                } while (anflVar != anfl.a);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return s(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof anfa;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof anff)) & (this.value != null);
    }

    @Override // defpackage.aniw
    public final Throwable k() {
        if (!(this instanceof anfh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof anfc) {
            return ((anfc) obj).b;
        }
        return null;
    }

    protected void m() {
    }

    public final void n(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    public final boolean o(Object obj) {
        if (obj == null) {
            obj = b;
        }
        if (!h.d(this, null, obj)) {
            return false;
        }
        l(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        Object obj = this.value;
        return (obj instanceof anfa) && ((anfa) obj).c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean qK(anhy anhyVar) {
        anfc anfcVar;
        anhyVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (anhyVar.isDone()) {
                if (!h.d(this, null, j(anhyVar))) {
                    return false;
                }
                l(this);
                return true;
            }
            anff anffVar = new anff(this, anhyVar);
            if (h.d(this, null, anffVar)) {
                try {
                    anhyVar.d(anffVar, angq.a);
                } catch (Throwable th) {
                    try {
                        anfcVar = new anfc(th);
                    } catch (Throwable unused) {
                        anfcVar = anfc.a;
                    }
                    h.d(this, anffVar, anfcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof anfa) {
            anhyVar.cancel(((anfa) obj).c);
        }
        return false;
    }

    protected void qf() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            h(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof anff))) {
                return s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                anfl anflVar = this.waiters;
                if (anflVar != anfl.a) {
                    anfl anflVar2 = new anfl();
                    do {
                        anflVar2.a(anflVar);
                        if (h.e(this, anflVar, anflVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    r(anflVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof anff)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return s(obj2);
                                }
                            } while (nanos >= 1000);
                            r(anflVar2);
                        } else {
                            anflVar = this.waiters;
                        }
                    } while (anflVar != anfl.a);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return s(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof anff)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return s(obj4);
                }
            }
            String anfmVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(anfmVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(anfmVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
