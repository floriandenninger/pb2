package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.alli;
import defpackage.allj;
import defpackage.allr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final alli k = new alli(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ahe
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        alli alliVar = this.k;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                allr.a().f(alliVar.a);
            }
        } else if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            allr.a().e(alliVar.a);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean v(View view) {
        return view instanceof allj;
    }
}
