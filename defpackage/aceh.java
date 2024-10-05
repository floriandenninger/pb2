package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aceh extends GestureDetector.SimpleOnGestureListener {
    WindowManager.LayoutParams a;
    public boolean b;
    public boolean c;
    final /* synthetic */ acei d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private int j;

    public aceh(acei aceiVar) {
        this.d = aceiVar;
    }

    public final void a() {
        this.b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.d.a.getLayoutParams();
        this.a = layoutParams;
        this.e = layoutParams.x;
        this.f = this.a.y;
        this.d.j();
        this.i = this.d.l.x;
        this.j = this.d.l.y;
        this.g = motionEvent.getRawX();
        this.h = motionEvent.getRawY();
        this.b = true;
        this.c = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.b) {
            return false;
        }
        if (!this.c) {
            this.c = true;
        }
        int i = this.e;
        float rawX = motionEvent2.getRawX();
        float f3 = this.g;
        int i2 = this.f;
        float rawY = motionEvent2.getRawY();
        float f4 = this.h;
        this.a.x = Math.min(Math.max(i + ((int) (rawX - f3)), this.d.j), this.i);
        this.a.y = Math.min(Math.max(i2 - ((int) (rawY - f4)), this.d.j), this.j);
        this.d.r = 0;
        int i3 = this.a.x;
        acei aceiVar = this.d;
        if (i3 == aceiVar.j) {
            aceiVar.r |= 3;
        } else if (this.a.x == this.i) {
            this.d.r |= 5;
        }
        int i4 = this.a.y;
        acei aceiVar2 = this.d;
        if (i4 == aceiVar2.j) {
            aceiVar2.r |= 80;
        } else if (this.a.y == this.j) {
            this.d.r |= 48;
        }
        acei aceiVar3 = this.d;
        aceiVar3.g.updateViewLayout(aceiVar3.a, this.a);
        this.d.k.set(this.a.x, this.a.y, this.a.x + this.a.width, this.a.y + this.a.height);
        return true;
    }
}
