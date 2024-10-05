package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbg {
    public View a;
    public hbf d;
    public int e;
    public int f;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hbe
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            hbg hbgVar = hbg.this;
            hbgVar.a.getWindowVisibleDisplayFrame(hbgVar.c);
            int i = hbgVar.c.bottom;
            if (i != hbgVar.f) {
                boolean z = i == hbgVar.e;
                hbgVar.g = z;
                if (z) {
                    if (hbgVar.h) {
                        hbgVar.a.getViewTreeObserver().removeOnGlobalLayoutListener(hbgVar.b);
                    } else {
                        hbf hbfVar = hbgVar.d;
                        if (hbfVar != null) {
                            ((ida) hbfVar).d();
                        }
                    }
                }
                int[] iArr = new int[2];
                hbgVar.a.getLocationOnScreen(iArr);
                yny.z(hbgVar.a, yny.n(i - iArr[1]), ViewGroup.LayoutParams.class);
                hbgVar.f = i;
            }
        }
    };
    public final Rect c = new Rect();
    public boolean g = true;
    public boolean h = true;

    public final void a() {
        amkq.N(this.a != null);
        if (this.h) {
            return;
        }
        this.h = true;
        if (this.g) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    public final void b() {
        amkq.N(this.a != null);
        if (this.h) {
            this.h = false;
            this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
        }
    }

    public final void c(View view) {
        view.getClass();
        this.a = view;
        view.getWindowVisibleDisplayFrame(this.c);
        int i = this.c.bottom;
        this.f = i;
        this.e = i;
    }
}
