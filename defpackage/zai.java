package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zai extends LinearLayout implements Checkable {
    private static final int[] b = {R.attr.state_checked};
    boolean a;

    public zai(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(RadioButton.class.getName());
        accessibilityEvent.setChecked(this.a);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a);
    }

    public void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public zai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    public zai(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
    }

    public zai(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
    }
}
