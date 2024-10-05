package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && acq.a(context.getPackageManager());
    }

    public static cik d(clh clhVar, cfj cfjVar) {
        return new cik(k(clhVar, cfjVar, cki.b));
    }

    public static cil e(clh clhVar, cfj cfjVar) {
        return f(clhVar, cfjVar, true);
    }

    public static cil f(clh clhVar, cfj cfjVar, boolean z) {
        return new cil(m(clhVar, z ? cls.a() : 1.0f, cfjVar, cki.a));
    }

    public static cim g(clh clhVar, cfj cfjVar, int i) {
        return new cim(k(clhVar, cfjVar, new ckl(i)));
    }

    public static cin h(clh clhVar, cfj cfjVar) {
        return new cin(k(clhVar, cfjVar, cki.c));
    }

    public static cip i(clh clhVar, cfj cfjVar) {
        return new cip(ckq.a(clhVar, cfjVar, cls.a(), cki.e, true));
    }

    public static cir j(clh clhVar, cfj cfjVar) {
        return new cir(m(clhVar, cls.a(), cfjVar, ckx.a));
    }

    public static List k(clh clhVar, cfj cfjVar, cld cldVar) {
        return ckq.a(clhVar, cfjVar, 1.0f, cldVar, false);
    }

    public static int[] l() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    private static List m(clh clhVar, float f, cfj cfjVar, cld cldVar) {
        return ckq.a(clhVar, cfjVar, f, cldVar, false);
    }
}
