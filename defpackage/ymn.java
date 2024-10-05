package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ymn extends SoftReference {
    public final Object a;

    public ymn(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj2, referenceQueue);
        this.a = obj;
    }
}
