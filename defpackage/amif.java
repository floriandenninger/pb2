package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amif extends PhantomReference {
    final amie a;

    public amif(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new amie(this);
    }
}
