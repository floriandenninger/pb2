package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kq implements AccessibilityManager.AccessibilityStateChangeListener {
    final eq a;

    public kq(eq eqVar, byte[] bArr, byte[] bArr2) {
        this.a = eqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kq) {
            return this.a.equals(((kq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        eq eqVar = this.a;
        dgo.a();
        dkp dkpVar = (dkp) ((dkm) eqVar).a.get();
        if (dkpVar == null) {
            return;
        }
        dkpVar.p(z);
        dkpVar.v = true;
        dkpVar.requestLayout();
    }
}
