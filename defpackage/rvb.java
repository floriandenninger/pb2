package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rvb implements AccessibilityManager.AccessibilityStateChangeListener {
    final /* synthetic */ rvd a;

    public rvb(rvd rvdVar) {
        this.a = rvdVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (z) {
            this.a.d();
        } else {
            this.a.c();
        }
    }
}
