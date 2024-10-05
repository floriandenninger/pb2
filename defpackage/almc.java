package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class almc {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public TabLayout g;
    public almf h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.i(this);
    }

    public final void b() {
        almf almfVar = this.h;
        if (almfVar != null) {
            almfVar.b();
        }
    }

    public final void c(Drawable drawable) {
        this.a = drawable;
        TabLayout tabLayout = this.g;
        if (tabLayout.r == 1 || tabLayout.u == 2) {
            tabLayout.n(true);
        }
        b();
    }
}
