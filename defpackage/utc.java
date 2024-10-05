package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class utc {
    private final String a;
    private final Class[] b;

    public utc(String str, Class[] clsArr) {
        this.a = str;
        this.b = clsArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        Object[] objArr;
        try {
            Method method = packageManager.getClass().getMethod(this.a, this.b);
            Class[] clsArr = this.b;
            if (clsArr.length == 2) {
                if (clsArr[0] == String.class && clsArr[1] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (clsArr[0] == String.class && clsArr[1] == Integer.TYPE && this.b[2] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error e) {
            e = e;
            ((amxh) ((amxh) utd.a.e()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 119, "PackageStatsCapture.java")).v("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.a, Arrays.asList(this.b));
            return false;
        } catch (NoSuchMethodException e2) {
            ((amxh) ((amxh) ((amxh) utd.a.c()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 'q', "PackageStatsCapture.java")).q("PackageStats getter not found");
            return false;
        } catch (Exception e3) {
            e = e3;
            ((amxh) ((amxh) utd.a.e()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 119, "PackageStatsCapture.java")).v("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.a, Arrays.asList(this.b));
            return false;
        }
    }
}
