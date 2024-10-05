package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvk {

    @Deprecated
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(azvk.class, "a");
    public volatile int a = 0;

    public final int a() {
        int i = azvn.a;
        return b.decrementAndGet(this);
    }

    public final int b() {
        int i = azvn.a;
        return b.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        int i3 = azvn.a;
        return b.compareAndSet(this, i, i2);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
