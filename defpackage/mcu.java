package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcu implements wh {
    boolean a = false;
    public boolean b = false;
    private final View c;
    private final int d;
    private final int e;
    private final mct f;
    private boolean g;
    private int h;
    private float i;
    private float j;
    private final boolean k;

    public mcu(View view, int i, mct mctVar, int i2, boolean z) {
        this.c = view;
        this.d = i;
        this.f = mctVar;
        this.e = i2;
        this.k = z;
    }

    private final float b() {
        return Math.abs(this.j);
    }

    private final void c(int i) {
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        yny.z(this.c, yny.n(i), ViewGroup.LayoutParams.class);
    }

    public final void a() {
        this.b = true;
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
        if (z) {
            this.f.a();
        }
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        int min;
        if (!this.b && !this.a) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.h);
                    if (findPointerIndex2 >= 0) {
                        float y = this.i - motionEvent.getY(findPointerIndex2);
                        this.j = y;
                        if (this.g && y < 0.0f) {
                            if (b() >= this.d) {
                                this.a = true;
                                this.f.b();
                            } else {
                                c(0);
                            }
                        }
                    }
                    return false;
                }
                if (actionMasked == 2 && (findPointerIndex = motionEvent.findPointerIndex(this.h)) >= 0) {
                    float y2 = this.i - motionEvent.getY(findPointerIndex);
                    this.j = y2;
                    if (this.g && y2 < 0.0f) {
                        if (this.k) {
                            min = this.d;
                            c(min / 2);
                            c(min);
                        } else {
                            min = (int) Math.min(b(), this.d);
                            c(min);
                        }
                        this.i -= min;
                    }
                }
                return false;
            }
            if (this.e != 0) {
                this.g = true;
            } else {
                this.g = !recyclerView.canScrollVertically(-1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.h = pointerId;
            int findPointerIndex3 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex3 >= 0) {
                this.i = motionEvent.getY(findPointerIndex3);
            }
        }
        return false;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
    }
}
