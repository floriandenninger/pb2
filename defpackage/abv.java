package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Log;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abv {
    private final BiometricManager a;
    private final gi b;
    private final trp c;

    public abv(trp trpVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = trpVar;
        this.a = Build.VERSION.SDK_INT >= 29 ? abt.b(trpVar.a) : null;
        this.b = Build.VERSION.SDK_INT <= 29 ? gi.b(trpVar.a) : null;
    }

    public static abv a(Context context) {
        return new abv(new trp(context, null, null, null), null, null, null, null);
    }

    private final int c() {
        gi giVar = this.b;
        if (giVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (giVar.d()) {
            return !this.b.c() ? 11 : 0;
        }
        return 12;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 30) {
            BiometricManager biometricManager = this.a;
            if (biometricManager != null) {
                return abu.a(biometricManager, PrivateKeyType.INVALID);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!abd.e(PrivateKeyType.INVALID)) {
            return -2;
        }
        if (abp.b(this.c.a) != null) {
            if (abd.d(PrivateKeyType.INVALID)) {
                return !this.c.p() ? 11 : 0;
            }
            if (Build.VERSION.SDK_INT == 29) {
                BiometricManager biometricManager2 = this.a;
                if (biometricManager2 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                return abt.a(biometricManager2);
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (abt.c(this.c.a)) {
                    if (this.c.p()) {
                        return c() != 0 ? -1 : 0;
                    }
                    return c();
                }
            } else {
                return c();
            }
        }
        return 12;
    }
}
