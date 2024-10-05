package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cms {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        f(str, valueOf.length() != 0 ? "Unexpected type for bundle response code: ".concat(valueOf) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    public static Bundle b(cml cmlVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("obfuscatedProfileId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(cmlVar.b)) {
            bundle.putString("oldSkuPurchaseToken", cmlVar.b);
        }
        if (!TextUtils.isEmpty(cmlVar.c)) {
            bundle.putString("oldSkuPurchaseId", cmlVar.c);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static cmn c(Intent intent, String str) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            cmm a2 = cmn.a();
            a2.a = 6;
            a2.b = "An internal error occurred.";
            return a2.a();
        }
        cmm a3 = cmn.a();
        a3.a = a(intent.getExtras(), str);
        a3.b = d(intent.getExtras(), str);
        return a3.a();
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        f(str, valueOf.length() != 0 ? "Unexpected type for debug message: ".concat(valueOf) : new String("Unexpected type for debug message: "));
        return "";
    }

    public static String e(int i) {
        amrz amrzVar = cmr.o;
        Integer valueOf = Integer.valueOf(i);
        return (!amrzVar.containsKey(valueOf) ? cmr.RESPONSE_CODE_UNSPECIFIED : (cmr) cmr.o.get(valueOf)).toString();
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static void h(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase j = j(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (j == null) {
                f("BillingHelper", "Couldn't find single purchase data as well.");
                return;
            } else {
                arrayList.add(j);
                return;
            }
        }
        stringArrayList.size();
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            Purchase j2 = j(stringArrayList.get(i), stringArrayList2.get(i));
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
    }

    public static int i(Intent intent) {
        if (intent == null) {
            f("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            f("ProxyBillingActivity", "Unexpected null bundle received!");
            return 0;
        }
        return extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            f("BillingHelper", sb.toString());
            return null;
        }
    }
}
