package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yzq extends HorizontalScrollView {
    private View.OnClickListener a;
    private View.OnClickListener b;
    private final zah c;
    public LinearLayout h;
    public int i;
    public ArrayList j;
    public yzo k;
    public yzp l;

    public yzq(Context context) {
        super(context);
        this.c = new zah();
        l(context);
    }

    protected abstract void i(int i, boolean z);

    public final int j() {
        return this.j.size();
    }

    public final View k(int i) {
        if (i < 0 || i >= this.j.size()) {
            return null;
        }
        return (View) this.j.get(i);
    }

    public void l(Context context) {
        this.i = -1;
        this.j = new ArrayList(10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        this.h.setFocusable(false);
        this.h.setClickable(false);
        addView(this.h);
        jw.V(this.h, 1);
        setFillViewport(true);
        setHorizontalScrollBarEnabled(false);
        this.a = new yzn(this, 1);
        this.b = new yzn(this, 0);
    }

    public void lf() {
        this.h.removeAllViews();
        this.j.clear();
        this.i = -1;
    }

    public void m(int i, boolean z) {
        int i2 = this.i;
        if (i2 != i) {
            this.i = i;
            i(i2, false);
            i(this.i, true);
        }
        yzo yzoVar = this.k;
        if (yzoVar != null) {
            yzoVar.pm(i2, i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(View view, boolean z) {
        this.j.add(view);
        this.h.addView(view, view.getLayoutParams());
        view.setOnClickListener(z ? this.a : this.b);
        jw.M(view, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -1);
    }

    public yzq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new zah();
        l(context);
    }

    public yzq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new zah();
        l(context);
    }
}
