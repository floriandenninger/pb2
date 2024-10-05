package android.support.v4.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.azuj;
import defpackage.azul;
import defpackage.ba;
import defpackage.ce;
import defpackage.cn;
import defpackage.dd;
import defpackage.dj;
import defpackage.dn;
import defpackage.jw;
import defpackage.ko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public boolean a;
    private final List b;
    private final List c;
    private View.OnApplyWindowInsetsListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    private final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof ce ? (ce) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ko t;
        int childCount;
        windowInsets.getClass();
        ko q = ko.q(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            t = ko.q(onApplyWindowInsets);
        } else {
            t = jw.t(this, q);
        }
        if (!t.x() && (childCount = getChildCount()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                jw.r(getChildAt(i), t);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.a && !this.b.isEmpty() && this.b.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
                if (i < 0) {
                    break;
                } else {
                    childCount = i;
                }
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                childAt.getClass();
                a(childAt);
                if (i5 >= i3) {
                    break;
                } else {
                    i4 = i5;
                }
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                childAt.getClass();
                a(childAt);
                if (i5 >= i3) {
                    break;
                } else {
                    i4 = i5;
                }
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        context.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ba.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + ((Object) classAttribute) + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, azuj azujVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, dd ddVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        ddVar.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ba.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        ce e = ddVar.e(id);
        if (classAttribute != null && e == null) {
            if (id <= 0) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + (string != null ? azul.a(" with tag ", string) : ""));
            }
            cn h = ddVar.h();
            context.getClassLoader();
            ce c = h.c(classAttribute);
            c.getClass();
            c.aC();
            dn k = ddVar.k();
            k.x();
            c.N = this;
            k.q(getId(), c, string);
            k.e();
        }
        for (dj djVar : ddVar.a.e()) {
            ce ceVar = djVar.b;
            if (ceVar.E == getId() && (view = ceVar.O) != null && view.getParent() == null) {
                ceVar.N = this;
                djVar.b();
            }
        }
    }
}
