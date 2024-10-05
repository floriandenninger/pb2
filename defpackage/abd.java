package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.AuthenticationCallback a(abf abfVar) {
        return new abc(abfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }

    public static int c(abz abzVar, abx abxVar) {
        int i = abxVar != null ? 15 : PrivateKeyType.INVALID;
        return abzVar.d ? 32768 | i : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i) {
        return (i & 32768) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(int i) {
        return i == 15 || i == 255 || i == 0;
    }

    public static abd f() {
        return new byw();
    }

    public static abd g() {
        return new byx();
    }

    public static abd h() {
        return new byy(byr.a);
    }
}
