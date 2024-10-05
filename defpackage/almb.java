package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class almb extends LinearLayout {
    public ValueAnimator a;
    public int b;
    public float c;
    final /* synthetic */ TabLayout d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almb(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.b = -1;
        this.e = -1;
        setWillNotDraw(false);
    }

    public final void a() {
        View childAt = getChildAt(this.b);
        TabLayout tabLayout = this.d;
        Drawable drawable = tabLayout.k;
        RectF x = alkd.x(tabLayout, childAt);
        drawable.setBounds((int) x.left, drawable.getBounds().top, (int) x.right, drawable.getBounds().bottom);
    }

    public final void b(int i) {
        Rect bounds = this.d.k.getBounds();
        this.d.k.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = this.d;
            tabLayout.A.y(tabLayout, view, view2, f, tabLayout.k);
        } else {
            Drawable drawable = this.d.k;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.d.k.getBounds().bottom);
        }
        jw.G(this);
    }

    public final void d(boolean z, int i, int i2) {
        View childAt = getChildAt(this.b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        allz allzVar = new allz(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(aleq.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(allzVar);
            valueAnimator.addListener(new alma(this, i));
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(allzVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height = this.d.k.getBounds().height();
        if (height < 0) {
            height = this.d.k.getIntrinsicHeight();
        }
        int i = this.d.t;
        int i2 = 0;
        if (i == 0) {
            i2 = getHeight() - height;
            height = getHeight();
        } else if (i == 1) {
            i2 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i != 2) {
            height = i != 3 ? 0 : getHeight();
        }
        if (this.d.k.getBounds().width() > 0) {
            Rect bounds = this.d.k.getBounds();
            this.d.k.setBounds(bounds.left, i2, bounds.right, height);
            TabLayout tabLayout = this.d;
            Drawable drawable = tabLayout.k;
            if (tabLayout.l != 0) {
                drawable = gl.c(drawable);
                if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(this.d.l, PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.setTint(this.d.l);
                }
            } else if (Build.VERSION.SDK_INT != 21) {
                drawable.setTintList(null);
            } else {
                drawable.setColorFilter(null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            d(false, this.b, -1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.d;
        if (tabLayout.r == 1 || tabLayout.u == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            int r = (int) alkd.r(getContext(), 16);
            if (i3 * childCount <= getMeasuredWidth() - (r + r)) {
                boolean z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                TabLayout tabLayout2 = this.d;
                tabLayout2.r = 0;
                tabLayout2.n(false);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.e == i) {
            return;
        }
        requestLayout();
        this.e = i;
    }
}
