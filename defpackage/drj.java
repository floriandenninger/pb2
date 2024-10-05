package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class drj extends HorizontalScrollView implements djj {
    public final dkp a;
    public int b;
    public int c;
    public sqv d;
    public dqz e;
    public ajbh f;
    private diq g;

    public drj(Context context) {
        super(context);
        dkp dkpVar = new dkp(context);
        this.a = dkpVar;
        addView(dkpVar);
    }

    @Override // defpackage.djj
    public final void a(List list) {
        list.add(this.a);
    }

    @Override // defpackage.djh
    public final diq b() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        diq diqVar = this.g;
        if (diqVar != null) {
            diqVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        dqz dqzVar = this.e;
        if (dqzVar != null) {
            dqzVar.a(this);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        dqz dqzVar = this.e;
        if (dqzVar != null) {
            dqzVar.d();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f != null) {
            sqv sqvVar = this.d;
            if (sqvVar != null) {
                int scrollX = getScrollX();
                int i5 = this.f.i;
                sww swwVar = sqvVar.a;
                szx szxVar = sqvVar.b;
                sxc sxcVar = sqvVar.c;
                awnw a = szxVar.a();
                syb sybVar = sxcVar.u;
                sxj sxjVar = sxcVar.r;
                aone createBuilder = awpq.a.createBuilder();
                createBuilder.copyOnWrite();
                awpq awpqVar = (awpq) createBuilder.instance;
                awpqVar.b |= 1;
                awpqVar.c = scrollX;
                sgf.y(this, swwVar, a, sybVar, sxjVar, (awpq) createBuilder.build());
            }
            this.f.i = getScrollX();
        }
        dqz dqzVar = this.e;
        if (dqzVar != null) {
            dqzVar.b(this);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        dqz dqzVar = this.e;
        if (dqzVar != null) {
            dqzVar.c(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // defpackage.djh
    public final void r(diq diqVar) {
        this.g = diqVar;
    }
}
