package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsa {
    private static final aeg a = new aeg();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            trp b2 = qtu.b(context);
            return b2.a.getPackageManager().getApplicationLabel(b2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(android.R.string.ok);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            if (oba.ae(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(R.string.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return h(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return h(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String f(Context context, int i) {
        String g;
        if (i == 6) {
            g = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g = g(context, i);
        }
        return g == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : g;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    private static String i(Context context, String str) {
        Resources resources;
        aeg aegVar = a;
        synchronized (aegVar) {
            Locale e = aik.c(context.getResources().getConfiguration()).e();
            if (!e.equals(b)) {
                aegVar.clear();
                b = e;
            }
            String str2 = (String) aegVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = qnm.c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static String e(Context context, int i) {
        if (i == 6 || i == 19) {
            return h(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return d(context, i);
    }
}
