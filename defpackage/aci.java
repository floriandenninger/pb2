package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }

    public static anhy c(aeu aeuVar) {
        aes aesVar = new aes();
        aew aewVar = new aew(aesVar);
        aesVar.b = aewVar;
        aesVar.a = aeuVar.getClass();
        try {
            Object a = aeuVar.a(aesVar);
            if (a != null) {
                aesVar.a = a;
            }
        } catch (Exception e) {
            aewVar.a(e);
        }
        return aewVar;
    }
}
