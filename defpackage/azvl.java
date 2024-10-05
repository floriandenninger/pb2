package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvl {

    @Deprecated
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(azvl.class, "b");
    public volatile long b;

    public azvl(long j) {
        this.b = j;
    }

    public final long a(long j) {
        int i = azvn.a;
        return a.addAndGet(this, j);
    }

    public final boolean b(long j, long j2) {
        int i = azvn.a;
        return a.compareAndSet(this, j, j2);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
