package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mo implements iw {
    final /* synthetic */ ne a;

    public mo(ne neVar) {
        this.a = neVar;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        boolean z;
        View view2;
        ko koVar2;
        boolean z2;
        int d;
        int f = koVar.f();
        ne neVar = this.a;
        int f2 = koVar.f();
        ActionBarContextView actionBarContextView = neVar.k;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) neVar.k.getLayoutParams();
            if (neVar.k.isShown()) {
                if (neVar.B == null) {
                    neVar.B = new Rect();
                    neVar.C = new Rect();
                }
                Rect rect = neVar.B;
                Rect rect2 = neVar.C;
                rect.set(koVar.d(), koVar.f(), koVar.e(), koVar.c());
                ViewGroup viewGroup = neVar.p;
                if (zb.a != null) {
                    try {
                        zb.a.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ko s = jw.s(neVar.p);
                int d2 = s == null ? 0 : s.d();
                int e = s == null ? 0 : s.e();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i > 0 && neVar.q == null) {
                    neVar.q = new View(neVar.d);
                    neVar.q.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = d2;
                    layoutParams.rightMargin = e;
                    neVar.p.addView(neVar.q, -1, layoutParams);
                } else {
                    View view3 = neVar.q;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != d2 || marginLayoutParams2.rightMargin != e) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = d2;
                            marginLayoutParams2.rightMargin = e;
                            neVar.q.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = neVar.q;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = neVar.q;
                    if ((jw.j(view5) & 8192) != 0) {
                        d = aih.d(neVar.d, R.color.abc_decor_view_status_guard_light);
                    } else {
                        d = aih.d(neVar.d, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(d);
                }
                if (!neVar.t && z) {
                    f2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                neVar.k.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = neVar.q;
        if (view6 != null) {
            view6.setVisibility(true == z ? 0 : 8);
        }
        if (f != f2) {
            koVar2 = koVar.p(koVar.d(), f2, koVar.e(), koVar.c());
            view2 = view;
        } else {
            view2 = view;
            koVar2 = koVar;
        }
        return jw.t(view2, koVar2);
    }
}
