package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class kw {
    public final Object a;

    public kw() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new kv(this);
        } else {
            this.a = new ku(this);
        }
    }

    public kw(Object obj) {
        this.a = obj;
    }

    public static kw d(int i, int i2, int i3, int i4, boolean z) {
        return new kw(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static kw e(int i, int i2, int i3) {
        return new kw(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public ks a(int i) {
        return null;
    }

    public ks b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }
}
