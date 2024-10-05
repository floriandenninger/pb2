package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class uqq {
    private static Thread a;
    private static volatile Handler b;
    private static Method c;

    public uqq() {
    }

    public uqq(byte[] bArr) {
    }

    private static void a(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static Uri c(Uri.Builder builder, amrp amrpVar) {
        return builder.encodedFragment(vdy.b(amrpVar.g())).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static File e(Uri uri, Context context) {
        char c2;
        File filesDir;
        if (!uri.getScheme().equals("android")) {
            throw new vdo("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new vdo(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (TextUtils.isEmpty(uri.getQuery())) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94416770:
                    if (str.equals("cache")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97434231:
                    if (str.equals("files")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 835260319:
                    if (str.equals("managed")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 991565957:
                    if (str.equals("directboot-files")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 == 2) {
                        filesDir = g(context);
                    } else if (c2 == 3) {
                        filesDir = context.getCacheDir();
                    } else if (c2 == 4) {
                        File file = new File(g(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                if (!vcx.c(vcx.a((String) arrayList.get(2)))) {
                                    throw new vdo("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new vdo(e);
                            }
                        }
                        filesDir = file;
                    } else if (c2 == 5) {
                        filesDir = context.getExternalFilesDir(null);
                    } else {
                        throw new vdo(String.format("Path must start with a valid logical location: %s", uri));
                    }
                } else {
                    if (Build.VERSION.SDK_INT < 24) {
                        throw new vdo(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                    }
                    filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                }
            } else {
                if (Build.VERSION.SDK_INT < 24) {
                    throw new vdo(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                }
                filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
            }
            return new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        }
        throw new vdo("Did not expect uri to have query");
    }

    public static File f(Context context) {
        return g(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File g(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static Handler h() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static void i() {
        if (n()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static void j() {
        if (!n()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static void k(Runnable runnable, long j) {
        h().postDelayed(runnable, j);
    }

    public static void l(Runnable runnable) {
        h().post(runnable);
    }

    public static void m(Runnable runnable) {
        h().removeCallbacks(runnable);
    }

    public static boolean n() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static String o(String str, Object... objArr) {
        return str + '(' + TextUtils.join(",", objArr) + ')';
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Deprecated
    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void r(dd ddVar) {
        if (c == null) {
            try {
                Method declaredMethod = dd.class.getDeclaredMethod("noteStateNotSaved", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                a(e);
            }
        }
        try {
            Method method = c;
            method.getClass();
            method.invoke(ddVar, new Object[0]);
        } catch (IllegalAccessException e2) {
            a(e2);
        } catch (InvocationTargetException e3) {
            a(e3);
        }
    }

    public static boolean s(ammr ammrVar) {
        return "true".equals(vcq.a(ammrVar.b, "false"));
    }
}
