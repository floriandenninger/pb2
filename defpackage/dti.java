package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dti extends SwipeRefreshLayout implements djj {
    public static final /* synthetic */ int o = 0;
    public final dkp k;
    public final RecyclerView l;
    public boolean m;
    public vz n;
    private diq p;

    public dti(Context context, RecyclerView recyclerView) {
        super(context);
        this.m = false;
        this.l = recyclerView;
        recyclerView.ad(new gmp(1));
        recyclerView.ay();
        addView(recyclerView);
        dkp dkpVar = new dkp(new dhe(getContext()));
        this.k = dkpVar;
        dkpVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(dkpVar);
    }

    @Override // defpackage.djj
    public final void a(List list) {
        int childCount = this.l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.l.getChildAt(i);
            if (childAt instanceof dkp) {
                list.add((dkp) childAt);
            }
        }
    }

    @Override // defpackage.djh
    public final diq b() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        diq diqVar = this.p;
        if (diqVar != null) {
            diqVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final boolean isLayoutRequested() {
        boolean z = doa.a;
        if (getParent() != null) {
            return getParent().isLayoutRequested() || super.isLayoutRequested();
        }
        return super.isLayoutRequested();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.k.getVisibility() == 8) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        dkp dkpVar = this.k;
        dkpVar.layout(paddingLeft, paddingTop, dkpVar.getMeasuredWidth() + paddingLeft, this.k.getMeasuredHeight() + paddingTop);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        q(View.MeasureSpec.getSize(i));
    }

    public final void p() {
        this.k.K();
        this.k.setVisibility(8);
    }

    public final void q(int i) {
        measureChild(this.k, View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    @Override // defpackage.djh
    public final void r(diq diqVar) {
        this.p = diqVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() == null || isNestedScrollingEnabled()) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.l.setOnTouchListener(onTouchListener);
    }
}
