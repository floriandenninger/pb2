package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yoo extends WeakReference {
    private final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoo(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        obj.getClass();
        this.a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof yoo) && get() == ((yoo) obj).get());
    }

    public final int hashCode() {
        return this.a;
    }
}
