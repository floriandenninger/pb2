package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azti {
    public static final /* synthetic */ int a = 0;

    static {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int k = azul.k(property, 0, 6);
            try {
                if (k < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = k + 1;
                    int k2 = azul.k(property, i2, 4);
                    if (k2 < 0) {
                        k2 = property.length();
                    }
                    String substring = property.substring(0, k);
                    substring.getClass();
                    String substring2 = property.substring(i2, k2);
                    substring2.getClass();
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i >= 65544) {
            try {
                try {
                    Object newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                    newInstance.getClass();
                    try {
                        return;
                    } catch (ClassCastException e) {
                        Throwable initCause = new ClassCastException("Instance classloader: " + newInstance.getClass().getClassLoader() + ", base type classloader: " + azth.class.getClassLoader()).initCause(e);
                        initCause.getClass();
                        throw initCause;
                    }
                } catch (ClassNotFoundException unused2) {
                    Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    newInstance2.getClass();
                    try {
                        return;
                    } catch (ClassCastException e2) {
                        Throwable initCause2 = new ClassCastException("Instance classloader: " + newInstance2.getClass().getClassLoader() + ", base type classloader: " + azth.class.getClassLoader()).initCause(e2);
                        initCause2.getClass();
                        throw initCause2;
                    }
                }
            } catch (ClassNotFoundException unused3) {
            }
        }
        if (i >= 65543) {
            try {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                    newInstance3.getClass();
                    try {
                    } catch (ClassCastException e3) {
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + newInstance3.getClass().getClassLoader() + ", base type classloader: " + azth.class.getClassLoader()).initCause(e3);
                        initCause3.getClass();
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    newInstance4.getClass();
                    try {
                    } catch (ClassCastException e4) {
                        Throwable initCause4 = new ClassCastException("Instance classloader: " + newInstance4.getClass().getClassLoader() + ", base type classloader: " + azth.class.getClassLoader()).initCause(e4);
                        initCause4.getClass();
                        throw initCause4;
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
        }
    }
}
