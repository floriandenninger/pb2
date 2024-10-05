package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sb extends qd {
    public ry g;
    public Drawable h;
    public boolean i;
    public int j;
    rz k;
    public rv l;
    rw m;
    final sa n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private qc u;

    public sb(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.n = new sa(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [rf] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.qd
    public final View a(qt qtVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = qtVar.getActionView();
        if (actionView == null || qtVar.m()) {
            if (!(view instanceof rf)) {
                actionMenuItemView = (rf) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            } else {
                actionMenuItemView = (rf) view;
            }
            actionMenuItemView.f(qtVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.c = (ActionMenuView) this.f;
            if (this.u == null) {
                this.u = new qc(this);
            }
            actionMenuItemView2.d = this.u;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == qtVar.p ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof se)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.qd, defpackage.re
    public final void b(Context context, qq qqVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = qqVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.j = jp.c(context);
        int i = this.q;
        if (this.o) {
            if (this.g == null) {
                ry ryVar = new ry(this, this.a);
                this.g = ryVar;
                if (this.i) {
                    ryVar.setImageDrawable(this.h);
                    this.h = null;
                    this.i = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.r = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.qd, defpackage.re
    public final void c(qq qqVar, boolean z) {
        n();
        rd rdVar = this.e;
        if (rdVar != null) {
            rdVar.a(qqVar, z);
        }
    }

    @Override // defpackage.qd, defpackage.re
    public final boolean e() {
        ArrayList arrayList;
        int i;
        boolean z;
        qq qqVar = this.c;
        View view = null;
        if (qqVar != null) {
            arrayList = qqVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.j;
        int i3 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            qt qtVar = (qt) arrayList.get(i4);
            if (qtVar.r()) {
                i5++;
            } else if (qtVar.q()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.s && qtVar.p) {
                i2 = 0;
            }
            i4++;
        }
        if (this.o && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            qt qtVar2 = (qt) arrayList.get(i8);
            if (qtVar2.r()) {
                View a = a(qtVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = qtVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                qtVar2.k(z);
            } else if (qtVar2.q()) {
                int i11 = qtVar2.b;
                boolean z3 = sparseBooleanArray.get(i11);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View a2 = a(qtVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z4 = i3 + i9 > 0;
                }
                boolean z5 = z4;
                if (z5 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z3) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        qt qtVar3 = (qt) arrayList.get(i12);
                        if (qtVar3.b == i11) {
                            if (qtVar3.o()) {
                                i7++;
                            }
                            qtVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                qtVar2.k(z5);
            } else {
                qtVar2.k(false);
                i8++;
                view = null;
                z = true;
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v2, types: [qq] */
    @Override // defpackage.qd, defpackage.re
    public final boolean f(rm rmVar) {
        boolean z = false;
        if (!rmVar.hasVisibleItems()) {
            return false;
        }
        rm rmVar2 = rmVar;
        while (true) {
            qq qqVar = rmVar2.j;
            if (qqVar == this.c) {
                break;
            }
            rmVar2 = (rm) qqVar;
        }
        qt qtVar = rmVar2.k;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof rf) && ((rf) childAt).a() == qtVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        qt qtVar2 = rmVar.k;
        int size = rmVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rmVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        rv rvVar = new rv(this, this.b, rmVar, view);
        this.l = rvVar;
        rvVar.d(z);
        this.l.f();
        rd rdVar = this.e;
        rm rmVar3 = rmVar;
        if (rdVar != null) {
            if (rmVar == null) {
                rmVar3 = this.c;
            }
            rdVar.b(rmVar3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qd, defpackage.re
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        boolean z = false;
        if (viewGroup != null) {
            qq qqVar = this.c;
            if (qqVar != null) {
                qqVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    qt qtVar = (qt) f.get(i2);
                    if (qtVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        qt a = childAt instanceof rf ? ((rf) childAt).a() : null;
                        View a2 = a(qtVar, childAt, viewGroup);
                        if (qtVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        qq qqVar2 = this.c;
        if (qqVar2 != null) {
            qqVar2.k();
            ArrayList arrayList = qqVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                id idVar = ((qt) arrayList.get(i3)).o;
            }
        }
        qq qqVar3 = this.c;
        ArrayList e = qqVar3 != null ? qqVar3.e() : null;
        if (this.o && e != null) {
            int size3 = e.size();
            if (size3 == 1) {
                z = !((qt) e.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new ry(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    ry ryVar = this.g;
                    se j = ActionMenuView.j();
                    j.a = true;
                    actionMenuView.addView(ryVar, j);
                }
                ((ActionMenuView) this.f).b = this.o;
            }
        }
        ry ryVar2 = this.g;
        if (ryVar2 != null) {
            Object parent = ryVar2.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).b = this.o;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        rw rwVar = this.m;
        if (rwVar == null || (obj = this.f) == null) {
            rz rzVar = this.k;
            if (rzVar == null) {
                return false;
            }
            rzVar.b();
            return true;
        }
        ((View) obj).removeCallbacks(rwVar);
        this.m = null;
        return true;
    }

    public final boolean l() {
        rz rzVar = this.k;
        return rzVar != null && rzVar.h();
    }

    public final boolean m() {
        qq qqVar;
        if (!this.o || l() || (qqVar = this.c) == null || this.f == null || this.m != null || qqVar.e().isEmpty()) {
            return false;
        }
        this.m = new rw(this, new rz(this, this.b, this.c, this.g));
        ((View) this.f).post(this.m);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.s = true;
    }

    public final void p() {
        this.o = true;
        this.p = true;
    }

    public final void q() {
        rv rvVar = this.l;
        if (rvVar != null) {
            rvVar.b();
        }
    }
}
