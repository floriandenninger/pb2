package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdn {
    private final ConcurrentMap a = new ConcurrentHashMap();

    @Deprecated
    public vdn() {
    }

    public final Semaphore a(String str) {
        Semaphore semaphore = (Semaphore) this.a.get(str);
        if (semaphore != null) {
            return semaphore;
        }
        this.a.putIfAbsent(str, new Semaphore(1));
        return (Semaphore) this.a.get(str);
    }
}
