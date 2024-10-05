package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alfj implements alff {
    final /* synthetic */ alfk a;

    public alfj(alfk alfkVar) {
        this.a = alfkVar;
    }

    @Override // defpackage.alfb
    public final void a(AppBarLayout appBarLayout, int i) {
        alfk alfkVar = this.a;
        alfkVar.g = i;
        ko koVar = alfkVar.h;
        int f = koVar != null ? koVar.f() : 0;
        int childCount = this.a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a.getChildAt(i2);
            alfi alfiVar = (alfi) childAt.getLayoutParams();
            alfq g = alfk.g(childAt);
            int i3 = alfiVar.a;
            if (i3 == 1) {
                g.c(aii.c(-i, 0, this.a.e(childAt)));
            } else if (i3 == 2) {
                g.c(Math.round((-i) * alfiVar.b));
            }
        }
        this.a.m();
        alfk alfkVar2 = this.a;
        if (alfkVar2.f != null && f > 0) {
            jw.G(alfkVar2);
        }
        int height = (this.a.getHeight() - jw.f(this.a)) - f;
        int f2 = this.a.f();
        alhw alhwVar = this.a.c;
        float f3 = height;
        alhwVar.c = Math.min(1.0f, (r0 - f2) / f3);
        alhwVar.d = alhwVar.b();
        alfk alfkVar3 = this.a;
        alhw alhwVar2 = alfkVar3.c;
        alhwVar2.e = alfkVar3.g + height;
        alhwVar2.s(Math.abs(i) / f3);
    }
}
