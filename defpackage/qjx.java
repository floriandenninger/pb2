package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjx extends View.AccessibilityDelegate {
    final /* synthetic */ CastSeekBar a;

    public qjx(CastSeekBar castSeekBar) {
        this.a = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.a.a.b);
        this.a.a();
        accessibilityEvent.setCurrentItemIndex(0);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
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
        if (i == 4096 || i == 8192) {
            CastSeekBar castSeekBar = this.a;
            int i2 = castSeekBar.a.b;
            castSeekBar.a();
            boolean z = castSeekBar.a.f;
        }
        return false;
    }
}
