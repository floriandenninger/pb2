package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aef {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public aef() {
        this(6);
    }

    public static int g(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    private final int j(Object obj, Object obj2) {
        int a = a(obj, obj2);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected int a(Object obj, Object obj2) {
        return 1;
    }

    protected Object b(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.a.get(obj);
                if (obj2 != null) {
                    this.g++;
                    return obj2;
                }
                this.h++;
                Object b = b(obj);
                if (b == null) {
                    return null;
                }
                synchronized (this) {
                    this.e++;
                    put = this.a.put(obj, b);
                    if (put != null) {
                        this.a.put(obj, put);
                    } else {
                        this.b += j(obj, b);
                    }
                }
                if (put != null) {
                    h(b, put);
                    return put;
                }
                f(this.c);
                return b;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += j(obj, obj2);
            put = this.a.put(obj, obj2);
            if (put != null) {
                this.b -= j(obj, put);
            }
        }
        if (put != null) {
            h(put, obj2);
        }
        f(this.c);
        return put;
    }

    public final synchronized Map e() {
        return new LinkedHashMap(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r3.b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r3.b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r4) goto L50
            java.util.LinkedHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap r2 = r3.a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r3.b     // Catch: java.lang.Throwable -> L71
            int r1 = r3.j(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r1
            r3.b = r2     // Catch: java.lang.Throwable -> L71
            int r1 = r3.f     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + 1
            r3.f = r1     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            r1 = 0
            r3.h(r0, r1)
            goto L0
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r4     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r4
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aef.f(int):void");
    }

    protected void h(Object obj, Object obj2) {
    }

    public final void i(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.a.remove(obj);
                if (remove != null) {
                    this.b -= j(obj, remove);
                }
            }
            if (remove != null) {
                h(remove, null);
                return;
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.g;
        i2 = this.h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public aef(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }
}
