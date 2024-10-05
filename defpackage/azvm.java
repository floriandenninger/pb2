package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvm {

    @Deprecated
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(azvm.class, Object.class, "a");
    public volatile Object a;

    public azvm(Object obj) {
        this.a = obj;
    }

    public final Object a(Object obj) {
        int i = azvn.a;
        return b.getAndSet(this, obj);
    }

    public final void b(Object obj) {
        int i = azvn.a;
        b.lazySet(this, obj);
    }

    public final boolean c(Object obj, Object obj2) {
        int i = azvn.a;
        return b.compareAndSet(this, obj, obj2);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
