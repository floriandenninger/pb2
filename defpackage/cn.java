package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cn {
    private static final aeg a = new aeg();

    public static Class a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e) {
            throw new cc("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new cc("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return ce.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class d(ClassLoader classLoader, String str) {
        aeg aegVar = a;
        aeg aegVar2 = (aeg) aegVar.get(classLoader);
        if (aegVar2 == null) {
            aegVar2 = new aeg();
            aegVar.put(classLoader, aegVar2);
        }
        Class cls = (Class) aegVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        aegVar2.put(str, cls2);
        return cls2;
    }

    public ce c(String str) {
        throw null;
    }
}
