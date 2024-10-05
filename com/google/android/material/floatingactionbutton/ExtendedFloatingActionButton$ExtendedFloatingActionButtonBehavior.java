package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ahe;
import defpackage.ahh;
import defpackage.alhd;
import defpackage.alhs;
import defpackage.alht;
import defpackage.alhx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends ahe {
    private Rect a;
    private boolean b;
    private boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alht.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    private final boolean A(View view, alhd alhdVar) {
        if (!y(view, alhdVar)) {
            return false;
        }
        if (view.getTop() < (alhdVar.getHeight() / 2) + ((ahh) alhdVar.getLayoutParams()).topMargin) {
            w(alhdVar);
            return true;
        }
        v(alhdVar);
        return true;
    }

    private static boolean x(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ahh) {
            return ((ahh) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean y(View view, alhd alhdVar) {
        return (this.b || this.c) && ((ahh) alhdVar.getLayoutParams()).f == view.getId();
    }

    private final boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, alhd alhdVar) {
        if (!y(appBarLayout, alhdVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        alhx.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.e()) {
            w(alhdVar);
            return true;
        }
        v(alhdVar);
        return true;
    }

    @Override // defpackage.ahe
    public final void a(ahh ahhVar) {
        if (ahhVar.h == 0) {
            ahhVar.h = 80;
        }
    }

    @Override // defpackage.ahe
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        alhd alhdVar = (alhd) view;
        if (view2 instanceof AppBarLayout) {
            z(coordinatorLayout, (AppBarLayout) view2, alhdVar);
            return false;
        }
        if (!x(view2)) {
            return false;
        }
        A(view2, alhdVar);
        return false;
    }

    @Override // defpackage.ahe
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        alhd alhdVar = (alhd) view;
        List h = coordinatorLayout.h(alhdVar);
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) h.get(i2);
            if (view2 instanceof AppBarLayout) {
                if (z(coordinatorLayout, (AppBarLayout) view2, alhdVar)) {
                    break;
                }
            } else {
                if (x(view2) && A(view2, alhdVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.l(alhdVar, i);
        return true;
    }

    @Override // defpackage.ahe
    public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
        return false;
    }

    protected final void v(alhd alhdVar) {
        if (this.c) {
            int i = alhd.f;
            alhs alhsVar = alhdVar.c;
        } else {
            int i2 = alhd.f;
            alhs alhsVar2 = alhdVar.d;
        }
        throw null;
    }

    protected final void w(alhd alhdVar) {
        if (this.c) {
            int i = alhd.f;
            alhs alhsVar = alhdVar.b;
        } else {
            int i2 = alhd.f;
            alhs alhsVar2 = alhdVar.e;
        }
        throw null;
    }
}
