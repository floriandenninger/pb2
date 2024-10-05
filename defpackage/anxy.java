package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxy {
    private final Context a;
    private final SharedPreferences b;
    private final boolean c;

    public anxy(Context context, String str) {
        ApplicationInfo applicationInfo;
        context = Build.VERSION.SDK_INT >= 24 ? aih.e(context) : context;
        this.a = context;
        String valueOf = String.valueOf(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(valueOf.length() != 0 ? "com.google.firebase.common.prefs:".concat(valueOf) : new String("com.google.firebase.common.prefs:"), 0);
        this.b = sharedPreferences;
        boolean z = true;
        if (!sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }
        this.c = z;
    }

    public final synchronized boolean a() {
        return this.c;
    }
}
