package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbv implements dbr, dbw {
    private Object a;
    private dbs b;
    private boolean c;
    private boolean d;
    private boolean e;
    private csz f;

    private final synchronized Object i(Long l) {
        if (!isDone() && !ddn.n()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.c) {
            if (!this.e) {
                if (this.d) {
                    return this.a;
                }
                if (l == null) {
                    wait(0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.e) {
                        if (!this.c) {
                            if (!this.d) {
                                throw new TimeoutException();
                            }
                            return this.a;
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f);
        }
        throw new CancellationException();
    }

    @Override // defpackage.dcl
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.dbw
    public final synchronized boolean a(csz cszVar, Object obj, dcl dclVar, boolean z) {
        this.e = true;
        this.f = cszVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.dcl
    public final synchronized void b(Object obj, dcs dcsVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            dbs dbsVar = null;
            if (z) {
                dbs dbsVar2 = this.b;
                this.b = null;
                dbsVar = dbsVar2;
            }
            if (dbsVar != null) {
                dbsVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.dcl
    public final synchronized dbs d() {
        return this.b;
    }

    @Override // defpackage.dcl
    public final void e(dck dckVar) {
        dckVar.g(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    @Override // defpackage.dcl
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.dcl
    public final void g(dck dckVar) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.dcl
    public final synchronized void h(dbs dbsVar) {
        this.b = dbsVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.c && !this.d) {
            z = this.e;
        }
        return z;
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
    }

    @Override // defpackage.daq
    public final void k() {
    }

    @Override // defpackage.dbw
    public final synchronized boolean ka(Object obj, Object obj2, int i) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.daq
    public final void l() {
    }

    @Override // defpackage.daq
    public final void m() {
    }

    public final String toString() {
        dbs dbsVar;
        String str;
        String concat = String.valueOf(super.toString()).concat("[status=");
        synchronized (this) {
            dbsVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dbsVar = this.b;
            }
        }
        if (dbsVar != null) {
            String valueOf = String.valueOf(dbsVar);
            int length = String.valueOf(concat).length();
            StringBuilder sb = new StringBuilder(length + 13 + str.length() + String.valueOf(valueOf).length());
            sb.append(concat);
            sb.append(str);
            sb.append(", request=[");
            sb.append(valueOf);
            sb.append("]]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 1 + str.length());
        sb2.append(concat);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }
}
