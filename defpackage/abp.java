package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Paint;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyguardManager b(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return acp.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean c(Context context) {
        KeyguardManager b = b(context);
        if (b == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return acp.b(b);
        }
        return aco.a(b);
    }

    public static Paint.Join d(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 2 ? Paint.Join.ROUND : Paint.Join.BEVEL : Paint.Join.MITER;
    }

    public static int[] e() {
        return new int[]{1, 2, 3};
    }

    public static Paint.Cap f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static int[] g() {
        return new int[]{1, 2, 3};
    }
}
