package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gey implements gfk {
    private final int a;
    private final int b;
    private final int c;
    private final View d;
    private final gfj e;
    private int f;

    public gey(Context context, View view, gfj gfjVar) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = yjk.K(displayMetrics, 16);
        this.b = yjk.K(displayMetrics, 80);
        this.c = yjk.K(displayMetrics, 640);
        this.d = view;
        this.e = gfjVar;
    }

    @Override // defpackage.gfk
    public final void a(View view, int i) {
        int i2;
        this.f += i;
        if (!view.canScrollVertically(-1) || (i2 = this.f) < (-this.c)) {
            this.e.g();
            this.f = 0;
        } else if (i2 > this.b) {
            this.e.c(true);
            this.f = 0;
        }
    }

    @Override // defpackage.gfk
    public final void b() {
        this.d.setTranslationY(0.0f);
        this.d.setTranslationX(0.0f);
        this.f = 0;
    }

    @Override // defpackage.gfk
    public final void c(int i) {
        yny.z(this.d, yny.h(yny.r(0), yny.q(this.a), yny.k(i + this.a), yny.m(8388693)), FrameLayout.LayoutParams.class);
    }

    @Override // defpackage.gfk
    public final void d() {
        this.f = 0;
    }
}
