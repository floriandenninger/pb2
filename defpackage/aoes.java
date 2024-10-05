package defpackage;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoes {
    private static final ConditionVariable g = new ConditionVariable();
    static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    static final Collection b = new ConcurrentLinkedQueue();
    static final Collection c = new ConcurrentLinkedQueue();
    static final AtomicInteger d = new AtomicInteger();
    public static volatile boolean e = false;
    private static volatile aoep h = aoeq.a;
    public static volatile aoer f = null;
    private static volatile Thread i = null;

    public static List a() {
        return new ArrayList(c);
    }

    public static List b() {
        return new ArrayList(b);
    }

    public static void c(String str, String... strArr) {
        f(h, str);
    }

    public static void d(aoep aoepVar) {
        if (aoepVar == null) {
            aoepVar = aoeq.a;
        }
        h = aoepVar;
    }

    private static void e(aoep aoepVar, String str) {
        boolean z;
        Map map = a;
        synchronized (map) {
            ConditionVariable conditionVariable = (ConditionVariable) map.get(str);
            ConditionVariable conditionVariable2 = g;
            if (conditionVariable == conditionVariable2) {
                return;
            }
            if (conditionVariable != null) {
                z = true;
            } else {
                conditionVariable = new ConditionVariable();
                map.put(str, conditionVariable);
                z = false;
            }
            if (!z) {
                synchronized (conditionVariable) {
                    try {
                        long nanoTime = System.nanoTime();
                        aoepVar.a(str);
                        map.put(str, conditionVariable2);
                        b.add(new hx(str, Long.valueOf(System.nanoTime() - nanoTime)));
                    } finally {
                    }
                }
            }
            if (Thread.holdsLock(conditionVariable)) {
                return;
            }
            conditionVariable.block();
        }
    }

    private static void f(aoep aoepVar, String str) {
        if (e) {
            long nanoTime = System.nanoTime();
            e(aoepVar, str);
            if (d.incrementAndGet() <= 20) {
                c.add(new hx(str, Long.valueOf(System.nanoTime() - nanoTime)));
                return;
            }
            return;
        }
        e(aoepVar, str);
    }
}
