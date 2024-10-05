package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzu {
    public static boolean a;
    private static AccessibilityManager.AccessibilityStateChangeListener b;
    private static boolean c;
    private final uzt d = new uzt();

    static {
        new Rect(0, 0, 1, 1);
    }

    public static void a(View view, CharSequence charSequence) {
        if (c(view.getContext())) {
            view.announceForAccessibility(charSequence);
        }
    }

    public static boolean c(Context context) {
        if (b == null) {
            c = d(context);
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            uzs uzsVar = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: uzs
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    uzu.a = true;
                }
            };
            b = uzsVar;
            accessibilityManager.addAccessibilityStateChangeListener(uzsVar);
        } else if (a) {
            c = d(context);
            a = false;
        }
        return c;
    }

    static boolean d(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return (!accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public final void b(View view, CharSequence charSequence) {
        if (c(view.getContext())) {
            uqq.m(this.d);
            this.d.a(view, charSequence);
            uqq.k(this.d, 500L);
        }
    }
}
