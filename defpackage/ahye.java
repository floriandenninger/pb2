package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahye extends View.AccessibilityDelegate {
    final /* synthetic */ ahyf a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahye(ahyf ahyfVar) {
        this.a = ahyfVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(this.a.H());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.a.H());
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096 && i != 8192) {
            return false;
        }
        long kL = this.a.kL() / 20;
        if (i == 4096) {
            ahyf ahyfVar = this.a;
            ahyfVar.s = Math.min(ahyfVar.r.i(), this.a.c() + kL);
        } else {
            ahyf ahyfVar2 = this.a;
            ahyfVar2.s = Math.max(ahyfVar2.r.j(), this.a.c() - kL);
        }
        ahyf ahyfVar3 = this.a;
        ahyfVar3.t.a(3, ahyfVar3.s);
        this.a.kN();
        this.a.invalidate();
        view.sendAccessibilityEvent(4);
        return true;
    }
}
