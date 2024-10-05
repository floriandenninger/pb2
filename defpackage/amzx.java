package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzx extends amzn {
    private static final boolean a = amzw.a();
    private static final boolean b;
    private static final amzm c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new amzv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return amzw.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.amzn
    protected amyp e(String str) {
        if (anaa.a.get() != null) {
            return ((amzs) anaa.a.get()).a(str);
        }
        anaa anaaVar = new anaa(str.replace('$', '.'));
        amzy.a.offer(anaaVar);
        if (anaa.a.get() == null) {
            return anaaVar;
        }
        anaa.e();
        return anaaVar;
    }

    @Override // defpackage.amzn
    protected amzm h() {
        return c;
    }

    @Override // defpackage.amzn
    protected anaf j() {
        return anab.a;
    }

    @Override // defpackage.amzn
    protected String m() {
        return "platform: Android";
    }
}
