package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayeq {
    public static Context a;
    private static String b;

    public ayeq() {
    }

    public ayeq(byte[] bArr) {
        new HashMap();
    }

    public static final ayfb a(int i) {
        return new ayfb(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }

    public static final PasswordAuthentication b(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            ayma.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", "https", str));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static ayjt c() {
        if (aymg.a != null) {
            return new ayfj();
        }
        return new aymg();
    }

    public static void d(ayqd ayqdVar, AtomicInteger atomicInteger, azqf azqfVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = azqi.d(azqfVar);
            if (d != null) {
                ayqdVar.b(d);
            } else {
                ayqdVar.sh();
            }
        }
    }

    public static void e(banw banwVar, AtomicInteger atomicInteger, azqf azqfVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = azqi.d(azqfVar);
            if (d != null) {
                banwVar.b(d);
            } else {
                banwVar.sh();
            }
        }
    }

    public static void f(ayqd ayqdVar, Throwable th, AtomicInteger atomicInteger, azqf azqfVar) {
        if (azqi.e(azqfVar, th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                ayqdVar.b(azqi.d(azqfVar));
                return;
            }
            return;
        }
        aynu.j(th);
    }

    public static void g(banw banwVar, Throwable th, AtomicInteger atomicInteger, azqf azqfVar) {
        if (azqi.e(azqfVar, th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                banwVar.b(azqi.d(azqfVar));
                return;
            }
            return;
        }
        aynu.j(th);
    }

    public static void h(banw banwVar, Object obj, AtomicInteger atomicInteger, azqf azqfVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            banwVar.c(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable d = azqi.d(azqfVar);
                if (d != null) {
                    banwVar.b(d);
                } else {
                    banwVar.sh();
                }
            }
        }
    }

    public static void i(AtomicReference atomicReference, ayqx ayqxVar, Class cls) {
        aysw.b(ayqxVar, "next is null");
        if (atomicReference.compareAndSet(null, ayqxVar)) {
            return;
        }
        ayqxVar.qc();
        if (atomicReference.get() != ayrz.a) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 141 + String.valueOf(name).length());
            sb.append("It is not allowed to subscribe with a(n) ");
            sb.append(name);
            sb.append(" multiple times. Please create a fresh instance of ");
            sb.append(name);
            sb.append(" and subscribe that to the target source instead.");
            aynu.j(new ayri(sb.toString()));
        }
    }

    public static long j(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, l(j2, j)));
        return j2;
    }

    public static long k(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, l(j2, j)));
        return j2;
    }

    public static long l(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long m(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j3 / j == j2) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static void n(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("More produced than requested: ");
                sb.append(j3);
                aynu.j(new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static void o(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("More produced than requested: ");
                sb.append(j3);
                aynu.j(new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static aypy p(Object obj, ayrv ayrvVar) {
        azjz azjzVar = new azjz(obj, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azjzVar;
    }

    public static boolean q(ayqb ayqbVar, ayqd ayqdVar, ayrv ayrvVar) {
        if (!(ayqbVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) ayqbVar).call();
            if (call == null) {
                aysa.f(ayqdVar);
                return true;
            }
            try {
                ayqb ayqbVar2 = (ayqb) ayrvVar.a(call);
                aysw.b(ayqbVar2, "The mapper returned a null ObservableSource");
                if (ayqbVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) ayqbVar2).call();
                        if (call2 == null) {
                            aysa.f(ayqdVar);
                            return true;
                        }
                        azjy azjyVar = new azjy(ayqdVar, call2);
                        ayqdVar.se(azjyVar);
                        azjyVar.run();
                    } catch (Throwable th) {
                        aynu.c(th);
                        aysa.h(th, ayqdVar);
                        return true;
                    }
                } else {
                    ayqbVar2.aE(ayqdVar);
                }
                return true;
            } catch (Throwable th2) {
                aynu.c(th2);
                aysa.h(th2, ayqdVar);
                return true;
            }
        } catch (Throwable th3) {
            aynu.c(th3);
            aysa.h(th3, ayqdVar);
            return true;
        }
    }

    public static void r(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static void s(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }

    public static String t() {
        return "95.0.4621.2@c85e9916";
    }

    public static String u(Context context) {
        String str = b;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            b = null;
        } else if (arrayList.size() == 1) {
            b = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    b = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                b = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                b = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                b = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                b = "com.google.android.apps.chrome";
            }
        }
        return b;
    }

    public static Context v(Context context, String str) {
        baec a2 = baec.a();
        try {
            Context createContextForSplit = context.createContextForSplit(str);
            a2.close();
            return createContextForSplit;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static int w(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
