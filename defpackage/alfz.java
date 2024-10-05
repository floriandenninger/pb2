package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alfz extends akm {
    final /* synthetic */ BottomSheetBehavior a;

    public alfz(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.akm
    public final int b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.q ? bottomSheetBehavior.w : bottomSheetBehavior.o;
    }

    @Override // defpackage.akm
    public final void d(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.s) {
                bottomSheetBehavior.H(1);
            }
        }
    }

    @Override // defpackage.akm
    public final boolean f(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.t;
        if (i2 == 1 || bottomSheetBehavior.B) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.A == i) {
            WeakReference weakReference = bottomSheetBehavior.y;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.a.x;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.akm
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.akm
    public final int h(View view, int i) {
        int v = this.a.v();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return aii.c(i, v, bottomSheetBehavior.q ? bottomSheetBehavior.w : bottomSheetBehavior.o);
    }

    @Override // defpackage.akm
    public final void i(View view, int i, int i2, int i3) {
        this.a.z(i2);
    }

    @Override // defpackage.akm
    public final void e(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        int i2 = 4;
        if (f2 >= 0.0f) {
            BottomSheetBehavior bottomSheetBehavior2 = this.a;
            if (bottomSheetBehavior2.q && bottomSheetBehavior2.K(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior3 = this.a;
                    if (top <= (bottomSheetBehavior3.w + bottomSheetBehavior3.v()) / 2) {
                        BottomSheetBehavior bottomSheetBehavior4 = this.a;
                        if (bottomSheetBehavior4.a) {
                            i = bottomSheetBehavior4.l;
                        } else if (Math.abs(view.getTop() - this.a.v()) < Math.abs(view.getTop() - this.a.m)) {
                            i = this.a.v();
                        } else {
                            i = this.a.m;
                            i2 = 6;
                        }
                        i2 = 3;
                    }
                }
                i = this.a.w;
                i2 = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior5 = this.a;
                if (!bottomSheetBehavior5.a) {
                    int i3 = bottomSheetBehavior5.m;
                    if (top2 < i3) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior5.o)) {
                            i = this.a.v();
                        } else {
                            i = this.a.m;
                        }
                    } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.a.o)) {
                        i = this.a.m;
                    } else {
                        bottomSheetBehavior = this.a;
                        i = bottomSheetBehavior.o;
                    }
                    i2 = 6;
                } else if (Math.abs(top2 - bottomSheetBehavior5.l) < Math.abs(top2 - this.a.o)) {
                    i = this.a.l;
                } else {
                    i = this.a.o;
                }
                i2 = 3;
            } else {
                bottomSheetBehavior = this.a;
                if (!bottomSheetBehavior.a) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.a.m) < Math.abs(top3 - this.a.o)) {
                        i = this.a.m;
                        i2 = 6;
                    } else {
                        i = this.a.o;
                    }
                }
                i = bottomSheetBehavior.o;
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior6 = this.a;
            if (bottomSheetBehavior6.a) {
                i = bottomSheetBehavior6.l;
            } else {
                int top4 = view.getTop();
                System.currentTimeMillis();
                BottomSheetBehavior bottomSheetBehavior7 = this.a;
                int i4 = bottomSheetBehavior7.m;
                if (top4 > i4) {
                    i = i4;
                    i2 = 6;
                } else {
                    i = bottomSheetBehavior7.v();
                }
            }
            i2 = 3;
        }
        this.a.J(view, i2, i, true);
    }
}
