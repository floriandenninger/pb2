package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public /* synthetic */ class ayaw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.ArrayList] */
    public static List a(Class cls, Iterable iterable, ClassLoader classLoader, ayda aydaVar) {
        ?? load;
        if (!b(classLoader)) {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        } else {
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    load.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : load) {
            aydaVar.b(obj);
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new aycz(aydaVar)));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static axqw g(List list, List list2) {
        return new axqw(list, list2);
    }

    public static void h(azrw azrwVar, List list) {
        list.add(azrwVar);
    }

    public static void i(azrw azrwVar, List list) {
        list.add(azrwVar);
    }

    public static void j(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static axqu l(axqn axqnVar) {
        return new axqu(axqnVar.a);
    }

    public static axqt m(axqn axqnVar) {
        return new axqt(axqnVar.a);
    }

    public static int n(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap o(int i) {
        return new LinkedHashMap(n(i));
    }

    public static List p(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static void q(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void r(Object obj) {
        obj.getClass();
    }

    public static void s(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Object t(Context context) {
        ComponentCallbacks2 m = axfq.m(context.getApplicationContext());
        boolean z = m instanceof axqk;
        Object[] objArr = {m.getClass()};
        if (!z) {
            throw new IllegalArgumentException(String.format("Sting BroadcastReceiver must be attached to an @Sting Application. Found: %s", objArr));
        }
        return ((axqk) m).lM();
    }

    public static apo u(zv zvVar, apo apoVar) {
        return ((axpl) axfq.n(zvVar, axpl.class)).kh().b(zvVar, zvVar.getIntent() != null ? zvVar.getIntent().getExtras() : null, apoVar);
    }

    public static apo v(ce ceVar, apo apoVar) {
        return ((axpm) axfq.n(ceVar, axpm.class)).ai().a(ceVar, apoVar);
    }

    public void c(Status status, aycd aycdVar) {
        throw null;
    }

    public void d(aycd aycdVar) {
        throw null;
    }

    public void e(Object obj) {
        throw null;
    }

    public void f() {
    }
}
