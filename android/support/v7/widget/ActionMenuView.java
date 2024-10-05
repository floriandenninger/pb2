package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.qo;
import defpackage.qp;
import defpackage.qq;
import defpackage.qt;
import defpackage.rd;
import defpackage.rg;
import defpackage.sb;
import defpackage.sc;
import defpackage.sd;
import defpackage.se;
import defpackage.sf;
import defpackage.uw;
import defpackage.ux;
import defpackage.yl;
import defpackage.zb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends ux implements qp, rg {
    public qq a;
    public boolean b;
    public sb c;
    public qo d;
    public yl e;
    private Context f;
    private int g;
    private rd h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final se j() {
        se seVar = new se();
        seVar.gravity = 16;
        return seVar;
    }

    public static final se k(ViewGroup.LayoutParams layoutParams) {
        se seVar;
        if (layoutParams != null) {
            if (layoutParams instanceof se) {
                seVar = new se((se) layoutParams);
            } else {
                seVar = new se(layoutParams);
            }
            if (seVar.gravity <= 0) {
                seVar.gravity = 16;
            }
            return seVar;
        }
        return j();
    }

    @Override // defpackage.rg
    public final void a(qq qqVar) {
        this.a = qqVar;
    }

    @Override // defpackage.qp
    public final boolean b(qt qtVar) {
        return this.a.z(qtVar, 0);
    }

    @Override // defpackage.ux, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final se generateLayoutParams(AttributeSet attributeSet) {
        return new se(getContext(), attributeSet);
    }

    @Override // defpackage.ux, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof se;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            qq qqVar = new qq(context);
            this.a = qqVar;
            qqVar.p(new sf(this));
            sb sbVar = new sb(context);
            this.c = sbVar;
            sbVar.p();
            sb sbVar2 = this.c;
            rd rdVar = this.h;
            if (rdVar == null) {
                rdVar = new sd();
            }
            sbVar2.e = rdVar;
            this.a.h(this.c, this.f);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.n();
        }
    }

    public final void f(rd rdVar, qo qoVar) {
        this.h = rdVar;
        this.d = qoVar;
    }

    public final void g(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ux, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ uw generateDefaultLayoutParams() {
        return j();
    }

    public final void h(sb sbVar) {
        this.c = sbVar;
        sbVar.j(this);
    }

    protected final boolean i(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof sc)) {
            z = ((sc) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof sc)) ? z : ((sc) childAt2).d() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ux, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean b = zb.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                se seVar = (se) childAt.getLayoutParams();
                if (seVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + seVar.leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - seVar.rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + seVar.leftMargin) + seVar.rightMargin;
                    i(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1) {
            if (i8 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = (i7 / 2) - (measuredWidth2 / 2);
                int i13 = i6 - (measuredHeight2 / 2);
                childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                se seVar2 = (se) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !seVar2.a) {
                    int i16 = width2 - seVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + seVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            se seVar3 = (se) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !seVar3.a) {
                int i19 = paddingLeft + seVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + seVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f6  */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // defpackage.ux, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    @Override // defpackage.ux, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ux, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ uw generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    @Override // defpackage.ux, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
