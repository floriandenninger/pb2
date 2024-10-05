package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zay {
    protected final int a;
    public float b;
    protected float c;
    protected float d;
    public float e;
    public int f;
    private final int g;
    private final int h;
    private final int i;
    private VelocityTracker j;

    public zay(Context context) {
        this(context, 200, 1, 20);
    }

    public final int a(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.f);
        if (findPointerIndex < 0) {
            return 0;
        }
        float x = motionEvent.getX(findPointerIndex);
        float f = this.d;
        this.d = x;
        return (int) (f - x);
    }

    public final int b(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.f);
        if (findPointerIndex < 0) {
            return 0;
        }
        return (int) (this.c - motionEvent.getY(findPointerIndex));
    }

    public final int c(MotionEvent motionEvent, int i) {
        int abs;
        boolean z = i == 1 || i == 3;
        int i2 = 2;
        boolean z2 = i == 2 || i == 3;
        int findPointerIndex = motionEvent.findPointerIndex(this.f);
        if (yjk.A(findPointerIndex, 0, motionEvent.getPointerCount())) {
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            int round = z2 ? Math.round(x - this.d) : 0;
            int round2 = z ? Math.round(y - this.e) : 0;
            int abs2 = Math.abs(round);
            int abs3 = Math.abs(round2);
            if (i != 2 && (i != 3 || abs2 <= abs3)) {
                abs = Math.abs(round2);
                if (round2 >= 0) {
                    i2 = 4;
                }
            } else {
                abs = Math.abs(round);
                i2 = round < 0 ? 1 : 3;
            }
            if (abs > this.a) {
                return i2;
            }
        }
        return 0;
    }

    public final void d(MotionEvent motionEvent) {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
    }

    public final void e(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & PrivateKeyType.INVALID;
        if (motionEvent.getPointerId(action) == this.f) {
            int i = action == 0 ? 1 : 0;
            this.d = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.e = y;
            this.b = this.d;
            this.c = y;
            this.f = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void f() {
        this.f = -1;
    }

    public final void g(MotionEvent motionEvent) {
        this.d = motionEvent.getX();
        float y = motionEvent.getY();
        this.e = y;
        this.b = this.d;
        this.c = y;
        this.f = motionEvent.getPointerId(0);
    }

    public final boolean h(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(this.f);
        if (yjk.A(findPointerIndex, 0, motionEvent.getPointerCount())) {
            if (c(motionEvent, i) != 0) {
                this.d = motionEvent.getX(findPointerIndex);
                this.e = motionEvent.getY(findPointerIndex);
                return true;
            }
        } else {
            f();
        }
        return false;
    }

    public final int i(MotionEvent motionEvent, int i) {
        int y;
        float yVelocity;
        int findPointerIndex = motionEvent.findPointerIndex(this.f);
        if (findPointerIndex < 0) {
            return 0;
        }
        this.j.computeCurrentVelocity(1000, this.h);
        if (i != 1) {
            y = (int) (this.b - motionEvent.getX(findPointerIndex));
            yVelocity = this.j.getXVelocity(this.f);
        } else {
            y = (int) (this.c - motionEvent.getY(findPointerIndex));
            yVelocity = this.j.getYVelocity(this.f);
        }
        int i2 = (int) yVelocity;
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j = null;
        }
        if (Math.abs(y) < this.g || Math.abs(i2) <= this.i) {
            return 0;
        }
        return i2 > 0 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zay(Context context, int i, int i2, int i3) {
        this.f = -1;
        amkq.F(i >= 200, "snapVelocity cannot be less than 200");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g = i3;
        if (i2 == 1) {
            this.a = viewConfiguration.getScaledPagingTouchSlop();
        } else {
            this.a = viewConfiguration.getScaledTouchSlop();
        }
        this.h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.i = i;
    }
}
