package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kx {
    public final AccessibilityRecord a;

    @Deprecated
    public kx(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            if (kxVar.a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(kxVar.a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
