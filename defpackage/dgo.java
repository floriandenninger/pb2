package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgo {
    private static volatile boolean a = false;

    public static synchronized void a() {
        synchronized (dgo.class) {
            a = false;
        }
    }

    public static boolean b(Context context) {
        return c((AccessibilityManager) context.getSystemService("accessibility"));
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
