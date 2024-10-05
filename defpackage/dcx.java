package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcx {
    private static final ConcurrentMap a = new ConcurrentHashMap();

    public static cqi a(Context context) {
        PackageInfo packageInfo;
        String uuid;
        String packageName = context.getPackageName();
        cqi cqiVar = (cqi) a.get(packageName);
        if (cqiVar != null) {
            return cqiVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppVersionSignature", valueOf.length() != 0 ? "Cannot resolve info for".concat(valueOf) : new String("Cannot resolve info for"), e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            uuid = String.valueOf(packageInfo.versionCode);
        } else {
            uuid = UUID.randomUUID().toString();
        }
        dcz dczVar = new dcz(uuid);
        cqi cqiVar2 = (cqi) a.putIfAbsent(packageName, dczVar);
        return cqiVar2 == null ? dczVar : cqiVar2;
    }
}
