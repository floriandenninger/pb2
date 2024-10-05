package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aivi extends ViewGroup {
    private final ayqw a;
    public final Rect m;
    public zaz n;
    public Runnable o;
    public View p;

    public aivi(Context context) {
        this(context, null);
    }

    private static int f(int i) {
        return (int) (i / 1.777f);
    }

    protected static final boolean i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aivh) {
            return ((aivh) layoutParams).a;
        }
        return true;
    }

    private static int j(int i) {
        return (int) (i * 1.777f);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aivh;
    }

    public final void g(zaz zazVar) {
        zazVar.getClass();
        this.n = zazVar;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aivh(-2, -2, true);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aivh(getContext(), attributeSet);
    }

    public final void h(View view) {
        amkq.O(this.p == null, "videoView has already been set");
        this.p = view;
        addView(view, 0, new aivh(-2, -2, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kS(View view, Rect rect, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = (i5 - rect.left) - rect.right;
        int i8 = (i6 - rect.top) - rect.bottom;
        boolean i9 = i(view.getLayoutParams());
        if (true == i9) {
            i5 = i7;
        }
        if (true == i9) {
            i6 = i8;
        }
        int min = Math.min(view.getMeasuredWidth(), i5);
        int min2 = Math.min(view.getMeasuredHeight(), i6);
        int i10 = (i9 ? rect.left : 0) + ((i5 - min) / 2);
        int i11 = (i9 ? rect.top : 0) + ((i6 - min2) / 2);
        view.layout(i10, i11, min + i10, min2 + i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kT(View view, Rect rect, int i, int i2) {
        int i3 = rect.left + rect.right;
        int i4 = rect.top + rect.bottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean i5 = i(layoutParams);
        if (true != i5) {
            i3 = 0;
        }
        int childMeasureSpec = getChildMeasureSpec(makeMeasureSpec, i3, layoutParams.width);
        if (true != i5) {
            i4 = 0;
        }
        view.measure(childMeasureSpec, getChildMeasureSpec(makeMeasureSpec2, i4, layoutParams.height));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        this.a.c();
        List pC = pC();
        if (!pC.isEmpty()) {
            this.a.g((ayqx[]) pC.toArray(new ayqx[pC.size()]));
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.a.c();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (z || childAt.getVisibility() != 8) {
                kS(childAt, this.m, i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r3 < (r2 / 1.777f)) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053 A[LOOP:0: B:6:0x004d->B:8:0x0053, LOOP_END] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            int r2 = android.view.View.MeasureSpec.getSize(r8)
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 != r5) goto L1a
            if (r1 != r5) goto L18
            goto L45
        L18:
            r0 = 1073741824(0x40000000, float:2.0)
        L1a:
            if (r0 == r5) goto L41
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r6) goto L23
            if (r1 != 0) goto L23
            goto L41
        L23:
            if (r1 == r5) goto L3c
            if (r1 != r6) goto L2a
            if (r0 != 0) goto L2a
            goto L3c
        L2a:
            if (r0 != r6) goto L39
            if (r1 != r6) goto L39
            float r0 = (float) r3
            float r1 = (float) r2
            r5 = 1071871164(0x3fe374bc, float:1.777)
            float r1 = r1 / r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
            goto L3c
        L39:
            r2 = 0
            r3 = 0
            goto L45
        L3c:
            int r2 = j(r3)
            goto L45
        L41:
            int r3 = f(r2)
        L45:
            int r8 = resolveSize(r2, r8)
            int r9 = resolveSize(r3, r9)
        L4d:
            int r0 = r7.getChildCount()
            if (r4 >= r0) goto L5f
            android.view.View r0 = r7.getChildAt(r4)
            android.graphics.Rect r1 = r7.m
            r7.kT(r0, r1, r8, r9)
            int r4 = r4 + 1
            goto L4d
        L5f:
            r7.setMeasuredDimension(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivi.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable = this.o;
        if (runnable != null) {
            runnable.run();
        }
        return super.onTouchEvent(motionEvent);
    }

    protected List pC() {
        ArrayList arrayList = new ArrayList();
        zaz zazVar = this.n;
        if (zazVar != null) {
            arrayList.add(zazVar.d().X(new ayrs() { // from class: aivg
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    aivi aiviVar = aivi.this;
                    zck zckVar = (zck) obj;
                    if (aiviVar.m.equals(zckVar.a.a)) {
                        return;
                    }
                    aiviVar.m.set(zckVar.a.a);
                    aiviVar.requestLayout();
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void pD(aivf aivfVar, View view) {
        addView(view, aivfVar.c());
    }

    public void pE(aivf... aivfVarArr) {
        for (aivf aivfVar : aivfVarArr) {
            View ld = aivfVar.ld();
            if (ld != null) {
                pD(aivfVar, ld);
            } else {
                String valueOf = String.valueOf(aivfVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Overlay ");
                sb.append(valueOf);
                sb.append(" does not provide a View and LayoutParams");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public aivi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ayqw();
        setFocusable(true);
        setDescendantFocusability(262144);
        this.m = new Rect();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aivh(layoutParams);
    }
}
