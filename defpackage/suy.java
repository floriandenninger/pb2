package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class suy {
    private final AccessibilityManager a;
    private boolean b = true;
    private Boolean c = null;

    public suy(AccessibilityManager accessibilityManager) {
        this.a = accessibilityManager;
    }

    public final synchronized Boolean a() {
        if (this.b) {
            this.c = Boolean.valueOf(this.a.isTouchExplorationEnabled());
            this.b = false;
        }
        return this.c;
    }

    public final synchronized void b() {
        this.b = true;
    }
}
