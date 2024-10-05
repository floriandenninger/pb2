package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alio extends ProgressBar {
    public final alip a;
    public int b;
    public final int c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final bxe k;
    private final bxe l;

    /* JADX INFO: Access modifiers changed from: protected */
    public alio(Context context, AttributeSet attributeSet, int i, int i2) {
        super(aloa.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = new alil(this, 1);
        this.i = new alil(this, 0);
        this.k = new alim(this);
        this.l = new alin(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = alig.a(context2, attributeSet, aljp.a, i, i2, new int[0]);
        this.c = a.getInt(5, -1);
        this.d = Math.min(a.getInt(3, -1), 1000);
        a.recycle();
        this.j = true;
    }

    public abstract alip a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aliy getProgressDrawable() {
        return (aliy) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aljf getIndeterminateDrawable() {
        return (aljf) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.j) {
            ((aljc) getCurrentDrawable()).h(f(), false, z);
        }
    }

    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (!jw.aj(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void g(int i) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.b = i;
                this.f = true;
                if (!getIndeterminateDrawable().isVisible() || alkd.n(getContext().getContentResolver()) == 0.0f) {
                    bxe bxeVar = this.k;
                    getIndeterminateDrawable();
                    bxeVar.a();
                    return;
                }
                getIndeterminateDrawable().b.c();
                return;
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.k);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().d(this.l);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d(this.l);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((aljc) getCurrentDrawable()).j();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().k(this.l);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().k(this.l);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        aljd aljdVar = null;
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                aljdVar = getIndeterminateDrawable().a;
            }
        } else if (getProgressDrawable() != null) {
            aljdVar = getProgressDrawable().a;
        }
        if (aljdVar == null) {
            return;
        }
        int b = aljdVar.b();
        int a = aljdVar.a();
        if (b < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = b + getPaddingLeft() + getPaddingRight();
        }
        if (a < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = a + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((aljc) currentDrawable).j();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((aljc) currentDrawable2).h(f(), false, false);
        }
        if ((currentDrawable2 instanceof aljf) && f()) {
            ((aljf) currentDrawable2).b.d();
        }
        this.f = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof aljf) {
                ((aljc) drawable).j();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof aliy) {
                aliy aliyVar = (aliy) drawable;
                aliyVar.j();
                super.setProgressDrawable(aliyVar);
                aliyVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
