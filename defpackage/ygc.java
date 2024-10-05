package defpackage;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ygc {
    private static final String a = "ygc";
    private final Activity b;
    private final acqz c;
    private final ygb d;
    public Object e;
    ViewGroup f;
    final FrameLayout g;
    private final axpg h;

    public ygc(Activity activity, axpg axpgVar, acqz acqzVar) {
        this.b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.g = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        this.d = new ygb();
        this.h = axpgVar;
        this.c = acqzVar;
    }

    private final View f() {
        if (d()) {
            return this.g.getChildAt(0);
        }
        return null;
    }

    private final void g(ajom ajomVar, Object obj) {
        if (ajomVar != null) {
            View a2 = ajomVar.a();
            ajok p = ahbw.p(a2);
            if (p == null) {
                p = new ajok();
                ahbw.v(a2, p);
            }
            p.h();
            p.a(this.c.mM());
            this.d.a(p, null, 0);
            ajomVar.oB(p, obj);
        }
    }

    private final void h() {
        if (d()) {
            View f = f();
            this.g.removeView(f);
            ((ajos) this.h.get()).b(f);
        }
    }

    public void a() {
        if (!d()) {
            Log.e(a, "No overlay to dismiss.");
            return;
        }
        h();
        this.f.removeView(this.g);
        this.f.setVisibility(8);
        this.d.a = null;
    }

    public void b(Object obj, Pair pair) {
        ajom ajomVar;
        if (obj == null) {
            return;
        }
        if (this.f == null) {
            this.f = yjj.C(this.b);
        }
        View view = null;
        if (pair == null) {
            pair = Pair.create("overlay_controller_param", null);
        }
        this.d.a = pair;
        this.e = obj;
        if (d()) {
            Object obj2 = this.e;
            if (!d() || ahbw.n(this.g.getChildAt(0)) != ((ajos) this.h.get()).c(obj2)) {
                h();
            } else {
                c();
                return;
            }
        }
        Object obj3 = this.e;
        if (obj3 != null && (ajomVar = (ajom) ahbw.s((ajos) this.h.get(), obj3, this.f).f()) != null) {
            g(ajomVar, obj3);
            view = ajomVar.a();
        }
        if (view == null) {
            return;
        }
        if (this.g.indexOfChild(view) < 0) {
            this.g.addView(view);
        }
        if (this.f.indexOfChild(this.g) < 0) {
            this.f.addView(this.g);
        }
        this.f.setVisibility(0);
    }

    public final void c() {
        if (d()) {
            View f = f();
            ahbw.t(f, (ajos) this.h.get());
            g(ahbw.q(f), this.e);
        }
    }

    public final boolean d() {
        ViewGroup viewGroup = this.f;
        return viewGroup != null && viewGroup.indexOfChild(this.g) >= 0 && this.g.getChildCount() > 0;
    }

    public final void e(Object obj) {
        b(obj, null);
    }
}
