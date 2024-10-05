package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afgc {
    public final TelephonyManager a;
    public final Context b;

    public afgc(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.a = telephonyManager;
        this.b = context;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean b(String str) {
        int length;
        return str != null && (length = str.length()) >= 5 && length <= 6;
    }
}
