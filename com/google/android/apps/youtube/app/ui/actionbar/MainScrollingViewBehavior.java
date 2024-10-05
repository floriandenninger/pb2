package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean a;
    public boolean b;
    int c;

    public MainScrollingViewBehavior() {
        this.c = 0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ahe
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.a) {
            return false;
        }
        this.c++;
        super.f(coordinatorLayout, view, view2);
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.alfp, defpackage.ahe
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.h(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ahe
    public final boolean n(View view) {
        if (this.a || this.b) {
            return false;
        }
        return view instanceof AppBarLayout;
    }

    public MainScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
    }
}
