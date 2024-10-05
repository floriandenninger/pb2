package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkr extends FrameLayout implements axql, aivf {
    public kut a;
    public ayqi b;
    public final Rect c;
    public aivf d;
    private axqg e;
    private boolean f;
    private View g;
    private ayqx h;

    public kkr(Context context) {
        super(context);
        if (!this.f) {
            this.f = true;
            ((koy) lM()).n(this);
        }
        this.c = new Rect();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.e == null) {
            this.e = new axqg(this, false);
        }
        return this.e;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return this.d.c();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.aivf
    public final View ld() {
        if (this.g == null) {
            View ld = this.d.ld();
            this.g = ld;
            ld.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addView(this.g);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = this.a.u().U().ab(this.b).ax(new ayrs() { // from class: kox
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kkr kkrVar = kkr.this;
                kkrVar.c.set((Rect) obj);
                kkrVar.requestLayout();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ayqx ayqxVar = this.h;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayrz.c((AtomicReference) this.h);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.g;
        if (view == null) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int min = Math.min(view.getMeasuredWidth(), i5);
        int min2 = Math.min(this.g.getMeasuredHeight(), i6);
        int i7 = ((this.c.left + (i5 - min)) - this.c.right) / 2;
        int i8 = (i6 - min2) / 2;
        this.g.layout(i7, i8, min + i7, min2 + i8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View view = this.g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.g.measure(getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec((size - this.c.left) - this.c.right, 1073741824), 0, layoutParams.width), getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0, layoutParams.height));
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
