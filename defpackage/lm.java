package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lm extends ic {
    @Override // defpackage.ic
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.h() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.h());
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        int h;
        super.d(view, ksVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        ksVar.r(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (h = nestedScrollView.h()) <= 0) {
            return;
        }
        ksVar.C(true);
        if (nestedScrollView.getScrollY() > 0) {
            ksVar.i(kr.d);
            ksVar.i(kr.h);
        }
        if (nestedScrollView.getScrollY() < h) {
            ksVar.i(kr.c);
            ksVar.i(kr.i);
        }
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.u(max);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int height2 = nestedScrollView.getHeight();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.h());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.u(min);
        return true;
    }
}
