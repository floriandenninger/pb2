package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahc implements iw {
    final /* synthetic */ CoordinatorLayout a;

    public ahc(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.f, koVar)) {
            coordinatorLayout.f = koVar;
            boolean z = koVar.f() > 0;
            coordinatorLayout.g = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!koVar.x()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (jw.af(childAt) && ((ahh) childAt.getLayoutParams()).a != null && koVar.x()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return koVar;
    }
}
