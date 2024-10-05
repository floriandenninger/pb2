package com.google.android.libraries.youtube.metadataeditor.elements.suggest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SuggestBottomSheetBehavior extends BottomSheetBehavior {
    public SuggestBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ahe
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        super.g(coordinatorLayout, view, motionEvent);
        return false;
    }
}
