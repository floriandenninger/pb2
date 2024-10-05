package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rmq {
    public static String b = "0";
    private static final String c = "rmq";
    private static qvu e;
    private static final qmz d = qmz.d;
    public static final Object a = new Object();

    private rmq() {
    }

    public static qvu a() {
        qvu qvuVar;
        synchronized (a) {
            qvuVar = e;
        }
        return qvuVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            qip.az(context, "Context must not be null");
            ClassLoader classLoader = rmq.class.getClassLoader();
            qip.an(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                qnm.d(context, 11925000);
                try {
                    qvu e2 = qvu.e(context, qvu.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = e2.d.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == rmq.class.getClassLoader()) {
                            Log.e(c, "ImplVersion class is missing from Cronet module.");
                            throw new qnk(8);
                        }
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) d(method, new Object[0]);
                        qip.an(num);
                        int intValue = num.intValue();
                        String str = (String) d(method2, new Object[0]);
                        qip.an(str);
                        b = str;
                        if (intValue < 3) {
                            Intent i = d.i(context, 2, "cr");
                            if (i != null) {
                                String str2 = b;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                                sb.append("Google Play Services update is required. The API Level of the client is ");
                                sb.append(3);
                                sb.append(". The API Level of the implementation is ");
                                sb.append(intValue);
                                sb.append(". The Cronet implementation version is ");
                                sb.append(str2);
                                throw new qnl(2, sb.toString(), i);
                            }
                            Log.e(c, "Unable to fetch error resolution intent");
                            throw new qnk(2);
                        }
                        e = e2;
                    } catch (Exception e3) {
                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e3);
                        throw ((qnk) new qnk(8).initCause(e3));
                    }
                } catch (qvq e4) {
                    Log.e(c, "Unable to load Cronet module", e4);
                    throw ((qnk) new qnk(8).initCause(e4));
                }
            } catch (ClassNotFoundException e5) {
                Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                throw ((qnk) new qnk(10).initCause(e5));
            }
        }
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
