package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abc extends BiometricPrompt.AuthenticationCallback {
    final /* synthetic */ abf a;

    public abc(abf abfVar) {
        this.a = abfVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        this.a.b();
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject b;
        IdentityCredential b2;
        abx abxVar = null;
        if (authenticationResult != null && (b = abd.b(authenticationResult)) != null) {
            Cipher e = ach.e(b);
            if (e != null) {
                abxVar = new abx(e);
            } else {
                Signature d = ach.d(b);
                if (d != null) {
                    abxVar = new abx(d);
                } else {
                    Mac f = ach.f(b);
                    if (f != null) {
                        abxVar = new abx(f);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b2 = aci.b(b)) != null) {
                        abxVar = new abx(b2);
                    }
                }
            }
        }
        int i = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                i = abe.a(authenticationResult);
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            i = 2;
        }
        this.a.c(new abw(abxVar, i));
    }
}
