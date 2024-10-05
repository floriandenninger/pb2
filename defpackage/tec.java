package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tec {
    private final tdq a;

    public tec(tdq tdqVar) {
        this.a = tdqVar;
    }

    private static int b(DisplayMetrics displayMetrics, int i) {
        return (int) Math.ceil(i / displayMetrics.density);
    }

    public final tdy a(tdx tdxVar, View view) {
        DisplayMetrics a;
        double d;
        double d2;
        if (view.getDisplay() != null) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            Rect rect = new Rect(0, 0, b(displayMetrics, displayMetrics.widthPixels), b(displayMetrics, displayMetrics.heightPixels));
            int i = teu.d;
            teu teuVar = this.a.a;
            Display display = view.getDisplay();
            if (display == null) {
                a = null;
            } else {
                int displayId = display.getDisplayId();
                HashMap hashMap = teuVar.a;
                Integer valueOf = Integer.valueOf(displayId);
                if (hashMap.containsKey(valueOf)) {
                    a = (DisplayMetrics) teuVar.a.get(valueOf);
                } else {
                    a = teuVar.a(display);
                }
            }
            Rect rect2 = new Rect(0, 0, b(a, a.widthPixels), b(a, a.heightPixels));
            int width = view.getWidth();
            int height = view.getHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int b = b(displayMetrics, iArr[0]);
            int b2 = b(displayMetrics, iArr[1]);
            Rect rect3 = new Rect(b, b2, b(displayMetrics, width) + b, b(displayMetrics, height) + b2);
            Rect rect4 = tdxVar.g != null ? new Rect(rect3.left + tdxVar.g.left, rect3.top + tdxVar.g.top, rect3.left + tdxVar.g.right, rect3.top + tdxVar.g.bottom) : rect3;
            if (!tdxVar.h()) {
                View view2 = view;
                while (true) {
                    if (view2.getVisibility() != 0) {
                        break;
                    }
                    view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
                    if (view2 == null) {
                        if (view.hasWindowFocus()) {
                            double height2 = rect2.height() * rect2.width();
                            double height3 = rect4.height() * rect4.width();
                            boolean f = tdxVar.f();
                            Rect rect5 = new Rect();
                            if (!f) {
                                Rect rect6 = new Rect();
                                if (jw.aj(view)) {
                                    view.getLocalVisibleRect(rect6);
                                }
                                rect5.setIntersect(new Rect(rect3.left + b(displayMetrics, rect6.left), rect3.top + b(displayMetrics, rect6.top), rect3.left + b(displayMetrics, rect6.right), rect3.top + b(displayMetrics, rect6.bottom)), rect4);
                            } else {
                                rect5.setIntersect(rect3, rect4);
                            }
                            double height4 = rect5.height() * rect5.width();
                            if (height3 > 0.0d) {
                                Double.isNaN(height4);
                                Double.isNaN(height3);
                                d = height4 / height3;
                            } else {
                                d = 0.0d;
                            }
                            if (height2 > 0.0d) {
                                Double.isNaN(height4);
                                Double.isNaN(height2);
                                d2 = height4 / height2;
                            } else {
                                d2 = 0.0d;
                            }
                            return new tdy(d, d2, rect4, rect3, rect, rect2);
                        }
                    }
                }
            }
            return new tdy(0.0d, 0.0d, rect4, rect3, rect, rect2);
        }
        return new tdy(0.0d, 0.0d, null, null, null, null);
    }
}
