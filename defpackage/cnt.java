package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnt implements Future, cnl, cnk {
    private boolean a = false;
    private Object b;
    private cnq c;

    private cnt() {
    }

    public static cnt c() {
        return new cnt();
    }

    private final synchronized Object d(Long l) {
        cnq cnqVar = this.c;
        if (cnqVar != null) {
            throw new ExecutionException(cnqVar);
        }
        if (this.a) {
            return this.b;
        }
        if (l == null) {
            while (!isDone()) {
                wait(0L);
            }
        } else if (l.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long longValue = l.longValue() + uptimeMillis;
            while (!isDone() && uptimeMillis < longValue) {
                wait(longValue - uptimeMillis);
                uptimeMillis = SystemClock.uptimeMillis();
            }
        }
        cnq cnqVar2 = this.c;
        if (cnqVar2 == null) {
            if (!this.a) {
                throw new TimeoutException();
            }
            return this.b;
        }
        throw new ExecutionException(cnqVar2);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return d(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.a) {
            z = this.c != null;
        }
        return z;
    }

    @Override // defpackage.cnk
    public final synchronized void kY(cnq cnqVar) {
        this.c = cnqVar;
        notifyAll();
    }

    @Override // defpackage.cnl
    public final synchronized void kZ(Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
