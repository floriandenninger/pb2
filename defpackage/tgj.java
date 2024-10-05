package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgj implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, tgt {
    public static final /* synthetic */ int f = 0;
    public final View a;
    public ViewGroup b;
    public final tjb d;
    private final tgb g;
    private tgb h;
    private List i;
    private final ViewTreeObserver.OnDrawListener p;
    private final aoae r;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private tgb m = null;
    public boolean c = false;
    private int q = 2;
    private final Rect n = new Rect();
    public Runnable e = null;
    private boolean o = false;

    private tgj(View view, tgb tgbVar) {
        this.a = view;
        this.g = tgbVar;
        this.r = tgbVar.e;
        tjb tjbVar = (tjb) tgbVar.c.pX(tja.a);
        this.d = tjbVar;
        int E = sgf.E(tjbVar.b);
        if (E == 0 || E != 3) {
            this.p = null;
        } else {
            this.p = new ViewTreeObserver.OnDrawListener() { // from class: tgh
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    final tgj tgjVar = tgj.this;
                    if (!tgjVar.c && tgjVar.b.isDirty() && tgjVar.e == null) {
                        tgjVar.e = new Runnable() { // from class: tgi
                            @Override // java.lang.Runnable
                            public final void run() {
                                tgj.this.k();
                            }
                        };
                        uqq.k(tgjVar.e, tgjVar.d.c);
                    }
                }
            };
        }
    }

    public static View a(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    public static tgb b(View view) {
        return (tgb) view.getTag(com.google.android.youtube.R.id.ve_tag);
    }

    public static boolean o(View view) {
        return view.getId() == 16908290;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(View view, tgb tgbVar) {
        tgj tgjVar = new tgj(view, tgbVar);
        tgbVar.a = tgjVar;
        tgjVar.a.setTag(com.google.android.youtube.R.id.ve_tag, tgjVar.g);
        if (tgjVar.r.y()) {
            tgjVar.a.addOnAttachStateChangeListener(tgjVar);
            if (jw.aj(tgjVar.a)) {
                tgjVar.onViewAttachedToWindow(tgjVar.a);
            }
        }
    }

    private final void t() {
        Runnable runnable = this.e;
        if (runnable != null) {
            uqq.m(runnable);
            this.e = null;
        }
    }

    private final void u() {
        int E;
        t();
        int E2 = sgf.E(this.d.b);
        if (E2 != 0 && E2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.p);
        }
        if (this.b == null || ((E = sgf.E(this.d.b)) != 0 && E == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.b = null;
        }
    }

    private final void v() {
        int E;
        amkq.N(this.j);
        if (this.l) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(R.id.content);
            viewGroup.getClass();
            this.b = viewGroup;
        } else {
            this.b = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        }
        if (this.b == null || ((E = sgf.E(this.d.b)) != 0 && E == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int E2 = sgf.E(this.d.b);
        if (E2 != 0 && E2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.p);
        }
    }

    private static void w(View view, tgs tgsVar) {
        tgb b = b(view);
        if (b != null) {
            tgt tgtVar = b.a;
            if (tgtVar instanceof tgj) {
                tgj tgjVar = (tgj) tgtVar;
                if (tgjVar.h != null || tgjVar.l) {
                    return;
                }
            }
            tgsVar.b(b);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(viewGroup.getChildAt(i), tgsVar);
            }
        }
    }

    private final int x() {
        if (this.a.getVisibility() != 0) {
            return 2;
        }
        if (this.l && !this.a.isShown()) {
            return 2;
        }
        int E = sgf.E(this.d.b);
        if (E != 0 && E != 1) {
            ViewGroup viewGroup = this.b;
            if (viewGroup == null) {
                return 2;
            }
            this.n.set(viewGroup.getScrollX(), this.b.getScrollY(), this.b.getWidth() + this.b.getScrollX(), this.b.getHeight() + this.b.getScrollY());
            if (this.a.getLeft() > this.n.left || this.a.getTop() > this.n.top || this.a.getRight() < this.n.right || this.a.getBottom() < this.n.bottom) {
                if (this.n.intersect(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom())) {
                    String.valueOf(String.valueOf(this.n)).length();
                    int width = ((this.n.width() * this.n.height()) * 100) / (this.a.getWidth() * this.a.getHeight());
                    tiz tizVar = this.d.d;
                    if (tizVar == null) {
                        tizVar = tiz.a;
                    }
                    if (width < tizVar.b) {
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    private final void y(int i) {
        if (i != this.q) {
            this.q = i;
            if (this.k) {
                this.r.A(this.g, i);
            }
        }
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ Object c() {
        if (n() || this.l) {
            return null;
        }
        tgb tgbVar = this.h;
        if (tgbVar != null || (tgbVar = this.m) != null) {
            return tgbVar;
        }
        for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
            View view = (View) parent;
            tgb b = b(view);
            if (b != null) {
                if (!this.j) {
                    return b;
                }
                this.m = b;
                return b;
            }
            if (o(view)) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        tgt tgtVar = ((tgb) obj).a;
        amkq.E(this.i.add(obj));
        tgtVar.j(this.g);
        if (this.j) {
            tgtVar.g();
        }
    }

    @Override // defpackage.tgt
    public final void e() {
        amkq.O(this.h != null, "No parent override to unset");
        this.h = null;
        if (this.j) {
            g();
        }
    }

    @Override // defpackage.tgt
    public final void f() {
        if (this.r.y()) {
            this.a.removeOnAttachStateChangeListener(this);
            if (jw.aj(this.a)) {
                onViewDetachedFromWindow(this.a);
            }
        }
        tgb tgbVar = this.h;
        if (tgbVar != null) {
            tgbVar.a.i(this.g);
        }
        List<tgb> list = this.i;
        if (list != null) {
            for (tgb tgbVar2 : list) {
                if (this.j) {
                    tgbVar2.a.h();
                }
                tgbVar2.a.e();
            }
            this.i.clear();
            this.i = null;
        }
        this.m = null;
        this.a.setTag(com.google.android.youtube.R.id.ve_tag, null);
    }

    @Override // defpackage.tgt
    public final void g() {
        if (!this.j || this.k) {
            return;
        }
        this.k = true;
        this.r.w(this.g);
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((tgb) it.next()).a.g();
            }
        }
    }

    @Override // defpackage.tgt
    public final void h() {
        if (this.k) {
            this.k = false;
            List list = this.i;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((tgb) it.next()).a.h();
                }
            }
            this.r.x(this.g);
            this.m = null;
        }
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        amkq.E(this.i.remove(obj));
        tgt tgtVar = ((tgb) obj).a;
        if (this.j) {
            tgtVar.h();
        }
        tgtVar.e();
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        obj.getClass();
        tgb tgbVar = this.h;
        amkq.T(tgbVar == null, "CVE (%s) has a parent override (%s). Swapping prohibited.", this.g, tgbVar);
        amkq.O(!this.l, "Isolated trees cannot have parents.");
        if (this.j) {
            amkq.L(((tgb) obj).a.m(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", this.g, obj);
            h();
        }
        this.h = (tgb) obj;
    }

    public final void k() {
        t();
        y(x());
        this.e = null;
    }

    @Override // defpackage.tgt
    public final void l(tgs tgsVar) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(viewGroup.getChildAt(i), tgsVar);
            }
        }
        List list = this.i;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                tgsVar.b((tgb) this.i.get(size));
            }
        }
    }

    @Override // defpackage.tgt
    public final boolean m() {
        return this.k;
    }

    @Override // defpackage.tgt
    public final boolean n() {
        return (this.h == null && o(this.a)) || this.l;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int E = sgf.E(this.d.b);
        if (E != 0 && E == 2) {
            if (this.o && view == this.b) {
                this.o = false;
                return;
            }
            View view2 = this.a;
            boolean z = view != view2;
            if (view == view2) {
                this.o = true;
            } else {
                this.o = false;
            }
            if (this.b == null) {
                amkq.N(!z);
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                this.b = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
            }
        } else if (view == this.a) {
            amkq.N(this.b == null);
            ViewGroup viewGroup2 = (ViewGroup) this.a.getParent();
            this.b = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.a.removeOnLayoutChangeListener(this);
        }
        if (this.c) {
            return;
        }
        k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        amkq.N(!this.j);
        this.j = true;
        v();
        g();
        if (this.c) {
            return;
        }
        k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        amkq.N(this.j);
        this.j = false;
        u();
        tgb tgbVar = this.h;
        if (tgbVar != null) {
            tgbVar.a.i(this.g);
            amkq.T(!this.k, "CVE (%s) was child of detached CVE (%s).", this.g, this.h);
        } else {
            h();
        }
    }

    public final void p(boolean z) {
        if (this.l == z) {
            return;
        }
        amkq.N(this.h == null);
        amkq.E((z && o(this.a)) ? false : true);
        if (this.j) {
            u();
        }
        this.l = z;
        if (this.j) {
            v();
        }
    }

    @Override // defpackage.tgt
    public final int r() {
        return this.c ? this.q : x();
    }

    @Override // defpackage.tgt
    public final void s(int i) {
        if (i == 1) {
            this.c = false;
            k();
        } else {
            this.c = true;
            y(2);
        }
    }
}
