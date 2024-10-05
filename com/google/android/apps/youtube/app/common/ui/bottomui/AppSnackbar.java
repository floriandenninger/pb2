package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import defpackage.gbe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppSnackbar extends Snackbar implements gbe {
    public AppSnackbar(Context context) {
        super(context);
    }

    @Override // defpackage.gbe
    public final void a() {
        String trim = this.b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
            obtain.setClassName(Snackbar.class.getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(trim);
            obtain.setEnabled(true);
            String trim2 = this.c.getText().toString().trim();
            if (!TextUtils.isEmpty(trim2)) {
                obtain.getText().add(trim2);
            }
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public AppSnackbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppSnackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
