package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ku extends kt {
    public ku(kw kwVar) {
        super(kwVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        ks b = this.a.b(i);
        if (b == null) {
            return null;
        }
        return b.b;
    }
}
