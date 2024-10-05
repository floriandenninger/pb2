package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.asc;
import defpackage.bg;
import defpackage.ir;
import defpackage.is;
import defpackage.iu;
import defpackage.ji;
import defpackage.jw;
import defpackage.lm;
import defpackage.ln;
import java.util.ArrayList;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements iu, ir {
    private static final lm d = new lm();
    private static final int[] e = {R.attr.fillViewport};
    private float A;
    private final asc B;
    public EdgeEffect a;
    public EdgeEffect b;
    public ln c;
    private long f;
    private final Rect g;
    private OverScroller h;
    private int i;
    private boolean j;
    private boolean k;
    private View l;
    private boolean m;
    private VelocityTracker n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] u;
    private final int[] v;
    private int w;
    private int x;
    private SavedState y;
    private final is z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final void A(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.i(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private final void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.t) {
            int i = actionIndex == 0 ? 1 : 0;
            this.i = (int) motionEvent.getY(i);
            this.t = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void C() {
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    private final void D(boolean z) {
        if (z) {
            p(2, 1);
        } else {
            j(1);
        }
        this.x = getScrollY();
        jw.G(this);
    }

    private final void E(View view) {
        view.getDrawingRect(this.g);
        offsetDescendantRectToMyCoords(view, this.g);
        int g = g(this.g);
        if (g != 0) {
            scrollBy(0, g);
        }
    }

    private final boolean F(View view) {
        return !H(view, 0, getHeight());
    }

    private static boolean G(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && G((View) parent, view2);
    }

    private final boolean H(View view, int i, int i2) {
        view.getDrawingRect(this.g);
        offsetDescendantRectToMyCoords(view, this.g);
        return this.g.bottom + i >= getScrollY() && this.g.top - i <= getScrollY() + i2;
    }

    private final boolean I(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z3 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            x(i == 33 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    private final boolean J(MotionEvent motionEvent) {
        boolean z;
        if (ji.d(this.a) != 0.0f) {
            ji.e(this.a, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        } else {
            z = false;
        }
        if (ji.d(this.b) == 0.0f) {
            return z;
        }
        ji.e(this.b, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
        return true;
    }

    private final void K(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i3 = layoutParams.topMargin;
            int i4 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
            D(z);
        } else {
            if (!this.h.isFinished()) {
                w();
            }
            scrollBy(i, i2);
        }
        this.f = AnimationUtils.currentAnimationTimeMillis();
    }

    private static int v(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private final void w() {
        this.h.abortAnimation();
        j(1);
    }

    private final void x(int i) {
        if (i != 0) {
            if (this.p) {
                s(i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private final void y() {
        this.m = false;
        C();
        j(0);
        this.a.onRelease();
        this.b.onRelease();
    }

    private final void z() {
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // defpackage.it
    public final void c(View view, View view2, int i, int i2) {
        this.B.d(i, i2);
        p(2, i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.isFinished()) {
            return;
        }
        this.h.computeScrollOffset();
        int currY = this.h.getCurrY();
        int i = currY - this.x;
        this.x = currY;
        int[] iArr = this.v;
        iArr[1] = 0;
        l(0, i, iArr, null, 1);
        int i2 = i - this.v[1];
        int h = h();
        if (i2 != 0) {
            int scrollY = getScrollY();
            kr(i2, getScrollX(), scrollY, h);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.v;
            iArr2[1] = 0;
            q(scrollY2, i3, this.u, 1, iArr2);
            i2 = i3 - this.v[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && h > 0)) {
                if (i2 < 0) {
                    if (this.a.isFinished()) {
                        this.a.onAbsorb((int) this.h.getCurrVelocity());
                    }
                } else if (this.b.isFinished()) {
                    this.b.onAbsorb((int) this.h.getCurrVelocity());
                }
            }
            w();
        }
        if (!this.h.isFinished()) {
            jw.G(this);
        } else {
            j(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    @Override // defpackage.it
    public final void d(View view, int i) {
        this.B.e(i);
        j(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.z.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.z.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return l(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.z.h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.a.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.a.setSize(width, height);
            if (this.a.draw(canvas)) {
                jw.G(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.b.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(h(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.b.setSize(width2, height2);
        if (this.b.draw(canvas)) {
            jw.G(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // defpackage.it
    public final boolean e(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // defpackage.iu
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        A(i4, i5, iArr);
    }

    protected final int g(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom <= i4 || rect.top <= scrollY) {
            if (rect.top >= scrollY || rect.bottom >= i4) {
                return 0;
            }
            if (rect.height() > height) {
                i = -(i4 - rect.bottom);
            } else {
                i = -(scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
        if (rect.height() > height) {
            i2 = rect.top - scrollY;
        } else {
            i2 = rect.bottom - i4;
        }
        return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.c();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return o(0);
    }

    public void i(int i) {
        if (getChildCount() > 0) {
            this.h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE, 0, 0);
            D(true);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.a;
    }

    public final void j(int i) {
        this.z.c(i);
    }

    public final boolean k(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !H(findNextFocus, height, getHeight())) {
            if (i != 33 || getScrollY() >= height) {
                if (i == 130 && getChildCount() > 0) {
                    View childAt = getChildAt(0);
                    height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
                }
            } else {
                height = getScrollY();
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            x(height);
        } else {
            findNextFocus.getDrawingRect(this.g);
            offsetDescendantRectToMyCoords(findNextFocus, this.g);
            x(g(this.g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !F(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // defpackage.it
    public final void kp(View view, int i, int i2, int[] iArr, int i3) {
        l(i, i2, iArr, null, i3);
    }

    @Override // defpackage.it
    public final void kq(View view, int i, int i2, int i3, int i4, int i5) {
        A(i4, i5, null);
    }

    final boolean kr(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        boolean z2 = i2 > 0 || i2 < 0;
        if (i5 > i4) {
            z = true;
        } else if (i5 < 0) {
            z = true;
            i4 = 0;
        } else {
            i4 = i5;
            z = false;
        }
        if (z && !o(1)) {
            this.h.springBack(0, i4, 0, 0, 0, h());
        }
        super.scrollTo(0, i4);
        return z2 || z;
    }

    public final boolean l(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.z.g(i, i2, iArr, iArr2, i3);
    }

    public final boolean m(KeyEvent keyEvent) {
        this.g.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    if (!keyEvent.isAltPressed()) {
                        return k(33);
                    }
                    return n(33);
                }
                if (keyCode == 20) {
                    if (!keyEvent.isAltPressed()) {
                        return k(130);
                    }
                    return n(130);
                }
                if (keyCode != 62) {
                    return false;
                }
                int i = true != keyEvent.isShiftPressed() ? 130 : 33;
                int height = getHeight();
                if (i == 130) {
                    this.g.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                        if (this.g.top + height > bottom) {
                            this.g.top = bottom - height;
                        }
                    }
                } else {
                    this.g.top = getScrollY() - height;
                    if (this.g.top < 0) {
                        this.g.top = 0;
                    }
                }
                Rect rect = this.g;
                rect.bottom = rect.top + height;
                I(i, this.g.top, this.g.bottom);
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i) {
        int childCount;
        int height = getHeight();
        this.g.top = 0;
        this.g.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.g;
            rect.top = rect.bottom - height;
        }
        return I(i, this.g.top, this.g.bottom);
    }

    public final boolean o(int i) {
        return this.z.k(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.m) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f = this.A;
                if (f == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    f = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    this.A = f;
                }
                int h = h();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * f));
                if (i < 0) {
                    h = 0;
                } else if (i <= h) {
                    h = i;
                }
                if (h != scrollY) {
                    super.scrollTo(getScrollX(), h);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.m) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.t;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.i) > this.q && (2 & getNestedScrollAxes()) == 0) {
                                this.m = true;
                                this.i = y;
                                z();
                                this.n.addMovement(motionEvent);
                                this.w = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        B(motionEvent);
                    }
                }
            }
            this.m = false;
            this.t = -1;
            C();
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, h())) {
                jw.G(this);
            }
            j(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.i = y2;
                    this.t = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.n;
                    if (velocityTracker == null) {
                        this.n = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.n.addMovement(motionEvent);
                    this.h.computeScrollOffset();
                    if (!J(motionEvent) && this.h.isFinished()) {
                        z = false;
                    }
                    this.m = z;
                    p(2, 0);
                }
            }
            if (!J(motionEvent) && this.h.isFinished()) {
                z = false;
            }
            this.m = z;
            C();
        }
        return this.m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.j = false;
        View view = this.l;
        if (view != null && G(view, this)) {
            E(this.l);
        }
        this.l = null;
        if (!this.k) {
            if (this.y != null) {
                scrollTo(getScrollX(), this.y.a);
                this.y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int v = v(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (v != scrollY) {
                scrollTo(getScrollX(), v);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.o && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        i((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        kp(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || F(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.y = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getScrollY();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ln lnVar = this.c;
        if (lnVar != null) {
            lnVar.a(this, i, i2);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !H(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.g);
        offsetDescendantRectToMyCoords(findFocus, this.g);
        x(g(this.g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i, int i2) {
        return this.z.m(i, i2);
    }

    public final void q(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.z.i(0, i, 0, i2, iArr, i3, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.j) {
            this.l = view2;
        } else {
            E(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int g = g(rect);
        boolean z2 = g != 0;
        if (z2) {
            if (z) {
                scrollBy(0, g);
            } else {
                s(g);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            C();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    public final void s(int i) {
        K(0, i, false);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int v = v(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int v2 = v(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (v == getScrollX() && v2 == getScrollY()) {
                return;
            }
            super.scrollTo(v, v2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.z.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return p(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        j(0);
    }

    public final void t(int i, boolean z) {
        K(-getScrollX(), i - getScrollY(), z);
    }

    public final void u(int i) {
        t(i, true);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bg(16);
        public int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
        this.j = true;
        this.k = false;
        this.l = null;
        this.m = false;
        this.p = true;
        this.t = -1;
        this.u = new int[2];
        this.v = new int[2];
        this.a = ji.f(context, attributeSet);
        this.b = ji.f(context, attributeSet);
        this.h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.q = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.o) {
            this.o = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.B = new asc(null);
        this.z = new is(this);
        setNestedScrollingEnabled(true);
        jw.M(this, d);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
