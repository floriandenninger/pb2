package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.jw;
import defpackage.zah;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class YouTubeButton extends YouTubeTextView {
    private static final zah a = new zah();

    public YouTubeButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        jw.M(this, a);
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public YouTubeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
