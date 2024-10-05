package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcv {
    public final akcu a;
    public final Rect b;
    private final View c;
    private final int d;
    private final int e;
    private final int f;

    public akcv(View view, View view2, int i, int i2) {
        this(view, view2, i, i2, 0);
    }

    public static int a(int i, View view) {
        int e = jw.e(view);
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return e != 1 ? 4 : 3;
                }
                throw new IllegalArgumentException();
            }
            if (e != 1) {
                return 3;
            }
        }
        return i2;
    }

    private static int j(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        return view.getMeasuredWidth();
    }

    private static boolean k(int i) {
        return i == 1 || i == 2;
    }

    public final void b(int i) {
        this.a.a(i);
    }

    public final void c(Rect rect, int i, int i2) {
        this.a.b(this.c, rect, i, i2, this.f);
    }

    public final void d(boolean z) {
        this.a.e = z;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void f(akcs akcsVar) {
        this.a.d = akcsVar;
    }

    public final void g(Rect rect) {
        int i;
        int i2 = this.d;
        int i3 = this.e;
        c(rect, i2, i3);
        if (k(i2)) {
            if (!h(i2, rect)) {
                i = i2 == 1 ? 2 : 1;
            }
            i = i2;
        } else {
            View view = this.c;
            if (!k(i2)) {
                int a = a(i2, view);
                int j = j(this.a);
                int width = this.b.width();
                if (a != 3 ? j >= (width - rect.width()) - rect.left : j >= rect.left - this.b.left) {
                    i = i2 == 3 ? 4 : 3;
                }
            }
            i = i2;
        }
        if (i != this.d) {
            this.a.b(this.c, rect, i, i3, this.f);
            j(this.a);
        }
        final akcu akcuVar = this.a;
        akcuVar.c.setClippingEnabled(false);
        akcuVar.c.setAnimationStyle(R.style.Animation.Dialog);
        if (akcuVar.f || akcuVar.j == 1) {
            boolean z = akcuVar.j == 1;
            akcuVar.b = new akcg(akcuVar.a, akcuVar, akcuVar.h, akcuVar.e);
            if (akcuVar.h.getRootView() instanceof ViewGroup) {
                ((ViewGroup) akcuVar.h.getRootView()).addView(akcuVar.b);
            }
            akcuVar.c.setOutsideTouchable(false);
            akcuVar.b.e = z;
        } else {
            akcuVar.c.setBackgroundDrawable(new BitmapDrawable(akcuVar.a.getResources(), ""));
            akcuVar.c.setOutsideTouchable(akcuVar.e);
            akcuVar.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: akct
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    akcu.this.a(0);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 29) {
            akcuVar.e();
        }
        akcuVar.c.showAtLocation(akcuVar.h, 0, akcuVar.l, akcuVar.m);
    }

    public final boolean h(int i, Rect rect) {
        if (!k(i)) {
            return true;
        }
        akcu akcuVar = this.a;
        int height = akcuVar.getHeight();
        if (height == 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            akcuVar.measure(makeMeasureSpec, makeMeasureSpec);
            height = akcuVar.getMeasuredHeight();
        }
        return i == 1 ? height < rect.top - this.b.top : height < (this.b.height() - rect.height()) - rect.top;
    }

    public final boolean i() {
        return this.a.isShown();
    }

    public akcv(View view, View view2, int i, int i2, int i3) {
        this(view, view2, i, i2, i3, 0);
    }

    public akcv(View view, View view2, int i, int i2, int i3, int i4) {
        view.getClass();
        view2.getClass();
        this.c = view2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        akcu akcuVar = new akcu(view.getContext(), i4);
        this.a = akcuVar;
        akcuVar.g = view;
        akcuVar.c = new PopupWindow(akcuVar);
        akcuVar.addView(view);
        Rect rect = new Rect();
        this.b = rect;
        rect.right = akcuVar.getResources().getDisplayMetrics().widthPixels;
        rect.bottom = akcuVar.getResources().getDisplayMetrics().heightPixels;
    }
}
