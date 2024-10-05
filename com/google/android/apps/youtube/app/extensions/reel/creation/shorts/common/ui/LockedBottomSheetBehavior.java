package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LockedBottomSheetBehavior extends BottomSheetBehavior {
    public LockedBottomSheetBehavior() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public LockedBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
