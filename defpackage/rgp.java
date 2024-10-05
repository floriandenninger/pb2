package defpackage;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgp extends FutureTask implements Comparable {
    final boolean a;
    final /* synthetic */ rgr b;
    private final long c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgp(rgr rgrVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.b = rgrVar;
        long andIncrement = rgr.a.getAndIncrement();
        this.c = andIncrement;
        this.d = str;
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            rgrVar.aF().c.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        rgp rgpVar = (rgp) obj;
        boolean z = this.a;
        if (z != rgpVar.a) {
            return !z ? 1 : -1;
        }
        long j = this.c;
        long j2 = rgpVar.c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.b.aF().d.b("Two tasks share the same index. index", Long.valueOf(this.c));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.b.aF().c.b(this.d, th);
        if ((th instanceof rgn) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgp(rgr rgrVar, Callable callable, boolean z) {
        super(callable);
        this.b = rgrVar;
        long andIncrement = rgr.a.getAndIncrement();
        this.c = andIncrement;
        this.d = "Task exception on worker thread";
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            rgrVar.aF().c.a("Tasks index overflow");
        }
    }
}
