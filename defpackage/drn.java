package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drn extends RecyclerView {
    public ajzj W;
    public dsf aa;

    public drn(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dsf dsfVar = this.aa;
        if (dsfVar != null) {
            dsfVar.a.y();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ajzj ajzjVar = this.W;
        if (ajzjVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (ajzjVar.a == null) {
            ajzjVar.a = new zbn(this, true);
        }
        ajzjVar.a.n(this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
