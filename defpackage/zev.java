package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zev {
    private static final amsx a = amsx.t("com.google.android.apps.userpanel", "com.google.audio.hearing.visualization.accessibility.scribe", "com.google.android.accessibility.soundamplifier");

    public static AccessibilityManager a(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static void b(Context context, AccessibilityEvent accessibilityEvent) {
        a(context).sendAccessibilityEvent(accessibilityEvent);
    }

    public static void c(Context context, View view, CharSequence charSequence) {
        if (e(context)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(charSequence);
            obtain.setEnabled(true);
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(context.getPackageName());
            new kx(obtain).a.setSource(view);
            b(context, obtain);
        }
    }

    public static void d(View view) {
        view.sendAccessibilityEvent(32);
    }

    public static boolean e(Context context) {
        if (f(context)) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = a(context).getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo != null && accessibilityServiceInfo.getId() != null) {
                String id = accessibilityServiceInfo.getId();
                if (id.startsWith("com.google")) {
                    amxd listIterator = a.listIterator();
                    while (listIterator.hasNext()) {
                        if (id.startsWith((String) listIterator.next())) {
                            break;
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        return a(context).isTouchExplorationEnabled();
    }

    public static void g(Context context, AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        a(context).addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    public static void h(Context context, AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        a(context).removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }
}
