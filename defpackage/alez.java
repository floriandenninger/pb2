package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alez implements lf {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ boolean b;

    public alez(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.lf
    public final boolean a(View view) {
        this.a.l(this.b);
        return true;
    }
}
