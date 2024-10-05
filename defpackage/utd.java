package defpackage;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utd {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture");
    static final utc[] b = {new utc("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new utc("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new utc("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageStats a(Context context) {
        uqq.i();
        if (Build.VERSION.SDK_INT < 26) {
            if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
                utc[] utcVarArr = b;
                if (!b()) {
                    ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 160, "PackageStatsCapture.java")).q("Callback implementation stripped by proguard.");
                    return null;
                }
                PackageStatsCapture$PackageStatsCallback packageStatsCapture$PackageStatsCallback = new PackageStatsCapture$PackageStatsCallback();
                try {
                    packageStatsCapture$PackageStatsCallback.a.acquire();
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    int myUid = Process.myUid();
                    for (int i = 0; i < 3; i++) {
                        if (utcVarArr[i].a(packageManager, packageName, myUid, packageStatsCapture$PackageStatsCallback)) {
                            amxj amxjVar = a;
                            ((amxh) ((amxh) amxjVar.e()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 171, "PackageStatsCapture.java")).q("Success invoking PackageStats capture.");
                            if (packageStatsCapture$PackageStatsCallback.a.tryAcquire(15000L, TimeUnit.MILLISECONDS)) {
                                return packageStatsCapture$PackageStatsCallback.b;
                            }
                            ((amxh) ((amxh) amxjVar.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "waitForStats", 63, "PackageStatsCapture.java")).q("Timeout while waiting for PackageStats callback");
                            return null;
                        }
                    }
                    ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 177, "PackageStatsCapture.java")).q("Couldn't capture PackageStats.");
                    return null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStats", 208, "PackageStatsCapture.java")).s("%s required", "android.permission.GET_PACKAGE_SIZE");
            return null;
        }
        return ute.a(context);
    }

    private static boolean b() {
        try {
            return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            ((amxh) ((amxh) ((amxh) a.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "isCallbackPresent", (char) 150, "PackageStatsCapture.java")).q("failure");
            return false;
        }
    }
}
