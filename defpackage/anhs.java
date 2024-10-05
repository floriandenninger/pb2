package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhs {
    private static final amvd a = new ampi(new hom(6), amvb.a).a();

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(4:(6:4|(1:25)|6|7|8|2)|6|7|8)|26|27|28|29|30|(1:32)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.util.concurrent.Future r3, java.lang.Class r4) {
        /*
            int r0 = defpackage.anhr.a
            java.util.Set r0 = defpackage.anhq.b
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L8
            goto L54
        L1f:
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            boolean r0 = r0.isAssignableFrom(r4)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Futures.getChecked exception type (%s) must not be a RuntimeException"
            defpackage.amkq.J(r0, r2, r4)
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Exception -> L35
            c(r4, r0)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r1 = 0
        L36:
            java.lang.String r0 = "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable"
            defpackage.amkq.J(r1, r0, r4)
            java.util.Set r0 = defpackage.anhq.b
            int r0 = r0.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L4a
            java.util.Set r0 = defpackage.anhq.b
            r0.clear()
        L4a:
            java.util.Set r0 = defpackage.anhq.b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.add(r1)
        L54:
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L59 java.lang.InterruptedException -> L79
            return r3
        L59:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 != 0) goto L71
            boolean r0 = r3 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L6c
            aniv r4 = new aniv
            r4.<init>(r3)
            throw r4
        L6c:
            java.lang.Exception r3 = c(r4, r3)
            throw r3
        L71:
            angr r4 = new angr
            java.lang.Error r3 = (java.lang.Error) r3
            r4.<init>(r3)
            throw r4
        L79:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.lang.Exception r3 = c(r4, r3)
            goto L87
        L86:
            throw r3
        L87:
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhs.a(java.util.concurrent.Future, java.lang.Class):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        anhq anhqVar = anhq.a;
    }

    private static Exception c(Class cls, Throwable th) {
        List asList = Arrays.asList(cls.getConstructors());
        amvd amvdVar = a;
        Object[] bn = amkq.bn(asList);
        Arrays.sort(bn, amvdVar);
        Iterator it = amkq.aP(Arrays.asList(bn)).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) d((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    private static Object d(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
