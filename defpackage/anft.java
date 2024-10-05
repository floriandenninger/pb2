package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anft extends anfx {
    private static final Logger c = Logger.getLogger(anft.class.getName());
    public amrl a;
    private final boolean d;
    private final boolean e;

    public anft(amrl amrlVar, boolean z, boolean z2) {
        super(amrlVar.size());
        amrlVar.getClass();
        this.a = amrlVar;
        this.d = z;
        this.e = z2;
    }

    private final void t(Throwable th) {
        th.getClass();
        if (this.d && !e(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set ar = amkq.ar();
                f(ar);
                anfx.b.b(this, ar);
                set = this.seenExceptions;
                set.getClass();
            }
            if (v(set, th)) {
                u(th);
                return;
            }
        }
        if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        amrl amrlVar = this.a;
        if (amrlVar == null) {
            return super.b();
        }
        String valueOf = String.valueOf(amrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // defpackage.anfx
    public final void f(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable k = k();
        k.getClass();
        v(set, k);
    }

    public abstract void g(int i, Object obj);

    public final void h(int i, Future future) {
        try {
            g(i, anaf.W(future));
        } catch (ExecutionException e) {
            t(e.getCause());
        } catch (Throwable th) {
            t(th);
        }
    }

    public final void i(amrl amrlVar) {
        int a = anfx.b.a(this);
        int i = 0;
        amkq.O(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (amrlVar != null) {
                amxd listIterator = amrlVar.listIterator();
                while (listIterator.hasNext()) {
                    Future future = (Future) listIterator.next();
                    if (!future.isCancelled()) {
                        h(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            q();
            s(2);
        }
    }

    public abstract void q();

    @Override // defpackage.anfm
    protected final void qf() {
        amrl amrlVar = this.a;
        s(1);
        if ((amrlVar != null) && isCancelled()) {
            boolean p = p();
            amxd listIterator = amrlVar.listIterator();
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        amrl amrlVar = this.a;
        amrlVar.getClass();
        if (amrlVar.isEmpty()) {
            q();
            return;
        }
        if (this.d) {
            amxd listIterator = this.a.listIterator();
            int i = 0;
            while (listIterator.hasNext()) {
                anhy anhyVar = (anhy) listIterator.next();
                anhyVar.d(new anfr(this, anhyVar, i), angq.a);
                i++;
            }
            return;
        }
        anfs anfsVar = new anfs(this, this.e ? this.a : null);
        amxd listIterator2 = this.a.listIterator();
        while (listIterator2.hasNext()) {
            ((anhy) listIterator2.next()).d(anfsVar, angq.a);
        }
    }

    public void s(int i) {
        this.a = null;
    }
}
