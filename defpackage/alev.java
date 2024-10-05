package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alev implements iw {
    final /* synthetic */ AppBarLayout a;

    public alev(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        AppBarLayout appBarLayout = this.a;
        ko koVar2 = true != jw.af(appBarLayout) ? null : koVar;
        if (!Objects.equals(appBarLayout.d, koVar2)) {
            appBarLayout.d = koVar2;
            appBarLayout.n();
            appBarLayout.requestLayout();
        }
        return koVar;
    }
}
