package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static int[] d() {
        return new int[]{1, 2, 3};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(R.string.fingerprint_error_user_canceled);
                    case 11:
                        return context.getString(R.string.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(R.string.fingerprint_error_hw_not_present);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i);
                        return context.getString(R.string.default_error_msg);
                }
            }
            return context.getString(R.string.fingerprint_error_lockout);
        }
        return context.getString(R.string.fingerprint_error_hw_not_available);
    }
}
