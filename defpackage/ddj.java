package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddj {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public ddj(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    protected void c(Object obj, Object obj2) {
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        anjr anjrVar = (anjr) this.a.get(obj);
        if (anjrVar == null) {
            return null;
        }
        return anjrVar.a;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int a = a(obj2);
        long j = a;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        anjr anjrVar = (anjr) this.a.put(obj, obj2 == null ? null : new anjr(obj2, a, null, null));
        if (anjrVar != null) {
            this.c -= anjrVar.b;
            if (!anjrVar.a.equals(obj2)) {
                c(obj, anjrVar.a);
            }
        }
        j(this.b);
        if (anjrVar != null) {
            return anjrVar.a;
        }
        return null;
    }

    public final synchronized Object h(Object obj) {
        anjr anjrVar = (anjr) this.a.remove(obj);
        if (anjrVar == null) {
            return null;
        }
        this.c -= anjrVar.b;
        return anjrVar.a;
    }

    public final void i() {
        j(0L);
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            anjr anjrVar = (anjr) entry.getValue();
            this.c -= anjrVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, anjrVar.a);
        }
    }
}
