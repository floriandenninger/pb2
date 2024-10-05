package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qtr {
    private static final Method a;
    private static final Method b;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
        }
        b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (oba.ab()) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (oba.ab()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (oba.ab()) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }

    public static WorkSource a(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c = qtu.b(context).c(str, 0);
                if (c == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                Method method = b;
                if (method == null) {
                    Method method2 = a;
                    if (method2 != null) {
                        try {
                            method2.invoke(workSource, Integer.valueOf(i));
                        } catch (Exception e) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    }
                } else {
                    try {
                        method.invoke(workSource, Integer.valueOf(i), str);
                    } catch (Exception e2) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    }
                }
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        return (context == null || context.getPackageManager() == null || qtu.b(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }
}
