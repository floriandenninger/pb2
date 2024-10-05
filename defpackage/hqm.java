package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqm extends View.AccessibilityDelegate {
    final /* synthetic */ hqo a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hqm(hqo hqoVar) {
        this.a = hqoVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        int width = this.a.d.getWidth() / 5;
        if (i == 4096) {
            this.a.b.a(width);
            return true;
        }
        if (i == 8192) {
            this.a.b.a(-width);
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
