package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gmw extends View.AccessibilityDelegate {
    final /* synthetic */ gna a;

    public gmw(gna gnaVar) {
        this.a = gnaVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ks c = ks.c(accessibilityNodeInfo);
        RecyclerView recyclerView = this.a.a;
        if (Build.VERSION.SDK_INT >= 22) {
            c.b.setTraversalBefore(recyclerView);
        }
    }
}
