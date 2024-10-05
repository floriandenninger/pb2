package androidx.work;

import defpackage.bxw;
import defpackage.byr;
import defpackage.byv;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends byv {
    private static final Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    @Override // defpackage.byv
    public final byr a(List list) {
        Object newInstance;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((byr) it.next()).c().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap2.get(str);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                        value = newInstance;
                        hashMap2.put(str, value);
                    } else {
                        hashMap2.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (!cls2.isArray()) {
                            newInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                            value = newInstance;
                        } else {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        }
                    } else if (!cls2.isArray() || !cls2.getComponentType().equals(cls)) {
                        if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = c(value, obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        value = c(obj, value);
                    }
                    hashMap2.put(str, value);
                }
            }
        }
        bxw.b(hashMap2, hashMap);
        return bxw.a(hashMap);
    }
}
