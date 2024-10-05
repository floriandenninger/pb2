package defpackage;

import android.graphics.PointF;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lth implements View.OnTouchListener {
    public final lsz c;
    public final ajom d;
    private final View e;
    private final int f;
    private final Handler g;
    private final int h;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    private final Runnable i = new Runnable() { // from class: ltg
        @Override // java.lang.Runnable
        public final void run() {
            lth lthVar = lth.this;
            if (lthVar.a(lthVar.b, lthVar.a)) {
                lsz lszVar = lthVar.c;
                wv h = lszVar.c.K.h(((msi) lthVar.d).a);
                if (lszVar.j(h)) {
                    zn znVar = lszVar.a;
                    if (!znVar.j.i(znVar.m, h)) {
                        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                        return;
                    }
                    if (h.a.getParent() != znVar.m) {
                        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                        return;
                    }
                    znVar.l();
                    znVar.f = 0.0f;
                    znVar.e = 0.0f;
                    znVar.n(h, 2);
                }
            }
        }
    };

    public lth(View view, lsz lszVar, ajom ajomVar, Handler handler, int i) {
        view.getClass();
        this.e = view;
        lszVar.getClass();
        this.c = lszVar;
        this.d = ajomVar;
        this.g = handler;
        this.h = i;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f = scaledTouchSlop * scaledTouchSlop;
    }

    public final boolean a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (f * f) + (f2 * f2) <= ((float) this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r4 != 3) goto L17;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r4 = r5.getAction()
            if (r4 == 0) goto L37
            r0 = 1
            if (r4 == r0) goto L2f
            r1 = 2
            if (r4 == r1) goto L10
            r0 = 3
            if (r4 == r0) goto L2f
            goto L62
        L10:
            android.graphics.PointF r4 = r3.b
            float r1 = r5.getX()
            float r5 = r5.getY()
            r4.set(r1, r5)
            android.graphics.PointF r4 = r3.b
            android.graphics.PointF r5 = r3.a
            boolean r4 = r3.a(r4, r5)
            if (r4 != 0) goto L2e
            android.os.Handler r4 = r3.g
            java.lang.Runnable r5 = r3.i
            r4.removeCallbacks(r5)
        L2e:
            return r0
        L2f:
            android.os.Handler r4 = r3.g
            java.lang.Runnable r0 = r3.i
            r4.removeCallbacks(r0)
            goto L62
        L37:
            android.graphics.PointF r4 = r3.a
            float r0 = r5.getX()
            float r1 = r5.getY()
            r4.set(r0, r1)
            android.graphics.PointF r4 = r3.b
            float r0 = r5.getX()
            float r1 = r5.getY()
            r4.set(r0, r1)
            android.os.Handler r4 = r3.g
            java.lang.Runnable r0 = r3.i
            r4.removeCallbacks(r0)
            android.os.Handler r4 = r3.g
            java.lang.Runnable r0 = r3.i
            int r1 = r3.h
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
        L62:
            android.view.View r4 = r3.e
            boolean r4 = r4.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lth.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
