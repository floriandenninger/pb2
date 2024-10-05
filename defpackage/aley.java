package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aley implements lf {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ AppBarLayout b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ AppBarLayout.BaseBehavior e;

    public aley(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // defpackage.lf
    public final boolean a(View view) {
        this.e.B(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
