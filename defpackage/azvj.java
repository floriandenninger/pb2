package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvj {

    @Deprecated
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(azvj.class, "b");
    private volatile int b;

    public azvj(boolean z) {
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        int i = azvn.a;
        return a.compareAndSet(this, 0, 1);
    }

    public final void c() {
        int i = azvn.a;
        this.b = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
