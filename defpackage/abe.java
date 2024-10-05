package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public void b() {
    }

    public void c(CharSequence charSequence) {
    }

    public void d() {
    }
}
