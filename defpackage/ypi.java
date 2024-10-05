package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ypi implements yoy {
    final Map a = new HashMap(256);
    private final ReadWriteLock b = new ReentrantReadWriteLock();

    @Override // defpackage.yoy
    public final ypc[] a(Object obj, Class cls, Object obj2) {
        Set<yph> v;
        ReadWriteLock readWriteLock;
        this.b.readLock().lock();
        try {
            int i = 0;
            if (this.a.containsKey(cls)) {
                v = yjj.v(this.a, cls);
            } else {
                this.b.readLock().unlock();
                Method[] declaredMethods = cls.getDeclaredMethods();
                this.b.writeLock().lock();
                try {
                    if (this.a.containsKey(cls)) {
                        v = yjj.v(this.a, cls);
                        readWriteLock = this.b;
                    } else {
                        for (Method method : declaredMethods) {
                            if (method.isAnnotationPresent(ypj.class)) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                amkq.F(parameterTypes.length == 1, "Event handler methods can only take a single event argument.");
                                yjj.w(this.a, cls, new yph(parameterTypes[0], method));
                            }
                        }
                        v = yjj.v(this.a, cls);
                        readWriteLock = this.b;
                    }
                    readWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    this.b.writeLock().unlock();
                    throw th;
                }
            }
            if (v.isEmpty()) {
                throw new IllegalArgumentException(String.format("Class %s does not contain any methods annotated with @Subscribe", cls.getName()));
            }
            ypc[] ypcVarArr = new ypc[v.size()];
            for (yph yphVar : v) {
                ypcVarArr[i] = new ypc(obj, yphVar.a, obj2, new ypg(obj, yphVar.b));
                i++;
            }
            return ypcVarArr;
        } finally {
            this.b.readLock().unlock();
        }
    }
}
