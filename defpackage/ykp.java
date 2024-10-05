package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykp {
    static final Uri a = Uri.parse("https://play.google.com/store/");
    private static final ykw b = new ykw();

    public static Set b(Context context, Uri uri) {
        ykw ykwVar = b;
        HashSet hashSet = new HashSet();
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 65536);
        if (queryIntentActivities != null) {
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                String str = queryIntentActivities.get(i).activityInfo.packageName;
                Set set = ykwVar.b;
                if (set == null) {
                    ykwVar.b = new HashSet();
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(ykw.a, 65536);
                    int size2 = queryIntentActivities2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ykwVar.b.add(queryIntentActivities2.get(i2).activityInfo.packageName);
                    }
                    set = ykwVar.b;
                }
                if (!set.contains(str)) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    public static void c(Context context, Intent intent, Uri uri) {
        intent.getClass();
        uri.getClass();
        String str = true != "https".equals(uri.getScheme()) ? "http://youtube.com/mobile" : "https://youtube.com/mobile";
        intent.putExtra("trusted_application_code_extra", PendingIntent.getActivity(context.getApplicationContext(), 0, new Intent(), yny.M(), null));
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse(str));
    }

    public static void d(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void e(Activity activity, String str, String str2) {
        Uri.Builder appendQueryParameter = a.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", str);
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("referrer", str2);
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", appendQueryParameter.build()));
    }

    public static void f(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            d(context, intent);
        } catch (ActivityNotFoundException e) {
            zga.d("Activity not found to view uri", e);
        }
    }

    public static boolean g(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return (queryIntentActivities == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean h(Context context, Uri uri) {
        ResolveInfo resolveActivity;
        ActivityInfo activityInfo;
        Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uri, "text/html");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (resolveActivity = packageManager.resolveActivity(dataAndType, 65536)) != null && (activityInfo = resolveActivity.activityInfo) != null && activityInfo.packageName != null) {
            Intent intent = new Intent(dataAndType);
            intent.setPackage(activityInfo.packageName);
            if (intent.resolveActivity(packageManager) != null) {
                dataAndType = intent;
            }
        }
        try {
            d(context, dataAndType);
            return true;
        } catch (ActivityNotFoundException e) {
            zga.d("Activity not found to view uri", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.app.Activity r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, java.util.List r26, defpackage.ykz r27, defpackage.ykj r28) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykp.i(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.util.List, ykz, ykj):void");
    }

    public static void j(Activity activity, String str, String str2) {
        String str3;
        Uri build = a.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", activity.getPackageName()).build();
        StringBuilder sb = new StringBuilder();
        String str4 = "&";
        if (TextUtils.isEmpty("app")) {
            str3 = "";
        } else {
            sb.append("utm_source=app");
            str3 = "&";
        }
        if (!TextUtils.isEmpty("prompt")) {
            sb.append(str3);
            sb.append("utm_medium=prompt");
            str3 = "&";
        }
        if (TextUtils.isEmpty("prompt")) {
            str4 = str3;
        } else {
            sb.append(str3);
            sb.append(str.length() != 0 ? "utm_campaign=".concat(str) : new String("utm_campaign="));
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str4);
            String valueOf = String.valueOf(str2);
            sb.append(valueOf.length() != 0 ? "utm_term=".concat(valueOf) : new String("utm_term="));
        }
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(sb2)) {
            build = build.buildUpon().appendQueryParameter("referrer", Uri.encode(sb2)).build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", build);
        if (g(activity, intent)) {
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    private static boolean k(Uri uri) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals(uri.getScheme(), "android-app");
    }

    private static void l(Intent intent, ykz ykzVar, ykj ykjVar) {
        ykzVar.a(intent, 907, ykjVar);
    }

    public static String a(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 22) {
            if (k(activity.getReferrer())) {
                return activity.getReferrer().getHost();
            }
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (k(uri)) {
            return uri.getHost();
        }
        return null;
    }
}
