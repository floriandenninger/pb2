package defpackage;

import android.hardware.biometrics.BiometricManager;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(PrivateKeyType.INVALID);
    }

    public static int b(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & PrivateKeyType.INVALID) / 255.0f;
        float d = d(((i >> 16) & PrivateKeyType.INVALID) / 255.0f);
        float d2 = d(((i >> 8) & PrivateKeyType.INVALID) / 255.0f);
        float d3 = d((i & PrivateKeyType.INVALID) / 255.0f);
        return (Math.round((f2 + (f * ((((i2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(e(d + ((d(((i2 >> 16) & PrivateKeyType.INVALID) / 255.0f) - d) * f)) * 255.0f) << 16) | (Math.round(e(d2 + ((d(((i2 >> 8) & PrivateKeyType.INVALID) / 255.0f) - d2) * f)) * 255.0f) << 8) | Math.round(e(d3 + ((d((i2 & PrivateKeyType.INVALID) / 255.0f) - d3) * f)) * 255.0f);
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    private static float d(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float e(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
