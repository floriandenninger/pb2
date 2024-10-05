package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahv {
    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.ahv.g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            defpackage.ahv.a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            defpackage.ahv.b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r2 = r0
        L33:
            defpackage.ahv.c = r2
            java.lang.Class r2 = defpackage.ahv.a
            java.lang.String r3 = "performStopActivity"
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L40
        L3e:
            r2 = r0
            goto L55
        L40:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r7[r1] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch: java.lang.Throwable -> L3e
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
        L55:
            defpackage.ahv.d = r2
            java.lang.Class r2 = defpackage.ahv.a
            if (r2 != 0) goto L5d
        L5b:
            r2 = r0
            goto L6e
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5b
            r7[r1] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch: java.lang.Throwable -> L5b
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
        L6e:
            defpackage.ahv.e = r2
            java.lang.Class r2 = defpackage.ahv.a
            boolean r3 = c()
            if (r3 == 0) goto Lb3
            if (r2 != 0) goto L7b
            goto Lb3
        L7b:
            r3 = 9
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r3[r6] = r7     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r1] = r6     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r5] = r6     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb3
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 5
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 6
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 7
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 8
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "requestRelaunchActivity"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> Lb3
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Lb3
            r0 = r2
        Lb3:
            defpackage.ahv.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahv.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new aht(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (c() && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            ahu ahuVar = new ahu(activity);
            application.registerActivityLifecycleCallbacks(ahuVar);
            Handler handler = g;
            handler.post(new ahr(ahuVar, obj2));
            try {
                if (c()) {
                    f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                handler.post(new ahs(application, ahuVar));
                return true;
            } catch (Throwable th) {
                g.post(new ahs(application, ahuVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }
}
