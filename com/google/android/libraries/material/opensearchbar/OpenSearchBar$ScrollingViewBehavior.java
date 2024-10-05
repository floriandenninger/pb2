package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.alfr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenSearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean a;

    public OpenSearchBar$ScrollingViewBehavior() {
        this.a = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ahe
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.f(coordinatorLayout, view, view2);
        if (!this.a && (view2 instanceof AppBarLayout)) {
            this.a = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT != 21) {
                alfr.a(appBarLayout, 0.0f);
            } else {
                appBarLayout.setOutlineProvider(null);
            }
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.alfp, defpackage.ahe
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.h(coordinatorLayout, view, i);
        return true;
    }

    @Override // defpackage.alfn
    public final boolean v() {
        return true;
    }

    public OpenSearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }
}
