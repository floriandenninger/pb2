package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzc {
    private static anzc d;
    private String e = null;
    public Boolean a = null;
    public Boolean b = null;
    public final Queue c = new ArrayDeque();

    private anzc() {
    }

    public static synchronized anzc a() {
        anzc anzcVar;
        synchronized (anzc.class) {
            if (d == null) {
                d = new anzc();
            }
            anzcVar = d;
        }
        return anzcVar;
    }

    public final synchronized String b(Context context, Intent intent) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.e = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.e = serviceInfo.name;
                }
                return this.e;
            }
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            Log.e("FirebaseMessaging", sb.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}
