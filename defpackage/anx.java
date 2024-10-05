package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anx {
    public static final anx a = new anx();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, anw anwVar, aod aodVar, Class cls) {
        aod aodVar2 = (aod) map.get(anwVar);
        if (aodVar2 == null || aodVar == aodVar2) {
            if (aodVar2 == null) {
                map.put(anwVar, aodVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + anwVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aodVar2 + ", new value " + aodVar);
    }

    public final anv a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(hashMap, (anw) entry.getKey(), (aod) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(aok.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                aod a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (parameterTypes[1].isAssignableFrom(aod.class)) {
                        if (a2 != aod.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new anw(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        anv anvVar = new anv(hashMap);
        this.c.put(cls, anvVar);
        this.b.put(cls, Boolean.valueOf(z));
        return anvVar;
    }

    public final anv b(Class cls) {
        anv anvVar = (anv) this.c.get(cls);
        return anvVar != null ? anvVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
