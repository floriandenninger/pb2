package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsb {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static acsc a(int i) {
        return new acsc(a.get() == 1, d, i, awxr.class.getName());
    }

    public static acsc b(int i) {
        return new acsc(a.get() == 1, c, i, awxs.class.getName());
    }

    public static acsc c(int i) {
        return new acsc(a.get() == 1, b, i, awxt.class.getName());
    }
}
