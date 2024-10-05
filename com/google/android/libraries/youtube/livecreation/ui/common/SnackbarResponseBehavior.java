package com.google.android.libraries.youtube.livecreation.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SnackbarResponseBehavior extends SwipeDismissBehavior {
    public SnackbarResponseBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // defpackage.ahe
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view2 instanceof Snackbar$SnackbarLayout) || view.getVisibility() != 0) {
            return false;
        }
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - view2.getHeight()));
        return true;
    }

    @Override // defpackage.ahe
    public final boolean n(View view) {
        return view instanceof Snackbar$SnackbarLayout;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        return false;
    }
}
