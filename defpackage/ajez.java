package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajez extends BaseTransientBottomBar$Behavior {
    public alh a;
    public View b;
    public int c = 0;
    public allg d;
    private akn l;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ahe
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.l == null) {
            this.l = akn.b(coordinatorLayout, new ajey(this));
        }
        akn aknVar = this.l;
        return aknVar != null && aknVar.k(motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ahe
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.h(coordinatorLayout, view, i);
        if (jw.c(view) == 0) {
            jw.V(view, 1);
        }
        this.c = view.getTop();
        return false;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ahe
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        akn aknVar = this.l;
        if (aknVar != null) {
            aknVar.f(motionEvent);
        }
        int action = motionEvent.getAction();
        return action != 0 ? (action == 1 || action == 3) ? false : true : (view == null || aknVar == null || !aknVar.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        return true;
    }

    public final float w(View view, int i) {
        return 1.0f - ((i - this.c) / view.getHeight());
    }

    public final alh x(final View view, float f) {
        alh alhVar = new alh(new hiq(null), (byte[]) null);
        ali aliVar = new ali(0.0f);
        aliVar.c();
        aliVar.e(1500.0f);
        alhVar.n = aliVar;
        alhVar.h(view.getTop());
        alhVar.g = f;
        alhVar.g(new ald() { // from class: ajex
            @Override // defpackage.ald
            public final void a(float f2) {
                ajez ajezVar = ajez.this;
                View view2 = view;
                int i = (int) f2;
                jw.E(view2, i - view2.getTop());
                view2.setAlpha(ajezVar.w(view2, i));
            }
        });
        return alhVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final void y(allg allgVar) {
        this.d = allgVar;
    }
}
