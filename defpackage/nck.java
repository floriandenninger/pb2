package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class nck extends nbp {
    public final wyz d;
    protected final xmi e;
    protected final View f;
    public final View g;
    protected final View h;
    protected final View i;
    protected final View j;
    public long k;
    private final Context l;
    private final wzq m;
    private final boolean n;

    public nck(Context context, aahd aahdVar, wzq wzqVar, wyz wyzVar, tdv tdvVar, euv euvVar, View view, View view2, View view3, View view4, View view5, View view6, boolean z) {
        super(aahdVar, tdvVar, euvVar, view4);
        this.l = context;
        this.m = wzqVar;
        this.d = wyzVar;
        view.getClass();
        this.f = view;
        view2.getClass();
        this.g = view2;
        view3.getClass();
        this.j = view3;
        this.h = view5;
        this.i = view6;
        this.n = z;
        xmi xmiVar = new xmi(view2, new ncj(this), new ncj(this), new View.OnTouchListener() { // from class: nch
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view7, MotionEvent motionEvent) {
                nck.this.d.b.g(motionEvent);
                return false;
            }
        }, new ncj(this), null, null);
        this.e = xmiVar;
        xmiVar.b(view3, false);
        if (view5 != null) {
            xmiVar.b(view5, true);
        }
        if (view6 != null) {
            xmiVar.b(view6, true);
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ncg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                nck nckVar = nck.this;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                nckVar.k(nckVar.j, nckVar.g);
            }
        });
    }

    public static fyl h(Context context) {
        Resources resources = context.getResources();
        int orElse = wbs.W(context, R.attr.adSeparator1).orElse(0);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.line_separator_height);
        TypedValue typedValue = new TypedValue();
        return new fyl(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? aii.a(context, typedValue.resourceId) : null, orElse, dimensionPixelSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ncl i() {
        return (ncl) this.a.c(this.c, ncl.class, "PSPState", new euu() { // from class: nci
            @Override // defpackage.euu
            public final Object a() {
                return new ncl(nck.this.k);
            }
        }, this.b);
    }

    public final List j(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(this.g);
        arrayList.remove(this.j);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void k(View view, View view2);

    public abstract void l(View view, MotionEvent motionEvent, List list, boolean z);

    public abstract void m(View view, MotionEvent motionEvent, List list);

    public abstract void n(List list);

    public abstract void o();

    public final void p(acra acraVar, Object obj, String str, List list, long j, aoxy aoxyVar, byte[] bArr) {
        this.k = j;
        if (this.n) {
            xmi xmiVar = this.e;
            boolean l = muf.l(this.l);
            if (xmiVar.g != l) {
                xmiVar.g = l;
                if (l) {
                    xmiVar.a.setOnClickListener(new xmg(xmiVar, 0));
                } else {
                    xmiVar.a.setOnClickListener(new xmg(xmiVar, 1));
                }
                if (xmiVar.g) {
                    for (View view : xmiVar.c) {
                        view.setOnTouchListener(null);
                        view.setClickable(true);
                        view.setOnClickListener(new xmg(xmiVar, 0));
                    }
                } else {
                    for (View view2 : xmiVar.c) {
                        view2.setOnClickListener(null);
                        view2.setClickable(false);
                        view2.setOnTouchListener(new xmh(xmiVar, 1));
                    }
                }
            }
        }
        super.d(acraVar, obj, str, list, aoxyVar, bArr);
        ncl i = i();
        if (i.b == 0) {
            i.b = System.currentTimeMillis();
        }
    }

    public final void q(apxf apxfVar) {
        Object obj = this.b;
        if (obj == null || this.m.d(obj)) {
            return;
        }
        ncl i = i();
        long j = i.b;
        if (j <= 0 || j + i.a > System.currentTimeMillis()) {
            return;
        }
        g(apxfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(List list) {
        View view = this.h;
        if (view != null && list.contains(view)) {
            return true;
        }
        View view2 = this.i;
        return view2 != null && list.contains(view2);
    }

    protected abstract boolean s();

    public final boolean t(List list) {
        if (list.contains(this.j) || s()) {
            return true;
        }
        AccessibilityManager a = zev.a(this.l);
        return a != null && a.isEnabled();
    }

    public boolean u(View view, List list) {
        View view2;
        if (!r(list)) {
            return false;
        }
        View view3 = this.h;
        if (view3 == null || view3.getVisibility() != 0) {
            View view4 = this.i;
            view2 = (view4 == null || view4.getVisibility() != 0) ? null : this.i;
        } else {
            view2 = this.h;
        }
        if (view2 == null) {
            return true;
        }
        Object tag = view2.getTag(R.id.innertube_menu_anchor_on_click_listener);
        View.OnClickListener onClickListener = tag instanceof View.OnClickListener ? (View.OnClickListener) tag : null;
        if (!this.n || onClickListener == null) {
            view2.performClick();
            return true;
        }
        onClickListener.onClick(view2);
        return true;
    }

    public boolean v(List list) {
        return false;
    }
}
