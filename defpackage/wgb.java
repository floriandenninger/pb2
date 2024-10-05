package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wgb implements wfz {
    private final Context a;
    private final FingerprintManager b;
    private final KeyguardManager c;
    private KeyStore d;
    private KeyGenerator e;
    private boolean f;
    private CancellationSignal g;

    public wgb(Context context) {
        this.f = false;
        this.a = context;
        this.c = (KeyguardManager) context.getSystemService("keyguard");
        this.b = (FingerprintManager) context.getSystemService("fingerprint");
        if (h()) {
            try {
                e();
                f();
                this.f = true;
            } catch (wfy e) {
                zga.d("Error initializing YouTubeFingerprintManagerImpl.", e);
                this.f = false;
            }
        }
    }

    private final FingerprintManager.CryptoObject g() {
        Cipher d;
        try {
            try {
                d = d();
            } catch (KeyPermanentlyInvalidatedException unused) {
                this.d.deleteEntry("YouTubeFingerprintKey");
                f();
                d = d();
            }
            return new FingerprintManager.CryptoObject(d);
        } catch (KeyPermanentlyInvalidatedException | KeyStoreException e) {
            throw new wfy("Failed to recreate CryptoObject for fingerprint.", e);
        }
    }

    private final boolean h() {
        if (Build.VERSION.SDK_INT < 23) {
            zga.l("Fingerprint scanner not available on this device.");
            return false;
        }
        if (this.a.checkCallingOrSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
            zga.l("Fingerprint permission denied.");
            return false;
        }
        if (this.c == null) {
            zga.l("KEYGUARD_SERVICE not available.");
            return false;
        }
        FingerprintManager fingerprintManager = this.b;
        if (fingerprintManager != null) {
            try {
                if (!fingerprintManager.isHardwareDetected()) {
                    zga.l("Fingerprint hardware not detected.");
                    return false;
                }
                if (!this.b.hasEnrolledFingerprints()) {
                    zga.l("Fingerprint hardware not enrolled.");
                    return false;
                }
                if (this.c.isKeyguardSecure()) {
                    return true;
                }
                zga.l("Fingerprint keyguard not secure.");
                return false;
            } catch (SecurityException e) {
                e.printStackTrace();
                zga.l("SecurityException when check fingerprint is available.");
                return false;
            }
        }
        zga.l("FINGERPRINT_SERVICE not available.");
        return false;
    }

    @Override // defpackage.wfv
    public final boolean a() {
        return h() && this.f;
    }

    @Override // defpackage.wfz
    public final void b(wfx wfxVar) {
        if (!a()) {
            ((weo) wfxVar).f();
            return;
        }
        this.g = new CancellationSignal();
        try {
            this.b.authenticate(g(), this.g, 0, new wga(wfxVar), null);
        } catch (wfy unused) {
            ((weo) wfxVar).f();
        }
    }

    @Override // defpackage.wfz
    public final void c() {
        CancellationSignal cancellationSignal = this.g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.g = null;
        }
    }

    final Cipher d() {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) this.d.getKey("YouTubeFingerprintKey", null));
            return cipher;
        } catch (InvalidKeyException e) {
            if (e instanceof KeyPermanentlyInvalidatedException) {
                throw ((KeyPermanentlyInvalidatedException) e);
            }
            throw new wfy("Failed to generate Cipher for fingerprint.", e);
        } catch (KeyStoreException e2) {
            e = e2;
            throw new wfy("Failed to generate Cipher for fingerprint.", e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new wfy("Failed to generate Cipher for fingerprint.", e);
        } catch (UnrecoverableKeyException e4) {
            e = e4;
            throw new wfy("Failed to generate Cipher for fingerprint.", e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new wfy("Failed to generate Cipher for fingerprint.", e);
        }
    }

    final void e() {
        try {
            this.d = KeyStore.getInstance("AndroidKeyStore");
            this.e = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        } catch (KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new wfy("Failed to initialize KeyStore and KeyGenerator", e);
        }
    }

    final void f() {
        try {
            this.d.load(null);
            this.e.init(new KeyGenParameterSpec.Builder("YouTubeFingerprintKey", 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
            this.e.generateKey();
        } catch (IOException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | ProviderException | CertificateException e) {
            throw new wfy("Failed to generate key for fingerprint.", e);
        }
    }
}
