package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azuy implements azuz {
    private final AtomicReference a;

    public azuy(azuz azuzVar) {
        this.a = new AtomicReference(azuzVar);
    }

    @Override // defpackage.azuz
    public final Iterator a() {
        azuz azuzVar = (azuz) this.a.getAndSet(null);
        if (azuzVar == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return azuzVar.a();
    }
}
