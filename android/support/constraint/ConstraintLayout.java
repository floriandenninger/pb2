package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.af;
import defpackage.ah;
import defpackage.ai;
import defpackage.ar;
import defpackage.as;
import defpackage.at;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a;
    as b;
    public ah c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(null);
    }

    public static final af b() {
        return new af(-2);
    }

    private final ar c(int i) {
        if (i == 0) {
            return this.b;
        }
        View view = (View) this.a.get(i);
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((af) view.getLayoutParams()).Y;
    }

    private final ar d(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((af) view.getLayoutParams()).Y;
    }

    private final void e(AttributeSet attributeSet) {
        this.b.f101J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ai.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 112) {
                    this.j = obtainStyledAttributes.getInt(112, this.j);
                } else if (index == 34) {
                    int resourceId = obtainStyledAttributes.getResourceId(34, 0);
                    ah ahVar = new ah();
                    this.c = ahVar;
                    ahVar.g(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }

    protected final void a() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof af;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new af(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            af afVar = (af) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || afVar.Q || isInEditMode) {
                ar arVar = afVar.Y;
                int b = arVar.b();
                int c = arVar.c();
                childAt.layout(b, c, arVar.h() + b, arVar.d() + c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0460, code lost:
    
        if (r10.height == (-1)) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        ar d = d(view);
        if ((view instanceof Guideline) && !(d instanceof at)) {
            af afVar = (af) view.getLayoutParams();
            afVar.Y = new at();
            afVar.Q = true;
            ((at) afVar.Y).A(afVar.M);
            ar arVar = afVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(d(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new af(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(attributeSet);
    }
}
