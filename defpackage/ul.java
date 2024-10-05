package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ul extends ll implements wh {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final lo E;
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    final ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public ul(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new uh(this);
        ui uiVar = new ui(this);
        this.E = uiVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(PrivateKeyType.INVALID);
        drawable.setAlpha(PrivateKeyType.INVALID);
        ofFloat.addListener(new uj(this));
        ofFloat.addUpdateListener(new uk(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aE(this);
            this.l.Y(this);
            this.l.aF(uiVar);
            p();
        }
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.aB(this);
            this.l.v(this);
            this.l.aD(uiVar);
        }
    }

    private final void p() {
        this.l.removeCallbacks(this.D);
    }

    private final void q(int i) {
        p();
        this.l.postDelayed(this.D, i);
    }

    private final boolean r() {
        return jw.e(this.l) == 1;
    }

    private static final int s(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.ll
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            j(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.u;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                this.b.setBounds(0, 0, i2, i5);
                this.c.setBounds(0, 0, this.v, this.k);
                if (r()) {
                    this.c.draw(canvas);
                    canvas.translate(this.u, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.u, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.b.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.y;
                int i9 = this.h;
                int i10 = this.g;
                this.w.setBounds(0, 0, i10, i8);
                this.x.setBounds(0, 0, this.j, this.z);
                canvas.translate(0.0f, i7 - i8);
                this.x.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.w.draw(canvas);
                canvas.translate(-r3, -r8);
            }
        }
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.l.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            p();
        }
        if (i == 0) {
            i();
        } else {
            k();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            q(1200);
        } else if (i == 1) {
            q(1500);
        }
        this.o = i;
    }

    public final void k() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    final boolean l(float f, float f2) {
        if (f2 < this.k - this.y) {
            return false;
        }
        int i = this.h;
        int i2 = this.g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    final boolean m(float f, float f2) {
        if (r()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean m = m(motionEvent.getX(), motionEvent.getY());
        boolean l = l(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (m) {
            if (!l) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                j(2);
                return true;
            }
        } else if (!l) {
            return false;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        j(2);
        return true;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m = m(motionEvent.getX(), motionEvent.getY());
            boolean l = l(motionEvent.getX(), motionEvent.getY());
            if (m) {
                if (!l) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                    j(2);
                    return;
                }
            } else if (!l) {
                return;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            j(2);
            return;
        }
        if (motionEvent.getAction() != 1 || this.o != 2) {
            if (motionEvent.getAction() == 2 && this.o == 2) {
                k();
                if (this.A == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.C;
                    int i = this.t;
                    iArr[0] = i;
                    iArr[1] = this.j - i;
                    float max = Math.max(iArr[0], Math.min(iArr[1], x));
                    if (Math.abs(this.h - max) >= 2.0f) {
                        int s2 = s(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                        if (s2 != 0) {
                            this.l.scrollBy(s2, 0);
                        }
                        this.i = max;
                    }
                }
                if (this.A == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.B;
                    int i2 = this.t;
                    iArr2[0] = i2;
                    iArr2[1] = this.k - i2;
                    float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                    if (Math.abs(this.e - max2) >= 2.0f) {
                        int s3 = s(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                        if (s3 != 0) {
                            this.l.scrollBy(0, s3);
                        }
                        this.f = max2;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f = 0.0f;
        this.i = 0.0f;
        j(1);
        this.A = 0;
    }
}
