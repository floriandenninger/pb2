package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.ahd;
import defpackage.ahe;
import defpackage.ahh;
import defpackage.aii;
import defpackage.aleq;
import defpackage.alev;
import defpackage.alew;
import defpackage.alex;
import defpackage.aley;
import defpackage.alez;
import defpackage.alfa;
import defpackage.alfb;
import defpackage.alfc;
import defpackage.alfd;
import defpackage.alfm;
import defpackage.alfn;
import defpackage.alfo;
import defpackage.alfr;
import defpackage.algc;
import defpackage.alig;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.aloa;
import defpackage.gl;
import defpackage.ir;
import defpackage.jw;
import defpackage.ko;
import defpackage.kr;
import defpackage.maw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements ahd {
    private int a;
    public boolean b;
    public int c;
    public ko d;
    public boolean e;
    public final List f;
    public Drawable g;
    private int h;
    private int i;
    private int j;
    private List k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference o;
    private ValueAnimator p;
    private int[] q;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class BaseBehavior extends alfm {
        public int a;
        public alfa b;
        private int d;
        private ValueAnimator e;
        private int f;
        private boolean g;
        private float h;
        private WeakReference i;

        public BaseBehavior() {
            this.f = -1;
        }

        private final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int x = x();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                alfd alfdVar = (alfd) childAt.getLayoutParams();
                if (I(alfdVar.a, 32)) {
                    top -= alfdVar.topMargin;
                    bottom += alfdVar.bottomMargin;
                }
                int i2 = -x;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                alfd alfdVar2 = (alfd) childAt2.getLayoutParams();
                int i3 = alfdVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i5 += appBarLayout.f();
                    }
                    if (I(i3, 2)) {
                        i5 += jw.f(childAt2);
                    } else if (I(i3, 5)) {
                        int f = jw.f(childAt2) + i5;
                        if (x >= f) {
                            i5 = f;
                        } else {
                            i4 = f;
                        }
                    }
                    if (I(i3, 32)) {
                        i4 += alfdVar2.topMargin;
                        i5 -= alfdVar2.bottomMargin;
                    }
                    if (x < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    J(coordinatorLayout, appBarLayout, aii.c(i4, -appBarLayout.g(), 0));
                }
            }
        }

        private final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            jw.J(coordinatorLayout, kr.c.a());
            jw.J(coordinatorLayout, kr.d.a());
            View K = K(coordinatorLayout);
            if (K == null || appBarLayout.g() == 0 || !(((ahh) K.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (x() != (-appBarLayout.g()) && K.canScrollVertically(1)) {
                L(coordinatorLayout, appBarLayout, kr.c, false);
            }
            if (x() != 0) {
                if (K.canScrollVertically(-1)) {
                    int i = -appBarLayout.c();
                    if (i != 0) {
                        jw.at(coordinatorLayout, kr.d, new aley(this, coordinatorLayout, appBarLayout, K, i));
                        return;
                    }
                    return;
                }
                L(coordinatorLayout, appBarLayout, kr.d, true);
            }
        }

        private static boolean I(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(x() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int x = x();
            if (x == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.e.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(aleq.e);
                this.e.addUpdateListener(new alex(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration(Math.min(height, 600));
            this.e.setIntValues(x, i);
            this.e.start();
        }

        private static final View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof ir) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, kr krVar, boolean z) {
            jw.at(coordinatorLayout, krVar, new alez(appBarLayout, z));
        }

        private static final void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            boolean z2 = true;
            if (view != null) {
                int i4 = ((alfd) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int f = jw.f(view);
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.p(K(coordinatorLayout));
            }
            boolean o = appBarLayout.o(z2);
            if (!z) {
                if (o) {
                    ArrayList a = coordinatorLayout.e.a(appBarLayout);
                    List arrayList = a != null ? new ArrayList(a) : null;
                    if (arrayList == null) {
                        arrayList = Collections.emptyList();
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ahe aheVar = ((ahh) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (aheVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) aheVar).g == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // defpackage.alfm
        public final /* bridge */ /* synthetic */ boolean A(View view) {
            alfa alfaVar = this.b;
            if (alfaVar != null) {
                maw mawVar = alfaVar.a.g;
                if (mawVar.k && !mawVar.v()) {
                    return true;
                }
            } else {
                WeakReference weakReference = this.i;
                if (weakReference == null) {
                    return true;
                }
                View view2 = (View) weakReference.get();
                if (view2 != null && view2.isShown() && !view2.canScrollVertically(-1)) {
                    return true;
                }
            }
            return false;
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.g();
                    i2 = i4;
                    i3 = appBarLayout.c() + i4;
                } else {
                    i2 = -appBarLayout.g();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = C(coordinatorLayout, appBarLayout, i, i2, i3);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.o(appBarLayout.p(view));
            }
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            B(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = C(coordinatorLayout, appBarLayout, i4, -appBarLayout.d(), 0);
            }
            if (i4 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.o(appBarLayout.p(view2));
                }
            }
            this.i = new WeakReference(view2);
        }

        @Override // defpackage.alfp, defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.c;
            int i3 = this.f;
            if (i3 >= 0 && (i2 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.g) {
                    round = jw.f(childAt) + appBarLayout.f();
                } else {
                    round = Math.round(childAt.getHeight() * this.h);
                }
                D(coordinatorLayout, appBarLayout, i4 + round);
            } else if (i2 != 0) {
                int i5 = i2 & 4;
                if ((i2 & 2) != 0) {
                    int i6 = -appBarLayout.g();
                    if (i5 != 0) {
                        J(coordinatorLayout, appBarLayout, i6);
                    } else {
                        D(coordinatorLayout, appBarLayout, i6);
                    }
                } else if ((i2 & 1) != 0) {
                    if (i5 != 0) {
                        J(coordinatorLayout, appBarLayout, 0);
                    } else {
                        D(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.c = 0;
            this.f = -1;
            F(aii.c(E(), -appBarLayout.g(), 0));
            M(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.j(E());
            H(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z = true;
            if (i3 == 0 || (!appBarLayout.e && (appBarLayout.g() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            }
            if (z && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            this.i = null;
            this.d = i2;
            return z;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ahh) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.o(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.f = savedState.a;
            this.h = savedState.b;
            this.g = savedState.e;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int E = E();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.a = i;
                    savedState.e = bottom == jw.f(childAt) + appBarLayout.f();
                    savedState.b = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // defpackage.alfm
        public final /* bridge */ /* synthetic */ int v(View view) {
            return -((AppBarLayout) view).d();
        }

        @Override // defpackage.alfm
        public final /* synthetic */ int w(View view) {
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.alfm
        public final int x() {
            return E() + this.a;
        }

        @Override // defpackage.alfm
        public final /* bridge */ /* synthetic */ int y(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int x = x();
            int i6 = 0;
            if (i2 == 0 || x < i2 || x > i3) {
                this.a = 0;
            } else {
                int c = aii.c(i, i2, i3);
                if (x != c) {
                    if (appBarLayout.b) {
                        int abs = Math.abs(c);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            alfd alfdVar = (alfd) childAt.getLayoutParams();
                            Interpolator interpolator = alfdVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = alfdVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + alfdVar.topMargin + alfdVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= jw.f(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (jw.af(childAt)) {
                                    i5 -= appBarLayout.f();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(c) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = c;
                    boolean F = F(i4);
                    int i9 = x - c;
                    this.a = c - i4;
                    if (F) {
                        for (int i10 = 0; i10 < appBarLayout.getChildCount(); i10++) {
                            alfd alfdVar2 = (alfd) appBarLayout.getChildAt(i10).getLayoutParams();
                            alfc alfcVar = alfdVar2.b;
                            if (alfcVar != null && (alfdVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                int E = E();
                                Rect rect = alfcVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.f());
                                float abs2 = alfcVar.a.top - Math.abs(E);
                                if (abs2 <= 0.0f) {
                                    float d = 1.0f - aii.d(Math.abs(abs2 / alfcVar.a.height()));
                                    float height = (-abs2) - ((alfcVar.a.height() * 0.3f) * (1.0f - (d * d)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(alfcVar.b);
                                    alfcVar.b.offset(0, (int) (-height));
                                    jw.R(childAt2, alfcVar.b);
                                } else {
                                    jw.R(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.b) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.j(E());
                    M(coordinatorLayout, appBarLayout, c, c < x ? -1 : 1, false);
                    i6 = i9;
                }
            }
            H(coordinatorLayout, appBarLayout);
            return i6;
        }

        @Override // defpackage.alfm
        public final /* bridge */ /* synthetic */ void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.o(appBarLayout.p(K(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = -1;
        }

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator CREATOR = new algc(1);
            int a;
            float b;
            boolean e;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ScrollingViewBehavior extends alfn {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout z(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.ahe
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ahe aheVar = ((ahh) view2.getLayoutParams()).a;
            if (aheVar instanceof BaseBehavior) {
                jw.E(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aheVar).a) + this.f) - A(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.e) {
                return false;
            }
            appBarLayout.o(appBarLayout.p(view));
            return false;
        }

        @Override // defpackage.alfp, defpackage.ahe
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.h(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.ahe
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout z2 = z(coordinatorLayout.h(view));
            if (z2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    z2.m(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ahe
        public boolean n(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.ahe
        public final void o(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                jw.J(coordinatorLayout, kr.c.a());
                jw.J(coordinatorLayout, kr.d.a());
            }
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            ko koVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View y = y(coordinatorLayout.h(view));
            if (y == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (jw.af(y) && (koVar = coordinatorLayout.f) != null) {
                    size += koVar.f() + koVar.c();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int x = size + x(y);
            int measuredHeight = y.getMeasuredHeight();
            if (v()) {
                view.setTranslationY(-measuredHeight);
            } else {
                x -= measuredHeight;
            }
            coordinatorLayout.o(view, i, i2, View.MeasureSpec.makeMeasureSpec(x, i4 == -1 ? 1073741824 : CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
            return true;
        }

        @Override // defpackage.alfn
        public final float w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int g = appBarLayout.g();
                int c = appBarLayout.c();
                ahe aheVar = ((ahh) appBarLayout.getLayoutParams()).a;
                int x = aheVar instanceof BaseBehavior ? ((BaseBehavior) aheVar).x() : 0;
                if ((c == 0 || g + x > c) && (i = g - c) != 0) {
                    return (x / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.alfn
        public final int x(View view) {
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.alfn
        public final /* bridge */ /* synthetic */ View y(List list) {
            return z(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alfo.f);
            this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private final void b() {
        this.h = -1;
        this.i = -1;
        this.j = -1;
    }

    protected static final alfd q() {
        return new alfd();
    }

    protected static final alfd r(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new alfd((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new alfd(layoutParams);
        }
        return new alfd((LinearLayout.LayoutParams) layoutParams);
    }

    private final void s(boolean z, boolean z2, boolean z3) {
        this.c = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    private final boolean t() {
        return this.g != null && f() > 0;
    }

    private final boolean u() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !jw.af(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahd
    public final ahe a() {
        return new Behavior();
    }

    final int c() {
        int i;
        int f;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            alfd alfdVar = (alfd) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = alfdVar.a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = alfdVar.topMargin + alfdVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    f = jw.f(childAt);
                } else if ((i4 & 2) != 0) {
                    f = measuredHeight - jw.f(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && jw.af(childAt)) {
                        i = Math.min(i, measuredHeight - f());
                    }
                    i3 += i;
                }
                i = i5 + f;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - f());
                }
                i3 += i;
            }
        }
        int max = Math.max(0, i3);
        this.i = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof alfd;
    }

    final int d() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            alfd alfdVar = (alfd) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + alfdVar.topMargin + alfdVar.bottomMargin;
            int i4 = alfdVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= jw.f(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.j = max;
        return max;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int e() {
        int f = f();
        int f2 = jw.f(this);
        if (f2 == 0) {
            int childCount = getChildCount();
            f2 = childCount > 0 ? jw.f(getChildAt(childCount - 1)) : 0;
            if (f2 == 0) {
                return getHeight() / 3;
            }
        }
        return f2 + f2 + f;
    }

    final int f() {
        ko koVar = this.d;
        if (koVar != null) {
            return koVar.f();
        }
        return 0;
    }

    public final int g() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            alfd alfdVar = (alfd) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = alfdVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + alfdVar.topMargin + alfdVar.bottomMargin;
            if (i2 == 0) {
                if (jw.af(childAt)) {
                    i3 -= f();
                }
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 -= jw.f(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.h = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return q();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final alfd generateLayoutParams(AttributeSet attributeSet) {
        return new alfd(getContext(), attributeSet);
    }

    public final void i(alfb alfbVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (alfbVar == null || this.k.contains(alfbVar)) {
            return;
        }
        this.k.add(alfbVar);
    }

    final void j(int i) {
        this.a = i;
        if (!willNotDraw()) {
            jw.G(this);
        }
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                alfb alfbVar = (alfb) this.k.get(i2);
                if (alfbVar != null) {
                    alfbVar.a(this, i);
                }
            }
        }
    }

    public final void k(alfb alfbVar) {
        List list = this.k;
        if (list == null || alfbVar == null) {
            return;
        }
        list.remove(alfbVar);
    }

    public final void l(boolean z) {
        m(z, jw.al(this));
    }

    public final void m(boolean z, boolean z2) {
        s(z, z2, true);
    }

    public final void n() {
        setWillNotDraw(!t());
    }

    final boolean o(boolean z) {
        if (this.m == z) {
            return false;
        }
        this.m = z;
        refreshDrawableState();
        if (this.e && (getBackground() instanceof alkg)) {
            alkg alkgVar = (alkg) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = true != z ? dimension : 0.0f;
            if (true != z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.p = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.p.setInterpolator(aleq.a);
            this.p.addUpdateListener(new alew(this, alkgVar));
            this.p.start();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alkd.B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.l;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970163 : R.attr.state_liftable;
        if (z2) {
            r3 = this.m ? R.attr.state_lifted : -2130970164;
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = r3;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970161;
        int i2 = -2130970160;
        if (z && this.m) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = defpackage.jw.af(r1)
            if (r2 == 0) goto L23
            boolean r2 = r1.u()
            if (r2 == 0) goto L23
            int r2 = r1.f()
            int r3 = r1.getChildCount()
        L17:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            defpackage.jw.E(r4, r2)
            goto L17
        L23:
            r1.b()
            r2 = 0
            r1.b = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L2e:
            r5 = 1
            if (r4 >= r3) goto L45
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            alfd r6 = (defpackage.alfd) r6
            android.view.animation.Interpolator r6 = r6.c
            if (r6 == 0) goto L42
            r1.b = r5
            goto L45
        L42:
            int r4 = r4 + 1
            goto L2e
        L45:
            android.graphics.drawable.Drawable r3 = r1.g
            if (r3 == 0) goto L54
            int r4 = r1.getWidth()
            int r6 = r1.f()
            r3.setBounds(r2, r2, r4, r6)
        L54:
            boolean r3 = r1.e
            if (r3 != 0) goto L77
            int r3 = r1.getChildCount()
            r4 = 0
        L5d:
            if (r4 >= r3) goto L78
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            alfd r6 = (defpackage.alfd) r6
            int r6 = r6.a
            r0 = r6 & 1
            if (r0 != r5) goto L74
            r6 = r6 & 10
            if (r6 == 0) goto L74
            goto L77
        L74:
            int r4 = r4 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            boolean r3 = r1.l
            if (r3 == r2) goto L81
            r1.l = r2
            r1.refreshDrawableState()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && jw.af(this) && u()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = aii.c(getMeasuredHeight() + f(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += f();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        b();
    }

    final boolean p(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        alkd.A(this, f);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return q();
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.c = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = alfr.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = alfr.a;
        Context context3 = getContext();
        TypedArray a = alig.a(context3, attributeSet, alfr.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = alig.a(context2, attributeSet, alfo.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            jw.O(this, a2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                alkg alkgVar = new alkg();
                alkgVar.l(ColorStateList.valueOf(colorDrawable.getColor()));
                alkgVar.j(context2);
                jw.O(this, alkgVar);
            }
            if (a2.hasValue(4)) {
                s(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                alfr.a(this, a2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.hasValue(2)) {
                    setKeyboardNavigationCluster(a2.getBoolean(2, false));
                }
                if (a2.hasValue(1)) {
                    setTouchscreenBlocksFocus(a2.getBoolean(1, false));
                }
            }
            this.e = a2.getBoolean(5, false);
            this.n = a2.getResourceId(6, -1);
            Drawable drawable = a2.getDrawable(7);
            Drawable drawable2 = this.g;
            if (drawable2 != drawable) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                this.g = mutate;
                if (mutate != null) {
                    if (mutate.isStateful()) {
                        this.g.setState(getDrawableState());
                    }
                    gl.e(this.g, jw.e(this));
                    this.g.setVisible(getVisibility() == 0, false);
                    this.g.setCallback(this);
                }
                n();
                jw.G(this);
            }
            a2.recycle();
            jw.X(this, new alev(this));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return r(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return r(layoutParams);
    }
}
