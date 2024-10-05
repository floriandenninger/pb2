package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anwp {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public anwp(Context context) {
        this.a = context;
    }

    public static String e(antc antcVar) {
        String str = antcVar.e().c;
        if (str != null) {
            return str;
        }
        String str2 = antcVar.e().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    private final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    private final synchronized void g() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo f;
        if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
            this.d = f.versionCode;
        }
        return this.d;
    }

    public final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!oba.aa()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (oba.aa()) {
            this.e = 2;
            i2 = 2;
        } else {
            this.e = 1;
        }
        return i2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            g();
        }
        return this.b;
    }

    public final synchronized String d() {
        if (this.c == null) {
            g();
        }
        return this.c;
    }
}
