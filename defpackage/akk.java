package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akk extends ic {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    public final AccessibilityManager b;
    public final View c;
    private akj k;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    int d = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    int e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    private int l = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public akk(View view) {
        if (view != null) {
            this.c = view;
            this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (jw.c(view) == 0) {
                jw.V(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private final AccessibilityEvent w(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            ks l = l(i);
            obtain.getText().add(l.f());
            obtain.setContentDescription(l.e());
            obtain.setScrollable(l.J());
            obtain.setPassword(l.I());
            obtain.setEnabled(l.G());
            obtain.setChecked(l.F());
            p(i, obtain);
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(l.d());
                obtain.setSource(this.c, i);
                obtain.setPackageName(this.c.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.c.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    private final void x(int i) {
        int i2 = this.l;
        if (i2 == i) {
            return;
        }
        this.l = i;
        v(i, 128);
        v(i2, 256);
    }

    @Override // defpackage.ic
    public kw a(View view) {
        if (this.k == null) {
            this.k = new akj(this);
        }
        return this.k;
    }

    protected abstract int k(float f2, float f3);

    protected abstract void m(List list);

    public final void n() {
        o(-1, 1);
    }

    public final void o(int i, int i2) {
        ViewParent parent;
        if (!this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return;
        }
        AccessibilityEvent w = w(i, 2048);
        w.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.c, w);
    }

    protected void p(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void q(int i, ks ksVar);

    public final boolean r(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.c.invalidate();
        v(i, 65536);
        return true;
    }

    public final boolean s(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        v(i, 8);
        return true;
    }

    public final boolean t(MotionEvent motionEvent) {
        if (this.b.isEnabled() && this.b.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int k = k(motionEvent.getX(), motionEvent.getY());
                x(k);
                if (k != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.l == Integer.MIN_VALUE) {
                    return false;
                }
                x(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean u(int i, int i2);

    public final void v(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(this.c, w(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ks l(int i) {
        if (i != -1) {
            ks b = ks.b();
            b.x(true);
            b.y(true);
            b.r("android.view.View");
            Rect rect = f;
            b.n(rect);
            b.o(rect);
            b.B(this.c);
            q(i, b);
            if (b.f() != null || b.e() != null) {
                b.j(this.h);
                b.k(this.g);
                if (!this.h.equals(rect) || !this.g.equals(rect)) {
                    int actions = b.b.getActions();
                    if ((actions & 64) != 0) {
                        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                    }
                    if ((actions & 128) != 0) {
                        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                    }
                    b.b.setPackageName(this.c.getContext().getPackageName());
                    View view = this.c;
                    b.d = i;
                    b.b.setSource(view, i);
                    if (this.d == i) {
                        b.l(true);
                        b.h(128);
                    } else {
                        b.l(false);
                        b.h(64);
                    }
                    boolean z = this.e == i;
                    if (z) {
                        b.h(2);
                    } else if (b.H()) {
                        b.h(1);
                    }
                    b.b.setFocused(z);
                    this.c.getLocationOnScreen(this.j);
                    if (this.g.equals(rect)) {
                        Rect rect2 = this.h;
                        b.n(rect2);
                        Rect rect3 = new Rect();
                        rect3.set(rect2);
                        if (b.c != -1) {
                            ks b2 = ks.b();
                            Rect rect4 = new Rect();
                            for (int i2 = b.c; i2 != -1; i2 = b2.c) {
                                View view2 = this.c;
                                b2.c = -1;
                                b2.b.setParent(view2, -1);
                                b2.n(f);
                                q(0, b2);
                                b2.j(rect4);
                                rect3.offset(rect4.left, rect4.top);
                            }
                            b2.b.recycle();
                        }
                        this.c.getLocationOnScreen(this.j);
                        rect3.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                        b.o(rect3);
                        b.k(this.g);
                    }
                    if (this.c.getLocalVisibleRect(this.i)) {
                        this.i.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                        if (this.g.intersect(this.i)) {
                            b.o(this.g);
                            Rect rect5 = this.g;
                            if (rect5 != null && !rect5.isEmpty() && this.c.getWindowVisibility() == 0) {
                                Object parent = this.c.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view3 = (View) parent;
                                        if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view3.getParent();
                                    } else if (parent != null) {
                                        b.E(true);
                                    }
                                }
                            }
                        }
                    }
                    return b;
                }
                throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        ks c = ks.c(AccessibilityNodeInfo.obtain(this.c));
        jw.F(this.c, c);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (c.b.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                c.b.addChild(this.c, ((Integer) arrayList.get(i3)).intValue());
            }
            return c;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }
}
