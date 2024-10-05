package defpackage;

import android.R;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class akce {
    public final akcd a;

    public akce(View view, int i, View view2, int i2) {
        view.getClass();
        view2.getClass();
        akcd akcdVar = new akcd(view2.getContext());
        this.a = akcdVar;
        akcdVar.c = view;
        akcdVar.a = new PopupWindow(akcdVar);
        akcdVar.addView(view);
        if (g(i)) {
            if (g(i)) {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int i3 = i(akcdVar);
                int i4 = view2.getResources().getDisplayMetrics().heightPixels;
                int i5 = i(view2);
                if (i != 1 ? i3 >= (i4 - i5) - iArr[1] : i3 >= iArr[1]) {
                    i = i == 1 ? 2 : 1;
                }
            }
        } else if (!g(i)) {
            int a = a(i, view2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int j = j(akcdVar);
            int i6 = view2.getResources().getDisplayMetrics().widthPixels;
            int j2 = j(view2);
            if (a != 5 ? j >= (i6 - j2) - iArr2[0] : j >= iArr2[0]) {
                i = i == 3 ? 4 : 3;
            }
        }
        akcdVar.e = view2;
        akcdVar.b();
        akcdVar.d = i;
        akcdVar.f = i2;
    }

    public static int a(int i, View view) {
        int e = jw.e(view);
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return e != 1 ? 5 : 6;
        }
        if (i == 4) {
            return e != 1 ? 6 : 5;
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(int i) {
        return i == 1 || i == 2;
    }

    private static int i(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
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

    public final void b() {
        PopupWindow popupWindow = this.a.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void c(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void d() {
        akcd akcdVar = this.a;
        akcdVar.a.setClippingEnabled(false);
        akcdVar.a.setAnimationStyle(R.style.Animation.Dialog);
        akcdVar.a.setBackgroundDrawable(new BitmapDrawable(akcdVar.e.getResources(), ""));
        akcdVar.a.setOutsideTouchable(akcdVar.b);
        akcdVar.a.showAtLocation(akcdVar.e, 0, 0, 0);
    }

    public final void e() {
        this.a.b();
        this.a.requestLayout();
    }

    public final boolean f() {
        return this.a.isShown();
    }

    public final void h() {
        this.a.b = true;
    }

    public akce(View view, int i, View view2, int i2, int i3) {
        this(view, i, view2, i2);
        this.a.a(i3);
    }
}
