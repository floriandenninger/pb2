package defpackage;

import android.app.ActionBar;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zao implements zaz {
    public final Set e;
    protected final Window f;
    protected final zba g;
    public int h;
    public boolean i;
    protected zan j;
    final zam k;
    public zbf l;
    private zan n;
    private View o;
    private int p;
    public final azqw a = azqv.aq(zck.a(zbe.a(new Rect(), zat.f(), new Rect(), new Rect()))).av();
    private final iw m = new iw() { // from class: zal
        @Override // defpackage.iw
        public final ko a(View view, ko koVar) {
            Rect rect;
            Rect rect2;
            zao zaoVar = zao.this;
            zaoVar.b.set(koVar.d(), koVar.f(), koVar.e(), koVar.c());
            Rect rect3 = zaoVar.c;
            if (Build.VERSION.SDK_INT >= 29) {
                rect = zao.a(view.getRootWindowInsets().getMandatorySystemGestureInsets());
            } else {
                rect = new Rect();
            }
            rect3.set(rect);
            Rect rect4 = zaoVar.d;
            if (Build.VERSION.SDK_INT >= 29) {
                rect2 = zao.a(view.getRootWindowInsets().getStableInsets());
            } else {
                rect2 = new Rect();
            }
            rect4.set(rect2);
            zaoVar.f();
            return (zaoVar.h & 1) == 1 ? koVar.n() : koVar;
        }
    };
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final Rect d = new Rect();

    public zao(Window window) {
        zam zamVar = new zam(this);
        this.k = zamVar;
        this.n = zan.DEFAULT;
        window.getClass();
        this.f = window;
        this.g = new zba(window, zamVar);
        this.e = Collections.newSetFromMap(new WeakHashMap());
        p(this.n);
    }

    public static Rect a(Insets insets) {
        return new Rect(insets.left, insets.top, insets.right, insets.bottom);
    }

    private final void p(zan zanVar) {
        this.j = zanVar;
        zba zbaVar = this.g;
        int i = zanVar.h;
        if (zbaVar.c != i) {
            zbaVar.c = i;
            zbaVar.a();
        }
        zba zbaVar2 = this.g;
        boolean z = zanVar.i;
        if (zbaVar2.e != z) {
            zbaVar2.e = z;
            zbaVar2.a();
        }
        this.g.b(zanVar.j);
        q();
    }

    private final void q() {
        zba zbaVar = this.g;
        boolean z = false;
        if (m() && this.i) {
            z = true;
        }
        if (zbaVar.g != z) {
            zbaVar.g = z;
            zbaVar.a();
        }
    }

    @Override // defpackage.zbl
    public final void b(boolean z) {
        if (z) {
            p(this.j);
        }
    }

    public final zat c() {
        if (Build.VERSION.SDK_INT >= 28) {
            View view = this.o;
            if (view == null || view.getRootWindowInsets() == null || this.o.getRootWindowInsets().getDisplayCutout() == null) {
                return zat.f();
            }
            return zat.e(new Rect(this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetLeft(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetTop(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetRight(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetBottom()), this.o.getRootWindowInsets().getDisplayCutout().getBoundingRects());
        }
        return zat.f();
    }

    @Override // defpackage.zaz
    public final aypn d() {
        return this.a;
    }

    @Override // defpackage.zaz
    public final void e(zbk zbkVar) {
        zbkVar.getClass();
        this.e.add(zbkVar);
    }

    public final void f() {
        Rect rect = new Rect(this.b);
        zbf zbfVar = this.l;
        if (zbfVar != null) {
            Rect rect2 = new Rect(this.b);
            zbg zbgVar = zbfVar.a;
            if (zbgVar.g.f) {
                boolean hasFeature = zbgVar.f.hasFeature(9);
                ActionBar actionBar = zbgVar.m;
                boolean z = false;
                if (actionBar != null && !actionBar.isShowing()) {
                    z = true;
                }
                if (hasFeature && z) {
                    rect2.top -= zbgVar.n;
                }
            }
            Rect rect3 = new Rect();
            if (zbgVar.m()) {
                rect3.set(rect2);
            }
            rect.set(rect3);
        }
        this.a.c(zck.a(zbe.a(rect, c(), this.c, this.d)));
    }

    @Override // defpackage.zaz
    public final void g() {
        this.p = 0;
        p(this.n);
    }

    @Override // defpackage.zaz
    public final void h(View view, int i) {
        zan zanVar;
        View view2 = this.o;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            jw.X(view2, null);
        }
        view.getClass();
        this.o = view;
        this.h = i;
        zba zbaVar = this.g;
        boolean z = (i & 4) == 4;
        View view3 = zbaVar.a;
        if (view3 != view) {
            if (view3 != null) {
                view3.setOnSystemUiVisibilityChangeListener(null);
            }
            view.getClass();
            zbaVar.a = view;
            zbaVar.d = z;
            zbaVar.a.setOnSystemUiVisibilityChangeListener(zbaVar);
            zbaVar.b = zbaVar.a.getSystemUiVisibility();
        }
        jw.X(this.o, this.m);
        if ((i & 2) == 2) {
            zanVar = zan.LAYOUT_FULLSCREEN;
        } else {
            zanVar = zan.DEFAULT;
        }
        this.n = zanVar;
        this.p = 0;
        p(zanVar);
    }

    @Override // defpackage.zaz
    public final void i() {
        zba zbaVar = this.g;
        zbaVar.removeMessages(0);
        zbaVar.h = true;
    }

    @Override // defpackage.zaz
    public final void j(boolean z) {
        this.i = z;
        q();
    }

    @Override // defpackage.zaz
    public final void k(int i) {
        if (this.j == zan.IMMERSIVE || this.j == zan.VR) {
            return;
        }
        this.g.b(i);
    }

    @Override // defpackage.zaz
    public final boolean l() {
        return this.j.h == 2;
    }

    @Override // defpackage.zaz
    public final boolean m() {
        zan zanVar = this.j;
        return (zanVar.h != 2 || zanVar.i || this.p == 4) ? false : true;
    }

    @Override // defpackage.zaz
    public final int n() {
        return this.p;
    }

    @Override // defpackage.zaz
    public final void o(int i) {
        zan zanVar;
        int i2 = i - 1;
        if (i2 == 0) {
            zanVar = zan.IMMERSIVE;
        } else if (i2 == 1) {
            zanVar = zan.IMMERSIVE_FLEX;
        } else if (i2 == 2) {
            zanVar = zan.VR;
        } else if (i2 != 3) {
            zanVar = zan.IMMERSIVE_SHOW_UI;
        } else {
            zanVar = zan.NON_STICKY_FULLSCREEN;
        }
        this.p = i;
        p(zanVar);
    }
}
