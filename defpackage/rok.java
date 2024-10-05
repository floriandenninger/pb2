package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rok {
    private static final Object a;
    private static Method b;
    private static Method c;

    static {
        int i = qmz.c;
        a = new Object();
        b = null;
        c = null;
    }

    public static void a(Context context) {
        Context context2;
        qip.az(context, "Context must not be null");
        qnm.d(context, 11925000);
        synchronized (a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = qvu.e(context, qvu.b, "com.google.android.gms.providerinstaller.dynamite").d;
            } catch (qvq e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ProviderInstaller", valueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(valueOf) : new String("Failed to load providerinstaller module: "));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context c2 = qnm.c(context);
                if (c2 != null) {
                    try {
                        if (c == null) {
                            c = b(c2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, Long.TYPE, Long.TYPE});
                        }
                        c.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        Log.w("ProviderInstaller", valueOf2.length() != 0 ? "Failed to report request stats: ".concat(valueOf2) : new String("Failed to report request stats: "));
                    }
                }
                if (c2 != null) {
                    c(c2, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new qnk(8);
                }
            }
            c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, String str) {
        try {
            if (b == null) {
                b = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new String("Failed to install provider: "));
            }
            throw new qnk(8);
        }
    }
}
