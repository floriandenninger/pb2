package com.google.android.libraries.social.ui.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import defpackage.abht;
import defpackage.abpc;
import defpackage.rrw;
import defpackage.vag;
import defpackage.vah;
import defpackage.vai;
import defpackage.vaj;
import defpackage.vak;
import defpackage.val;
import defpackage.van;
import defpackage.vao;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpandingScrollView extends vao {
    public static final vak a = new vak(Arrays.asList(vaj.COLLAPSED, vaj.EXPANDED, vaj.FULLY_EXPANDED));
    public static final vak b = new val();
    private static boolean s;
    private final float[] A;
    private final Set B;
    public int c;
    public boolean d;
    EnumSet e;
    public vaj f;
    final Set g;
    final Set h;
    public View i;
    private final int t;
    private van u;
    private vak v;
    private vak w;
    private vak x;
    private vaj y;
    private vaj z;

    static {
        new vak(Arrays.asList(vaj.HIDDEN, vaj.EXPANDED));
        new vak(Arrays.asList(vaj.COLLAPSED, vaj.EXPANDED));
    }

    public ExpandingScrollView(Context context) {
        super(context);
        this.d = true;
        this.e = EnumSet.of(vaj.EXPANDED);
        vak vakVar = a;
        this.v = vakVar;
        this.w = vakVar;
        this.x = b;
        this.f = vaj.HIDDEN;
        this.A = new float[vaj.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new van(this, new vag(this, 1), new vag(this, 0));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }

    public static /* synthetic */ void j(ExpandingScrollView expandingScrollView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (expandingScrollView.o == null) {
            expandingScrollView.o = VelocityTracker.obtain();
        }
        expandingScrollView.o.addMovement(motionEvent);
        if (!expandingScrollView.p) {
            if (!super.n(motionEvent) && action == 1 && expandingScrollView.q) {
                expandingScrollView.q = false;
                expandingScrollView.performClick();
                return;
            }
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float f = expandingScrollView.j[1];
                expandingScrollView.m(motionEvent);
                expandingScrollView.k(expandingScrollView.getScrollY() + Math.round(f - expandingScrollView.j[1]));
                expandingScrollView.q = false;
                return;
            }
            if (action != 3) {
                return;
            }
        }
        expandingScrollView.p = false;
        if (action == 3 || expandingScrollView.getChildCount() <= 0) {
            expandingScrollView.g(0.0f);
        } else {
            expandingScrollView.o.computeCurrentVelocity(1000, expandingScrollView.l);
            float yVelocity = expandingScrollView.o.getYVelocity();
            if (yVelocity > expandingScrollView.m || yVelocity < (-r1)) {
                float f2 = -yVelocity;
                expandingScrollView.n = f2;
                int scrollX = expandingScrollView.getScrollX();
                int scrollY = expandingScrollView.getScrollY();
                Scroller scroller = expandingScrollView.r;
                int[] iArr = expandingScrollView.k;
                scroller.fling(scrollX, scrollY, 0, (int) f2, 0, 0, iArr[0], iArr[1]);
                expandingScrollView.invalidate();
            } else {
                expandingScrollView.g(0.0f);
            }
        }
        VelocityTracker velocityTracker = expandingScrollView.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            expandingScrollView.o = null;
        }
        expandingScrollView.q = false;
    }

    private final void p(vaj vajVar) {
        vaj vajVar2 = this.f;
        this.f = vajVar;
        q();
        if (this.f != vajVar2) {
            for (abpc abpcVar : this.B) {
                vaj vajVar3 = this.f;
                if (vajVar3 == vaj.COLLAPSED || vajVar3 == vaj.FULLY_EXPANDED) {
                    if (vajVar2 == vaj.COLLAPSED || vajVar2 == vaj.FULLY_EXPANDED) {
                        boolean z = vajVar3 == vaj.FULLY_EXPANDED;
                        abht abhtVar = (abht) abpcVar.a.get();
                        if (z) {
                            abhtVar.v(abpcVar.c.d);
                        } else {
                            abhtVar.r();
                        }
                        abpcVar.b.b(abpcVar.c, z);
                    }
                }
            }
        }
    }

    private final void q() {
        if (this.f == vaj.HIDDEN) {
            int a2 = a(vaj.HIDDEN);
            l(a2, a2);
            return;
        }
        vaj vajVar = (vaj) Collections.max(this.v.a);
        vaj vajVar2 = vaj.COLLAPSED;
        Iterator it = this.v.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vaj vajVar3 = (vaj) it.next();
            if (!vajVar3.equals(vaj.HIDDEN)) {
                vajVar2 = vajVar3;
                break;
            }
        }
        l(a(vajVar2), a(vajVar));
    }

    private final void r(Configuration configuration) {
        this.v = configuration.orientation == 2 ? this.x : this.w;
        i(this.f, false);
    }

    public final int a(vaj vajVar) {
        return Math.round((this.c * this.A[vajVar.ordinal()]) / 100.0f);
    }

    public final vaj b(vaj vajVar) {
        return this.v.a(vajVar.f);
    }

    public final vaj c(vaj vajVar) {
        return this.v.b(vajVar);
    }

    @Override // defpackage.vao
    public final void d() {
        for (abpc abpcVar : this.B) {
        }
    }

    @Override // defpackage.vao
    public final void e() {
        for (abpc abpcVar : this.B) {
        }
    }

    public final void f(vaj vajVar) {
        i(vajVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vao
    public final void g(float f) {
        vaj vajVar;
        vaj c;
        if (this.f == vaj.HIDDEN) {
            return;
        }
        if (Math.abs(f) > this.t) {
            int scrollY = (int) ((f * 0.3f) + getScrollY());
            vajVar = null;
            int i = Integer.MAX_VALUE;
            for (vaj vajVar2 : this.v.a) {
                int abs = Math.abs(a(vajVar2) - scrollY);
                int i2 = abs < i ? abs : i;
                if (abs < i) {
                    vajVar = vajVar2;
                }
                i = i2;
            }
        } else {
            vajVar = this.f;
            if (getScrollY() > a(this.f)) {
                c = b(this.f);
            } else {
                c = c(this.f);
            }
            vaj vajVar3 = this.f;
            if (c != vajVar3) {
                int a2 = a(vajVar3);
                if ((getScrollY() - a2) / (a(c) - a2) > 0.2f) {
                    vajVar = c;
                }
            }
        }
        f(vajVar);
    }

    public final void h() {
        for (vaj vajVar : vaj.values()) {
            this.A[vajVar.ordinal()] = vajVar.g;
        }
    }

    public final void i(vaj vajVar, boolean z) {
        char c = true != z ? (char) 0 : (char) 500;
        vaj a2 = this.v.a(vajVar);
        p(a2);
        int a3 = a(a2);
        if (c > 0) {
            o(a3, false);
        } else {
            k(a3);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vaj vajVar = this.f;
        r(configuration);
        vaj vajVar2 = this.f;
        if (vajVar2 != vajVar) {
            this.y = vajVar;
            this.z = vajVar2;
        } else {
            vaj vajVar3 = this.y;
            if (vajVar3 != null && this.v.a.contains(vajVar3)) {
                if (this.f == this.z) {
                    i(this.y, false);
                }
                this.y = null;
                this.z = null;
            }
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((vah) it.next()).a();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 0 || this.i != null) {
            return;
        }
        View childAt = getChildAt(0);
        removeAllViews();
        this.u.e.b();
        this.i = childAt;
        if (childAt != null) {
            addView(childAt);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.vao, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = (i4 - i2) / 2;
        int i6 = this.c;
        if (i6 != i5) {
            this.c = i5;
            z2 = true;
        } else {
            i5 = i6;
            z2 = false;
        }
        int i7 = i3 - i;
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(getPaddingLeft(), i5, i7 - getPaddingRight(), measuredHeight);
            i8++;
            i5 = measuredHeight;
        }
        KeyEvent.Callback callback = this.i;
        if (!(callback instanceof vai) || ((vai) callback).a()) {
            View findViewById = findViewById(0);
            if ((findViewById == null ? 0 : findViewById.getHeight()) > 0) {
                vaj vajVar = vaj.COLLAPSED;
                float min = (Math.min(r7, this.c) * 100.0f) / this.c;
                int ordinal = vajVar.ordinal();
                if (this.A[ordinal] != min) {
                    vaj c = c(vajVar);
                    if (vajVar == c || min >= this.A[c.ordinal()]) {
                        vaj b2 = b(vajVar);
                        if (vajVar == b2 || min <= this.A[b2.ordinal()]) {
                            this.A[ordinal] = min;
                            q();
                            if (this.p) {
                                int scrollY = getScrollY();
                                while (scrollY < a(c(this.f))) {
                                    vaj vajVar2 = this.f;
                                    if (vajVar2 == c(vajVar2)) {
                                        break;
                                    } else {
                                        p(c(this.f));
                                    }
                                }
                                while (scrollY > a(b(this.f))) {
                                    vaj vajVar3 = this.f;
                                    if (vajVar3 == b(vajVar3)) {
                                        break;
                                    } else {
                                        p(b(this.f));
                                    }
                                }
                            } else if (this.f == vajVar) {
                                o(a(vajVar), true);
                            }
                        } else {
                            throw new IllegalArgumentException("exposure percentage more than next state");
                        }
                    } else {
                        throw new IllegalArgumentException("exposure percentage less than previous state");
                    }
                }
            }
        }
        q();
        if (z2) {
            i(this.f, false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((size * this.A[vaj.FULLY_EXPANDED.ordinal()]) / 100.0f), 1073741824);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, makeMeasureSpec);
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + size);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.a;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f, this.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        if (r2 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        if (r0.k == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e8, code lost:
    
        if (r1 > r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f3, code lost:
    
        if (r1 > r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    @Override // defpackage.vao, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.B.isEmpty()) {
            return;
        }
        Set<abpc> set = this.B;
        int scrollY = getScrollY();
        int i3 = 0;
        vaj vajVar = vaj.values()[0];
        vaj[] values = vaj.values();
        int length = values.length;
        while (i3 < length) {
            vaj vajVar2 = values[i3];
            if (scrollY < a(vajVar2)) {
                break;
            }
            i3++;
            vajVar = vajVar2;
        }
        if (this.A[vajVar.ordinal()] == 100.0f) {
            for (abpc abpcVar : set) {
            }
        } else {
            a(vajVar);
            a(vajVar == vaj.HIDDEN ? vaj.COLLAPSED : b(vajVar));
            for (abpc abpcVar2 : set) {
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new rrw(15);
        public final vaj a;
        private final float[] b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = vaj.a(parcel.readString());
            this.b = parcel.createFloatArray();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.toString());
            parcel.writeFloatArray(this.b);
        }

        public SavedState(Parcelable parcelable, vaj vajVar, float[] fArr) {
            super(parcelable);
            this.a = vajVar;
            this.b = fArr;
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = EnumSet.of(vaj.EXPANDED);
        vak vakVar = a;
        this.v = vakVar;
        this.w = vakVar;
        this.x = b;
        this.f = vaj.HIDDEN;
        this.A = new float[vaj.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new van(this, new vag(this, 1), new vag(this, 0));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = EnumSet.of(vaj.EXPANDED);
        vak vakVar = a;
        this.v = vakVar;
        this.w = vakVar;
        this.x = b;
        this.f = vaj.HIDDEN;
        this.A = new float[vaj.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new van(this, new vag(this, 1), new vag(this, 0));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }
}
