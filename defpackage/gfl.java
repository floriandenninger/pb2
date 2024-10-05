package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfl implements gfk, zcc {
    public final zcd a;
    protected final View b;
    protected View c = null;
    private final gfj d;

    public gfl(View view, View view2, gfj gfjVar) {
        this.b = view;
        this.a = new zcd(view2);
        this.d = gfjVar;
    }

    @Override // defpackage.gfk
    public final void a(View view, int i) {
    }

    @Override // defpackage.gfk
    public final void b() {
        this.b.setTranslationY(0.0f);
        this.b.setTranslationX(0.0f);
        this.b.setTranslationY(-r0.getHeight());
    }

    @Override // defpackage.gfk
    public final void c(int i) {
        yny.z(this.b, yny.h(yny.r(0), yny.q(0), yny.v(0), yny.m(51)), FrameLayout.LayoutParams.class);
    }

    @Override // defpackage.gfk
    public final void d() {
    }

    public final void f(View view) {
        this.c = view;
        this.a.c(view);
    }

    @Override // defpackage.zcc
    public final void rV(zby zbyVar) {
        View view = this.c;
        if (view == null) {
            return;
        }
        Rect rect = zbyVar.a;
        if (!zbyVar.e() || (rect.left <= 0 && rect.top <= 0)) {
            this.d.c(true);
            return;
        }
        Rect rect2 = zbyVar.a;
        if (jw.e(view) == 1) {
            this.b.setTranslationX(rect2.right - this.b.getWidth());
        } else {
            this.b.setTranslationX(rect2.left);
        }
        this.b.setTranslationY(rect2.top);
        this.d.g();
    }
}
