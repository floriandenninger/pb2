package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qnn {
    private static qnn a;
    private final Context b;
    private volatile String c;

    public qnn(Context context) {
        this.b = context.getApplicationContext();
    }

    public static qnn b(Context context) {
        qip.an(context);
        synchronized (qnn.class) {
            if (a == null) {
                qni.a(context);
                a = new qnn(context);
            }
        }
        return a;
    }

    static final qss f(PackageInfo packageInfo, qss... qssVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        qnf qnfVar = new qnf(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < qssVarArr.length; i++) {
            if (qssVarArr[i].equals(qnfVar)) {
                return qssVarArr[i];
            }
        }
        return null;
    }

    public static final boolean g(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? f(packageInfo, qnh.a) : f(packageInfo, qnh.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final qnj a(String str) {
        qnj e;
        if (str == null) {
            return qnj.b();
        }
        if (str.equals(this.c)) {
            return qnj.a;
        }
        if (qni.b()) {
            e = qni.e(str, qnm.e(this.b));
        } else {
            try {
                e = e(this.b.getPackageManager().getPackageInfo(str, 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    "no pkg ".concat(str);
                }
                return qnj.c();
            }
        }
        if (!e.b) {
            return e;
        }
        this.c = str;
        return e;
    }

    public final boolean c(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (g(packageInfo, false)) {
            return true;
        }
        if (g(packageInfo, true)) {
            if (qnm.e(this.b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public final boolean d(int i) {
        qnj b;
        int length;
        String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    b = a(packagesForUid[i2]);
                    if (b.b) {
                        break;
                    }
                    i2++;
                } else {
                    qip.an(b);
                    break;
                }
            }
        } else {
            b = qnj.b();
        }
        return b.b;
    }

    public final qnj e(PackageInfo packageInfo) {
        boolean e = qnm.e(this.b);
        if (packageInfo == null) {
            return qnj.b();
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return qnj.b();
        }
        qnf qnfVar = new qnf(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        qnj c = qni.c(str, qnfVar, e, false);
        return (!c.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !qni.c(str, qnfVar, false, true).b) ? c : qnj.b();
    }
}
