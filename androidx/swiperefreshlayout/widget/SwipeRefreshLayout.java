package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import defpackage.asc;
import defpackage.asg;
import defpackage.buw;
import defpackage.buz;
import defpackage.bva;
import defpackage.bvc;
import defpackage.bvd;
import defpackage.bve;
import defpackage.bvf;
import defpackage.bvg;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.ir;
import defpackage.is;
import defpackage.it;
import defpackage.iu;
import defpackage.iv;
import defpackage.jw;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements iu, it, ir, iv {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {R.attr.enabled};
    private final DecelerateInterpolator A;
    private int B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private int G;
    private Animation.AnimationListener H;
    private final Animation I;

    /* renamed from: J, reason: collision with root package name */
    private final Animation f78J;
    private final asc K;
    public bvi a;
    public boolean b;
    public int c;
    public buw d;
    public int e;
    public int f;
    public int g;
    public bva h;
    public boolean i;
    public boolean j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final is q;
    private final int[] r;
    private final int[] s;
    private final int[] t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private final Animation p(int i, int i2) {
        bve bveVar = new bve(this, i, i2);
        bveVar.setDuration(300L);
        buw buwVar = this.d;
        buwVar.a = null;
        buwVar.clearAnimation();
        this.d.startAnimation(bveVar);
        return bveVar;
    }

    private final void q() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void r(float f) {
        if (f > this.o) {
            u(true, true);
            return;
        }
        this.b = false;
        this.h.d(0.0f);
        bvf bvfVar = new bvf(this, 0);
        this.e = this.c;
        this.f78J.reset();
        this.f78J.setDuration(200L);
        this.f78J.setInterpolator(this.A);
        buw buwVar = this.d;
        buwVar.a = bvfVar;
        buwVar.clearAnimation();
        this.d.startAnimation(this.f78J);
        this.h.b(false);
    }

    private final void s(float f) {
        this.h.b(true);
        float min = Math.min(1.0f, Math.abs(f / this.o));
        double d = min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f);
        float f2 = this.o;
        float f3 = this.g;
        double max2 = Math.max(0.0f, Math.min(abs - f2, f3 + f3) / f3) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = (float) (max2 - pow);
        float f5 = f4 + f4;
        float f6 = f3 * f5;
        int i = this.f + ((int) ((f3 * min) + f6 + f6));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        if (f < this.o) {
            if (this.h.getAlpha() > 76 && !w(this.E)) {
                this.E = p(this.h.getAlpha(), 76);
            }
        } else if (this.h.getAlpha() < 255 && !w(this.F)) {
            this.F = p(this.h.getAlpha(), PrivateKeyType.INVALID);
        }
        this.h.d(Math.min(0.8f, max * 0.8f));
        this.h.c(Math.min(1.0f, max));
        bva bvaVar = this.h;
        bvaVar.a.g = (((max * 0.4f) - 0.25f) + f5 + f5) * 0.5f;
        bvaVar.invalidateSelf();
        m(i - this.c);
    }

    private final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            this.z = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void u(boolean z, boolean z2) {
        if (this.b != z) {
            this.i = z2;
            q();
            this.b = z;
            if (z) {
                int i = this.c;
                Animation.AnimationListener animationListener = this.H;
                this.e = i;
                this.I.reset();
                this.I.setDuration(200L);
                this.I.setInterpolator(this.A);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.I);
                return;
            }
            n(this.H);
        }
    }

    private final void v(float f) {
        float f2 = this.x;
        float f3 = this.n;
        if (f - f2 <= f3 || this.y) {
            return;
        }
        this.w = f2 + f3;
        this.y = true;
        this.h.setAlpha(76);
    }

    private static final boolean w(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // defpackage.it
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.it
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.q.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.q.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.q.f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.q.h(i, i2, i3, i4, iArr);
    }

    @Override // defpackage.it
    public final boolean e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.iu
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        this.q.i(i, i2, i3, i4, this.s, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = this.s[1] + i4;
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || o()) {
            return;
        }
        float abs = this.p + Math.abs(i8);
        this.p = abs;
        s(abs);
        iArr[1] = iArr[1] + i6;
    }

    public final void g(float f) {
        m((this.e + ((int) ((this.f - r0) * f))) - this.d.getTop());
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.B;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.K.c();
    }

    public final void h() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(PrivateKeyType.INVALID);
        this.h.setAlpha(PrivateKeyType.INVALID);
        m(this.f - this.c);
        this.c = this.d.getTop();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.q.j();
    }

    public final void i(float f) {
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.q.a;
    }

    public final void j(int... iArr) {
        q();
        bva bvaVar = this.h;
        bvaVar.a.c(iArr);
        bvaVar.a.h();
        bvaVar.invalidateSelf();
    }

    public final void k(int i) {
        this.d.setBackgroundColor(i);
    }

    @Override // defpackage.it
    public final void kp(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.it
    public final void kq(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.t);
    }

    public final void m(int i) {
        this.d.bringToFront();
        jw.E(this.d, i);
        this.c = this.d.getTop();
    }

    public final void n(Animation.AnimationListener animationListener) {
        bvd bvdVar = new bvd(this);
        this.D = bvdVar;
        bvdVar.setDuration(150L);
        buw buwVar = this.d;
        buwVar.a = animationListener;
        buwVar.clearAnimation();
        this.d.startAnimation(this.D);
    }

    public final boolean o() {
        View view = this.m;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || o() || this.b || this.u) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.z;
                    if (i == -1) {
                        Log.e(k, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        t(motionEvent);
                    }
                }
            }
            this.y = false;
            this.z = -1;
        } else {
            m(this.f - this.d.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.z = pointerId;
            this.y = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.x = motionEvent.getY(findPointerIndex2);
        }
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            q();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        buw buwVar = this.d;
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.c;
        buwVar.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            q();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        this.B = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.d) {
                this.B = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                s(f2);
            }
        }
        int[] iArr2 = this.r;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.t);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.K.f(i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.u = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        l(savedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.K.e(0);
        this.u = false;
        float f = this.p;
        if (f > 0.0f) {
            r(f);
            this.p = 0.0f;
        } else {
            post(new Runnable() { // from class: bvb
                @Override // java.lang.Runnable
                public final void run() {
                    SwipeRefreshLayout.this.h();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || o() || this.b || this.u) {
            return false;
        }
        if (actionMasked == 0) {
            this.z = motionEvent.getPointerId(0);
            this.y = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex < 0) {
                    Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.y) {
                    float y = motionEvent.getY(findPointerIndex);
                    float f = this.w;
                    this.y = false;
                    r((y - f) * 0.5f);
                }
                this.z = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex2 < 0) {
                    Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                v(y2);
                if (this.y) {
                    float f2 = (y2 - this.w) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    s(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.z = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    t(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.q.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.q.l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.q.b();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(10);
        final boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.r = new int[2];
        this.s = new int[2];
        this.t = new int[2];
        this.z = -1;
        this.B = -1;
        this.H = new bvf(this, 1);
        this.I = new bvg(this);
        this.f78J = new bvh(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.v = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.A = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.G = (int) (displayMetrics.density * 40.0f);
        this.d = new buw(getContext());
        bva bvaVar = new bva(getContext());
        this.h = bvaVar;
        buz buzVar = bvaVar.a;
        float f = bvaVar.b.getDisplayMetrics().density;
        buzVar.e(2.5f * f);
        buzVar.p = 7.5f * f;
        buzVar.h();
        buzVar.q = (int) (10.0f * f);
        buzVar.r = (int) (f * 5.0f);
        bvaVar.invalidateSelf();
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.o = i;
        this.K = new asc(null);
        this.q = new is(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.G;
        this.c = i2;
        this.f = i2;
        g(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public final void l(boolean z) {
        if (z) {
            if (!this.b) {
                this.b = true;
                m((this.g + this.f) - this.c);
                this.i = false;
                Animation.AnimationListener animationListener = this.H;
                this.d.setVisibility(0);
                this.h.setAlpha(PrivateKeyType.INVALID);
                bvc bvcVar = new bvc(this);
                this.C = bvcVar;
                bvcVar.setDuration(this.v);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.C);
                return;
            }
            z = true;
        }
        u(z, false);
    }
}
