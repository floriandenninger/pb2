package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aydk {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e;

    public aydk(Class cls, ClassLoader classLoader) {
        Class asSubclass = cls.asSubclass(amkz.class);
        this.a = asSubclass;
        this.d = asSubclass.getMethod("getScopes", new Class[0]);
        Method declaredMethod = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(amkz.class).getDeclaredMethod("newBuilder", new Class[0]);
        this.b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", new Class[0]);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        Method method = asSubclass.getMethod("getClientId", new Class[0]);
        arrayList.add(new aydl(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = asSubclass.getMethod("getClientEmail", new Class[0]);
        arrayList.add(new aydl(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = asSubclass.getMethod("getPrivateKey", new Class[0]);
        arrayList.add(new aydl(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = asSubclass.getMethod("getPrivateKeyId", new Class[0]);
        arrayList.add(new aydl(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
    }
}
