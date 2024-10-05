package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ypa {
    static final Object a = c();
    private static final yoy[] e = {new ypf(), new ypi()};
    private static final yny i = new yny();
    final Map b;
    final Map c;
    public final ReadWriteLock d;
    private final Executor f;
    private final yoy[] g;
    private final shf h;

    public ypa(Executor executor, shf shfVar) {
        shfVar.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        yny ynyVar = i;
        yoy[] yoyVarArr = e;
        executor.getClass();
        this.f = executor;
        this.b = new HashMap(256);
        this.c = new zgt(new yoz(this));
        this.d = reentrantReadWriteLock;
        this.h = shfVar;
        ynyVar.getClass();
        yoyVarArr.getClass();
        this.g = yoyVarArr;
    }

    public static Object c() {
        return new Object();
    }

    private final void o(Object obj, Object obj2, boolean z) {
        obj2.getClass();
        if (this.h != null && (obj2 instanceof ypk)) {
            ypk ypkVar = (ypk) obj2;
            if (!ypkVar.j()) {
                ypkVar.i(this.h.d());
            }
        }
        yox yoxVar = new yox(this, obj, obj2);
        if (Looper.myLooper() != Looper.getMainLooper() || !z) {
            this.f.execute(yoxVar);
        } else {
            yoxVar.run();
        }
    }

    private final void p(Object obj, Class cls, ypc ypcVar) {
        yjj.w(this.b, cls, ypcVar);
        yjj.w(this.c, obj, ypcVar);
    }

    public final ypc a(Object obj, Class cls, ypb ypbVar) {
        return b(obj, cls, a, ypbVar);
    }

    public final ypc b(Object obj, Class cls, Object obj2, ypb ypbVar) {
        obj.getClass();
        obj2.getClass();
        ypbVar.getClass();
        ypc ypcVar = new ypc(obj, cls, obj2, ypbVar);
        this.d.writeLock().lock();
        try {
            p(obj, cls, ypcVar);
            return ypcVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void d(Object obj) {
        o(a, obj, false);
    }

    public final void e(Object obj, Object obj2) {
        o(obj, obj2, false);
    }

    public final void f(Object obj) {
        o(a, obj, true);
    }

    public final void g(Object obj) {
        obj.getClass();
        h(obj, obj.getClass());
    }

    public final void h(Object obj, Class cls) {
        j(obj, cls, a);
    }

    public final void i(Object obj, Object obj2) {
        j(obj, obj.getClass(), obj2);
    }

    public final void j(Object obj, Class cls, Object obj2) {
        cls.getClass();
        obj2.getClass();
        amkq.F(cls.isAssignableFrom(obj.getClass()), "clazz must be a superclass of target");
        yoy[] yoyVarArr = this.g;
        int length = yoyVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            ypc[] a2 = yoyVarArr[i2].a(obj, cls, obj2);
            if (a2 != null && (a2.length) > 0) {
                this.d.writeLock().lock();
                for (ypc ypcVar : a2) {
                    try {
                        p(obj, ypcVar.a, ypcVar);
                    } finally {
                        this.d.writeLock().unlock();
                    }
                }
                return;
            }
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("target ");
        sb.append(valueOf);
        sb.append(" could not be registered!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void k(Collection collection) {
        this.d.writeLock().lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ypc ypcVar = (ypc) it.next();
                n(ypcVar);
                Object a2 = ypcVar.a();
                if (a2 != null && yjj.x(this.c, a2, ypcVar)) {
                    yjj.z(this.c, a2);
                }
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void l(ypc... ypcVarArr) {
        k(Arrays.asList(ypcVarArr));
    }

    public final void m(Object obj) {
        ReadWriteLock readWriteLock;
        if (obj == null) {
            return;
        }
        this.d.writeLock().lock();
        try {
            if (this.c.containsKey(obj)) {
                Set set = (Set) this.c.remove(obj);
                if (set != null && !set.isEmpty()) {
                    k(set);
                    readWriteLock = this.d;
                }
                readWriteLock = this.d;
            } else {
                readWriteLock = this.d;
            }
            readWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final void n(ypc ypcVar) {
        Class cls = ypcVar.a;
        if (yjj.x(this.b, cls, ypcVar)) {
            yjj.z(this.b, cls);
        }
    }
}
