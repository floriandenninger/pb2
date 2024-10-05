package defpackage;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aop {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoi a(Object obj) {
        boolean z = obj instanceof aoi;
        boolean z2 = obj instanceof aoa;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((aoa) obj, (aoi) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((aoa) obj, null);
        }
        if (z) {
            return (aoi) obj;
        }
        Class<?> cls = obj.getClass();
        if (b(cls) == 2) {
            List list = (List) b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(c((Constructor) list.get(0), obj));
            }
            aob[] aobVarArr = new aob[list.size()];
            for (int i = 0; i < list.size(); i++) {
                aobVarArr[i] = c((Constructor) list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(aobVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r5.booleanValue() != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aop.b(java.lang.Class):int");
    }

    private static aob c(Constructor constructor, Object obj) {
        try {
            return (aob) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean d(Class cls) {
        return cls != null && aoj.class.isAssignableFrom(cls);
    }
}
